package il.ac.hit.courses.sayinghellow;

public class GreetingDemo
{
 public static void main(String[] args)
 {
  //instantiating the HelloGreeting class
  HelloGreeting helloToDaniel = new HelloGreeting("Daniel");
  HelloGreeting helloToMichael = new HelloGreeting("Michael");
  HelloGreeting helloToSam = new HelloGreeting("Sam");
  HelloGreeting helloToDavid = new HelloGreeting("David");
  //calling the greet method on each one of the HelloGreeting objects
  helloToDaniel.greet();
  helloToMichael.greet();
  helloToSam.greet();
  helloToDavid.greet();
 }
}