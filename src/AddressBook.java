// Elisha Catherasoo
// 101148507

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies = new ArrayList<>();

    // add a new Buddy
    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    // remove a Buddy
    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
