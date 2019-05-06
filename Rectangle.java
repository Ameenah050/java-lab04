/**
 * Lab04 Assignment1c.
 *
 * @author (AMINA HAMID U15/FNS/CSC/050)
 * @version (a version number or a date)
 */
public class Rectangle
{
   private double length, width;
   
   public Rectangle(double recLength, double recWidth)
   {
       length = recLength;
       width = recWidth;
   }
   
   public double area()
   {
       return length * width;
   }
   
   public double getLength()
   {
       return length;
   }
   
   public double getWidth()
   {
       return width;
   }
   
   public void setLength(double newLength)
   {
       length = newLength;
   }
   
   public void setWidth(double newWidth)
   {
       width = newWidth;
   }
   
}
