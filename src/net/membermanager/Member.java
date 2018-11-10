package net.membermanager;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Member {
    private String name;
    private String email;
    private int birthYear;

    public static void main(String[] args) {
        //Member member1 = new Member("Johnattan", 1982, "johna.sanna@hotmail.com") ;
    }

    //constructor 1
    public Member (String givenName, int givenBirthYear) {
        this.name = givenName;

        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime (date);
        int thisYear = calendar.get(Calendar.YEAR);
        int howOld = thisYear - givenBirthYear;
        if (howOld < 18) throw new IllegalArgumentException("Too young to be a member");
        this.birthYear = givenBirthYear;
    }

    //constructor 2
    public Member (String givenName, int givenBirthYear,String givenEmail) {
        this(givenName, givenBirthYear);
        //one invariant:
        if (givenEmail == "" || !givenEmail.contains("@")) throw new IllegalArgumentException("Invalid email");
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

    @Override
    public String toString() {
        return ("Name: <" + this.name + "> BirthYear: <" + this.email + "> Email: <" + this.birthYear + ">");
    }

    //@Override
    //void add (Member addThisMember) {
    //    System.out.println("add disabled");
    //}

}

