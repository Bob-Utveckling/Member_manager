package net.membermanager;

import java.util.ArrayList;
import java.util.List;

public class Club {
    String name;
    List<Member> members = new ArrayList<>();

    public Club (String givenName) {
        if (givenName == null) throw new IllegalArgumentException();
        this.name = givenName;
    }

    public Club (String givenName, List<Member> givenMembers) {
        if (givenName == null || givenMembers == null) throw new IllegalArgumentException();
    }

    public void addMember(Member m) {
        if (m == null) throw new IllegalArgumentException();
        members.add(m);
    }

    public int numberOfMembers() {
        if (members.isEmpty()) {
            System.out.println("No members in club.");
            return 0;
        } else {
            System.out.println("Number of members: " + members.size());
            return members.size();
        }
    }

    public String name() {
        //System.out.println("Club name: " + this.name);
        return ("Club name: " + this.name);
    }

    /*public void members() {
        for (Member member : members) {
            System.out.println("name: <" + member.getName() + "> " +
                    "birth year: <" + member.getBirthYear() + "> " +
                    "email: <" + member.getEmail() + ">");
        }
        //return members;
        // void and not returning means
        // not being able to change members list from this class
    }
    */

    //pakcage-private:
    //i.e.:
    //The protected modifier specifies that the member
    // can only be accessed within its own package (as with package-private)
    // and, in addition, by a subclass of its class in another package.
    List<Member> members() {
        for (Member member : members) {
            System.out.println("name: <" + member.getName() + "> " +
                    "birth year: <" + member.getBirthYear() + "> " +
                    "email: <" + member.getEmail() + ">");
        }

        return members;
    }

    @Override
    public String toString() {
        String returnThis = "Club name: " + name();
        System.out.println("Club members: ");
        members();
        return returnThis;
    }

    public static void main (String[] args) {
        Club club1 = new Club("Nödinge");
        club1.addMember(new Member("Ali", 1982));
        club1.addMember(new Member("Reza", 1981));
        club1.numberOfMembers();
        club1.name();
        club1.members();
        System.out.println(club1.toString());
    }
}