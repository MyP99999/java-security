/*
 * This file is generated by jOOQ.
 */
package com.jooq.sample.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Articles implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   articleId;
    private String    title;
    private LocalDate date;
    private String    description;
    private Integer   rating;
    private String    sourceLink;
    private String    name;
    private Byte      approved;
    private String    image;
    private Integer   categoryId;
    private Integer   userId;

    public Articles() {}

    public Articles(Articles value) {
        this.articleId = value.articleId;
        this.title = value.title;
        this.date = value.date;
        this.description = value.description;
        this.rating = value.rating;
        this.sourceLink = value.sourceLink;
        this.name = value.name;
        this.approved = value.approved;
        this.image = value.image;
        this.categoryId = value.categoryId;
        this.userId = value.userId;
    }

    public Articles(
        Integer   articleId,
        String    title,
        LocalDate date,
        String    description,
        Integer   rating,
        String    sourceLink,
        String    name,
        Byte      approved,
        String    image,
        Integer   categoryId,
        Integer   userId
    ) {
        this.articleId = articleId;
        this.title = title;
        this.date = date;
        this.description = description;
        this.rating = rating;
        this.sourceLink = sourceLink;
        this.name = name;
        this.approved = approved;
        this.image = image;
        this.categoryId = categoryId;
        this.userId = userId;
    }

    /**
     * Getter for <code>evidennewsaggregator.articles.article_id</code>.
     */
    public Integer getArticleId() {
        return this.articleId;
    }

    /**
     * Setter for <code>evidennewsaggregator.articles.article_id</code>.
     */
    public Articles setArticleId(Integer articleId) {
        this.articleId = articleId;
        return this;
    }

    /**
     * Getter for <code>evidennewsaggregator.articles.title</code>.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>evidennewsaggregator.articles.title</code>.
     */
    public Articles setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>evidennewsaggregator.articles.date</code>.
     */
    public LocalDate getDate() {
        return this.date;
    }

    /**
     * Setter for <code>evidennewsaggregator.articles.date</code>.
     */
    public Articles setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    /**
     * Getter for <code>evidennewsaggregator.articles.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>evidennewsaggregator.articles.description</code>.
     */
    public Articles setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>evidennewsaggregator.articles.rating</code>.
     */
    public Integer getRating() {
        return this.rating;
    }

    /**
     * Setter for <code>evidennewsaggregator.articles.rating</code>.
     */
    public Articles setRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    /**
     * Getter for <code>evidennewsaggregator.articles.source_link</code>.
     */
    public String getSourceLink() {
        return this.sourceLink;
    }

    /**
     * Setter for <code>evidennewsaggregator.articles.source_link</code>.
     */
    public Articles setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
        return this;
    }

    /**
     * Getter for <code>evidennewsaggregator.articles.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>evidennewsaggregator.articles.name</code>.
     */
    public Articles setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>evidennewsaggregator.articles.approved</code>.
     */
    public Byte getApproved() {
        return this.approved;
    }

    /**
     * Setter for <code>evidennewsaggregator.articles.approved</code>.
     */
    public Articles setApproved(Byte approved) {
        this.approved = approved;
        return this;
    }

    /**
     * Getter for <code>evidennewsaggregator.articles.image</code>.
     */
    public String getImage() {
        return this.image;
    }

    /**
     * Setter for <code>evidennewsaggregator.articles.image</code>.
     */
    public Articles setImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Getter for <code>evidennewsaggregator.articles.category_id</code>.
     */
    public Integer getCategoryId() {
        return this.categoryId;
    }

    /**
     * Setter for <code>evidennewsaggregator.articles.category_id</code>.
     */
    public Articles setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * Getter for <code>evidennewsaggregator.articles.user_id</code>.
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>evidennewsaggregator.articles.user_id</code>.
     */
    public Articles setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Articles other = (Articles) obj;
        if (articleId == null) {
            if (other.articleId != null)
                return false;
        }
        else if (!articleId.equals(other.articleId))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        }
        else if (!title.equals(other.title))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        }
        else if (!date.equals(other.date))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (rating == null) {
            if (other.rating != null)
                return false;
        }
        else if (!rating.equals(other.rating))
            return false;
        if (sourceLink == null) {
            if (other.sourceLink != null)
                return false;
        }
        else if (!sourceLink.equals(other.sourceLink))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (approved == null) {
            if (other.approved != null)
                return false;
        }
        else if (!approved.equals(other.approved))
            return false;
        if (image == null) {
            if (other.image != null)
                return false;
        }
        else if (!image.equals(other.image))
            return false;
        if (categoryId == null) {
            if (other.categoryId != null)
                return false;
        }
        else if (!categoryId.equals(other.categoryId))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!userId.equals(other.userId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.articleId == null) ? 0 : this.articleId.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.date == null) ? 0 : this.date.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.rating == null) ? 0 : this.rating.hashCode());
        result = prime * result + ((this.sourceLink == null) ? 0 : this.sourceLink.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.approved == null) ? 0 : this.approved.hashCode());
        result = prime * result + ((this.image == null) ? 0 : this.image.hashCode());
        result = prime * result + ((this.categoryId == null) ? 0 : this.categoryId.hashCode());
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Articles (");

        sb.append(articleId);
        sb.append(", ").append(title);
        sb.append(", ").append(date);
        sb.append(", ").append(description);
        sb.append(", ").append(rating);
        sb.append(", ").append(sourceLink);
        sb.append(", ").append(name);
        sb.append(", ").append(approved);
        sb.append(", ").append(image);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(userId);

        sb.append(")");
        return sb.toString();
    }
}
