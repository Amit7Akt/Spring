package com.ojectInjection;

public class Student {
	
	private MathCheat math_cheat ;
	public void setMath_cheat(MathCheat math_cheat) {
		this.math_cheat = math_cheat;
	}
	public void Cheating() {
		math_cheat.mathcheat();
		
		
	}
}
