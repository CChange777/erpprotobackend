package com.wecreate.entities;

public class Stakeholder extends BaseEntity {
    private String firstName;
    private String lastName;
    private String address;

    public Stakeholder(String firstName, String lastName, String address) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAddress(address);
    }

    @Override
    public String toString() {
        return String.format("Stakeholder[id=%s, firstName?%s, lastName=%s, address=%s", id, getFirstName(), getLastName(), getAddress());
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
