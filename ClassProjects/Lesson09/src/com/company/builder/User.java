package com.company.builder;

public class User {
    private Long id;
    private String firstname;
    private String secondname;
    private String address;
    private String phoneNumber;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String firstname;
        private String secondname;
        private String address;
        private String phoneNumber;
        
        public Builder id(Long id) {
            this.id = id;
            return this;
        }
        
        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder secondname(String secondname) {
            this.secondname = secondname;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    private User(Builder builder) {
        this.id = builder.id;
        this.firstname = builder.firstname;
        //и т. д.
    }
    
    
    
    


    public User(Long id, String firstname, String secondname, String address, String phoneNumber) {
        this.id = id;
        this.firstname = firstname;
        this.secondname = secondname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public User(String firstname, String secondname) {
        this.firstname = firstname;
        this.secondname = secondname;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
