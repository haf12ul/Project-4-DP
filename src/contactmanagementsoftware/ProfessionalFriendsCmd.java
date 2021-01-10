package contactmanagementsoftware;

public class ProfessionalFriendsCmd implements AcquaintanceCommand {

    @Override
    public Acquaintances returnClass() {
        return new ProfessionalFriends();
    }
}
