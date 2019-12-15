package com.example.demoweb.orm.model.auto.users;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUSERIsNull() {
            addCriterion("`USER` is null");
            return (Criteria) this;
        }

        public Criteria andUSERIsNotNull() {
            addCriterion("`USER` is not null");
            return (Criteria) this;
        }

        public Criteria andUSEREqualTo(String value) {
            addCriterion("`USER` =", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERNotEqualTo(String value) {
            addCriterion("`USER` <>", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERGreaterThan(String value) {
            addCriterion("`USER` >", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERGreaterThanOrEqualTo(String value) {
            addCriterion("`USER` >=", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERLessThan(String value) {
            addCriterion("`USER` <", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERLessThanOrEqualTo(String value) {
            addCriterion("`USER` <=", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERLike(String value) {
            addCriterion("`USER` like", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERNotLike(String value) {
            addCriterion("`USER` not like", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERIn(List<String> values) {
            addCriterion("`USER` in", values, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERNotIn(List<String> values) {
            addCriterion("`USER` not in", values, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERBetween(String value1, String value2) {
            addCriterion("`USER` between", value1, value2, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERNotBetween(String value1, String value2) {
            addCriterion("`USER` not between", value1, value2, "USER");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSIsNull() {
            addCriterion("CURRENT_CONNECTIONS is null");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSIsNotNull() {
            addCriterion("CURRENT_CONNECTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSEqualTo(Long value) {
            addCriterion("CURRENT_CONNECTIONS =", value, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSNotEqualTo(Long value) {
            addCriterion("CURRENT_CONNECTIONS <>", value, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSGreaterThan(Long value) {
            addCriterion("CURRENT_CONNECTIONS >", value, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSGreaterThanOrEqualTo(Long value) {
            addCriterion("CURRENT_CONNECTIONS >=", value, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSLessThan(Long value) {
            addCriterion("CURRENT_CONNECTIONS <", value, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSLessThanOrEqualTo(Long value) {
            addCriterion("CURRENT_CONNECTIONS <=", value, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSIn(List<Long> values) {
            addCriterion("CURRENT_CONNECTIONS in", values, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSNotIn(List<Long> values) {
            addCriterion("CURRENT_CONNECTIONS not in", values, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSBetween(Long value1, Long value2) {
            addCriterion("CURRENT_CONNECTIONS between", value1, value2, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSNotBetween(Long value1, Long value2) {
            addCriterion("CURRENT_CONNECTIONS not between", value1, value2, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSIsNull() {
            addCriterion("TOTAL_CONNECTIONS is null");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSIsNotNull() {
            addCriterion("TOTAL_CONNECTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSEqualTo(Long value) {
            addCriterion("TOTAL_CONNECTIONS =", value, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSNotEqualTo(Long value) {
            addCriterion("TOTAL_CONNECTIONS <>", value, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSGreaterThan(Long value) {
            addCriterion("TOTAL_CONNECTIONS >", value, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_CONNECTIONS >=", value, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSLessThan(Long value) {
            addCriterion("TOTAL_CONNECTIONS <", value, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_CONNECTIONS <=", value, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSIn(List<Long> values) {
            addCriterion("TOTAL_CONNECTIONS in", values, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSNotIn(List<Long> values) {
            addCriterion("TOTAL_CONNECTIONS not in", values, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSBetween(Long value1, Long value2) {
            addCriterion("TOTAL_CONNECTIONS between", value1, value2, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_CONNECTIONS not between", value1, value2, "TOTAL_CONNECTIONS");
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