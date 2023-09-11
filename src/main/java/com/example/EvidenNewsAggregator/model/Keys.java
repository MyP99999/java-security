/*
 * This file is generated by jOOQ.
 */
package com.example.EvidenNewsAggregator.model;


import com.jooq.sample.model.tables.Articles;
import com.jooq.sample.model.tables.Categories;
import com.jooq.sample.model.tables.Roles;
import com.jooq.sample.model.tables.Users;
import com.jooq.sample.model.tables.records.ArticlesRecord;
import com.jooq.sample.model.tables.records.CategoriesRecord;
import com.jooq.sample.model.tables.records.RolesRecord;
import com.jooq.sample.model.tables.records.UsersRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * evidennewsaggregator.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ArticlesRecord> KEY_ARTICLES_PRIMARY = Internal.createUniqueKey(Articles.ARTICLES, DSL.name("KEY_articles_PRIMARY"), new TableField[] { Articles.ARTICLES.ARTICLE_ID }, true);
    public static final UniqueKey<CategoriesRecord> KEY_CATEGORIES_PRIMARY = Internal.createUniqueKey(Categories.CATEGORIES, DSL.name("KEY_categories_PRIMARY"), new TableField[] { Categories.CATEGORIES.CATEGORY_ID }, true);
    public static final UniqueKey<RolesRecord> KEY_ROLES_PRIMARY = Internal.createUniqueKey(Roles.ROLES, DSL.name("KEY_roles_PRIMARY"), new TableField[] { Roles.ROLES.ROLE_ID }, true);
    public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = Internal.createUniqueKey(Users.USERS, DSL.name("KEY_users_PRIMARY"), new TableField[] { Users.USERS.USER_ID }, true);
    public static final UniqueKey<UsersRecord> KEY_USERS_USER_ID_UNIQUE = Internal.createUniqueKey(Users.USERS, DSL.name("KEY_users_user_id_UNIQUE"), new TableField[] { Users.USERS.USER_ID }, true);
    public static final UniqueKey<UsersRecord> KEY_USERS_USERNAME_UNIQUE = Internal.createUniqueKey(Users.USERS, DSL.name("KEY_users_username_UNIQUE"), new TableField[] { Users.USERS.USERNAME }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ArticlesRecord, CategoriesRecord> CATEGORY_ID = Internal.createForeignKey(Articles.ARTICLES, DSL.name("category_id"), new TableField[] { Articles.ARTICLES.CATEGORY_ID }, Keys.KEY_CATEGORIES_PRIMARY, new TableField[] { Categories.CATEGORIES.CATEGORY_ID }, true);
    public static final ForeignKey<ArticlesRecord, UsersRecord> USER_ID = Internal.createForeignKey(Articles.ARTICLES, DSL.name("user_id"), new TableField[] { Articles.ARTICLES.USER_ID }, Keys.KEY_USERS_PRIMARY, new TableField[] { Users.USERS.USER_ID }, true);
    public static final ForeignKey<UsersRecord, RolesRecord> ROLE_ID = Internal.createForeignKey(Users.USERS, DSL.name("role_id"), new TableField[] { Users.USERS.ROLE_ID }, Keys.KEY_ROLES_PRIMARY, new TableField[] { Roles.ROLES.ROLE_ID }, true);
}
