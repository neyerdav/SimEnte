package dev.neyerdavid.flugverhalten;

public class FliegtMitFluegeln implements FlugVerhalten {

    @Override
    public void fliegen() {
        System.out.println("Kann fliegen");
    }
}
