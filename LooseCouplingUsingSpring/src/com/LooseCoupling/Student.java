package com.LooseCoupling;

public class Student {
	private MathCheat cheat;

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}
	public void Student_cheating() {
		cheat.mathCheat();
	}
}
