package com.random.testi;

public class User {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String degreeProgram;
    protected String diploma;

    public User(String firstName, String lastName, String email, String degreeProgram, String diploma) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.diploma = diploma;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public String getDiploma(){
        return diploma;
    }
}


