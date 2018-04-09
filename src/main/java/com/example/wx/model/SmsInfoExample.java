package com.example.wx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsInfoExample() {
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

        public Criteria andSendtypeIsNull() {
            addCriterion("sendtype is null");
            return (Criteria) this;
        }

        public Criteria andSendtypeIsNotNull() {
            addCriterion("sendtype is not null");
            return (Criteria) this;
        }

        public Criteria andSendtypeEqualTo(Integer value) {
            addCriterion("sendtype =", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotEqualTo(Integer value) {
            addCriterion("sendtype <>", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeGreaterThan(Integer value) {
            addCriterion("sendtype >", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendtype >=", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeLessThan(Integer value) {
            addCriterion("sendtype <", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeLessThanOrEqualTo(Integer value) {
            addCriterion("sendtype <=", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeIn(List<Integer> values) {
            addCriterion("sendtype in", values, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotIn(List<Integer> values) {
            addCriterion("sendtype not in", values, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeBetween(Integer value1, Integer value2) {
            addCriterion("sendtype between", value1, value2, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sendtype not between", value1, value2, "sendtype");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeIsNull() {
            addCriterion("verificationcode is null");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeIsNotNull() {
            addCriterion("verificationcode is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeEqualTo(String value) {
            addCriterion("verificationcode =", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeNotEqualTo(String value) {
            addCriterion("verificationcode <>", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeGreaterThan(String value) {
            addCriterion("verificationcode >", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("verificationcode >=", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeLessThan(String value) {
            addCriterion("verificationcode <", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeLessThanOrEqualTo(String value) {
            addCriterion("verificationcode <=", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeLike(String value) {
            addCriterion("verificationcode like", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeNotLike(String value) {
            addCriterion("verificationcode not like", value, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeIn(List<String> values) {
            addCriterion("verificationcode in", values, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeNotIn(List<String> values) {
            addCriterion("verificationcode not in", values, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeBetween(String value1, String value2) {
            addCriterion("verificationcode between", value1, value2, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andVerificationcodeNotBetween(String value1, String value2) {
            addCriterion("verificationcode not between", value1, value2, "verificationcode");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCutofftimeIsNull() {
            addCriterion("cutofftime is null");
            return (Criteria) this;
        }

        public Criteria andCutofftimeIsNotNull() {
            addCriterion("cutofftime is not null");
            return (Criteria) this;
        }

        public Criteria andCutofftimeEqualTo(Date value) {
            addCriterion("cutofftime =", value, "cutofftime");
            return (Criteria) this;
        }

        public Criteria andCutofftimeNotEqualTo(Date value) {
            addCriterion("cutofftime <>", value, "cutofftime");
            return (Criteria) this;
        }

        public Criteria andCutofftimeGreaterThan(Date value) {
            addCriterion("cutofftime >", value, "cutofftime");
            return (Criteria) this;
        }

        public Criteria andCutofftimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cutofftime >=", value, "cutofftime");
            return (Criteria) this;
        }

        public Criteria andCutofftimeLessThan(Date value) {
            addCriterion("cutofftime <", value, "cutofftime");
            return (Criteria) this;
        }

        public Criteria andCutofftimeLessThanOrEqualTo(Date value) {
            addCriterion("cutofftime <=", value, "cutofftime");
            return (Criteria) this;
        }

        public Criteria andCutofftimeIn(List<Date> values) {
            addCriterion("cutofftime in", values, "cutofftime");
            return (Criteria) this;
        }

        public Criteria andCutofftimeNotIn(List<Date> values) {
            addCriterion("cutofftime not in", values, "cutofftime");
            return (Criteria) this;
        }

        public Criteria andCutofftimeBetween(Date value1, Date value2) {
            addCriterion("cutofftime between", value1, value2, "cutofftime");
            return (Criteria) this;
        }

        public Criteria andCutofftimeNotBetween(Date value1, Date value2) {
            addCriterion("cutofftime not between", value1, value2, "cutofftime");
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

        public Criteria andSendurlIsNull() {
            addCriterion("sendurl is null");
            return (Criteria) this;
        }

        public Criteria andSendurlIsNotNull() {
            addCriterion("sendurl is not null");
            return (Criteria) this;
        }

        public Criteria andSendurlEqualTo(String value) {
            addCriterion("sendurl =", value, "sendurl");
            return (Criteria) this;
        }

        public Criteria andSendurlNotEqualTo(String value) {
            addCriterion("sendurl <>", value, "sendurl");
            return (Criteria) this;
        }

        public Criteria andSendurlGreaterThan(String value) {
            addCriterion("sendurl >", value, "sendurl");
            return (Criteria) this;
        }

        public Criteria andSendurlGreaterThanOrEqualTo(String value) {
            addCriterion("sendurl >=", value, "sendurl");
            return (Criteria) this;
        }

        public Criteria andSendurlLessThan(String value) {
            addCriterion("sendurl <", value, "sendurl");
            return (Criteria) this;
        }

        public Criteria andSendurlLessThanOrEqualTo(String value) {
            addCriterion("sendurl <=", value, "sendurl");
            return (Criteria) this;
        }

        public Criteria andSendurlLike(String value) {
            addCriterion("sendurl like", value, "sendurl");
            return (Criteria) this;
        }

        public Criteria andSendurlNotLike(String value) {
            addCriterion("sendurl not like", value, "sendurl");
            return (Criteria) this;
        }

        public Criteria andSendurlIn(List<String> values) {
            addCriterion("sendurl in", values, "sendurl");
            return (Criteria) this;
        }

        public Criteria andSendurlNotIn(List<String> values) {
            addCriterion("sendurl not in", values, "sendurl");
            return (Criteria) this;
        }

        public Criteria andSendurlBetween(String value1, String value2) {
            addCriterion("sendurl between", value1, value2, "sendurl");
            return (Criteria) this;
        }

        public Criteria andSendurlNotBetween(String value1, String value2) {
            addCriterion("sendurl not between", value1, value2, "sendurl");
            return (Criteria) this;
        }

        public Criteria andParameterIsNull() {
            addCriterion("parameter is null");
            return (Criteria) this;
        }

        public Criteria andParameterIsNotNull() {
            addCriterion("parameter is not null");
            return (Criteria) this;
        }

        public Criteria andParameterEqualTo(String value) {
            addCriterion("parameter =", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotEqualTo(String value) {
            addCriterion("parameter <>", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThan(String value) {
            addCriterion("parameter >", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThanOrEqualTo(String value) {
            addCriterion("parameter >=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThan(String value) {
            addCriterion("parameter <", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThanOrEqualTo(String value) {
            addCriterion("parameter <=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLike(String value) {
            addCriterion("parameter like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotLike(String value) {
            addCriterion("parameter not like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterIn(List<String> values) {
            addCriterion("parameter in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotIn(List<String> values) {
            addCriterion("parameter not in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterBetween(String value1, String value2) {
            addCriterion("parameter between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotBetween(String value1, String value2) {
            addCriterion("parameter not between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andJsonresultIsNull() {
            addCriterion("jsonresult is null");
            return (Criteria) this;
        }

        public Criteria andJsonresultIsNotNull() {
            addCriterion("jsonresult is not null");
            return (Criteria) this;
        }

        public Criteria andJsonresultEqualTo(String value) {
            addCriterion("jsonresult =", value, "jsonresult");
            return (Criteria) this;
        }

        public Criteria andJsonresultNotEqualTo(String value) {
            addCriterion("jsonresult <>", value, "jsonresult");
            return (Criteria) this;
        }

        public Criteria andJsonresultGreaterThan(String value) {
            addCriterion("jsonresult >", value, "jsonresult");
            return (Criteria) this;
        }

        public Criteria andJsonresultGreaterThanOrEqualTo(String value) {
            addCriterion("jsonresult >=", value, "jsonresult");
            return (Criteria) this;
        }

        public Criteria andJsonresultLessThan(String value) {
            addCriterion("jsonresult <", value, "jsonresult");
            return (Criteria) this;
        }

        public Criteria andJsonresultLessThanOrEqualTo(String value) {
            addCriterion("jsonresult <=", value, "jsonresult");
            return (Criteria) this;
        }

        public Criteria andJsonresultLike(String value) {
            addCriterion("jsonresult like", value, "jsonresult");
            return (Criteria) this;
        }

        public Criteria andJsonresultNotLike(String value) {
            addCriterion("jsonresult not like", value, "jsonresult");
            return (Criteria) this;
        }

        public Criteria andJsonresultIn(List<String> values) {
            addCriterion("jsonresult in", values, "jsonresult");
            return (Criteria) this;
        }

        public Criteria andJsonresultNotIn(List<String> values) {
            addCriterion("jsonresult not in", values, "jsonresult");
            return (Criteria) this;
        }

        public Criteria andJsonresultBetween(String value1, String value2) {
            addCriterion("jsonresult between", value1, value2, "jsonresult");
            return (Criteria) this;
        }

        public Criteria andJsonresultNotBetween(String value1, String value2) {
            addCriterion("jsonresult not between", value1, value2, "jsonresult");
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