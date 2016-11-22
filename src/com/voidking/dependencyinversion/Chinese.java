package com.voidking.dependencyinversion;

public class Chinese implements Human {
	
	private Languige lan;
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(lan.kind());
	}

	public void setLan(Languige lan) {
		this.lan = lan;
	}
}
