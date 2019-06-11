package com.example.gj.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPayExample() {
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

        public Criteria andPayNoIsNull() {
            addCriterion("Pay_no is null");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNotNull() {
            addCriterion("Pay_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayNoEqualTo(String value) {
            addCriterion("Pay_no =", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotEqualTo(String value) {
            addCriterion("Pay_no <>", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThan(String value) {
            addCriterion("Pay_no >", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("Pay_no >=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThan(String value) {
            addCriterion("Pay_no <", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThanOrEqualTo(String value) {
            addCriterion("Pay_no <=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLike(String value) {
            addCriterion("Pay_no like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotLike(String value) {
            addCriterion("Pay_no not like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoIn(List<String> values) {
            addCriterion("Pay_no in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotIn(List<String> values) {
            addCriterion("Pay_no not in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoBetween(String value1, String value2) {
            addCriterion("Pay_no between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotBetween(String value1, String value2) {
            addCriterion("Pay_no not between", value1, value2, "payNo");
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

        public Criteria andZfcodeinspIsNull() {
            addCriterion("Zfcodeinsp is null");
            return (Criteria) this;
        }

        public Criteria andZfcodeinspIsNotNull() {
            addCriterion("Zfcodeinsp is not null");
            return (Criteria) this;
        }

        public Criteria andZfcodeinspEqualTo(String value) {
            addCriterion("Zfcodeinsp =", value, "zfcodeinsp");
            return (Criteria) this;
        }

        public Criteria andZfcodeinspNotEqualTo(String value) {
            addCriterion("Zfcodeinsp <>", value, "zfcodeinsp");
            return (Criteria) this;
        }

        public Criteria andZfcodeinspGreaterThan(String value) {
            addCriterion("Zfcodeinsp >", value, "zfcodeinsp");
            return (Criteria) this;
        }

        public Criteria andZfcodeinspGreaterThanOrEqualTo(String value) {
            addCriterion("Zfcodeinsp >=", value, "zfcodeinsp");
            return (Criteria) this;
        }

        public Criteria andZfcodeinspLessThan(String value) {
            addCriterion("Zfcodeinsp <", value, "zfcodeinsp");
            return (Criteria) this;
        }

        public Criteria andZfcodeinspLessThanOrEqualTo(String value) {
            addCriterion("Zfcodeinsp <=", value, "zfcodeinsp");
            return (Criteria) this;
        }

        public Criteria andZfcodeinspLike(String value) {
            addCriterion("Zfcodeinsp like", value, "zfcodeinsp");
            return (Criteria) this;
        }

        public Criteria andZfcodeinspNotLike(String value) {
            addCriterion("Zfcodeinsp not like", value, "zfcodeinsp");
            return (Criteria) this;
        }

        public Criteria andZfcodeinspIn(List<String> values) {
            addCriterion("Zfcodeinsp in", values, "zfcodeinsp");
            return (Criteria) this;
        }

        public Criteria andZfcodeinspNotIn(List<String> values) {
            addCriterion("Zfcodeinsp not in", values, "zfcodeinsp");
            return (Criteria) this;
        }

        public Criteria andZfcodeinspBetween(String value1, String value2) {
            addCriterion("Zfcodeinsp between", value1, value2, "zfcodeinsp");
            return (Criteria) this;
        }

        public Criteria andZfcodeinspNotBetween(String value1, String value2) {
            addCriterion("Zfcodeinsp not between", value1, value2, "zfcodeinsp");
            return (Criteria) this;
        }

        public Criteria andZfnameIsNull() {
            addCriterion("Zfname is null");
            return (Criteria) this;
        }

        public Criteria andZfnameIsNotNull() {
            addCriterion("Zfname is not null");
            return (Criteria) this;
        }

        public Criteria andZfnameEqualTo(String value) {
            addCriterion("Zfname =", value, "zfname");
            return (Criteria) this;
        }

        public Criteria andZfnameNotEqualTo(String value) {
            addCriterion("Zfname <>", value, "zfname");
            return (Criteria) this;
        }

        public Criteria andZfnameGreaterThan(String value) {
            addCriterion("Zfname >", value, "zfname");
            return (Criteria) this;
        }

        public Criteria andZfnameGreaterThanOrEqualTo(String value) {
            addCriterion("Zfname >=", value, "zfname");
            return (Criteria) this;
        }

        public Criteria andZfnameLessThan(String value) {
            addCriterion("Zfname <", value, "zfname");
            return (Criteria) this;
        }

        public Criteria andZfnameLessThanOrEqualTo(String value) {
            addCriterion("Zfname <=", value, "zfname");
            return (Criteria) this;
        }

        public Criteria andZfnameLike(String value) {
            addCriterion("Zfname like", value, "zfname");
            return (Criteria) this;
        }

        public Criteria andZfnameNotLike(String value) {
            addCriterion("Zfname not like", value, "zfname");
            return (Criteria) this;
        }

        public Criteria andZfnameIn(List<String> values) {
            addCriterion("Zfname in", values, "zfname");
            return (Criteria) this;
        }

        public Criteria andZfnameNotIn(List<String> values) {
            addCriterion("Zfname not in", values, "zfname");
            return (Criteria) this;
        }

        public Criteria andZfnameBetween(String value1, String value2) {
            addCriterion("Zfname between", value1, value2, "zfname");
            return (Criteria) this;
        }

        public Criteria andZfnameNotBetween(String value1, String value2) {
            addCriterion("Zfname not between", value1, value2, "zfname");
            return (Criteria) this;
        }

        public Criteria andPayNameIsNull() {
            addCriterion("Pay_name is null");
            return (Criteria) this;
        }

        public Criteria andPayNameIsNotNull() {
            addCriterion("Pay_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayNameEqualTo(String value) {
            addCriterion("Pay_name =", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotEqualTo(String value) {
            addCriterion("Pay_name <>", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameGreaterThan(String value) {
            addCriterion("Pay_name >", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameGreaterThanOrEqualTo(String value) {
            addCriterion("Pay_name >=", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLessThan(String value) {
            addCriterion("Pay_name <", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLessThanOrEqualTo(String value) {
            addCriterion("Pay_name <=", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLike(String value) {
            addCriterion("Pay_name like", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotLike(String value) {
            addCriterion("Pay_name not like", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameIn(List<String> values) {
            addCriterion("Pay_name in", values, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotIn(List<String> values) {
            addCriterion("Pay_name not in", values, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameBetween(String value1, String value2) {
            addCriterion("Pay_name between", value1, value2, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotBetween(String value1, String value2) {
            addCriterion("Pay_name not between", value1, value2, "payName");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNull() {
            addCriterion("Pay_Money is null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNotNull() {
            addCriterion("Pay_Money is not null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyEqualTo(Float value) {
            addCriterion("Pay_Money =", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotEqualTo(Float value) {
            addCriterion("Pay_Money <>", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThan(Float value) {
            addCriterion("Pay_Money >", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("Pay_Money >=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThan(Float value) {
            addCriterion("Pay_Money <", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThanOrEqualTo(Float value) {
            addCriterion("Pay_Money <=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIn(List<Float> values) {
            addCriterion("Pay_Money in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotIn(List<Float> values) {
            addCriterion("Pay_Money not in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyBetween(Float value1, Float value2) {
            addCriterion("Pay_Money between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotBetween(Float value1, Float value2) {
            addCriterion("Pay_Money not between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("Pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("Pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("Pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("Pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("Pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("Pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("Pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("Pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("Pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("Pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("Pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("Pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("Pay_type not between", value1, value2, "payType");
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