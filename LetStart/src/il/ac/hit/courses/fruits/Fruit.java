package il.ac.hit.courses.fruits;

import java.awt.*;
/**
 * An object of this class represents a fruit. 
 * 
 * @author Haim.
 *
 */
public class Fruit
{

 /**
  * The fruit weight
  */
 private double weight;  

 /**
  * The fruit name
  */
 private String name;
 
 /**
  *  The fruit color
  */
 private Color color;
 
 /**
  * Constructs a new allocated <code>Fruit</code> object, that represents a fruit. 
  * 
  * @param weight the weight of the fruit represented by the new allocated <code>Fruit</code> object. 
  * @param name the name of the fruit represented by the new allocated <code>Fruit</code> object. 
  * @param color the color of the fruit represented by the new allocated <code>Fruit</code> object.
  */
 public Fruit(double weight, String name, Color color)
 {
  super();
  this.weight = weight;
  this.name = name;
  this.color = color;
 }

 /**
  * @return the fruit's weight.
  */
 public double getWeight()
 {
  return weight;
 }

 /**
  * @param weight the fruit's weight to be set.
  */
 public void setWeight(double weight)
 {
  this.weight = weight;
 }

 /**
  * @return the fruit's name.
  */
 public String getName()
 {
  return name;
 }

 /**
  * @param name the fruit's name to be set.
  */
 public void setName(String name)
 {
  this.name = name;
 }

 /**
  * @return the fruit's color.
  */
 public Color getColor()
 {
  return color;
 }

 /**
  * @param color the fruit's color to be set.
  */
 public void setColor(Color color)
 {
  this.color = color;
 }
 
 /* This method returns a string that describes the <code>Fruit</code>
  * object.
  * @see java.lang.Object#toString()
  */
 public String toString()
 {
  return "["+name+", "+weight+", "+", "+color+"]";
 }
}
