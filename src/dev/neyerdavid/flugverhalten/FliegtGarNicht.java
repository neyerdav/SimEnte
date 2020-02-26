package dev.neyerdavid.flugverhalten;

public class FliegtGarNicht implements FlugVerhalten {

    @Override
    public void fliegen() {
        System.out.println("Kann nicht fliegen");
    }
}
