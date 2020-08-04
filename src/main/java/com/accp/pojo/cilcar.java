package com.accp.pojo;

import java.util.List;

public class cilcar {
    private String clrno;

    private Integer clid;

    private String cliname;

    private Integer cmlid;

    private String cbdname;

    private String cmlmodel;

    private Integer engid;

    private String engname;

    private String affiliation;
    
    private List<carmodel> car;

    
    
    public List<carmodel> getCar() {
		return car;
	}

	public void setCar(List<carmodel> car) {
		this.car = car;
	}

	public String getClrno() {
        return clrno;
    }

    public void setClrno(String clrno) {
        this.clrno = clrno == null ? null : clrno.trim();
    }

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

    public Integer getCmlid() {
        return cmlid;
    }

    public void setCmlid(Integer cmlid) {
        this.cmlid = cmlid;
    }

    public String getCbdname() {
        return cbdname;
    }

    public void setCbdname(String cbdname) {
        this.cbdname = cbdname == null ? null : cbdname.trim();
    }

    public String getCmlmodel() {
        return cmlmodel;
    }

    public void setCmlmodel(String cmlmodel) {
        this.cmlmodel = cmlmodel == null ? null : cmlmodel.trim();
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

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation == null ? null : affiliation.trim();
    }
}