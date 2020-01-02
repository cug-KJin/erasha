package com.example.demoweb.orm.model.auto.tbl_article;

public class TblArticle {
    private String article_id;

    private String article_title;

    private Byte article_status;

    private String create_time;

    private String modify_time;

    private String article_publish_time;

    private String type_id;

    private String tag_list;

    private String article_content;

    public String getArticle_id() {
        return article_id;
    }

    public void setArticle_id(String article_id) {
        this.article_id = article_id == null ? null : article_id.trim();
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title == null ? null : article_title.trim();
    }

    public Byte getArticle_status() {
        return article_status;
    }

    public void setArticle_status(Byte article_status) {
        this.article_status = article_status;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time == null ? null : create_time.trim();
    }

    public String getModify_time() {
        return modify_time;
    }

    public void setModify_time(String modify_time) {
        this.modify_time = modify_time == null ? null : modify_time.trim();
    }

    public String getArticle_publish_time() {
        return article_publish_time;
    }

    public void setArticle_publish_time(String article_publish_time) {
        this.article_publish_time = article_publish_time == null ? null : article_publish_time.trim();
    }

    public String getType_id() {
        return type_id;
    }

    public void setType_id(String type_id) {
        this.type_id = type_id == null ? null : type_id.trim();
    }

    public String getTag_list() {
        return tag_list;
    }

    public void setTag_list(String tag_list) {
        this.tag_list = tag_list == null ? null : tag_list.trim();
    }

    public String getArticle_content() {
        return article_content;
    }

    public void setArticle_content(String article_content) {
        this.article_content = article_content == null ? null : article_content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", article_id=").append(article_id);
        sb.append(", article_title=").append(article_title);
        sb.append(", article_status=").append(article_status);
        sb.append(", create_time=").append(create_time);
        sb.append(", modify_time=").append(modify_time);
        sb.append(", article_publish_time=").append(article_publish_time);
        sb.append(", type_id=").append(type_id);
        sb.append(", tag_list=").append(tag_list);
        sb.append(", article_content=").append(article_content);
        sb.append("]");
        return sb.toString();
    }
}