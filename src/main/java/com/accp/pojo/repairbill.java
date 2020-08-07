package com.accp.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class repairbill {
    private String odd;

    private String clrno;

    private Integer classid;

    private String classname;

    private String staid;

    private String staname;

    private String resno;

    private Date billingtime;

    private String maintaintype;

    private Date predictdate;

    private Date practicaldate;

    private String cause;

    private String remark;

    private Integer bcstate;

    private BigDecimal mhcost;

    private Integer consumehour;

    private BigDecimal rescue;

    private BigDecimal goodsamt;

    private BigDecimal projectamt;

    private BigDecimal oddamt;

    private Integer caastate;

    private String caatype;

    private BigDecimal caamoney;

    public String getOdd() {
        return odd;
    }

    public void setOdd(String odd) {
        this.odd = odd == null ? null : odd.trim();
    }

    public String getClrno() {
        return clrno;
    }

    public void setClrno(String clrno) {
        this.clrno = clrno == null ? null : clrno.trim();
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getStaid() {
        return staid;
    }

    public void setStaid(String staid) {
        this.staid = staid == null ? null : staid.trim();
    }

    public String getStaname() {
        return staname;
    }

    public void setStaname(String staname) {
        this.staname = staname == null ? null : staname.trim();
    }

    public String getResno() {
        return resno;
    }

    public void setResno(String resno) {
        this.resno = resno == null ? null : resno.trim();
    }

    public Date getBillingtime() {
        return billingtime;
    }

    public void setBillingtime(Date billingtime) {
        this.billingtime = billingtime;
    }

    public String getMaintaintype() {
        return maintaintype;
    }

    public void setMaintaintype(String maintaintype) {
        this.maintaintype = maintaintype == null ? null : maintaintype.trim();
    }

    public Date getPredictdate() {
        return predictdate;
    }

    public void setPredictdate(Date predictdate) {
        this.predictdate = predictdate;
    }

    public Date getPracticaldate() {
        return practicaldate;
    }

    public void setPracticaldate(Date practicaldate) {
        this.practicaldate = practicaldate;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getBcstate() {
        return bcstate;
    }

    public void setBcstate(Integer bcstate) {
        this.bcstate = bcstate;
    }

    public BigDecimal getMhcost() {
        return mhcost;
    }

    public void setMhcost(BigDecimal mhcost) {
        this.mhcost = mhcost;
    }

    public Integer getConsumehour() {
        return consumehour;
    }

    public void setConsumehour(Integer consumehour) {
        this.consumehour = consumehour;
    }

    public BigDecimal getRescue() {
        return rescue;
    }

    public void setRescue(BigDecimal rescue) {
        this.rescue = rescue;
    }

    public BigDecimal getGoodsamt() {
        return goodsamt;
    }

    public void setGoodsamt(BigDecimal goodsamt) {
        this.goodsamt = goodsamt;
    }

    public BigDecimal getProjectamt() {
        return projectamt;
    }

    public void setProjectamt(BigDecimal projectamt) {
        this.projectamt = projectamt;
    }

    public BigDecimal getOddamt() {
        return oddamt;
    }

    public void setOddamt(BigDecimal oddamt) {
        this.oddamt = oddamt;
    }

    public Integer getCaastate() {
        return caastate;
    }

    public void setCaastate(Integer caastate) {
        this.caastate = caastate;
    }

    public String getCaatype() {
        return caatype;
    }

    public void setCaatype(String caatype) {
        this.caatype = caatype == null ? null : caatype.trim();
    }

    public BigDecimal getCaamoney() {
        return caamoney;
    }

    public void setCaamoney(BigDecimal caamoney) {
        this.caamoney = caamoney;
    }
}