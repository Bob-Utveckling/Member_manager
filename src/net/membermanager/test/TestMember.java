package net.membermanager.test;

import net.membermanager.Member;

public class TestMember {

    public static void main(String[] args) {
        try {
            //anropa constructos med olika värde
            Member member1 = new Member("bob", 2002);
            Member member2 = new Member("bob", 1990, "email");
            //c: fråga om. #14.
            Member member3 = new Member("bob", 1990, "bob@email.se");

            Member member4 = new Member("bob", 1990, "");
            System.err.println("Test för invalid email failed - no exception thrown."); //checking did not return error

        } catch (IllegalArgumentException e) {
            System.out.println("Testet lyckades, efersom hittade felaktiga indata");
            System.out.println(e);
        }

    }
}
