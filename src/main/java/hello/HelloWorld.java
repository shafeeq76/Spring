package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
	
	LocalTime currentTime = new LocalTime();
	System.out.println("This is First Gradle Build");
	System.out.println("The Current Local Time is : "+currentTime);
	
    	Greeter greeter = new Greeter();
    	System.out.println(greeter.sayHello());
  }
}
