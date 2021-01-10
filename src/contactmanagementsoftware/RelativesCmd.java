package contactmanagementsoftware;

public class RelativesCmd implements AcquaintanceCommand {

    @Override
    public Acquaintances returnClass() {
        return new Relatives();
    }
}
