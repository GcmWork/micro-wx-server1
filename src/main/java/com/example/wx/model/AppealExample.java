package com.example.wx.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppealExample() {
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

        public Criteria andPoarentnameIsNull() {
            addCriterion("poarentname is null");
            return (Criteria) this;
        }

        public Criteria andPoarentnameIsNotNull() {
            addCriterion("poarentname is not null");
            return (Criteria) this;
        }

        public Criteria andPoarentnameEqualTo(String value) {
            addCriterion("poarentname =", value, "poarentname");
            return (Criteria) this;
        }

        public Criteria andPoarentnameNotEqualTo(String value) {
            addCriterion("poarentname <>", value, "poarentname");
            return (Criteria) this;
        }

        public Criteria andPoarentnameGreaterThan(String value) {
            addCriterion("poarentname >", value, "poarentname");
            return (Criteria) this;
        }

        public Criteria andPoarentnameGreaterThanOrEqualTo(String value) {
            addCriterion("poarentname >=", value, "poarentname");
            return (Criteria) this;
        }

        public Criteria andPoarentnameLessThan(String value) {
            addCriterion("poarentname <", value, "poarentname");
            return (Criteria) this;
        }

        public Criteria andPoarentnameLessThanOrEqualTo(String value) {
            addCriterion("poarentname <=", value, "poarentname");
            return (Criteria) this;
        }

        public Criteria andPoarentnameLike(String value) {
            addCriterion("poarentname like", value, "poarentname");
            return (Criteria) this;
        }

        public Criteria andPoarentnameNotLike(String value) {
            addCriterion("poarentname not like", value, "poarentname");
            return (Criteria) this;
        }

        public Criteria andPoarentnameIn(List<String> values) {
            addCriterion("poarentname in", values, "poarentname");
            return (Criteria) this;
        }

        public Criteria andPoarentnameNotIn(List<String> values) {
            addCriterion("poarentname not in", values, "poarentname");
            return (Criteria) this;
        }

        public Criteria andPoarentnameBetween(String value1, String value2) {
            addCriterion("poarentname between", value1, value2, "poarentname");
            return (Criteria) this;
        }

        public Criteria andPoarentnameNotBetween(String value1, String value2) {
            addCriterion("poarentname not between", value1, value2, "poarentname");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("relation like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("relation not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("relation not between", value1, value2, "relation");
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

        public Criteria andAppealtimeIsNull() {
            addCriterion("appealtime is null");
            return (Criteria) this;
        }

        public Criteria andAppealtimeIsNotNull() {
            addCriterion("appealtime is not null");
            return (Criteria) this;
        }

        public Criteria andAppealtimeEqualTo(Date value) {
            addCriterion("appealtime =", value, "appealtime");
            return (Criteria) this;
        }

        public Criteria andAppealtimeNotEqualTo(Date value) {
            addCriterion("appealtime <>", value, "appealtime");
            return (Criteria) this;
        }

        public Criteria andAppealtimeGreaterThan(Date value) {
            addCriterion("appealtime >", value, "appealtime");
            return (Criteria) this;
        }

        public Criteria andAppealtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appealtime >=", value, "appealtime");
            return (Criteria) this;
        }

        public Criteria andAppealtimeLessThan(Date value) {
            addCriterion("appealtime <", value, "appealtime");
            return (Criteria) this;
        }

        public Criteria andAppealtimeLessThanOrEqualTo(Date value) {
            addCriterion("appealtime <=", value, "appealtime");
            return (Criteria) this;
        }

        public Criteria andAppealtimeIn(List<Date> values) {
            addCriterion("appealtime in", values, "appealtime");
            return (Criteria) this;
        }

        public Criteria andAppealtimeNotIn(List<Date> values) {
            addCriterion("appealtime not in", values, "appealtime");
            return (Criteria) this;
        }

        public Criteria andAppealtimeBetween(Date value1, Date value2) {
            addCriterion("appealtime between", value1, value2, "appealtime");
            return (Criteria) this;
        }

        public Criteria andAppealtimeNotBetween(Date value1, Date value2) {
            addCriterion("appealtime not between", value1, value2, "appealtime");
            return (Criteria) this;
        }

        public Criteria andAppealtypeIsNull() {
            addCriterion("appealtype is null");
            return (Criteria) this;
        }

        public Criteria andAppealtypeIsNotNull() {
            addCriterion("appealtype is not null");
            return (Criteria) this;
        }

        public Criteria andAppealtypeEqualTo(Integer value) {
            addCriterion("appealtype =", value, "appealtype");
            return (Criteria) this;
        }

        public Criteria andAppealtypeNotEqualTo(Integer value) {
            addCriterion("appealtype <>", value, "appealtype");
            return (Criteria) this;
        }

        public Criteria andAppealtypeGreaterThan(Integer value) {
            addCriterion("appealtype >", value, "appealtype");
            return (Criteria) this;
        }

        public Criteria andAppealtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("appealtype >=", value, "appealtype");
            return (Criteria) this;
        }

        public Criteria andAppealtypeLessThan(Integer value) {
            addCriterion("appealtype <", value, "appealtype");
            return (Criteria) this;
        }

        public Criteria andAppealtypeLessThanOrEqualTo(Integer value) {
            addCriterion("appealtype <=", value, "appealtype");
            return (Criteria) this;
        }

        public Criteria andAppealtypeIn(List<Integer> values) {
            addCriterion("appealtype in", values, "appealtype");
            return (Criteria) this;
        }

        public Criteria andAppealtypeNotIn(List<Integer> values) {
            addCriterion("appealtype not in", values, "appealtype");
            return (Criteria) this;
        }

        public Criteria andAppealtypeBetween(Integer value1, Integer value2) {
            addCriterion("appealtype between", value1, value2, "appealtype");
            return (Criteria) this;
        }

        public Criteria andAppealtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("appealtype not between", value1, value2, "appealtype");
            return (Criteria) this;
        }

        public Criteria andOldmobilephoneIsNull() {
            addCriterion("oldmobilephone is null");
            return (Criteria) this;
        }

        public Criteria andOldmobilephoneIsNotNull() {
            addCriterion("oldmobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andOldmobilephoneEqualTo(String value) {
            addCriterion("oldmobilephone =", value, "oldmobilephone");
            return (Criteria) this;
        }

        public Criteria andOldmobilephoneNotEqualTo(String value) {
            addCriterion("oldmobilephone <>", value, "oldmobilephone");
            return (Criteria) this;
        }

        public Criteria andOldmobilephoneGreaterThan(String value) {
            addCriterion("oldmobilephone >", value, "oldmobilephone");
            return (Criteria) this;
        }

        public Criteria andOldmobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("oldmobilephone >=", value, "oldmobilephone");
            return (Criteria) this;
        }

        public Criteria andOldmobilephoneLessThan(String value) {
            addCriterion("oldmobilephone <", value, "oldmobilephone");
            return (Criteria) this;
        }

        public Criteria andOldmobilephoneLessThanOrEqualTo(String value) {
            addCriterion("oldmobilephone <=", value, "oldmobilephone");
            return (Criteria) this;
        }

        public Criteria andOldmobilephoneLike(String value) {
            addCriterion("oldmobilephone like", value, "oldmobilephone");
            return (Criteria) this;
        }

        public Criteria andOldmobilephoneNotLike(String value) {
            addCriterion("oldmobilephone not like", value, "oldmobilephone");
            return (Criteria) this;
        }

        public Criteria andOldmobilephoneIn(List<String> values) {
            addCriterion("oldmobilephone in", values, "oldmobilephone");
            return (Criteria) this;
        }

        public Criteria andOldmobilephoneNotIn(List<String> values) {
            addCriterion("oldmobilephone not in", values, "oldmobilephone");
            return (Criteria) this;
        }

        public Criteria andOldmobilephoneBetween(String value1, String value2) {
            addCriterion("oldmobilephone between", value1, value2, "oldmobilephone");
            return (Criteria) this;
        }

        public Criteria andOldmobilephoneNotBetween(String value1, String value2) {
            addCriterion("oldmobilephone not between", value1, value2, "oldmobilephone");
            return (Criteria) this;
        }

        public Criteria andNewmobilephoneIsNull() {
            addCriterion("newmobilephone is null");
            return (Criteria) this;
        }

        public Criteria andNewmobilephoneIsNotNull() {
            addCriterion("newmobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andNewmobilephoneEqualTo(String value) {
            addCriterion("newmobilephone =", value, "newmobilephone");
            return (Criteria) this;
        }

        public Criteria andNewmobilephoneNotEqualTo(String value) {
            addCriterion("newmobilephone <>", value, "newmobilephone");
            return (Criteria) this;
        }

        public Criteria andNewmobilephoneGreaterThan(String value) {
            addCriterion("newmobilephone >", value, "newmobilephone");
            return (Criteria) this;
        }

        public Criteria andNewmobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("newmobilephone >=", value, "newmobilephone");
            return (Criteria) this;
        }

        public Criteria andNewmobilephoneLessThan(String value) {
            addCriterion("newmobilephone <", value, "newmobilephone");
            return (Criteria) this;
        }

        public Criteria andNewmobilephoneLessThanOrEqualTo(String value) {
            addCriterion("newmobilephone <=", value, "newmobilephone");
            return (Criteria) this;
        }

        public Criteria andNewmobilephoneLike(String value) {
            addCriterion("newmobilephone like", value, "newmobilephone");
            return (Criteria) this;
        }

        public Criteria andNewmobilephoneNotLike(String value) {
            addCriterion("newmobilephone not like", value, "newmobilephone");
            return (Criteria) this;
        }

        public Criteria andNewmobilephoneIn(List<String> values) {
            addCriterion("newmobilephone in", values, "newmobilephone");
            return (Criteria) this;
        }

        public Criteria andNewmobilephoneNotIn(List<String> values) {
            addCriterion("newmobilephone not in", values, "newmobilephone");
            return (Criteria) this;
        }

        public Criteria andNewmobilephoneBetween(String value1, String value2) {
            addCriterion("newmobilephone between", value1, value2, "newmobilephone");
            return (Criteria) this;
        }

        public Criteria andNewmobilephoneNotBetween(String value1, String value2) {
            addCriterion("newmobilephone not between", value1, value2, "newmobilephone");
            return (Criteria) this;
        }

        public Criteria andAppealresultIsNull() {
            addCriterion("appealresult is null");
            return (Criteria) this;
        }

        public Criteria andAppealresultIsNotNull() {
            addCriterion("appealresult is not null");
            return (Criteria) this;
        }

        public Criteria andAppealresultEqualTo(String value) {
            addCriterion("appealresult =", value, "appealresult");
            return (Criteria) this;
        }

        public Criteria andAppealresultNotEqualTo(String value) {
            addCriterion("appealresult <>", value, "appealresult");
            return (Criteria) this;
        }

        public Criteria andAppealresultGreaterThan(String value) {
            addCriterion("appealresult >", value, "appealresult");
            return (Criteria) this;
        }

        public Criteria andAppealresultGreaterThanOrEqualTo(String value) {
            addCriterion("appealresult >=", value, "appealresult");
            return (Criteria) this;
        }

        public Criteria andAppealresultLessThan(String value) {
            addCriterion("appealresult <", value, "appealresult");
            return (Criteria) this;
        }

        public Criteria andAppealresultLessThanOrEqualTo(String value) {
            addCriterion("appealresult <=", value, "appealresult");
            return (Criteria) this;
        }

        public Criteria andAppealresultLike(String value) {
            addCriterion("appealresult like", value, "appealresult");
            return (Criteria) this;
        }

        public Criteria andAppealresultNotLike(String value) {
            addCriterion("appealresult not like", value, "appealresult");
            return (Criteria) this;
        }

        public Criteria andAppealresultIn(List<String> values) {
            addCriterion("appealresult in", values, "appealresult");
            return (Criteria) this;
        }

        public Criteria andAppealresultNotIn(List<String> values) {
            addCriterion("appealresult not in", values, "appealresult");
            return (Criteria) this;
        }

        public Criteria andAppealresultBetween(String value1, String value2) {
            addCriterion("appealresult between", value1, value2, "appealresult");
            return (Criteria) this;
        }

        public Criteria andAppealresultNotBetween(String value1, String value2) {
            addCriterion("appealresult not between", value1, value2, "appealresult");
            return (Criteria) this;
        }

        public Criteria andRechargetime1IsNull() {
            addCriterion("rechargetime1 is null");
            return (Criteria) this;
        }

        public Criteria andRechargetime1IsNotNull() {
            addCriterion("rechargetime1 is not null");
            return (Criteria) this;
        }

        public Criteria andRechargetime1EqualTo(Date value) {
            addCriterion("rechargetime1 =", value, "rechargetime1");
            return (Criteria) this;
        }

        public Criteria andRechargetime1NotEqualTo(Date value) {
            addCriterion("rechargetime1 <>", value, "rechargetime1");
            return (Criteria) this;
        }

        public Criteria andRechargetime1GreaterThan(Date value) {
            addCriterion("rechargetime1 >", value, "rechargetime1");
            return (Criteria) this;
        }

        public Criteria andRechargetime1GreaterThanOrEqualTo(Date value) {
            addCriterion("rechargetime1 >=", value, "rechargetime1");
            return (Criteria) this;
        }

        public Criteria andRechargetime1LessThan(Date value) {
            addCriterion("rechargetime1 <", value, "rechargetime1");
            return (Criteria) this;
        }

        public Criteria andRechargetime1LessThanOrEqualTo(Date value) {
            addCriterion("rechargetime1 <=", value, "rechargetime1");
            return (Criteria) this;
        }

        public Criteria andRechargetime1In(List<Date> values) {
            addCriterion("rechargetime1 in", values, "rechargetime1");
            return (Criteria) this;
        }

        public Criteria andRechargetime1NotIn(List<Date> values) {
            addCriterion("rechargetime1 not in", values, "rechargetime1");
            return (Criteria) this;
        }

        public Criteria andRechargetime1Between(Date value1, Date value2) {
            addCriterion("rechargetime1 between", value1, value2, "rechargetime1");
            return (Criteria) this;
        }

        public Criteria andRechargetime1NotBetween(Date value1, Date value2) {
            addCriterion("rechargetime1 not between", value1, value2, "rechargetime1");
            return (Criteria) this;
        }

        public Criteria andAmount1IsNull() {
            addCriterion("amount1 is null");
            return (Criteria) this;
        }

        public Criteria andAmount1IsNotNull() {
            addCriterion("amount1 is not null");
            return (Criteria) this;
        }

        public Criteria andAmount1EqualTo(BigDecimal value) {
            addCriterion("amount1 =", value, "amount1");
            return (Criteria) this;
        }

        public Criteria andAmount1NotEqualTo(BigDecimal value) {
            addCriterion("amount1 <>", value, "amount1");
            return (Criteria) this;
        }

        public Criteria andAmount1GreaterThan(BigDecimal value) {
            addCriterion("amount1 >", value, "amount1");
            return (Criteria) this;
        }

        public Criteria andAmount1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount1 >=", value, "amount1");
            return (Criteria) this;
        }

        public Criteria andAmount1LessThan(BigDecimal value) {
            addCriterion("amount1 <", value, "amount1");
            return (Criteria) this;
        }

        public Criteria andAmount1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount1 <=", value, "amount1");
            return (Criteria) this;
        }

        public Criteria andAmount1In(List<BigDecimal> values) {
            addCriterion("amount1 in", values, "amount1");
            return (Criteria) this;
        }

        public Criteria andAmount1NotIn(List<BigDecimal> values) {
            addCriterion("amount1 not in", values, "amount1");
            return (Criteria) this;
        }

        public Criteria andAmount1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount1 between", value1, value2, "amount1");
            return (Criteria) this;
        }

        public Criteria andAmount1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount1 not between", value1, value2, "amount1");
            return (Criteria) this;
        }

        public Criteria andRechargetime2IsNull() {
            addCriterion("rechargetime2 is null");
            return (Criteria) this;
        }

        public Criteria andRechargetime2IsNotNull() {
            addCriterion("rechargetime2 is not null");
            return (Criteria) this;
        }

        public Criteria andRechargetime2EqualTo(Date value) {
            addCriterion("rechargetime2 =", value, "rechargetime2");
            return (Criteria) this;
        }

        public Criteria andRechargetime2NotEqualTo(Date value) {
            addCriterion("rechargetime2 <>", value, "rechargetime2");
            return (Criteria) this;
        }

        public Criteria andRechargetime2GreaterThan(Date value) {
            addCriterion("rechargetime2 >", value, "rechargetime2");
            return (Criteria) this;
        }

        public Criteria andRechargetime2GreaterThanOrEqualTo(Date value) {
            addCriterion("rechargetime2 >=", value, "rechargetime2");
            return (Criteria) this;
        }

        public Criteria andRechargetime2LessThan(Date value) {
            addCriterion("rechargetime2 <", value, "rechargetime2");
            return (Criteria) this;
        }

        public Criteria andRechargetime2LessThanOrEqualTo(Date value) {
            addCriterion("rechargetime2 <=", value, "rechargetime2");
            return (Criteria) this;
        }

        public Criteria andRechargetime2In(List<Date> values) {
            addCriterion("rechargetime2 in", values, "rechargetime2");
            return (Criteria) this;
        }

        public Criteria andRechargetime2NotIn(List<Date> values) {
            addCriterion("rechargetime2 not in", values, "rechargetime2");
            return (Criteria) this;
        }

        public Criteria andRechargetime2Between(Date value1, Date value2) {
            addCriterion("rechargetime2 between", value1, value2, "rechargetime2");
            return (Criteria) this;
        }

        public Criteria andRechargetime2NotBetween(Date value1, Date value2) {
            addCriterion("rechargetime2 not between", value1, value2, "rechargetime2");
            return (Criteria) this;
        }

        public Criteria andAmount2IsNull() {
            addCriterion("amount2 is null");
            return (Criteria) this;
        }

        public Criteria andAmount2IsNotNull() {
            addCriterion("amount2 is not null");
            return (Criteria) this;
        }

        public Criteria andAmount2EqualTo(BigDecimal value) {
            addCriterion("amount2 =", value, "amount2");
            return (Criteria) this;
        }

        public Criteria andAmount2NotEqualTo(BigDecimal value) {
            addCriterion("amount2 <>", value, "amount2");
            return (Criteria) this;
        }

        public Criteria andAmount2GreaterThan(BigDecimal value) {
            addCriterion("amount2 >", value, "amount2");
            return (Criteria) this;
        }

        public Criteria andAmount2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount2 >=", value, "amount2");
            return (Criteria) this;
        }

        public Criteria andAmount2LessThan(BigDecimal value) {
            addCriterion("amount2 <", value, "amount2");
            return (Criteria) this;
        }

        public Criteria andAmount2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount2 <=", value, "amount2");
            return (Criteria) this;
        }

        public Criteria andAmount2In(List<BigDecimal> values) {
            addCriterion("amount2 in", values, "amount2");
            return (Criteria) this;
        }

        public Criteria andAmount2NotIn(List<BigDecimal> values) {
            addCriterion("amount2 not in", values, "amount2");
            return (Criteria) this;
        }

        public Criteria andAmount2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount2 between", value1, value2, "amount2");
            return (Criteria) this;
        }

        public Criteria andAmount2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount2 not between", value1, value2, "amount2");
            return (Criteria) this;
        }

        public Criteria andRechargetime3IsNull() {
            addCriterion("rechargetime3 is null");
            return (Criteria) this;
        }

        public Criteria andRechargetime3IsNotNull() {
            addCriterion("rechargetime3 is not null");
            return (Criteria) this;
        }

        public Criteria andRechargetime3EqualTo(Date value) {
            addCriterion("rechargetime3 =", value, "rechargetime3");
            return (Criteria) this;
        }

        public Criteria andRechargetime3NotEqualTo(Date value) {
            addCriterion("rechargetime3 <>", value, "rechargetime3");
            return (Criteria) this;
        }

        public Criteria andRechargetime3GreaterThan(Date value) {
            addCriterion("rechargetime3 >", value, "rechargetime3");
            return (Criteria) this;
        }

        public Criteria andRechargetime3GreaterThanOrEqualTo(Date value) {
            addCriterion("rechargetime3 >=", value, "rechargetime3");
            return (Criteria) this;
        }

        public Criteria andRechargetime3LessThan(Date value) {
            addCriterion("rechargetime3 <", value, "rechargetime3");
            return (Criteria) this;
        }

        public Criteria andRechargetime3LessThanOrEqualTo(Date value) {
            addCriterion("rechargetime3 <=", value, "rechargetime3");
            return (Criteria) this;
        }

        public Criteria andRechargetime3In(List<Date> values) {
            addCriterion("rechargetime3 in", values, "rechargetime3");
            return (Criteria) this;
        }

        public Criteria andRechargetime3NotIn(List<Date> values) {
            addCriterion("rechargetime3 not in", values, "rechargetime3");
            return (Criteria) this;
        }

        public Criteria andRechargetime3Between(Date value1, Date value2) {
            addCriterion("rechargetime3 between", value1, value2, "rechargetime3");
            return (Criteria) this;
        }

        public Criteria andRechargetime3NotBetween(Date value1, Date value2) {
            addCriterion("rechargetime3 not between", value1, value2, "rechargetime3");
            return (Criteria) this;
        }

        public Criteria andAmount3IsNull() {
            addCriterion("amount3 is null");
            return (Criteria) this;
        }

        public Criteria andAmount3IsNotNull() {
            addCriterion("amount3 is not null");
            return (Criteria) this;
        }

        public Criteria andAmount3EqualTo(BigDecimal value) {
            addCriterion("amount3 =", value, "amount3");
            return (Criteria) this;
        }

        public Criteria andAmount3NotEqualTo(BigDecimal value) {
            addCriterion("amount3 <>", value, "amount3");
            return (Criteria) this;
        }

        public Criteria andAmount3GreaterThan(BigDecimal value) {
            addCriterion("amount3 >", value, "amount3");
            return (Criteria) this;
        }

        public Criteria andAmount3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount3 >=", value, "amount3");
            return (Criteria) this;
        }

        public Criteria andAmount3LessThan(BigDecimal value) {
            addCriterion("amount3 <", value, "amount3");
            return (Criteria) this;
        }

        public Criteria andAmount3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount3 <=", value, "amount3");
            return (Criteria) this;
        }

        public Criteria andAmount3In(List<BigDecimal> values) {
            addCriterion("amount3 in", values, "amount3");
            return (Criteria) this;
        }

        public Criteria andAmount3NotIn(List<BigDecimal> values) {
            addCriterion("amount3 not in", values, "amount3");
            return (Criteria) this;
        }

        public Criteria andAmount3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount3 between", value1, value2, "amount3");
            return (Criteria) this;
        }

        public Criteria andAmount3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount3 not between", value1, value2, "amount3");
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

        public Criteria andStudentclassIsNull() {
            addCriterion("studentclass is null");
            return (Criteria) this;
        }

        public Criteria andStudentclassIsNotNull() {
            addCriterion("studentclass is not null");
            return (Criteria) this;
        }

        public Criteria andStudentclassEqualTo(String value) {
            addCriterion("studentclass =", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassNotEqualTo(String value) {
            addCriterion("studentclass <>", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassGreaterThan(String value) {
            addCriterion("studentclass >", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassGreaterThanOrEqualTo(String value) {
            addCriterion("studentclass >=", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassLessThan(String value) {
            addCriterion("studentclass <", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassLessThanOrEqualTo(String value) {
            addCriterion("studentclass <=", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassLike(String value) {
            addCriterion("studentclass like", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassNotLike(String value) {
            addCriterion("studentclass not like", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassIn(List<String> values) {
            addCriterion("studentclass in", values, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassNotIn(List<String> values) {
            addCriterion("studentclass not in", values, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassBetween(String value1, String value2) {
            addCriterion("studentclass between", value1, value2, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassNotBetween(String value1, String value2) {
            addCriterion("studentclass not between", value1, value2, "studentclass");
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