package edu.umb.cs680.hw11.multicast;

public class StockEvent {
	
	private String ticker;
	private float quote;
	public StockEvent(String t, float q) {
		this.ticker = t;
		this.quote = q;
	}
	public String getTicker() {
		return ticker;
	}
	public float getQuote() {
		return quote;
	}
}
