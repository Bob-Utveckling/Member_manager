package net.membermanager.test;

import net.membermanager.Club;
import net.membermanager.Member;

public class TestClub {
    public static void main (String[] args) {
        Club testClub = new Club("Test Club");
        System.out.println(testClub.name());
        System.out.println(testClub.numberOfMembers());

        testClub.addMember(new Member("Johanna", 1955));
        System.out.println(testClub.numberOfMembers());
        //testClub.members();

        try {
            //testClub.members().add(new Member("Name1", 1981));
            //testClub.members();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
