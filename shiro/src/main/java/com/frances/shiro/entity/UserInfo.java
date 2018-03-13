package com.frances.shiro.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class UserInfo implements Serializable {
    @Id
    @GeneratedValue
    private Integer uid;
    @Column(unique = true)
    private String username;
    private String nickname;
    private String password;
    private String salt;
    private byte state;

    @ManyToMany(fetch = FetchType.EAGER)//立即从数据库中加载数据
    @JoinTable(name="SysUserRole",joinColumns = {@JoinColumn(name="uid")},inverseJoinColumns = {@JoinColumn(name="roleId") })
    private List<SysRole> roleList;//一个用户具有多个角色

    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid){
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }
    /**
     * 密码盐
     * @return
     */
    public String getCredentialSalt(){
        return this.username + this.salt;
    }
}
