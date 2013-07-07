package il.ac.hit.courses.monkey;


import java.util.*;
import java.awt.*;
/**
 * This class tests the Monkey class.
 * @author Haim
 *
 */
public class MonkiesDemo
{
	public static void main(String[] args)
 {
  //Instantiating the Monkey class to represent Bobo The Monkey
  Calendar boboBirthdayCalendar = Calendar.getInstance();
  boboBirthdayCalendar.set(1983,11,24);
  Date boboBirthday = boboBirthdayCalendar.getTime();
  Monkey bobo = new Monkey("Bobo",65,108,Color.green,boboBirthday);
  
  //Instantiating the Monkey class to represent Gogo The Monkey
  Calendar gogoBirthdayCalendar = Calendar.getInstance();
  gogoBirthdayCalendar.set(1982,11,24);
  Date gogoBirthday = gogoBirthdayCalendar.getTime();
  Monkey gogo = new Monkey("Gogo",65,108,Color.yellow,gogoBirthday);
  //Instantiating the Monkey class to represent Jojo The Monkey
  Calendar jojoBirthdayCalendar = Calendar.getInstance();
  gogoBirthdayCalendar.set(1980,11,24);
  Date jojoBirthday = gogoBirthdayCalendar.getTime();
  Monkey jojo = new Monkey("Jojo",65,108,Color.blue,jojoBirthday);
  //printing out the textual descriptions of the three monkeys
  System.out.println("The three monkey objects were successfully created:");
  System.out.println(bobo);
  System.out.println(gogo);
  System.out.println(jojo);
 }
}