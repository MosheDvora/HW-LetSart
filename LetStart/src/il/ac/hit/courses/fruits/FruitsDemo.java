package il.ac.hit.courses.fruits;

import java.awt.*;
/**
 * This class is a stand alone application that demonstrates a simple
 * usage of the Fruit class.
 * 
 * @author Haim
 *
 */
public class FruitsDemo
{

 /**
  * @param args 
  */
 public static void main(String[] args)
 {
  //instantiating the Fruit class in order to get objects
  //that represent an apple, orange, banana and avocado.
  Fruit apple = new Fruit(124.3,"Apple",Color.green);
  Fruit orange = new Fruit(208.2,"Orange",Color.orange);
  Fruit banana = new Fruit(82.14,"Banana",Color.yellow);
  Fruit avocado = new Fruit(84.22,"Avocado",Color.green);
  //printing out each one of the four objects.
  System.out.println(apple);
  System.out.println(orange);
  System.out.println(banana);  
  System.out.println(avocado);  
 }
}