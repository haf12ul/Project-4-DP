package contactmanagementsoftware;

public class AcquaintanceInvoker {

    AcquaintanceCommand slot;

    public void setCommand(AcquaintanceCommand command) {
        slot = command;
    }

    public Acquaintances setClass() {
        return slot.returnClass();
    }
}
