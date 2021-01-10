package contactmanagementsoftware;

public class CasualAcquaintancesCmd implements AcquaintanceCommand {

    @Override
    public Acquaintances returnClass() {
        return new CasualAcquaintances();
    }
}
