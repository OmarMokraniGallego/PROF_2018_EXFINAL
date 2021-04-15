package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {

	@Test
	public void smokeTest1() {
		/*Greeting greeting = new Greeting();
		assertEquals("Good morning", greeting.getGreeting(null));*/
		
		MyCalendar calendar = new MyCalendar();
		assertEquals("Good morning", greeting.getGreeting(null));

		
	}
	
	@Test
	public void smokeTest2() {
		Greeting greeting = new Greeting();
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
	}
	
	@Test
	public void smokeTest3() {
		Greeting greeting = new Greeting();
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH));
	}

}
