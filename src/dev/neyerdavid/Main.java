package dev.neyerdavid;

import dev.neyerdavid.enten.*;
import dev.neyerdavid.flugverhalten.FliegtMitFluegeln;
import dev.neyerdavid.flugverhalten.FlugVerhalten;
import dev.neyerdavid.quaken.Quaken;

public class Main {

    public static void main(String[] args) {
	Ente mallard = new StockEnte();
	mallard.tuFliegen();
	mallard.tuQuaken();

	Ente moor = new MoorEnte();
	moor.tuFliegen();
	moor.tuQuaken();

	Ente lock = new LockEnte();
	lock.tuFliegen();
	lock.tuQuaken();

	Ente gummi = new GummiEnte();
	gummi.tuFliegen();
	gummi.tuQuaken();
	gummi.setFlugVerhalten(new FliegtMitFluegeln());
	gummi.setQuakVerhalten(new Quaken());
	gummi.tuFliegen();
	gummi.tuQuaken();
    }
}
