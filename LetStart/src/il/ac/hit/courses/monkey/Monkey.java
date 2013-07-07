package il.ac.hit.courses.monkey;

import java.awt.*;
import java.util.*;

/**
 * The <code>Monkey</code> class describes the monkey animal. Each object of this
 * class represents a unique monkey animal. 
 * @author Haim
 *
 */
public class Monkey
{

 /**
  * The monkey name.
  */
 private String name;

 /**
  * The monkey weight.
  */
 private double weight;

 /**
  * The monkey height.
  */
 private double height; 

 /**
  * The monkey color.
  */
 private Color color; 

 /**
  * The monkey birthday. 
  */
 private Date birthday;

 /**
  * Constructs an object that represents a monkey with the following default attributes: 
  * Weight of 64kg, height of 140cm, black color, today's date as its birthday and "Bogly" as its name.
  *
  */
 public Monkey()
 {
  this("Bogly", 64,140,Color.BLACK , Calendar.getInstance().getTime());
 }

 /**
  * Constructs an object that represents a monkey with the received parameters as its attributes.
  * @param weight the monkey weight.
  * @param height the monkey height.
  * @param color the monkey color.
  * @param birthday the monkey birthday.
  */
 public Monkey(String name, double weight, double height, Color color, Date birthday)
 {
  super();
  this.name = name;
  this.weight = weight;
  this.height = height;
  this.color = color;
  this.birthday = birthday;
 }

 /**
  * Gets the monkey name.
  * @return the monkey name.
  */
 public String getName()
 {
  return name;
 }

 /**
  * Sets the new name of this monkey.
  * @param name the new name. 
  */
 public void setName(String name)
 {
  this.name = name;
 }

 /**
  * Gets the monkey weight.
  * @return the monkey weight
  */
 public double getWeight()
 {
  return weight;
 }

 /**
  * Sets the new weight of this monkey.
  * @param weight the new weight. 
  */
 public void setWeight(double weight)
 {
  this.weight = weight;
 }

 /**
  * Gets the monkey weight.
  * @return the monkey height.
  */
 public double getHeight()
 {
  return height;
 }

 /**
  * Sets the new monkey height.
  * @param height the monkey height.
  */
 public void setHeight(double height)
 {
  this.height = height;
 }

 /**
  * Gets the monkey color.
  * @return the monkey color.
  */
 public Color getColor()
 {
  return color;
 }

 /**
  * Sets the monkey color.
  * @param color the new monkey color.
  */
 public void setColor(Color color)
 {
  this.color = color;
 }

 /**
  * Gets the monkey birthday.
  * @return the monkey birthday.
  */
 public Date getBirthday()
 {
  return birthday;
 } 

 public String toString()
 {
  return "[" + name + ", " + color + ", kg" + weight + " cm" + height + "]";  
 }
}
