import static org.junit.Assert.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;


public class PrintBalanceTest {

	@Test
	public void testGreetingEnglish() {
		Locale currentLocale = new Locale("en", "US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Hello", messages.getString("greetings"));
	}

	
	@Test
	public void testInputNameEnglish() {
		Locale currentLocale = new Locale("en", "US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Please enter your name", messages.getString("inputName"));
	}
	
	@Test
	public void testPleasedToMeetEnglish() {
		Locale currentLocale = new Locale("en", "US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("I am pleased to meet you ", messages.getString("pleasedToMeet"));
	}
	
	@Test
	public void testAsOfEnglish() {
		Locale currentLocale = new Locale("en", "US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("As of : ", messages.getString("asOf"));
	}
	
	@Test
	public void testOweEnglish() {
		Locale currentLocale = new Locale("en", "US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("You owe the school ", messages.getString("owe"));
	}
	
	@Test
	public void testByeEnglish() {
		Locale currentLocale = new Locale("en", "US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Good Bye", messages.getString("bye"));
	}
	
	@Test
	public void testDateEnglish() {
		Locale currentLocale = new Locale("en", "US");
		String today = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale).format(new Date());
		assertEquals("Apr 10, 2012", today);
	}
	
	@Test
	public void testGreetingFrench() {
		Locale currentLocale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Bonjour", messages.getString("greetings"));
	}

	
	@Test
	public void testInputNameFrench() {
		Locale currentLocale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("S'il vous plaît entrer votre nom", messages.getString("inputName"));
	}
	
	@Test
	public void testPleasedToMeetFrench() {
		Locale currentLocale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Je suis heureux de vous rencontrer ", messages.getString("pleasedToMeet"));
	}
	
	@Test
	public void testAsOfFrench() {
		Locale currentLocale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("En date du : ", messages.getString("asOf"));
	}
	
	@Test
	public void testOweFrench() {
		Locale currentLocale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Vous devez l'école ", messages.getString("owe"));
	}
	
	@Test
	public void testByeFrench() {
		Locale currentLocale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Au revoir", messages.getString("bye"));
	}
	
	@Test
	public void testDateFrench() {
		Locale currentLocale = new Locale("fr", "FR");
		String today = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale).format(new Date());
		assertEquals("10 avr. 2012", today);
	}
		
	@Test
	public void testGreetingGerman() {
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Hallo", messages.getString("greetings"));
	}

	
	@Test
	public void testInputNameGerman() {
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Bitte geben Sie Ihren Namen", messages.getString("inputName"));
	}
	
	@Test
	public void testPleasedToMeetGerman() {
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Ich freue mich, Sie kennen zu lernen ", messages.getString("pleasedToMeet"));
	}
	
	@Test
	public void testAsOfGerman() {
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Stand: ", messages.getString("asOf"));
	}
	
	@Test
	public void testOweGerman() {
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Sie schulden die Schule ", messages.getString("owe"));
	}
	
	@Test
	public void testByeGerman() {
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Auf Wiedersehen", messages.getString("bye"));
	}
	
	@Test
	public void testDateGerman() {
		Locale currentLocale = new Locale("de", "DE");
		String today = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale).format(new Date());
		assertEquals("10.04.2012", today);
	}
}
