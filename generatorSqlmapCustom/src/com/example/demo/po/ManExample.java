package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class ManExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManExample() {
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

        public Criteria andManIdIsNull() {
            addCriterion("man_id is null");
            return (Criteria) this;
        }

        public Criteria andManIdIsNotNull() {
            addCriterion("man_id is not null");
            return (Criteria) this;
        }

        public Criteria andManIdEqualTo(Integer value) {
            addCriterion("man_id =", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotEqualTo(Integer value) {
            addCriterion("man_id <>", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThan(Integer value) {
            addCriterion("man_id >", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("man_id >=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThan(Integer value) {
            addCriterion("man_id <", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThanOrEqualTo(Integer value) {
            addCriterion("man_id <=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdIn(List<Integer> values) {
            addCriterion("man_id in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotIn(List<Integer> values) {
            addCriterion("man_id not in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdBetween(Integer value1, Integer value2) {
            addCriterion("man_id between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotBetween(Integer value1, Integer value2) {
            addCriterion("man_id not between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andManNameIsNull() {
            addCriterion("man_name is null");
            return (Criteria) this;
        }

        public Criteria andManNameIsNotNull() {
            addCriterion("man_name is not null");
            return (Criteria) this;
        }

        public Criteria andManNameEqualTo(String value) {
            addCriterion("man_name =", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotEqualTo(String value) {
            addCriterion("man_name <>", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameGreaterThan(String value) {
            addCriterion("man_name >", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameGreaterThanOrEqualTo(String value) {
            addCriterion("man_name >=", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLessThan(String value) {
            addCriterion("man_name <", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLessThanOrEqualTo(String value) {
            addCriterion("man_name <=", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLike(String value) {
            addCriterion("man_name like", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotLike(String value) {
            addCriterion("man_name not like", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameIn(List<String> values) {
            addCriterion("man_name in", values, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotIn(List<String> values) {
            addCriterion("man_name not in", values, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameBetween(String value1, String value2) {
            addCriterion("man_name between", value1, value2, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotBetween(String value1, String value2) {
            addCriterion("man_name not between", value1, value2, "manName");
            return (Criteria) this;
        }

        public Criteria andManSexIsNull() {
            addCriterion("man_sex is null");
            return (Criteria) this;
        }

        public Criteria andManSexIsNotNull() {
            addCriterion("man_sex is not null");
            return (Criteria) this;
        }

        public Criteria andManSexEqualTo(String value) {
            addCriterion("man_sex =", value, "manSex");
            return (Criteria) this;
        }

        public Criteria andManSexNotEqualTo(String value) {
            addCriterion("man_sex <>", value, "manSex");
            return (Criteria) this;
        }

        public Criteria andManSexGreaterThan(String value) {
            addCriterion("man_sex >", value, "manSex");
            return (Criteria) this;
        }

        public Criteria andManSexGreaterThanOrEqualTo(String value) {
            addCriterion("man_sex >=", value, "manSex");
            return (Criteria) this;
        }

        public Criteria andManSexLessThan(String value) {
            addCriterion("man_sex <", value, "manSex");
            return (Criteria) this;
        }

        public Criteria andManSexLessThanOrEqualTo(String value) {
            addCriterion("man_sex <=", value, "manSex");
            return (Criteria) this;
        }

        public Criteria andManSexLike(String value) {
            addCriterion("man_sex like", value, "manSex");
            return (Criteria) this;
        }

        public Criteria andManSexNotLike(String value) {
            addCriterion("man_sex not like", value, "manSex");
            return (Criteria) this;
        }

        public Criteria andManSexIn(List<String> values) {
            addCriterion("man_sex in", values, "manSex");
            return (Criteria) this;
        }

        public Criteria andManSexNotIn(List<String> values) {
            addCriterion("man_sex not in", values, "manSex");
            return (Criteria) this;
        }

        public Criteria andManSexBetween(String value1, String value2) {
            addCriterion("man_sex between", value1, value2, "manSex");
            return (Criteria) this;
        }

        public Criteria andManSexNotBetween(String value1, String value2) {
            addCriterion("man_sex not between", value1, value2, "manSex");
            return (Criteria) this;
        }

        public Criteria andManAgeIsNull() {
            addCriterion("man_age is null");
            return (Criteria) this;
        }

        public Criteria andManAgeIsNotNull() {
            addCriterion("man_age is not null");
            return (Criteria) this;
        }

        public Criteria andManAgeEqualTo(Integer value) {
            addCriterion("man_age =", value, "manAge");
            return (Criteria) this;
        }

        public Criteria andManAgeNotEqualTo(Integer value) {
            addCriterion("man_age <>", value, "manAge");
            return (Criteria) this;
        }

        public Criteria andManAgeGreaterThan(Integer value) {
            addCriterion("man_age >", value, "manAge");
            return (Criteria) this;
        }

        public Criteria andManAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("man_age >=", value, "manAge");
            return (Criteria) this;
        }

        public Criteria andManAgeLessThan(Integer value) {
            addCriterion("man_age <", value, "manAge");
            return (Criteria) this;
        }

        public Criteria andManAgeLessThanOrEqualTo(Integer value) {
            addCriterion("man_age <=", value, "manAge");
            return (Criteria) this;
        }

        public Criteria andManAgeIn(List<Integer> values) {
            addCriterion("man_age in", values, "manAge");
            return (Criteria) this;
        }

        public Criteria andManAgeNotIn(List<Integer> values) {
            addCriterion("man_age not in", values, "manAge");
            return (Criteria) this;
        }

        public Criteria andManAgeBetween(Integer value1, Integer value2) {
            addCriterion("man_age between", value1, value2, "manAge");
            return (Criteria) this;
        }

        public Criteria andManAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("man_age not between", value1, value2, "manAge");
            return (Criteria) this;
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