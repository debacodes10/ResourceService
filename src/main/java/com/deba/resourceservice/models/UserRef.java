package com.deba.resourceservice.models;

import java.util.List;

public class UserRef {
    private String userId;
    private String name;
    private String email;
    private Role role;
    private List<String> clubs;

    public enum Role {
        ADMIN,
        MEMBER,
        LEAD
    }

    public UserRef() {}

    public UserRef(String Id, String name) {
        this.userId = Id;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String Id) {
        this.userId = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<String> getClubs() {
        return clubs;
    }

    public void setClubs(List<String> clubs) {
        this.clubs = clubs;
    }

}
