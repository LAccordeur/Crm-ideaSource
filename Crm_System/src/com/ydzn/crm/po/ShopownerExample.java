package com.ydzn.crm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShopownerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopownerExample() {
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

        public Criteria andAccountnameIsNull() {
            addCriterion("AccountName is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("AccountName is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("AccountName =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("AccountName <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("AccountName >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("AccountName >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("AccountName <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("AccountName <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("AccountName like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("AccountName not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("AccountName in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("AccountName not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("AccountName between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("AccountName not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountpwdIsNull() {
            addCriterion("AccountPwd is null");
            return (Criteria) this;
        }

        public Criteria andAccountpwdIsNotNull() {
            addCriterion("AccountPwd is not null");
            return (Criteria) this;
        }

        public Criteria andAccountpwdEqualTo(String value) {
            addCriterion("AccountPwd =", value, "accountpwd");
            return (Criteria) this;
        }

        public Criteria andAccountpwdNotEqualTo(String value) {
            addCriterion("AccountPwd <>", value, "accountpwd");
            return (Criteria) this;
        }

        public Criteria andAccountpwdGreaterThan(String value) {
            addCriterion("AccountPwd >", value, "accountpwd");
            return (Criteria) this;
        }

        public Criteria andAccountpwdGreaterThanOrEqualTo(String value) {
            addCriterion("AccountPwd >=", value, "accountpwd");
            return (Criteria) this;
        }

        public Criteria andAccountpwdLessThan(String value) {
            addCriterion("AccountPwd <", value, "accountpwd");
            return (Criteria) this;
        }

        public Criteria andAccountpwdLessThanOrEqualTo(String value) {
            addCriterion("AccountPwd <=", value, "accountpwd");
            return (Criteria) this;
        }

        public Criteria andAccountpwdLike(String value) {
            addCriterion("AccountPwd like", value, "accountpwd");
            return (Criteria) this;
        }

        public Criteria andAccountpwdNotLike(String value) {
            addCriterion("AccountPwd not like", value, "accountpwd");
            return (Criteria) this;
        }

        public Criteria andAccountpwdIn(List<String> values) {
            addCriterion("AccountPwd in", values, "accountpwd");
            return (Criteria) this;
        }

        public Criteria andAccountpwdNotIn(List<String> values) {
            addCriterion("AccountPwd not in", values, "accountpwd");
            return (Criteria) this;
        }

        public Criteria andAccountpwdBetween(String value1, String value2) {
            addCriterion("AccountPwd between", value1, value2, "accountpwd");
            return (Criteria) this;
        }

        public Criteria andAccountpwdNotBetween(String value1, String value2) {
            addCriterion("AccountPwd not between", value1, value2, "accountpwd");
            return (Criteria) this;
        }

        public Criteria andAccountaddressIsNull() {
            addCriterion("AccountAddress is null");
            return (Criteria) this;
        }

        public Criteria andAccountaddressIsNotNull() {
            addCriterion("AccountAddress is not null");
            return (Criteria) this;
        }

        public Criteria andAccountaddressEqualTo(String value) {
            addCriterion("AccountAddress =", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressNotEqualTo(String value) {
            addCriterion("AccountAddress <>", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressGreaterThan(String value) {
            addCriterion("AccountAddress >", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressGreaterThanOrEqualTo(String value) {
            addCriterion("AccountAddress >=", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressLessThan(String value) {
            addCriterion("AccountAddress <", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressLessThanOrEqualTo(String value) {
            addCriterion("AccountAddress <=", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressLike(String value) {
            addCriterion("AccountAddress like", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressNotLike(String value) {
            addCriterion("AccountAddress not like", value, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressIn(List<String> values) {
            addCriterion("AccountAddress in", values, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressNotIn(List<String> values) {
            addCriterion("AccountAddress not in", values, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressBetween(String value1, String value2) {
            addCriterion("AccountAddress between", value1, value2, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andAccountaddressNotBetween(String value1, String value2) {
            addCriterion("AccountAddress not between", value1, value2, "accountaddress");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeIsNull() {
            addCriterion("OpeningTime is null");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeIsNotNull() {
            addCriterion("OpeningTime is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeEqualTo(Date value) {
            addCriterionForJDBCTime("OpeningTime =", value, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("OpeningTime <>", value, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("OpeningTime >", value, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("OpeningTime >=", value, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeLessThan(Date value) {
            addCriterionForJDBCTime("OpeningTime <", value, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("OpeningTime <=", value, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeIn(List<Date> values) {
            addCriterionForJDBCTime("OpeningTime in", values, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("OpeningTime not in", values, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("OpeningTime between", value1, value2, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("OpeningTime not between", value1, value2, "openingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeIsNull() {
            addCriterion("ClosingTime is null");
            return (Criteria) this;
        }

        public Criteria andClosingtimeIsNotNull() {
            addCriterion("ClosingTime is not null");
            return (Criteria) this;
        }

        public Criteria andClosingtimeEqualTo(Date value) {
            addCriterionForJDBCTime("ClosingTime =", value, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("ClosingTime <>", value, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("ClosingTime >", value, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("ClosingTime >=", value, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeLessThan(Date value) {
            addCriterionForJDBCTime("ClosingTime <", value, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("ClosingTime <=", value, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeIn(List<Date> values) {
            addCriterionForJDBCTime("ClosingTime in", values, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("ClosingTime not in", values, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("ClosingTime between", value1, value2, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("ClosingTime not between", value1, value2, "closingtime");
            return (Criteria) this;
        }

        public Criteria andAccountdetailIsNull() {
            addCriterion("AccountDetail is null");
            return (Criteria) this;
        }

        public Criteria andAccountdetailIsNotNull() {
            addCriterion("AccountDetail is not null");
            return (Criteria) this;
        }

        public Criteria andAccountdetailEqualTo(String value) {
            addCriterion("AccountDetail =", value, "accountdetail");
            return (Criteria) this;
        }

        public Criteria andAccountdetailNotEqualTo(String value) {
            addCriterion("AccountDetail <>", value, "accountdetail");
            return (Criteria) this;
        }

        public Criteria andAccountdetailGreaterThan(String value) {
            addCriterion("AccountDetail >", value, "accountdetail");
            return (Criteria) this;
        }

        public Criteria andAccountdetailGreaterThanOrEqualTo(String value) {
            addCriterion("AccountDetail >=", value, "accountdetail");
            return (Criteria) this;
        }

        public Criteria andAccountdetailLessThan(String value) {
            addCriterion("AccountDetail <", value, "accountdetail");
            return (Criteria) this;
        }

        public Criteria andAccountdetailLessThanOrEqualTo(String value) {
            addCriterion("AccountDetail <=", value, "accountdetail");
            return (Criteria) this;
        }

        public Criteria andAccountdetailLike(String value) {
            addCriterion("AccountDetail like", value, "accountdetail");
            return (Criteria) this;
        }

        public Criteria andAccountdetailNotLike(String value) {
            addCriterion("AccountDetail not like", value, "accountdetail");
            return (Criteria) this;
        }

        public Criteria andAccountdetailIn(List<String> values) {
            addCriterion("AccountDetail in", values, "accountdetail");
            return (Criteria) this;
        }

        public Criteria andAccountdetailNotIn(List<String> values) {
            addCriterion("AccountDetail not in", values, "accountdetail");
            return (Criteria) this;
        }

        public Criteria andAccountdetailBetween(String value1, String value2) {
            addCriterion("AccountDetail between", value1, value2, "accountdetail");
            return (Criteria) this;
        }

        public Criteria andAccountdetailNotBetween(String value1, String value2) {
            addCriterion("AccountDetail not between", value1, value2, "accountdetail");
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