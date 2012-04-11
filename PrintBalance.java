import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2011.
 */
public class PrintBalance{

	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
		String language = "en";
		String country = "US";
		
//		String language = "de";
//		String country = "DE";
		
//		String language = "fr";
//		String country = "FR";
		
		Locale currentLocale;
		ResourceBundle messages;
		
		currentLocale = new Locale(language, country);
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
	
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		
		//Greeting
//		System.out.println("Hello World");
		
		System.out.println(messages.getString("greetings"));
		
		//Get User's Name
//		System.out.println("Please enter your name");
		System.out.println(messages.getString("inputName"));
		String name = scanInput.nextLine();
//		System.out.println("I am pleased to meet you " + name);
		System.out.println(messages.getString("pleasedToMeet")+ name);
		
		
		
		
		//print today's date, balance and bid goodbye
//		System.out.println("As of : "+ today.toString());
		System.out.println(messages.getString("asOf") + DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, currentLocale).format(today));
//		System.out.println("You owe the school $9876543.21");
		System.out.println(messages.getString("owe") + NumberFormat.getCurrencyInstance(currentLocale).format(9876543.21));
//		System.out.println("Good Bye");
		System.out.println(messages.getString("bye"));
	}
}



