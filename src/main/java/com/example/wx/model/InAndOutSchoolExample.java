package com.example.wx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InAndOutSchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InAndOutSchoolExample() {
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

        public Criteria andInouttypeIsNull() {
            addCriterion("inouttype is null");
            return (Criteria) this;
        }

        public Criteria andInouttypeIsNotNull() {
            addCriterion("inouttype is not null");
            return (Criteria) this;
        }

        public Criteria andInouttypeEqualTo(String value) {
            addCriterion("inouttype =", value, "inouttype");
            return (Criteria) this;
        }

        public Criteria andInouttypeNotEqualTo(String value) {
            addCriterion("inouttype <>", value, "inouttype");
            return (Criteria) this;
        }

        public Criteria andInouttypeGreaterThan(String value) {
            addCriterion("inouttype >", value, "inouttype");
            return (Criteria) this;
        }

        public Criteria andInouttypeGreaterThanOrEqualTo(String value) {
            addCriterion("inouttype >=", value, "inouttype");
            return (Criteria) this;
        }

        public Criteria andInouttypeLessThan(String value) {
            addCriterion("inouttype <", value, "inouttype");
            return (Criteria) this;
        }

        public Criteria andInouttypeLessThanOrEqualTo(String value) {
            addCriterion("inouttype <=", value, "inouttype");
            return (Criteria) this;
        }

        public Criteria andInouttypeLike(String value) {
            addCriterion("inouttype like", value, "inouttype");
            return (Criteria) this;
        }

        public Criteria andInouttypeNotLike(String value) {
            addCriterion("inouttype not like", value, "inouttype");
            return (Criteria) this;
        }

        public Criteria andInouttypeIn(List<String> values) {
            addCriterion("inouttype in", values, "inouttype");
            return (Criteria) this;
        }

        public Criteria andInouttypeNotIn(List<String> values) {
            addCriterion("inouttype not in", values, "inouttype");
            return (Criteria) this;
        }

        public Criteria andInouttypeBetween(String value1, String value2) {
            addCriterion("inouttype between", value1, value2, "inouttype");
            return (Criteria) this;
        }

        public Criteria andInouttypeNotBetween(String value1, String value2) {
            addCriterion("inouttype not between", value1, value2, "inouttype");
            return (Criteria) this;
        }

        public Criteria andInouttimeIsNull() {
            addCriterion("inouttime is null");
            return (Criteria) this;
        }

        public Criteria andInouttimeIsNotNull() {
            addCriterion("inouttime is not null");
            return (Criteria) this;
        }

        public Criteria andInouttimeEqualTo(Date value) {
            addCriterion("inouttime =", value, "inouttime");
            return (Criteria) this;
        }

        public Criteria andInouttimeNotEqualTo(Date value) {
            addCriterion("inouttime <>", value, "inouttime");
            return (Criteria) this;
        }

        public Criteria andInouttimeGreaterThan(Date value) {
            addCriterion("inouttime >", value, "inouttime");
            return (Criteria) this;
        }

        public Criteria andInouttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("inouttime >=", value, "inouttime");
            return (Criteria) this;
        }

        public Criteria andInouttimeLessThan(Date value) {
            addCriterion("inouttime <", value, "inouttime");
            return (Criteria) this;
        }

        public Criteria andInouttimeLessThanOrEqualTo(Date value) {
            addCriterion("inouttime <=", value, "inouttime");
            return (Criteria) this;
        }

        public Criteria andInouttimeIn(List<Date> values) {
            addCriterion("inouttime in", values, "inouttime");
            return (Criteria) this;
        }

        public Criteria andInouttimeNotIn(List<Date> values) {
            addCriterion("inouttime not in", values, "inouttime");
            return (Criteria) this;
        }

        public Criteria andInouttimeBetween(Date value1, Date value2) {
            addCriterion("inouttime between", value1, value2, "inouttime");
            return (Criteria) this;
        }

        public Criteria andInouttimeNotBetween(Date value1, Date value2) {
            addCriterion("inouttime not between", value1, value2, "inouttime");
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

        public Criteria andInoutmemoIsNull() {
            addCriterion("inoutmemo is null");
            return (Criteria) this;
        }

        public Criteria andInoutmemoIsNotNull() {
            addCriterion("inoutmemo is not null");
            return (Criteria) this;
        }

        public Criteria andInoutmemoEqualTo(String value) {
            addCriterion("inoutmemo =", value, "inoutmemo");
            return (Criteria) this;
        }

        public Criteria andInoutmemoNotEqualTo(String value) {
            addCriterion("inoutmemo <>", value, "inoutmemo");
            return (Criteria) this;
        }

        public Criteria andInoutmemoGreaterThan(String value) {
            addCriterion("inoutmemo >", value, "inoutmemo");
            return (Criteria) this;
        }

        public Criteria andInoutmemoGreaterThanOrEqualTo(String value) {
            addCriterion("inoutmemo >=", value, "inoutmemo");
            return (Criteria) this;
        }

        public Criteria andInoutmemoLessThan(String value) {
            addCriterion("inoutmemo <", value, "inoutmemo");
            return (Criteria) this;
        }

        public Criteria andInoutmemoLessThanOrEqualTo(String value) {
            addCriterion("inoutmemo <=", value, "inoutmemo");
            return (Criteria) this;
        }

        public Criteria andInoutmemoLike(String value) {
            addCriterion("inoutmemo like", value, "inoutmemo");
            return (Criteria) this;
        }

        public Criteria andInoutmemoNotLike(String value) {
            addCriterion("inoutmemo not like", value, "inoutmemo");
            return (Criteria) this;
        }

        public Criteria andInoutmemoIn(List<String> values) {
            addCriterion("inoutmemo in", values, "inoutmemo");
            return (Criteria) this;
        }

        public Criteria andInoutmemoNotIn(List<String> values) {
            addCriterion("inoutmemo not in", values, "inoutmemo");
            return (Criteria) this;
        }

        public Criteria andInoutmemoBetween(String value1, String value2) {
            addCriterion("inoutmemo between", value1, value2, "inoutmemo");
            return (Criteria) this;
        }

        public Criteria andInoutmemoNotBetween(String value1, String value2) {
            addCriterion("inoutmemo not between", value1, value2, "inoutmemo");
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