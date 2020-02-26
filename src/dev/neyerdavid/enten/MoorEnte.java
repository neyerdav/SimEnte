package dev.neyerdavid.enten;

import dev.neyerdavid.flugverhalten.FliegtMitFluegeln;
import dev.neyerdavid.quaken.Quaken;

public class MoorEnte extends Ente{
    public MoorEnte() {
        flugVerhalten = new FliegtMitFluegeln();
        quakVerhalten = new Quaken();
    }
}
