package com.accp.pojo;

import java.math.BigDecimal;

public class carmodel {
    private Integer cmlid;

    private Integer cbdid;

    private String cbdname;

    private Integer engid;

    private String engname;

    private String cmlmodel;

    private BigDecimal reference;

    public Integer getCmlid() {
        return cmlid;
    }

    public void setCmlid(Integer cmlid) {
        this.cmlid = cmlid;
    }

    public Integer getCbdid() {
        return cbdid;
    }

    public void setCbdid(Integer cbdid) {
        this.cbdid = cbdid;
    }

    public String getCbdname() {
        return cbdname;
    }

    public void setCbdname(String cbdname) {
        this.cbdname = cbdname == null ? null : cbdname.trim();
    }

    public Integer getEngid() {
        return engid;
    }

    public void setEngid(Integer engid) {
        this.engid = engid;
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname == null ? null : engname.trim();
    }

    public String getCmlmodel() {
        return cmlmodel;
    }

    public void setCmlmodel(String cmlmodel) {
        this.cmlmodel = cmlmodel == null ? null : cmlmodel.trim();
    }

    public BigDecimal getReference() {
        return reference;
    }

    public void setReference(BigDecimal reference) {
        this.reference = reference;
    }
}