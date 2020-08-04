package com.accp.pojo;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class client {
    private Integer clid;

    private String cliname;

    private Integer clisex;

    private String cliphone;

    private String cliaddress;
    
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date cliborth;

    private String clidcard;

    private Integer growthval;

    private String rank;

    private BigDecimal discount;

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public String getCliname() {
        return cliname;
    }

    public void setCliname(String cliname) {
        this.cliname = cliname == null ? null : cliname.trim();
    }

    public Integer getClisex() {
        return clisex;
    }

    public void setClisex(Integer clisex) {
        this.clisex = clisex;
    }

    public String getCliphone() {
        return cliphone;
    }

    public void setCliphone(String cliphone) {
        this.cliphone = cliphone == null ? null : cliphone.trim();
    }

    public String getCliaddress() {
        return cliaddress;
    }

    public void setCliaddress(String cliaddress) {
        this.cliaddress = cliaddress == null ? null : cliaddress.trim();
    }

    public Date getCliborth() {
        return cliborth;
    }

    public void setCliborth(Date cliborth) {
        this.cliborth = cliborth;
    }

    public String getClidcard() {
        return clidcard;
    }

    public void setClidcard(String clidcard) {
        this.clidcard = clidcard == null ? null : clidcard.trim();
    }

    public Integer getGrowthval() {
        return growthval;
    }

    public void setGrowthval(Integer growthval) {
        this.growthval = growthval;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}