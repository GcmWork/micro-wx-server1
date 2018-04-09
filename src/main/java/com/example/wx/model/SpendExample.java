package com.example.wx.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpendExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserbhIsNull() {
            addCriterion("userbh is null");
            return (Criteria) this;
        }

        public Criteria andUserbhIsNotNull() {
            addCriterion("userbh is not null");
            return (Criteria) this;
        }

        public Criteria andUserbhEqualTo(String value) {
            addCriterion("userbh =", value, "userbh");
            return (Criteria) this;
        }

        public Criteria andUserbhNotEqualTo(String value) {
            addCriterion("userbh <>", value, "userbh");
            return (Criteria) this;
        }

        public Criteria andUserbhGreaterThan(String value) {
            addCriterion("userbh >", value, "userbh");
            return (Criteria) this;
        }

        public Criteria andUserbhGreaterThanOrEqualTo(String value) {
            addCriterion("userbh >=", value, "userbh");
            return (Criteria) this;
        }

        public Criteria andUserbhLessThan(String value) {
            addCriterion("userbh <", value, "userbh");
            return (Criteria) this;
        }

        public Criteria andUserbhLessThanOrEqualTo(String value) {
            addCriterion("userbh <=", value, "userbh");
            return (Criteria) this;
        }

        public Criteria andUserbhLike(String value) {
            addCriterion("userbh like", value, "userbh");
            return (Criteria) this;
        }

        public Criteria andUserbhNotLike(String value) {
            addCriterion("userbh not like", value, "userbh");
            return (Criteria) this;
        }

        public Criteria andUserbhIn(List<String> values) {
            addCriterion("userbh in", values, "userbh");
            return (Criteria) this;
        }

        public Criteria andUserbhNotIn(List<String> values) {
            addCriterion("userbh not in", values, "userbh");
            return (Criteria) this;
        }

        public Criteria andUserbhBetween(String value1, String value2) {
            addCriterion("userbh between", value1, value2, "userbh");
            return (Criteria) this;
        }

        public Criteria andUserbhNotBetween(String value1, String value2) {
            addCriterion("userbh not between", value1, value2, "userbh");
            return (Criteria) this;
        }

        public Criteria andSpendtypeIsNull() {
            addCriterion("spendtype is null");
            return (Criteria) this;
        }

        public Criteria andSpendtypeIsNotNull() {
            addCriterion("spendtype is not null");
            return (Criteria) this;
        }

        public Criteria andSpendtypeEqualTo(String value) {
            addCriterion("spendtype =", value, "spendtype");
            return (Criteria) this;
        }

        public Criteria andSpendtypeNotEqualTo(String value) {
            addCriterion("spendtype <>", value, "spendtype");
            return (Criteria) this;
        }

        public Criteria andSpendtypeGreaterThan(String value) {
            addCriterion("spendtype >", value, "spendtype");
            return (Criteria) this;
        }

        public Criteria andSpendtypeGreaterThanOrEqualTo(String value) {
            addCriterion("spendtype >=", value, "spendtype");
            return (Criteria) this;
        }

        public Criteria andSpendtypeLessThan(String value) {
            addCriterion("spendtype <", value, "spendtype");
            return (Criteria) this;
        }

        public Criteria andSpendtypeLessThanOrEqualTo(String value) {
            addCriterion("spendtype <=", value, "spendtype");
            return (Criteria) this;
        }

        public Criteria andSpendtypeLike(String value) {
            addCriterion("spendtype like", value, "spendtype");
            return (Criteria) this;
        }

        public Criteria andSpendtypeNotLike(String value) {
            addCriterion("spendtype not like", value, "spendtype");
            return (Criteria) this;
        }

        public Criteria andSpendtypeIn(List<String> values) {
            addCriterion("spendtype in", values, "spendtype");
            return (Criteria) this;
        }

        public Criteria andSpendtypeNotIn(List<String> values) {
            addCriterion("spendtype not in", values, "spendtype");
            return (Criteria) this;
        }

        public Criteria andSpendtypeBetween(String value1, String value2) {
            addCriterion("spendtype between", value1, value2, "spendtype");
            return (Criteria) this;
        }

        public Criteria andSpendtypeNotBetween(String value1, String value2) {
            addCriterion("spendtype not between", value1, value2, "spendtype");
            return (Criteria) this;
        }

        public Criteria andSpendtimeIsNull() {
            addCriterion("spendtime is null");
            return (Criteria) this;
        }

        public Criteria andSpendtimeIsNotNull() {
            addCriterion("spendtime is not null");
            return (Criteria) this;
        }

        public Criteria andSpendtimeEqualTo(Date value) {
            addCriterion("spendtime =", value, "spendtime");
            return (Criteria) this;
        }

        public Criteria andSpendtimeNotEqualTo(Date value) {
            addCriterion("spendtime <>", value, "spendtime");
            return (Criteria) this;
        }

        public Criteria andSpendtimeGreaterThan(Date value) {
            addCriterion("spendtime >", value, "spendtime");
            return (Criteria) this;
        }

        public Criteria andSpendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spendtime >=", value, "spendtime");
            return (Criteria) this;
        }

        public Criteria andSpendtimeLessThan(Date value) {
            addCriterion("spendtime <", value, "spendtime");
            return (Criteria) this;
        }

        public Criteria andSpendtimeLessThanOrEqualTo(Date value) {
            addCriterion("spendtime <=", value, "spendtime");
            return (Criteria) this;
        }

        public Criteria andSpendtimeIn(List<Date> values) {
            addCriterion("spendtime in", values, "spendtime");
            return (Criteria) this;
        }

        public Criteria andSpendtimeNotIn(List<Date> values) {
            addCriterion("spendtime not in", values, "spendtime");
            return (Criteria) this;
        }

        public Criteria andSpendtimeBetween(Date value1, Date value2) {
            addCriterion("spendtime between", value1, value2, "spendtime");
            return (Criteria) this;
        }

        public Criteria andSpendtimeNotBetween(Date value1, Date value2) {
            addCriterion("spendtime not between", value1, value2, "spendtime");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andEndpointIsNull() {
            addCriterion("endpoint is null");
            return (Criteria) this;
        }

        public Criteria andEndpointIsNotNull() {
            addCriterion("endpoint is not null");
            return (Criteria) this;
        }

        public Criteria andEndpointEqualTo(String value) {
            addCriterion("endpoint =", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotEqualTo(String value) {
            addCriterion("endpoint <>", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointGreaterThan(String value) {
            addCriterion("endpoint >", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointGreaterThanOrEqualTo(String value) {
            addCriterion("endpoint >=", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointLessThan(String value) {
            addCriterion("endpoint <", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointLessThanOrEqualTo(String value) {
            addCriterion("endpoint <=", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointLike(String value) {
            addCriterion("endpoint like", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotLike(String value) {
            addCriterion("endpoint not like", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointIn(List<String> values) {
            addCriterion("endpoint in", values, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotIn(List<String> values) {
            addCriterion("endpoint not in", values, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointBetween(String value1, String value2) {
            addCriterion("endpoint between", value1, value2, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotBetween(String value1, String value2) {
            addCriterion("endpoint not between", value1, value2, "endpoint");
            return (Criteria) this;
        }

        public Criteria andBeforeamountIsNull() {
            addCriterion("beforeamount is null");
            return (Criteria) this;
        }

        public Criteria andBeforeamountIsNotNull() {
            addCriterion("beforeamount is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeamountEqualTo(BigDecimal value) {
            addCriterion("beforeamount =", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountNotEqualTo(BigDecimal value) {
            addCriterion("beforeamount <>", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountGreaterThan(BigDecimal value) {
            addCriterion("beforeamount >", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("beforeamount >=", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountLessThan(BigDecimal value) {
            addCriterion("beforeamount <", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("beforeamount <=", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountIn(List<BigDecimal> values) {
            addCriterion("beforeamount in", values, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountNotIn(List<BigDecimal> values) {
            addCriterion("beforeamount not in", values, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beforeamount between", value1, value2, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beforeamount not between", value1, value2, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAfteramountIsNull() {
            addCriterion("afteramount is null");
            return (Criteria) this;
        }

        public Criteria andAfteramountIsNotNull() {
            addCriterion("afteramount is not null");
            return (Criteria) this;
        }

        public Criteria andAfteramountEqualTo(BigDecimal value) {
            addCriterion("afteramount =", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountNotEqualTo(BigDecimal value) {
            addCriterion("afteramount <>", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountGreaterThan(BigDecimal value) {
            addCriterion("afteramount >", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("afteramount >=", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountLessThan(BigDecimal value) {
            addCriterion("afteramount <", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("afteramount <=", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountIn(List<BigDecimal> values) {
            addCriterion("afteramount in", values, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountNotIn(List<BigDecimal> values) {
            addCriterion("afteramount not in", values, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("afteramount between", value1, value2, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("afteramount not between", value1, value2, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAddfieldIsNull() {
            addCriterion("addfield is null");
            return (Criteria) this;
        }

        public Criteria andAddfieldIsNotNull() {
            addCriterion("addfield is not null");
            return (Criteria) this;
        }

        public Criteria andAddfieldEqualTo(String value) {
            addCriterion("addfield =", value, "addfield");
            return (Criteria) this;
        }

        public Criteria andAddfieldNotEqualTo(String value) {
            addCriterion("addfield <>", value, "addfield");
            return (Criteria) this;
        }

        public Criteria andAddfieldGreaterThan(String value) {
            addCriterion("addfield >", value, "addfield");
            return (Criteria) this;
        }

        public Criteria andAddfieldGreaterThanOrEqualTo(String value) {
            addCriterion("addfield >=", value, "addfield");
            return (Criteria) this;
        }

        public Criteria andAddfieldLessThan(String value) {
            addCriterion("addfield <", value, "addfield");
            return (Criteria) this;
        }

        public Criteria andAddfieldLessThanOrEqualTo(String value) {
            addCriterion("addfield <=", value, "addfield");
            return (Criteria) this;
        }

        public Criteria andAddfieldLike(String value) {
            addCriterion("addfield like", value, "addfield");
            return (Criteria) this;
        }

        public Criteria andAddfieldNotLike(String value) {
            addCriterion("addfield not like", value, "addfield");
            return (Criteria) this;
        }

        public Criteria andAddfieldIn(List<String> values) {
            addCriterion("addfield in", values, "addfield");
            return (Criteria) this;
        }

        public Criteria andAddfieldNotIn(List<String> values) {
            addCriterion("addfield not in", values, "addfield");
            return (Criteria) this;
        }

        public Criteria andAddfieldBetween(String value1, String value2) {
            addCriterion("addfield between", value1, value2, "addfield");
            return (Criteria) this;
        }

        public Criteria andAddfieldNotBetween(String value1, String value2) {
            addCriterion("addfield not between", value1, value2, "addfield");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("isdel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("isdel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(Integer value) {
            addCriterion("isdel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(Integer value) {
            addCriterion("isdel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(Integer value) {
            addCriterion("isdel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(Integer value) {
            addCriterion("isdel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("isdel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<Integer> values) {
            addCriterion("isdel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<Integer> values) {
            addCriterion("isdel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(Integer value1, Integer value2) {
            addCriterion("isdel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("isdel not between", value1, value2, "isdel");
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