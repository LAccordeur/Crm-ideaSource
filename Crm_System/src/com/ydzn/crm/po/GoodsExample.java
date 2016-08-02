package com.ydzn.crm.po;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsidIsNull() {
            addCriterion("GoodsID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("GoodsID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("GoodsID =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("GoodsID <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("GoodsID >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsID >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("GoodsID <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsID <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("GoodsID in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("GoodsID not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("GoodsID between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsID not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("GoodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("GoodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("GoodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("GoodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("GoodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("GoodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("GoodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("GoodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("GoodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("GoodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("GoodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("GoodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("GoodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyIsNull() {
            addCriterion("GoodsMoney is null");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyIsNotNull() {
            addCriterion("GoodsMoney is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyEqualTo(Float value) {
            addCriterion("GoodsMoney =", value, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyNotEqualTo(Float value) {
            addCriterion("GoodsMoney <>", value, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyGreaterThan(Float value) {
            addCriterion("GoodsMoney >", value, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("GoodsMoney >=", value, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyLessThan(Float value) {
            addCriterion("GoodsMoney <", value, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyLessThanOrEqualTo(Float value) {
            addCriterion("GoodsMoney <=", value, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyIn(List<Float> values) {
            addCriterion("GoodsMoney in", values, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyNotIn(List<Float> values) {
            addCriterion("GoodsMoney not in", values, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyBetween(Float value1, Float value2) {
            addCriterion("GoodsMoney between", value1, value2, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsmoneyNotBetween(Float value1, Float value2) {
            addCriterion("GoodsMoney not between", value1, value2, "goodsmoney");
            return (Criteria) this;
        }

        public Criteria andGoodsstorageIsNull() {
            addCriterion("GoodsStorage is null");
            return (Criteria) this;
        }

        public Criteria andGoodsstorageIsNotNull() {
            addCriterion("GoodsStorage is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsstorageEqualTo(Long value) {
            addCriterion("GoodsStorage =", value, "goodsstorage");
            return (Criteria) this;
        }

        public Criteria andGoodsstorageNotEqualTo(Long value) {
            addCriterion("GoodsStorage <>", value, "goodsstorage");
            return (Criteria) this;
        }

        public Criteria andGoodsstorageGreaterThan(Long value) {
            addCriterion("GoodsStorage >", value, "goodsstorage");
            return (Criteria) this;
        }

        public Criteria andGoodsstorageGreaterThanOrEqualTo(Long value) {
            addCriterion("GoodsStorage >=", value, "goodsstorage");
            return (Criteria) this;
        }

        public Criteria andGoodsstorageLessThan(Long value) {
            addCriterion("GoodsStorage <", value, "goodsstorage");
            return (Criteria) this;
        }

        public Criteria andGoodsstorageLessThanOrEqualTo(Long value) {
            addCriterion("GoodsStorage <=", value, "goodsstorage");
            return (Criteria) this;
        }

        public Criteria andGoodsstorageIn(List<Long> values) {
            addCriterion("GoodsStorage in", values, "goodsstorage");
            return (Criteria) this;
        }

        public Criteria andGoodsstorageNotIn(List<Long> values) {
            addCriterion("GoodsStorage not in", values, "goodsstorage");
            return (Criteria) this;
        }

        public Criteria andGoodsstorageBetween(Long value1, Long value2) {
            addCriterion("GoodsStorage between", value1, value2, "goodsstorage");
            return (Criteria) this;
        }

        public Criteria andGoodsstorageNotBetween(Long value1, Long value2) {
            addCriterion("GoodsStorage not between", value1, value2, "goodsstorage");
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