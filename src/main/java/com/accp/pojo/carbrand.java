package com.accp.pojo;

public class carbrand {
    private Integer cbdid;

    private String cbdname;

    private String logogram;

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

    public String getLogogram() {
        return logogram;
    }

    public void setLogogram(String logogram) {
        this.logogram = logogram == null ? null : logogram.trim();
    }
}