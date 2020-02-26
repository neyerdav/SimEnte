package dev.neyerdavid.enten;

import dev.neyerdavid.flugverhalten.FliegtGarNicht;
import dev.neyerdavid.quaken.Quietschen;

public class GummiEnte extends Ente{
public GummiEnte() {
    flugVerhalten = new FliegtGarNicht();
    quakVerhalten = new Quietschen();
}
}
