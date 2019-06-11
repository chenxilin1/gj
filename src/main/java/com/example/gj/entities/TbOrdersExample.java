package com.example.gj.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrdersExample() {
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

        public Criteria andOrdersNoIsNull() {
            addCriterion("orders_no is null");
            return (Criteria) this;
        }

        public Criteria andOrdersNoIsNotNull() {
            addCriterion("orders_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersNoEqualTo(String value) {
            addCriterion("orders_no =", value, "ordersNo");
            return (Criteria) this;
        }

        public Criteria andOrdersNoNotEqualTo(String value) {
            addCriterion("orders_no <>", value, "ordersNo");
            return (Criteria) this;
        }

        public Criteria andOrdersNoGreaterThan(String value) {
            addCriterion("orders_no >", value, "ordersNo");
            return (Criteria) this;
        }

        public Criteria andOrdersNoGreaterThanOrEqualTo(String value) {
            addCriterion("orders_no >=", value, "ordersNo");
            return (Criteria) this;
        }

        public Criteria andOrdersNoLessThan(String value) {
            addCriterion("orders_no <", value, "ordersNo");
            return (Criteria) this;
        }

        public Criteria andOrdersNoLessThanOrEqualTo(String value) {
            addCriterion("orders_no <=", value, "ordersNo");
            return (Criteria) this;
        }

        public Criteria andOrdersNoLike(String value) {
            addCriterion("orders_no like", value, "ordersNo");
            return (Criteria) this;
        }

        public Criteria andOrdersNoNotLike(String value) {
            addCriterion("orders_no not like", value, "ordersNo");
            return (Criteria) this;
        }

        public Criteria andOrdersNoIn(List<String> values) {
            addCriterion("orders_no in", values, "ordersNo");
            return (Criteria) this;
        }

        public Criteria andOrdersNoNotIn(List<String> values) {
            addCriterion("orders_no not in", values, "ordersNo");
            return (Criteria) this;
        }

        public Criteria andOrdersNoBetween(String value1, String value2) {
            addCriterion("orders_no between", value1, value2, "ordersNo");
            return (Criteria) this;
        }

        public Criteria andOrdersNoNotBetween(String value1, String value2) {
            addCriterion("orders_no not between", value1, value2, "ordersNo");
            return (Criteria) this;
        }

        public Criteria andCbenameIsNull() {
            addCriterion("Cbename is null");
            return (Criteria) this;
        }

        public Criteria andCbenameIsNotNull() {
            addCriterion("Cbename is not null");
            return (Criteria) this;
        }

        public Criteria andCbenameEqualTo(String value) {
            addCriterion("Cbename =", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameNotEqualTo(String value) {
            addCriterion("Cbename <>", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameGreaterThan(String value) {
            addCriterion("Cbename >", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameGreaterThanOrEqualTo(String value) {
            addCriterion("Cbename >=", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameLessThan(String value) {
            addCriterion("Cbename <", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameLessThanOrEqualTo(String value) {
            addCriterion("Cbename <=", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameLike(String value) {
            addCriterion("Cbename like", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameNotLike(String value) {
            addCriterion("Cbename not like", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameIn(List<String> values) {
            addCriterion("Cbename in", values, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameNotIn(List<String> values) {
            addCriterion("Cbename not in", values, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameBetween(String value1, String value2) {
            addCriterion("Cbename between", value1, value2, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameNotBetween(String value1, String value2) {
            addCriterion("Cbename not between", value1, value2, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspIsNull() {
            addCriterion("cbecodeinsp is null");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspIsNotNull() {
            addCriterion("cbecodeinsp is not null");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspEqualTo(String value) {
            addCriterion("cbecodeinsp =", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspNotEqualTo(String value) {
            addCriterion("cbecodeinsp <>", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspGreaterThan(String value) {
            addCriterion("cbecodeinsp >", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspGreaterThanOrEqualTo(String value) {
            addCriterion("cbecodeinsp >=", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspLessThan(String value) {
            addCriterion("cbecodeinsp <", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspLessThanOrEqualTo(String value) {
            addCriterion("cbecodeinsp <=", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspLike(String value) {
            addCriterion("cbecodeinsp like", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspNotLike(String value) {
            addCriterion("cbecodeinsp not like", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspIn(List<String> values) {
            addCriterion("cbecodeinsp in", values, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspNotIn(List<String> values) {
            addCriterion("cbecodeinsp not in", values, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspBetween(String value1, String value2) {
            addCriterion("cbecodeinsp between", value1, value2, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspNotBetween(String value1, String value2) {
            addCriterion("cbecodeinsp not between", value1, value2, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNull() {
            addCriterion("Goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("Goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(Integer value) {
            addCriterion("Goods_number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(Integer value) {
            addCriterion("Goods_number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(Integer value) {
            addCriterion("Goods_number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(Integer value) {
            addCriterion("Goods_number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<Integer> values) {
            addCriterion("Goods_number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<Integer> values) {
            addCriterion("Goods_number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(Integer value1, Integer value2) {
            addCriterion("Goods_number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("User_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("User_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("User_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("User_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("User_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("User_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("User_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("User_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("User_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("User_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("User_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("User_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("User_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("User_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNull() {
            addCriterion("Total_Money is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("Total_Money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(Float value) {
            addCriterion("Total_Money =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(Float value) {
            addCriterion("Total_Money <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(Float value) {
            addCriterion("Total_Money >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("Total_Money >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(Float value) {
            addCriterion("Total_Money <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(Float value) {
            addCriterion("Total_Money <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<Float> values) {
            addCriterion("Total_Money in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<Float> values) {
            addCriterion("Total_Money not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(Float value1, Float value2) {
            addCriterion("Total_Money between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(Float value1, Float value2) {
            addCriterion("Total_Money not between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("Create_Time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("Create_Time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("Create_Time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("Create_Time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("Create_Time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Create_Time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("Create_Time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Create_Time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("Create_Time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("Create_Time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("Create_Time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Create_Time not between", value1, value2, "createTime");
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