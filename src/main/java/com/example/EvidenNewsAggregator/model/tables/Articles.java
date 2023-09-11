/*
 * This file is generated by jOOQ.
 */
package com.jooq.sample.model.tables;


import com.example.EvidenNewsAggregator.model.Evidennewsaggregator;
import com.example.EvidenNewsAggregator.model.Indexes;
import com.example.EvidenNewsAggregator.model.Keys;
import com.jooq.sample.model.tables.records.ArticlesRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Articles extends TableImpl<ArticlesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>evidennewsaggregator.articles</code>
     */
    public static final Articles ARTICLES = new Articles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ArticlesRecord> getRecordType() {
        return ArticlesRecord.class;
    }

    /**
     * The column <code>evidennewsaggregator.articles.article_id</code>.
     */
    public final TableField<ArticlesRecord, Integer> ARTICLE_ID = createField(DSL.name("article_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>evidennewsaggregator.articles.title</code>.
     */
    public final TableField<ArticlesRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>evidennewsaggregator.articles.date</code>.
     */
    public final TableField<ArticlesRecord, LocalDate> DATE = createField(DSL.name("date"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>evidennewsaggregator.articles.description</code>.
     */
    public final TableField<ArticlesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(400), this, "");

    /**
     * The column <code>evidennewsaggregator.articles.rating</code>.
     */
    public final TableField<ArticlesRecord, Integer> RATING = createField(DSL.name("rating"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>evidennewsaggregator.articles.source_link</code>.
     */
    public final TableField<ArticlesRecord, String> SOURCE_LINK = createField(DSL.name("source_link"), SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>evidennewsaggregator.articles.name</code>.
     */
    public final TableField<ArticlesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>evidennewsaggregator.articles.approved</code>.
     */
    public final TableField<ArticlesRecord, Byte> APPROVED = createField(DSL.name("approved"), SQLDataType.TINYINT, this, "");

    /**
     * The column <code>evidennewsaggregator.articles.image</code>.
     */
    public final TableField<ArticlesRecord, String> IMAGE = createField(DSL.name("image"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>evidennewsaggregator.articles.category_id</code>.
     */
    public final TableField<ArticlesRecord, Integer> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>evidennewsaggregator.articles.user_id</code>.
     */
    public final TableField<ArticlesRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER, this, "");

    private Articles(Name alias, Table<ArticlesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Articles(Name alias, Table<ArticlesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>evidennewsaggregator.articles</code> table reference
     */
    public Articles(String alias) {
        this(DSL.name(alias), ARTICLES);
    }

    /**
     * Create an aliased <code>evidennewsaggregator.articles</code> table reference
     */
    public Articles(Name alias) {
        this(alias, ARTICLES);
    }

    /**
     * Create a <code>evidennewsaggregator.articles</code> table reference
     */
    public Articles() {
        this(DSL.name("articles"), null);
    }

    public <O extends Record> Articles(Table<O> child, ForeignKey<O, ArticlesRecord> key) {
        super(child, key, ARTICLES);
    }

    @Override
    public Schema getSchema() {
        return Evidennewsaggregator.EVIDENNEWSAGGREGATOR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ARTICLES_CATEGORY_ID_IDX, Indexes.ARTICLES_USER_ID_IDX);
    }

    @Override
    public Identity<ArticlesRecord, Integer> getIdentity() {
        return (Identity<ArticlesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ArticlesRecord> getPrimaryKey() {
        return Keys.KEY_ARTICLES_PRIMARY;
    }

    @Override
    public List<UniqueKey<ArticlesRecord>> getKeys() {
        return Arrays.<UniqueKey<ArticlesRecord>>asList(Keys.KEY_ARTICLES_PRIMARY);
    }

    @Override
    public List<ForeignKey<ArticlesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ArticlesRecord, ?>>asList(Keys.CATEGORY_ID, Keys.USER_ID);
    }

    private transient Categories _categories;
    private transient Users _users;

    public Categories categories() {
        if (_categories == null)
            _categories = new Categories(this, Keys.CATEGORY_ID);

        return _categories;
    }

    public Users users() {
        if (_users == null)
            _users = new Users(this, Keys.USER_ID);

        return _users;
    }

    @Override
    public Articles as(String alias) {
        return new Articles(DSL.name(alias), this);
    }

    @Override
    public Articles as(Name alias) {
        return new Articles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Articles rename(String name) {
        return new Articles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Articles rename(Name name) {
        return new Articles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, LocalDate, String, Integer, String, String, Byte, String, Integer, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
