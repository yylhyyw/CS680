package edu.umb.cs680.hw11.observer;

public class DJIAEvent {
    private float djia;
	
	public float getDjia() {
		return djia;
	}
	public DJIAEvent(float djia)
	{
		this.djia = djia;
	}

	public void setDjia(float djia) {
		this.djia = djia;
	}
}