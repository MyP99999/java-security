/*
 * This file is generated by jOOQ.
 */
package com.jooq.sample.model.tables;


import com.example.EvidenNewsAggregator.model.Evidennewsaggregator;
import com.example.EvidenNewsAggregator.model.Keys;
import com.jooq.sample.model.tables.records.CategoriesRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class Categories extends TableImpl<CategoriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>evidennewsaggregator.categories</code>
     */
    public static final Categories CATEGORIES = new Categories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CategoriesRecord> getRecordType() {
        return CategoriesRecord.class;
    }

    /**
     * The column <code>evidennewsaggregator.categories.category_id</code>.
     */
    public final TableField<CategoriesRecord, Integer> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>evidennewsaggregator.categories.name</code>.
     */
    public final TableField<CategoriesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    private Categories(Name alias, Table<CategoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Categories(Name alias, Table<CategoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>evidennewsaggregator.categories</code> table reference
     */
    public Categories(String alias) {
        this(DSL.name(alias), CATEGORIES);
    }

    /**
     * Create an aliased <code>evidennewsaggregator.categories</code> table reference
     */
    public Categories(Name alias) {
        this(alias, CATEGORIES);
    }

    /**
     * Create a <code>evidennewsaggregator.categories</code> table reference
     */
    public Categories() {
        this(DSL.name("categories"), null);
    }

    public <O extends Record> Categories(Table<O> child, ForeignKey<O, CategoriesRecord> key) {
        super(child, key, CATEGORIES);
    }

    @Override
    public Schema getSchema() {
        return Evidennewsaggregator.EVIDENNEWSAGGREGATOR;
    }

    @Override
    public Identity<CategoriesRecord, Integer> getIdentity() {
        return (Identity<CategoriesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CategoriesRecord> getPrimaryKey() {
        return Keys.KEY_CATEGORIES_PRIMARY;
    }

    @Override
    public List<UniqueKey<CategoriesRecord>> getKeys() {
        return Arrays.<UniqueKey<CategoriesRecord>>asList(Keys.KEY_CATEGORIES_PRIMARY);
    }

    @Override
    public Categories as(String alias) {
        return new Categories(DSL.name(alias), this);
    }

    @Override
    public Categories as(Name alias) {
        return new Categories(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Categories rename(String name) {
        return new Categories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Categories rename(Name name) {
        return new Categories(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
