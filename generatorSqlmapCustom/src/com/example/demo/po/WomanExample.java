package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class WomanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WomanExample() {
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

        public Criteria andWomIdIsNull() {
            addCriterion("wom_id is null");
            return (Criteria) this;
        }

        public Criteria andWomIdIsNotNull() {
            addCriterion("wom_id is not null");
            return (Criteria) this;
        }

        public Criteria andWomIdEqualTo(Integer value) {
            addCriterion("wom_id =", value, "womId");
            return (Criteria) this;
        }

        public Criteria andWomIdNotEqualTo(Integer value) {
            addCriterion("wom_id <>", value, "womId");
            return (Criteria) this;
        }

        public Criteria andWomIdGreaterThan(Integer value) {
            addCriterion("wom_id >", value, "womId");
            return (Criteria) this;
        }

        public Criteria andWomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wom_id >=", value, "womId");
            return (Criteria) this;
        }

        public Criteria andWomIdLessThan(Integer value) {
            addCriterion("wom_id <", value, "womId");
            return (Criteria) this;
        }

        public Criteria andWomIdLessThanOrEqualTo(Integer value) {
            addCriterion("wom_id <=", value, "womId");
            return (Criteria) this;
        }

        public Criteria andWomIdIn(List<Integer> values) {
            addCriterion("wom_id in", values, "womId");
            return (Criteria) this;
        }

        public Criteria andWomIdNotIn(List<Integer> values) {
            addCriterion("wom_id not in", values, "womId");
            return (Criteria) this;
        }

        public Criteria andWomIdBetween(Integer value1, Integer value2) {
            addCriterion("wom_id between", value1, value2, "womId");
            return (Criteria) this;
        }

        public Criteria andWomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wom_id not between", value1, value2, "womId");
            return (Criteria) this;
        }

        public Criteria andWomNameIsNull() {
            addCriterion("wom_name is null");
            return (Criteria) this;
        }

        public Criteria andWomNameIsNotNull() {
            addCriterion("wom_name is not null");
            return (Criteria) this;
        }

        public Criteria andWomNameEqualTo(String value) {
            addCriterion("wom_name =", value, "womName");
            return (Criteria) this;
        }

        public Criteria andWomNameNotEqualTo(String value) {
            addCriterion("wom_name <>", value, "womName");
            return (Criteria) this;
        }

        public Criteria andWomNameGreaterThan(String value) {
            addCriterion("wom_name >", value, "womName");
            return (Criteria) this;
        }

        public Criteria andWomNameGreaterThanOrEqualTo(String value) {
            addCriterion("wom_name >=", value, "womName");
            return (Criteria) this;
        }

        public Criteria andWomNameLessThan(String value) {
            addCriterion("wom_name <", value, "womName");
            return (Criteria) this;
        }

        public Criteria andWomNameLessThanOrEqualTo(String value) {
            addCriterion("wom_name <=", value, "womName");
            return (Criteria) this;
        }

        public Criteria andWomNameLike(String value) {
            addCriterion("wom_name like", value, "womName");
            return (Criteria) this;
        }

        public Criteria andWomNameNotLike(String value) {
            addCriterion("wom_name not like", value, "womName");
            return (Criteria) this;
        }

        public Criteria andWomNameIn(List<String> values) {
            addCriterion("wom_name in", values, "womName");
            return (Criteria) this;
        }

        public Criteria andWomNameNotIn(List<String> values) {
            addCriterion("wom_name not in", values, "womName");
            return (Criteria) this;
        }

        public Criteria andWomNameBetween(String value1, String value2) {
            addCriterion("wom_name between", value1, value2, "womName");
            return (Criteria) this;
        }

        public Criteria andWomNameNotBetween(String value1, String value2) {
            addCriterion("wom_name not between", value1, value2, "womName");
            return (Criteria) this;
        }

        public Criteria andWomSexIsNull() {
            addCriterion("wom_sex is null");
            return (Criteria) this;
        }

        public Criteria andWomSexIsNotNull() {
            addCriterion("wom_sex is not null");
            return (Criteria) this;
        }

        public Criteria andWomSexEqualTo(String value) {
            addCriterion("wom_sex =", value, "womSex");
            return (Criteria) this;
        }

        public Criteria andWomSexNotEqualTo(String value) {
            addCriterion("wom_sex <>", value, "womSex");
            return (Criteria) this;
        }

        public Criteria andWomSexGreaterThan(String value) {
            addCriterion("wom_sex >", value, "womSex");
            return (Criteria) this;
        }

        public Criteria andWomSexGreaterThanOrEqualTo(String value) {
            addCriterion("wom_sex >=", value, "womSex");
            return (Criteria) this;
        }

        public Criteria andWomSexLessThan(String value) {
            addCriterion("wom_sex <", value, "womSex");
            return (Criteria) this;
        }

        public Criteria andWomSexLessThanOrEqualTo(String value) {
            addCriterion("wom_sex <=", value, "womSex");
            return (Criteria) this;
        }

        public Criteria andWomSexLike(String value) {
            addCriterion("wom_sex like", value, "womSex");
            return (Criteria) this;
        }

        public Criteria andWomSexNotLike(String value) {
            addCriterion("wom_sex not like", value, "womSex");
            return (Criteria) this;
        }

        public Criteria andWomSexIn(List<String> values) {
            addCriterion("wom_sex in", values, "womSex");
            return (Criteria) this;
        }

        public Criteria andWomSexNotIn(List<String> values) {
            addCriterion("wom_sex not in", values, "womSex");
            return (Criteria) this;
        }

        public Criteria andWomSexBetween(String value1, String value2) {
            addCriterion("wom_sex between", value1, value2, "womSex");
            return (Criteria) this;
        }

        public Criteria andWomSexNotBetween(String value1, String value2) {
            addCriterion("wom_sex not between", value1, value2, "womSex");
            return (Criteria) this;
        }

        public Criteria andWomAgeIsNull() {
            addCriterion("wom_age is null");
            return (Criteria) this;
        }

        public Criteria andWomAgeIsNotNull() {
            addCriterion("wom_age is not null");
            return (Criteria) this;
        }

        public Criteria andWomAgeEqualTo(Integer value) {
            addCriterion("wom_age =", value, "womAge");
            return (Criteria) this;
        }

        public Criteria andWomAgeNotEqualTo(Integer value) {
            addCriterion("wom_age <>", value, "womAge");
            return (Criteria) this;
        }

        public Criteria andWomAgeGreaterThan(Integer value) {
            addCriterion("wom_age >", value, "womAge");
            return (Criteria) this;
        }

        public Criteria andWomAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wom_age >=", value, "womAge");
            return (Criteria) this;
        }

        public Criteria andWomAgeLessThan(Integer value) {
            addCriterion("wom_age <", value, "womAge");
            return (Criteria) this;
        }

        public Criteria andWomAgeLessThanOrEqualTo(Integer value) {
            addCriterion("wom_age <=", value, "womAge");
            return (Criteria) this;
        }

        public Criteria andWomAgeIn(List<Integer> values) {
            addCriterion("wom_age in", values, "womAge");
            return (Criteria) this;
        }

        public Criteria andWomAgeNotIn(List<Integer> values) {
            addCriterion("wom_age not in", values, "womAge");
            return (Criteria) this;
        }

        public Criteria andWomAgeBetween(Integer value1, Integer value2) {
            addCriterion("wom_age between", value1, value2, "womAge");
            return (Criteria) this;
        }

        public Criteria andWomAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("wom_age not between", value1, value2, "womAge");
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