package com.example.gj.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrdersdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrdersdetailsExample() {
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

        public Criteria andOrdersdetailsNoIsNull() {
            addCriterion("ordersDetails_no is null");
            return (Criteria) this;
        }

        public Criteria andOrdersdetailsNoIsNotNull() {
            addCriterion("ordersDetails_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersdetailsNoEqualTo(String value) {
            addCriterion("ordersDetails_no =", value, "ordersdetailsNo");
            return (Criteria) this;
        }

        public Criteria andOrdersdetailsNoNotEqualTo(String value) {
            addCriterion("ordersDetails_no <>", value, "ordersdetailsNo");
            return (Criteria) this;
        }

        public Criteria andOrdersdetailsNoGreaterThan(String value) {
            addCriterion("ordersDetails_no >", value, "ordersdetailsNo");
            return (Criteria) this;
        }

        public Criteria andOrdersdetailsNoGreaterThanOrEqualTo(String value) {
            addCriterion("ordersDetails_no >=", value, "ordersdetailsNo");
            return (Criteria) this;
        }

        public Criteria andOrdersdetailsNoLessThan(String value) {
            addCriterion("ordersDetails_no <", value, "ordersdetailsNo");
            return (Criteria) this;
        }

        public Criteria andOrdersdetailsNoLessThanOrEqualTo(String value) {
            addCriterion("ordersDetails_no <=", value, "ordersdetailsNo");
            return (Criteria) this;
        }

        public Criteria andOrdersdetailsNoLike(String value) {
            addCriterion("ordersDetails_no like", value, "ordersdetailsNo");
            return (Criteria) this;
        }

        public Criteria andOrdersdetailsNoNotLike(String value) {
            addCriterion("ordersDetails_no not like", value, "ordersdetailsNo");
            return (Criteria) this;
        }

        public Criteria andOrdersdetailsNoIn(List<String> values) {
            addCriterion("ordersDetails_no in", values, "ordersdetailsNo");
            return (Criteria) this;
        }

        public Criteria andOrdersdetailsNoNotIn(List<String> values) {
            addCriterion("ordersDetails_no not in", values, "ordersdetailsNo");
            return (Criteria) this;
        }

        public Criteria andOrdersdetailsNoBetween(String value1, String value2) {
            addCriterion("ordersDetails_no between", value1, value2, "ordersdetailsNo");
            return (Criteria) this;
        }

        public Criteria andOrdersdetailsNoNotBetween(String value1, String value2) {
            addCriterion("ordersDetails_no not between", value1, value2, "ordersdetailsNo");
            return (Criteria) this;
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

        public Criteria andGoodsNoIsNull() {
            addCriterion("Goods_no is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIsNotNull() {
            addCriterion("Goods_no is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoEqualTo(String value) {
            addCriterion("Goods_no =", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotEqualTo(String value) {
            addCriterion("Goods_no <>", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThan(String value) {
            addCriterion("Goods_no >", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_no >=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThan(String value) {
            addCriterion("Goods_no <", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThanOrEqualTo(String value) {
            addCriterion("Goods_no <=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLike(String value) {
            addCriterion("Goods_no like", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotLike(String value) {
            addCriterion("Goods_no not like", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIn(List<String> values) {
            addCriterion("Goods_no in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotIn(List<String> values) {
            addCriterion("Goods_no not in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoBetween(String value1, String value2) {
            addCriterion("Goods_no between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotBetween(String value1, String value2) {
            addCriterion("Goods_no not between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("Goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("Goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("Goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("Goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("Goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("Goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("Goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("Goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("Goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("Goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("Goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("Goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("Goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsinspIsNull() {
            addCriterion("Goodsinsp is null");
            return (Criteria) this;
        }

        public Criteria andGoodsinspIsNotNull() {
            addCriterion("Goodsinsp is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsinspEqualTo(String value) {
            addCriterion("Goodsinsp =", value, "goodsinsp");
            return (Criteria) this;
        }

        public Criteria andGoodsinspNotEqualTo(String value) {
            addCriterion("Goodsinsp <>", value, "goodsinsp");
            return (Criteria) this;
        }

        public Criteria andGoodsinspGreaterThan(String value) {
            addCriterion("Goodsinsp >", value, "goodsinsp");
            return (Criteria) this;
        }

        public Criteria andGoodsinspGreaterThanOrEqualTo(String value) {
            addCriterion("Goodsinsp >=", value, "goodsinsp");
            return (Criteria) this;
        }

        public Criteria andGoodsinspLessThan(String value) {
            addCriterion("Goodsinsp <", value, "goodsinsp");
            return (Criteria) this;
        }

        public Criteria andGoodsinspLessThanOrEqualTo(String value) {
            addCriterion("Goodsinsp <=", value, "goodsinsp");
            return (Criteria) this;
        }

        public Criteria andGoodsinspLike(String value) {
            addCriterion("Goodsinsp like", value, "goodsinsp");
            return (Criteria) this;
        }

        public Criteria andGoodsinspNotLike(String value) {
            addCriterion("Goodsinsp not like", value, "goodsinsp");
            return (Criteria) this;
        }

        public Criteria andGoodsinspIn(List<String> values) {
            addCriterion("Goodsinsp in", values, "goodsinsp");
            return (Criteria) this;
        }

        public Criteria andGoodsinspNotIn(List<String> values) {
            addCriterion("Goodsinsp not in", values, "goodsinsp");
            return (Criteria) this;
        }

        public Criteria andGoodsinspBetween(String value1, String value2) {
            addCriterion("Goodsinsp between", value1, value2, "goodsinsp");
            return (Criteria) this;
        }

        public Criteria andGoodsinspNotBetween(String value1, String value2) {
            addCriterion("Goodsinsp not between", value1, value2, "goodsinsp");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("Goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("Goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(Float value) {
            addCriterion("Goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Float value) {
            addCriterion("Goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Float value) {
            addCriterion("Goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Float value) {
            addCriterion("Goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Float value) {
            addCriterion("Goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Float> values) {
            addCriterion("Goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Float> values) {
            addCriterion("Goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Float value1, Float value2) {
            addCriterion("Goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Float value1, Float value2) {
            addCriterion("Goods_price not between", value1, value2, "goodsPrice");
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

        public Criteria andTotalIsNull() {
            addCriterion("Total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("Total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Float value) {
            addCriterion("Total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Float value) {
            addCriterion("Total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Float value) {
            addCriterion("Total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("Total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Float value) {
            addCriterion("Total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Float value) {
            addCriterion("Total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Float> values) {
            addCriterion("Total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Float> values) {
            addCriterion("Total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Float value1, Float value2) {
            addCriterion("Total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Float value1, Float value2) {
            addCriterion("Total not between", value1, value2, "total");
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