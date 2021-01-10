package contactmanagementsoftware;

public class PersonalFriendsCmd implements AcquaintanceCommand {

    @Override
    public Acquaintances returnClass() {
        return new PersonalFriends();
    }
}
