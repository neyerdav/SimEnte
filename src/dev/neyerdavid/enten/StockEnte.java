package dev.neyerdavid.enten;

import dev.neyerdavid.flugverhalten.FliegtGarNicht;
import dev.neyerdavid.quaken.StummesQuaken;

public class StockEnte extends Ente {
   public StockEnte(){
        flugVerhalten = new FliegtGarNicht();
        quakVerhalten = new StummesQuaken();
    }

}
