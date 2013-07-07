package il.ac.hit.courses.sayinghellowgreeting;
public class GreetingsDemo
{
 public static void main(String[] args)
 {
  //instantiating the Greeting class in order to get two objects.
  //One object represent the good morning greeting. The other object
  //represent the good evening greeting.
  Greeting goodMorningGreeting = new Greeting("Good Morning");
  Greeting goodEveningGreeting = new Greeting("Good Evening");
  //calling the greet method on the good morning greeting object
  //in order to greet David, Daniel, Sam, John & Michael with a 
  //good morning greeting message.
  goodMorningGreeting.greet("David");
  goodMorningGreeting.greet("Daniel");
  goodMorningGreeting.greet("Sam");
  goodMorningGreeting.greet("John");
  goodMorningGreeting.greet("Michael");  
  //calling the greet method on the good evening greeting object
  //in order to greet David, Daniel, Sam, John & Michael with a 
  //good morning greeting message.
  goodEveningGreeting.greet("David");
  goodEveningGreeting.greet("Daniel");
  goodEveningGreeting.greet("Sam");
  goodEveningGreeting.greet("John");
  goodEveningGreeting.greet("Michael");  
 }
}