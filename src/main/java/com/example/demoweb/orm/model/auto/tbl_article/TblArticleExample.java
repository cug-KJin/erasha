package com.example.demoweb.orm.model.auto.tbl_article;

import java.util.ArrayList;
import java.util.List;

public class TblArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andArticle_idIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticle_idIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_idEqualTo(String value) {
            addCriterion("article_id =", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idNotEqualTo(String value) {
            addCriterion("article_id <>", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idGreaterThan(String value) {
            addCriterion("article_id >", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idGreaterThanOrEqualTo(String value) {
            addCriterion("article_id >=", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idLessThan(String value) {
            addCriterion("article_id <", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idLessThanOrEqualTo(String value) {
            addCriterion("article_id <=", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idLike(String value) {
            addCriterion("article_id like", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idNotLike(String value) {
            addCriterion("article_id not like", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idIn(List<String> values) {
            addCriterion("article_id in", values, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idNotIn(List<String> values) {
            addCriterion("article_id not in", values, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idBetween(String value1, String value2) {
            addCriterion("article_id between", value1, value2, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idNotBetween(String value1, String value2) {
            addCriterion("article_id not between", value1, value2, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_titleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticle_titleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_titleEqualTo(String value) {
            addCriterion("article_title =", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleGreaterThan(String value) {
            addCriterion("article_title >", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleLessThan(String value) {
            addCriterion("article_title <", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleLike(String value) {
            addCriterion("article_title like", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleNotLike(String value) {
            addCriterion("article_title not like", value, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleIn(List<String> values) {
            addCriterion("article_title in", values, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_titleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "article_title");
            return (Criteria) this;
        }

        public Criteria andArticle_statusIsNull() {
            addCriterion("article_status is null");
            return (Criteria) this;
        }

        public Criteria andArticle_statusIsNotNull() {
            addCriterion("article_status is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_statusEqualTo(Byte value) {
            addCriterion("article_status =", value, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusNotEqualTo(Byte value) {
            addCriterion("article_status <>", value, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusGreaterThan(Byte value) {
            addCriterion("article_status >", value, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("article_status >=", value, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusLessThan(Byte value) {
            addCriterion("article_status <", value, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusLessThanOrEqualTo(Byte value) {
            addCriterion("article_status <=", value, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusIn(List<Byte> values) {
            addCriterion("article_status in", values, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusNotIn(List<Byte> values) {
            addCriterion("article_status not in", values, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusBetween(Byte value1, Byte value2) {
            addCriterion("article_status between", value1, value2, "article_status");
            return (Criteria) this;
        }

        public Criteria andArticle_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("article_status not between", value1, value2, "article_status");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(String value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(String value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(String value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLike(String value) {
            addCriterion("create_time like", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotLike(String value) {
            addCriterion("create_time not like", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<String> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModify_timeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModify_timeEqualTo(String value) {
            addCriterion("modify_time =", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeNotEqualTo(String value) {
            addCriterion("modify_time <>", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeGreaterThan(String value) {
            addCriterion("modify_time >", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeGreaterThanOrEqualTo(String value) {
            addCriterion("modify_time >=", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeLessThan(String value) {
            addCriterion("modify_time <", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeLessThanOrEqualTo(String value) {
            addCriterion("modify_time <=", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeLike(String value) {
            addCriterion("modify_time like", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeNotLike(String value) {
            addCriterion("modify_time not like", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeIn(List<String> values) {
            addCriterion("modify_time in", values, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeNotIn(List<String> values) {
            addCriterion("modify_time not in", values, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeBetween(String value1, String value2) {
            addCriterion("modify_time between", value1, value2, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeNotBetween(String value1, String value2) {
            addCriterion("modify_time not between", value1, value2, "modify_time");
            return (Criteria) this;
        }

        public Criteria andArticle_publish_timeIsNull() {
            addCriterion("article_publish_time is null");
            return (Criteria) this;
        }

        public Criteria andArticle_publish_timeIsNotNull() {
            addCriterion("article_publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_publish_timeEqualTo(String value) {
            addCriterion("article_publish_time =", value, "article_publish_time");
            return (Criteria) this;
        }

        public Criteria andArticle_publish_timeNotEqualTo(String value) {
            addCriterion("article_publish_time <>", value, "article_publish_time");
            return (Criteria) this;
        }

        public Criteria andArticle_publish_timeGreaterThan(String value) {
            addCriterion("article_publish_time >", value, "article_publish_time");
            return (Criteria) this;
        }

        public Criteria andArticle_publish_timeGreaterThanOrEqualTo(String value) {
            addCriterion("article_publish_time >=", value, "article_publish_time");
            return (Criteria) this;
        }

        public Criteria andArticle_publish_timeLessThan(String value) {
            addCriterion("article_publish_time <", value, "article_publish_time");
            return (Criteria) this;
        }

        public Criteria andArticle_publish_timeLessThanOrEqualTo(String value) {
            addCriterion("article_publish_time <=", value, "article_publish_time");
            return (Criteria) this;
        }

        public Criteria andArticle_publish_timeLike(String value) {
            addCriterion("article_publish_time like", value, "article_publish_time");
            return (Criteria) this;
        }

        public Criteria andArticle_publish_timeNotLike(String value) {
            addCriterion("article_publish_time not like", value, "article_publish_time");
            return (Criteria) this;
        }

        public Criteria andArticle_publish_timeIn(List<String> values) {
            addCriterion("article_publish_time in", values, "article_publish_time");
            return (Criteria) this;
        }

        public Criteria andArticle_publish_timeNotIn(List<String> values) {
            addCriterion("article_publish_time not in", values, "article_publish_time");
            return (Criteria) this;
        }

        public Criteria andArticle_publish_timeBetween(String value1, String value2) {
            addCriterion("article_publish_time between", value1, value2, "article_publish_time");
            return (Criteria) this;
        }

        public Criteria andArticle_publish_timeNotBetween(String value1, String value2) {
            addCriterion("article_publish_time not between", value1, value2, "article_publish_time");
            return (Criteria) this;
        }

        public Criteria andType_idIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andType_idIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andType_idEqualTo(String value) {
            addCriterion("type_id =", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idNotEqualTo(String value) {
            addCriterion("type_id <>", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idGreaterThan(String value) {
            addCriterion("type_id >", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idGreaterThanOrEqualTo(String value) {
            addCriterion("type_id >=", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idLessThan(String value) {
            addCriterion("type_id <", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idLessThanOrEqualTo(String value) {
            addCriterion("type_id <=", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idLike(String value) {
            addCriterion("type_id like", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idNotLike(String value) {
            addCriterion("type_id not like", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idIn(List<String> values) {
            addCriterion("type_id in", values, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idNotIn(List<String> values) {
            addCriterion("type_id not in", values, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idBetween(String value1, String value2) {
            addCriterion("type_id between", value1, value2, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idNotBetween(String value1, String value2) {
            addCriterion("type_id not between", value1, value2, "type_id");
            return (Criteria) this;
        }

        public Criteria andTag_listIsNull() {
            addCriterion("tag_list is null");
            return (Criteria) this;
        }

        public Criteria andTag_listIsNotNull() {
            addCriterion("tag_list is not null");
            return (Criteria) this;
        }

        public Criteria andTag_listEqualTo(String value) {
            addCriterion("tag_list =", value, "tag_list");
            return (Criteria) this;
        }

        public Criteria andTag_listNotEqualTo(String value) {
            addCriterion("tag_list <>", value, "tag_list");
            return (Criteria) this;
        }

        public Criteria andTag_listGreaterThan(String value) {
            addCriterion("tag_list >", value, "tag_list");
            return (Criteria) this;
        }

        public Criteria andTag_listGreaterThanOrEqualTo(String value) {
            addCriterion("tag_list >=", value, "tag_list");
            return (Criteria) this;
        }

        public Criteria andTag_listLessThan(String value) {
            addCriterion("tag_list <", value, "tag_list");
            return (Criteria) this;
        }

        public Criteria andTag_listLessThanOrEqualTo(String value) {
            addCriterion("tag_list <=", value, "tag_list");
            return (Criteria) this;
        }

        public Criteria andTag_listLike(String value) {
            addCriterion("tag_list like", value, "tag_list");
            return (Criteria) this;
        }

        public Criteria andTag_listNotLike(String value) {
            addCriterion("tag_list not like", value, "tag_list");
            return (Criteria) this;
        }

        public Criteria andTag_listIn(List<String> values) {
            addCriterion("tag_list in", values, "tag_list");
            return (Criteria) this;
        }

        public Criteria andTag_listNotIn(List<String> values) {
            addCriterion("tag_list not in", values, "tag_list");
            return (Criteria) this;
        }

        public Criteria andTag_listBetween(String value1, String value2) {
            addCriterion("tag_list between", value1, value2, "tag_list");
            return (Criteria) this;
        }

        public Criteria andTag_listNotBetween(String value1, String value2) {
            addCriterion("tag_list not between", value1, value2, "tag_list");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}