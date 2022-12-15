/*
 * Demonstrating the annotation @Autowired and @Qualifier
 */

package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;
	
	
	@Autowired
	@Qualifier("Octopus_heart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		if(heart !=  null)
		{
			System.out.println("name of the animal is :" + heart.getName()+" and it has "+heart.getNumber_of_hearts()+" hearts");
			heart.pump();
		}
		else {
			System.out.println("You're dead");
		}
	}



}
