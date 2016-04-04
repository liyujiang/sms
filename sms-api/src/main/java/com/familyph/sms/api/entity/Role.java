package com.familyph.sms.api.entity;

public class Role {
    private Long roleid;

    private String rolename;

    private Long roleparentid;

    private String roledesc;

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Long getRoleparentid() {
        return roleparentid;
    }

    public void setRoleparentid(Long roleparentid) {
        this.roleparentid = roleparentid;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc == null ? null : roledesc.trim();
    }
}