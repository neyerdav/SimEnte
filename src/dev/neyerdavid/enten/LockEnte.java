package dev.neyerdavid.enten;

import dev.neyerdavid.flugverhalten.FliegtGarNicht;
import dev.neyerdavid.quaken.Quaken;

public class LockEnte extends Ente{
    public LockEnte() {
        flugVerhalten = new FliegtGarNicht();
        quakVerhalten = new Quaken();
    }
}
