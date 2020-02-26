package dev.neyerdavid.enten;

import dev.neyerdavid.flugverhalten.FlugVerhalten;
import dev.neyerdavid.quaken.QuakVerhalten;

public abstract class Ente {
    FlugVerhalten flugVerhalten;
    QuakVerhalten quakVerhalten;

    public void schwimmen() {
        System.out.println("Alle Enten schwimmen");
    }
    public void tuQuaken(){
        quakVerhalten.quaken();
    }
    public void tuFliegen() { flugVerhalten.fliegen();}
    public void setFlugVerhalten(FlugVerhalten fv) { this.flugVerhalten = fv; }
    public void setQuakVerhalten(QuakVerhalten qv) { this.quakVerhalten = qv; }
}
