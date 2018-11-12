package net.membermanager.test;

import net.membermanager.Club;
import net.membermanager.Member;

public class TestClub {
    public static void main (String[] args) {

        //17.a. Test:  skapa en klubb med bara namn
        Club testClub = new Club("Test Club");

        //17.a. Test: namnet ska gå att läsa ut med name()
        System.out.println(testClub.name());


        //17.a. Test: numberOfMembers() ska svara 0
        System.out.println(testClub.numberOfMembers());

        //17.b. Test:
        // Det ska gå att lägga till medlemmar och se detta reflekteras i både
        //numberOfMembers() och i metoden members().
        testClub.addMember(new Member("Johanna", 1955));
        System.out.println(testClub.numberOfMembers());
        testClub.members();

        //17.c. Test:
        //Den lista du får från metoden members() är en kopia - dvs testa att du inte kan
        //ändra i kopian så att klubbens interna (private) lista också ändras.
        int copyOfNumberOfClubMembers = testClub.numberOfMembers();
        System.out.println("default number: " + copyOfNumberOfClubMembers);
        try {
            testClub.members().add(new Member("Name1", 1981));
            System.out.println("number has changed to: " + testClub.numberOfMembers());
            assert testClub.numberOfMembers() == copyOfNumberOfClubMembers;
            //if (copyOfNumberOfClubMembers != testClub.numberOfMembers()) {
            //    System.err.println("change was made in number of members");
            //}
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
