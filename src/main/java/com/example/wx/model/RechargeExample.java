package com.example.wx.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargeExample() {
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

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("mobilephone =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("mobilephone <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("mobilephone >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobilephone >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("mobilephone <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("mobilephone <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("mobilephone like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("mobilephone not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("mobilephone in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("mobilephone not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("mobilephone between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("mobilephone not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andRechargeamountIsNull() {
            addCriterion("rechargeamount is null");
            return (Criteria) this;
        }

        public Criteria andRechargeamountIsNotNull() {
            addCriterion("rechargeamount is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeamountEqualTo(BigDecimal value) {
            addCriterion("rechargeamount =", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountNotEqualTo(BigDecimal value) {
            addCriterion("rechargeamount <>", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountGreaterThan(BigDecimal value) {
            addCriterion("rechargeamount >", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rechargeamount >=", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountLessThan(BigDecimal value) {
            addCriterion("rechargeamount <", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rechargeamount <=", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountIn(List<BigDecimal> values) {
            addCriterion("rechargeamount in", values, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountNotIn(List<BigDecimal> values) {
            addCriterion("rechargeamount not in", values, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rechargeamount between", value1, value2, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rechargeamount not between", value1, value2, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargedateIsNull() {
            addCriterion("rechargedate is null");
            return (Criteria) this;
        }

        public Criteria andRechargedateIsNotNull() {
            addCriterion("rechargedate is not null");
            return (Criteria) this;
        }

        public Criteria andRechargedateEqualTo(Date value) {
            addCriterion("rechargedate =", value, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateNotEqualTo(Date value) {
            addCriterion("rechargedate <>", value, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateGreaterThan(Date value) {
            addCriterion("rechargedate >", value, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateGreaterThanOrEqualTo(Date value) {
            addCriterion("rechargedate >=", value, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateLessThan(Date value) {
            addCriterion("rechargedate <", value, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateLessThanOrEqualTo(Date value) {
            addCriterion("rechargedate <=", value, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateIn(List<Date> values) {
            addCriterion("rechargedate in", values, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateNotIn(List<Date> values) {
            addCriterion("rechargedate not in", values, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateBetween(Date value1, Date value2) {
            addCriterion("rechargedate between", value1, value2, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargedateNotBetween(Date value1, Date value2) {
            addCriterion("rechargedate not between", value1, value2, "rechargedate");
            return (Criteria) this;
        }

        public Criteria andRechargestatusIsNull() {
            addCriterion("rechargestatus is null");
            return (Criteria) this;
        }

        public Criteria andRechargestatusIsNotNull() {
            addCriterion("rechargestatus is not null");
            return (Criteria) this;
        }

        public Criteria andRechargestatusEqualTo(String value) {
            addCriterion("rechargestatus =", value, "rechargestatus");
            return (Criteria) this;
        }

        public Criteria andRechargestatusNotEqualTo(String value) {
            addCriterion("rechargestatus <>", value, "rechargestatus");
            return (Criteria) this;
        }

        public Criteria andRechargestatusGreaterThan(String value) {
            addCriterion("rechargestatus >", value, "rechargestatus");
            return (Criteria) this;
        }

        public Criteria andRechargestatusGreaterThanOrEqualTo(String value) {
            addCriterion("rechargestatus >=", value, "rechargestatus");
            return (Criteria) this;
        }

        public Criteria andRechargestatusLessThan(String value) {
            addCriterion("rechargestatus <", value, "rechargestatus");
            return (Criteria) this;
        }

        public Criteria andRechargestatusLessThanOrEqualTo(String value) {
            addCriterion("rechargestatus <=", value, "rechargestatus");
            return (Criteria) this;
        }

        public Criteria andRechargestatusLike(String value) {
            addCriterion("rechargestatus like", value, "rechargestatus");
            return (Criteria) this;
        }

        public Criteria andRechargestatusNotLike(String value) {
            addCriterion("rechargestatus not like", value, "rechargestatus");
            return (Criteria) this;
        }

        public Criteria andRechargestatusIn(List<String> values) {
            addCriterion("rechargestatus in", values, "rechargestatus");
            return (Criteria) this;
        }

        public Criteria andRechargestatusNotIn(List<String> values) {
            addCriterion("rechargestatus not in", values, "rechargestatus");
            return (Criteria) this;
        }

        public Criteria andRechargestatusBetween(String value1, String value2) {
            addCriterion("rechargestatus between", value1, value2, "rechargestatus");
            return (Criteria) this;
        }

        public Criteria andRechargestatusNotBetween(String value1, String value2) {
            addCriterion("rechargestatus not between", value1, value2, "rechargestatus");
            return (Criteria) this;
        }

        public Criteria andRelationidIsNull() {
            addCriterion("relationid is null");
            return (Criteria) this;
        }

        public Criteria andRelationidIsNotNull() {
            addCriterion("relationid is not null");
            return (Criteria) this;
        }

        public Criteria andRelationidEqualTo(Long value) {
            addCriterion("relationid =", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotEqualTo(Long value) {
            addCriterion("relationid <>", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidGreaterThan(Long value) {
            addCriterion("relationid >", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidGreaterThanOrEqualTo(Long value) {
            addCriterion("relationid >=", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLessThan(Long value) {
            addCriterion("relationid <", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLessThanOrEqualTo(Long value) {
            addCriterion("relationid <=", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidIn(List<Long> values) {
            addCriterion("relationid in", values, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotIn(List<Long> values) {
            addCriterion("relationid not in", values, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidBetween(Long value1, Long value2) {
            addCriterion("relationid between", value1, value2, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotBetween(Long value1, Long value2) {
            addCriterion("relationid not between", value1, value2, "relationid");
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

        public Criteria andStudentnameIsNull() {
            addCriterion("studentname is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("studentname is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("studentname =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("studentname <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("studentname >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("studentname >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("studentname <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("studentname <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("studentname like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("studentname not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("studentname in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("studentname not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("studentname between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("studentname not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andParentnameIsNull() {
            addCriterion("parentname is null");
            return (Criteria) this;
        }

        public Criteria andParentnameIsNotNull() {
            addCriterion("parentname is not null");
            return (Criteria) this;
        }

        public Criteria andParentnameEqualTo(String value) {
            addCriterion("parentname =", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotEqualTo(String value) {
            addCriterion("parentname <>", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameGreaterThan(String value) {
            addCriterion("parentname >", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameGreaterThanOrEqualTo(String value) {
            addCriterion("parentname >=", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLessThan(String value) {
            addCriterion("parentname <", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLessThanOrEqualTo(String value) {
            addCriterion("parentname <=", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLike(String value) {
            addCriterion("parentname like", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotLike(String value) {
            addCriterion("parentname not like", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameIn(List<String> values) {
            addCriterion("parentname in", values, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotIn(List<String> values) {
            addCriterion("parentname not in", values, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameBetween(String value1, String value2) {
            addCriterion("parentname between", value1, value2, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotBetween(String value1, String value2) {
            addCriterion("parentname not between", value1, value2, "parentname");
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