package il.ac.hit.courses.car;


import java.awt.*;
public class Car
{
	//test git
 /**
  * The car's brand. 
  */
 private String brand;
 
 /**
  * The car's model.
  */
 private String model;
 
 /**
  * The car's color.
  */
 private Color color;
 
 /**
  * The car's id number.
  */
 private long id;
 
 /**
  * Constructs a new Car object. 
  * @param brand the Car's brand.
  * @param model the Car's model.
  * @param color the Car's color.
  * @param id the Car's ID number. 
  */
 public Car(String brand, String model, Color color, long id)
 {
  super();
  this.brand = brand;
  this.model = model;
  this.color = color;
  this.id = id;
 }
 
 /**
  * Gets the car's color. 
  * @return the car's color.
  */
 public Color getColor()
 {
  return color;
 }
 
 /**
  * Sets the car's color. 
  * @param color the new car's color.
  */
 public void setColor(Color color)
 {
  this.color = color;
 }
 
 /**
  * Gets the car's brand.
  * @return the car's brand. 
  */
 public String getBrand()
 {
  return brand;
 }
 
 /**
  * Gets the car's model.
  * @return the car model.
  */
 public String getModel()
 {
  return model;
 }
 
 /**
  * Gets the car's ID number. 
  * @return the car ID number.
  */
 public long getId()
 {
  return id;
 }

 /* Gets a string representation of this car.
  * @see java.lang.Object#toString()
  */
 public String toString()
 {
  return brand+" "+model+" "+"id="+id+" color=("+color.getRed()+","+color.getGreen()+","+color.getBlue()+")"; 
 }
 public static void main(String args[])
 {
  Car toyotaCorola = new Car("Toyota","Corola",Color.WHITE,234234);
  Car toyotaCellica = new Car("Toyota","Cellica",Color.red,123123);  
  Car toyotaCarina = new Car("Toyota","Carina ",Color.green ,443222);
  System.out.println(toyotaCorola);
  System.out.println(toyotaCellica);
  System.out.println(toyotaCarina);
 }
}