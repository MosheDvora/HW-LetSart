package il.ac.hit.courses.sayinghellow;

/**
 * @author Haim
 *
 */
public class HelloGreeting
{
 /**
  *  Name of the person to whom the greeting is said.
  */
 private String personName;

 /**
  * @param personName the name of the person to whom the greetings is said.
  */
 public HelloGreeting(String personName)
 {
  this.personName = personName;
 }

 /**
  * Prints out a textual hello greeting message.
  */
 public void greet()
 {
  System.out.println("Hello " + personName);
 }

 /**
  * @return the name of the person to whom the greeting is said.
  */
 public String getPersonName()
 {
  return personName;
 }

 /**
  * @param personName the name of the person to whom the greeting is said.
  */
 public void setPersonName(String personName)
 {
  this.personName = personName;
 }
}



