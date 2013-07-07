package il.ac.hit.courses.sayinghellowgreeting;

/**
 * @author Haim
 *
 */
public class Greeting
{
 /**
  * The greeting text.
  */
 private String greetingText; 
 
 /**
  * @param personName the greeting text
  */
 public Greeting(String greetingText)
 {
  this.greetingText = greetingText;
 }

 /**
  * Prints out a textual hello greeting message.
  */
 public void greet(String personName)
 {
  System.out.println(greetingText + " " + personName);
 }
 
 /**
  * @return the greeting text
  */
 public String getGreetingText()
 {
  return greetingText;
 }

 /**
  * @param greetingText the greeting text
  */
 public void setGreetingText(String greetingText)
 {
  this.greetingText = greetingText;
 }

}

