package com.munnicha.patterns.gof.creational.prototype.model;

/**
 *
 * @author munnicha
 */
public class Approver implements Cloneable{
    
    private String name;
    private String role;
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Approver{" + "name=" + name + ", role=" + role + '}';
    }

}
