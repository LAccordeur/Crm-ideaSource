package com.ydzn.crm.po;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomidIsNull() {
            addCriterion("CustomID is null");
            return (Criteria) this;
        }

        public Criteria andCustomidIsNotNull() {
            addCriterion("CustomID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomidEqualTo(Integer value) {
            addCriterion("CustomID =", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotEqualTo(Integer value) {
            addCriterion("CustomID <>", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidGreaterThan(Integer value) {
            addCriterion("CustomID >", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CustomID >=", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLessThan(Integer value) {
            addCriterion("CustomID <", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLessThanOrEqualTo(Integer value) {
            addCriterion("CustomID <=", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidIn(List<Integer> values) {
            addCriterion("CustomID in", values, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotIn(List<Integer> values) {
            addCriterion("CustomID not in", values, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidBetween(Integer value1, Integer value2) {
            addCriterion("CustomID between", value1, value2, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotBetween(Integer value1, Integer value2) {
            addCriterion("CustomID not between", value1, value2, "customid");
            return (Criteria) this;
        }

        public Criteria andTelephonenumberIsNull() {
            addCriterion("TelephoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andTelephonenumberIsNotNull() {
            addCriterion("TelephoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTelephonenumberEqualTo(String value) {
            addCriterion("TelephoneNumber =", value, "telephonenumber");
            return (Criteria) this;
        }

        public Criteria andTelephonenumberNotEqualTo(String value) {
            addCriterion("TelephoneNumber <>", value, "telephonenumber");
            return (Criteria) this;
        }

        public Criteria andTelephonenumberGreaterThan(String value) {
            addCriterion("TelephoneNumber >", value, "telephonenumber");
            return (Criteria) this;
        }

        public Criteria andTelephonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("TelephoneNumber >=", value, "telephonenumber");
            return (Criteria) this;
        }

        public Criteria andTelephonenumberLessThan(String value) {
            addCriterion("TelephoneNumber <", value, "telephonenumber");
            return (Criteria) this;
        }

        public Criteria andTelephonenumberLessThanOrEqualTo(String value) {
            addCriterion("TelephoneNumber <=", value, "telephonenumber");
            return (Criteria) this;
        }

        public Criteria andTelephonenumberLike(String value) {
            addCriterion("TelephoneNumber like", value, "telephonenumber");
            return (Criteria) this;
        }

        public Criteria andTelephonenumberNotLike(String value) {
            addCriterion("TelephoneNumber not like", value, "telephonenumber");
            return (Criteria) this;
        }

        public Criteria andTelephonenumberIn(List<String> values) {
            addCriterion("TelephoneNumber in", values, "telephonenumber");
            return (Criteria) this;
        }

        public Criteria andTelephonenumberNotIn(List<String> values) {
            addCriterion("TelephoneNumber not in", values, "telephonenumber");
            return (Criteria) this;
        }

        public Criteria andTelephonenumberBetween(String value1, String value2) {
            addCriterion("TelephoneNumber between", value1, value2, "telephonenumber");
            return (Criteria) this;
        }

        public Criteria andTelephonenumberNotBetween(String value1, String value2) {
            addCriterion("TelephoneNumber not between", value1, value2, "telephonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomnameIsNull() {
            addCriterion("CustomName is null");
            return (Criteria) this;
        }

        public Criteria andCustomnameIsNotNull() {
            addCriterion("CustomName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomnameEqualTo(String value) {
            addCriterion("CustomName =", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotEqualTo(String value) {
            addCriterion("CustomName <>", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameGreaterThan(String value) {
            addCriterion("CustomName >", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameGreaterThanOrEqualTo(String value) {
            addCriterion("CustomName >=", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLessThan(String value) {
            addCriterion("CustomName <", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLessThanOrEqualTo(String value) {
            addCriterion("CustomName <=", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLike(String value) {
            addCriterion("CustomName like", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotLike(String value) {
            addCriterion("CustomName not like", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameIn(List<String> values) {
            addCriterion("CustomName in", values, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotIn(List<String> values) {
            addCriterion("CustomName not in", values, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameBetween(String value1, String value2) {
            addCriterion("CustomName between", value1, value2, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotBetween(String value1, String value2) {
            addCriterion("CustomName not between", value1, value2, "customname");
            return (Criteria) this;
        }

        public Criteria andBonuspointIsNull() {
            addCriterion("BonusPoint is null");
            return (Criteria) this;
        }

        public Criteria andBonuspointIsNotNull() {
            addCriterion("BonusPoint is not null");
            return (Criteria) this;
        }

        public Criteria andBonuspointEqualTo(Long value) {
            addCriterion("BonusPoint =", value, "bonuspoint");
            return (Criteria) this;
        }

        public Criteria andBonuspointNotEqualTo(Long value) {
            addCriterion("BonusPoint <>", value, "bonuspoint");
            return (Criteria) this;
        }

        public Criteria andBonuspointGreaterThan(Long value) {
            addCriterion("BonusPoint >", value, "bonuspoint");
            return (Criteria) this;
        }

        public Criteria andBonuspointGreaterThanOrEqualTo(Long value) {
            addCriterion("BonusPoint >=", value, "bonuspoint");
            return (Criteria) this;
        }

        public Criteria andBonuspointLessThan(Long value) {
            addCriterion("BonusPoint <", value, "bonuspoint");
            return (Criteria) this;
        }

        public Criteria andBonuspointLessThanOrEqualTo(Long value) {
            addCriterion("BonusPoint <=", value, "bonuspoint");
            return (Criteria) this;
        }

        public Criteria andBonuspointIn(List<Long> values) {
            addCriterion("BonusPoint in", values, "bonuspoint");
            return (Criteria) this;
        }

        public Criteria andBonuspointNotIn(List<Long> values) {
            addCriterion("BonusPoint not in", values, "bonuspoint");
            return (Criteria) this;
        }

        public Criteria andBonuspointBetween(Long value1, Long value2) {
            addCriterion("BonusPoint between", value1, value2, "bonuspoint");
            return (Criteria) this;
        }

        public Criteria andBonuspointNotBetween(Long value1, Long value2) {
            addCriterion("BonusPoint not between", value1, value2, "bonuspoint");
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