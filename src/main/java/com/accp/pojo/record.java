package com.accp.pojo;

import java.math.BigDecimal;

public class record {
    private Integer recid;

    private String odd;

    private Integer rewid;

    private Integer goodsid;

    private String goodsname;

    private BigDecimal goodsprice;

    private Integer num;

    private BigDecimal goodsamt;

    private Integer proid;

    private String proname;

    private BigDecimal proprice;

    private String rectype;

    public Integer getRecid() {
        return recid;
    }

    public void setRecid(Integer recid) {
        this.recid = recid;
    }

    public String getOdd() {
        return odd;
    }

    public void setOdd(String odd) {
        this.odd = odd == null ? null : odd.trim();
    }

    public Integer getRewid() {
        return rewid;
    }

    public void setRewid(Integer rewid) {
        this.rewid = rewid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public BigDecimal getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(BigDecimal goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getGoodsamt() {
        return goodsamt;
    }

    public void setGoodsamt(BigDecimal goodsamt) {
        this.goodsamt = goodsamt;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public BigDecimal getProprice() {
        return proprice;
    }

    public void setProprice(BigDecimal proprice) {
        this.proprice = proprice;
    }

    public String getRectype() {
        return rectype;
    }

    public void setRectype(String rectype) {
        this.rectype = rectype == null ? null : rectype.trim();
    }
}