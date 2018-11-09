package net.membermanager;

public class Member {
    String name;
    String email;
    int birthYear;

    //constructor 1
    public Member (String givenName, int givenBirthYear) {
        this.name = givenName;
        this.birthYear = givenBirthYear;
    }

    //constructo 2
    public Member (String givenName, int givenBirthYear,String givenEmail) {
        this(givenName, givenBirthYear);
        this.email = givenEmail;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getBirthYear() {
        return birthYear;
    }
}

