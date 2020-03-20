package com.imooc.demo.dto;

import java.util.Objects;

public class MemberDti {
    /**
     * ID
     */
    private String id;

    public MemberDti(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MemberDti{");
        sb.append("id='").append(id).append('\'');
        sb.append(", loginname='").append(loginname).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDti memberDti = (MemberDti) o;
        return Objects.equals(id, memberDti.id) &&
                Objects.equals(loginname, memberDti.loginname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, loginname);
    }

    private String loginname;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }


}
