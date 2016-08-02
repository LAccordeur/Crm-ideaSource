package com.ydzn.crm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andActivityidIsNull() {
            addCriterion("ActivityID is null");
            return (Criteria) this;
        }

        public Criteria andActivityidIsNotNull() {
            addCriterion("ActivityID is not null");
            return (Criteria) this;
        }

        public Criteria andActivityidEqualTo(Integer value) {
            addCriterion("ActivityID =", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotEqualTo(Integer value) {
            addCriterion("ActivityID <>", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThan(Integer value) {
            addCriterion("ActivityID >", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ActivityID >=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThan(Integer value) {
            addCriterion("ActivityID <", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThanOrEqualTo(Integer value) {
            addCriterion("ActivityID <=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidIn(List<Integer> values) {
            addCriterion("ActivityID in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotIn(List<Integer> values) {
            addCriterion("ActivityID not in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidBetween(Integer value1, Integer value2) {
            addCriterion("ActivityID between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotBetween(Integer value1, Integer value2) {
            addCriterion("ActivityID not between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivitynameIsNull() {
            addCriterion("ActivityName is null");
            return (Criteria) this;
        }

        public Criteria andActivitynameIsNotNull() {
            addCriterion("ActivityName is not null");
            return (Criteria) this;
        }

        public Criteria andActivitynameEqualTo(String value) {
            addCriterion("ActivityName =", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotEqualTo(String value) {
            addCriterion("ActivityName <>", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameGreaterThan(String value) {
            addCriterion("ActivityName >", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameGreaterThanOrEqualTo(String value) {
            addCriterion("ActivityName >=", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLessThan(String value) {
            addCriterion("ActivityName <", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLessThanOrEqualTo(String value) {
            addCriterion("ActivityName <=", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLike(String value) {
            addCriterion("ActivityName like", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotLike(String value) {
            addCriterion("ActivityName not like", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameIn(List<String> values) {
            addCriterion("ActivityName in", values, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotIn(List<String> values) {
            addCriterion("ActivityName not in", values, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameBetween(String value1, String value2) {
            addCriterion("ActivityName between", value1, value2, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotBetween(String value1, String value2) {
            addCriterion("ActivityName not between", value1, value2, "activityname");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNull() {
            addCriterion("AccountID is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("AccountID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(Integer value) {
            addCriterion("AccountID =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(Integer value) {
            addCriterion("AccountID <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(Integer value) {
            addCriterion("AccountID >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccountID >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(Integer value) {
            addCriterion("AccountID <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(Integer value) {
            addCriterion("AccountID <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<Integer> values) {
            addCriterion("AccountID in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<Integer> values) {
            addCriterion("AccountID not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(Integer value1, Integer value2) {
            addCriterion("AccountID between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(Integer value1, Integer value2) {
            addCriterion("AccountID not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeIsNull() {
            addCriterion("ActivityStartTime is null");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeIsNotNull() {
            addCriterion("ActivityStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("ActivityStartTime =", value, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ActivityStartTime <>", value, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ActivityStartTime >", value, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ActivityStartTime >=", value, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeLessThan(Date value) {
            addCriterionForJDBCDate("ActivityStartTime <", value, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ActivityStartTime <=", value, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("ActivityStartTime in", values, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ActivityStartTime not in", values, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ActivityStartTime between", value1, value2, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitystarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ActivityStartTime not between", value1, value2, "activitystarttime");
            return (Criteria) this;
        }

        public Criteria andActivitycuttimeIsNull() {
            addCriterion("ActivityCutTime is null");
            return (Criteria) this;
        }

        public Criteria andActivitycuttimeIsNotNull() {
            addCriterion("ActivityCutTime is not null");
            return (Criteria) this;
        }

        public Criteria andActivitycuttimeEqualTo(Date value) {
            addCriterionForJDBCTime("ActivityCutTime =", value, "activitycuttime");
            return (Criteria) this;
        }

        public Criteria andActivitycuttimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("ActivityCutTime <>", value, "activitycuttime");
            return (Criteria) this;
        }

        public Criteria andActivitycuttimeGreaterThan(Date value) {
            addCriterionForJDBCTime("ActivityCutTime >", value, "activitycuttime");
            return (Criteria) this;
        }

        public Criteria andActivitycuttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("ActivityCutTime >=", value, "activitycuttime");
            return (Criteria) this;
        }

        public Criteria andActivitycuttimeLessThan(Date value) {
            addCriterionForJDBCTime("ActivityCutTime <", value, "activitycuttime");
            return (Criteria) this;
        }

        public Criteria andActivitycuttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("ActivityCutTime <=", value, "activitycuttime");
            return (Criteria) this;
        }

        public Criteria andActivitycuttimeIn(List<Date> values) {
            addCriterionForJDBCTime("ActivityCutTime in", values, "activitycuttime");
            return (Criteria) this;
        }

        public Criteria andActivitycuttimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("ActivityCutTime not in", values, "activitycuttime");
            return (Criteria) this;
        }

        public Criteria andActivitycuttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("ActivityCutTime between", value1, value2, "activitycuttime");
            return (Criteria) this;
        }

        public Criteria andActivitycuttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("ActivityCutTime not between", value1, value2, "activitycuttime");
            return (Criteria) this;
        }

        public Criteria andActivitydetailIsNull() {
            addCriterion("ActivityDetail is null");
            return (Criteria) this;
        }

        public Criteria andActivitydetailIsNotNull() {
            addCriterion("ActivityDetail is not null");
            return (Criteria) this;
        }

        public Criteria andActivitydetailEqualTo(String value) {
            addCriterion("ActivityDetail =", value, "activitydetail");
            return (Criteria) this;
        }

        public Criteria andActivitydetailNotEqualTo(String value) {
            addCriterion("ActivityDetail <>", value, "activitydetail");
            return (Criteria) this;
        }

        public Criteria andActivitydetailGreaterThan(String value) {
            addCriterion("ActivityDetail >", value, "activitydetail");
            return (Criteria) this;
        }

        public Criteria andActivitydetailGreaterThanOrEqualTo(String value) {
            addCriterion("ActivityDetail >=", value, "activitydetail");
            return (Criteria) this;
        }

        public Criteria andActivitydetailLessThan(String value) {
            addCriterion("ActivityDetail <", value, "activitydetail");
            return (Criteria) this;
        }

        public Criteria andActivitydetailLessThanOrEqualTo(String value) {
            addCriterion("ActivityDetail <=", value, "activitydetail");
            return (Criteria) this;
        }

        public Criteria andActivitydetailLike(String value) {
            addCriterion("ActivityDetail like", value, "activitydetail");
            return (Criteria) this;
        }

        public Criteria andActivitydetailNotLike(String value) {
            addCriterion("ActivityDetail not like", value, "activitydetail");
            return (Criteria) this;
        }

        public Criteria andActivitydetailIn(List<String> values) {
            addCriterion("ActivityDetail in", values, "activitydetail");
            return (Criteria) this;
        }

        public Criteria andActivitydetailNotIn(List<String> values) {
            addCriterion("ActivityDetail not in", values, "activitydetail");
            return (Criteria) this;
        }

        public Criteria andActivitydetailBetween(String value1, String value2) {
            addCriterion("ActivityDetail between", value1, value2, "activitydetail");
            return (Criteria) this;
        }

        public Criteria andActivitydetailNotBetween(String value1, String value2) {
            addCriterion("ActivityDetail not between", value1, value2, "activitydetail");
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