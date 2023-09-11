/*
 * This file is generated by jOOQ.
 */
package com.example.EvidenNewsAggregator.model;


import com.jooq.sample.model.tables.Articles;
import com.jooq.sample.model.tables.Users;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in evidennewsaggregator.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ARTICLES_CATEGORY_ID_IDX = Internal.createIndex(DSL.name("category_id_idx"), Articles.ARTICLES, new OrderField[] { Articles.ARTICLES.CATEGORY_ID }, false);
    public static final Index USERS_ROLE_ID_IDX = Internal.createIndex(DSL.name("role_id_idx"), Users.USERS, new OrderField[] { Users.USERS.ROLE_ID }, false);
    public static final Index ARTICLES_USER_ID_IDX = Internal.createIndex(DSL.name("user_id_idx"), Articles.ARTICLES, new OrderField[] { Articles.ARTICLES.USER_ID }, false);
}
