// Elisha Catherasoo
// 101148507

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies = new ArrayList<>();

    // add a new Buddy
    public void addBuddy(String name, String address, String phoneNumber){
        BuddyInfo newbuddy = new BuddyInfo(name, address, phoneNumber);

        buddies.add(newbuddy);
    }

    // remove a Buddy
    public void removeBuddy(String name, String address, String phoneNumber){
        BuddyInfo removeBuddy= new BuddyInfo(name, address, phoneNumber);

        buddies.remove(removeBuddy);
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}
