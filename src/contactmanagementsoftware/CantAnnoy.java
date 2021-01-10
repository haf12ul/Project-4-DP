package contactmanagementsoftware;

import java.io.Serializable;

public class CantAnnoy implements Annoy,Serializable {

    @Override
    public String annoy() {
        return "not annoying.";
    }
}
