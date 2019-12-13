package edu.umb.cs680.hw11.observer;

import java.util.Observable;

public class DJIAQuoteObservable extends Observable {

	public void changeQuote(float q)
	{	
        setChanged();
        notifyObservers(new DJIAEvent(q));
	}

}