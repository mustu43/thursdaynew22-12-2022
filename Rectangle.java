package learn;

class Rectangl
{
  double length, breadth;
  public Rectangl (double length, double breadth)
  {
    this.length = length;
    this.breadth = breadth;

  }
  public void Area ()
  {
    System.out.println ("The Area of Rectangle is:" +
			this.length * this.breadth);
  }
  public void Perimeter ()
  {
    System.out.println ("The Perimeter of Rectangle is" +
			(2 * (this.length + this.breadth)));
  }

}

class Square extends Rectangl
{


  public Square (double side)
  {
    super (side, side);





  }

}

public class Rectangle
{
  public static void main (String[]args)
  {
    Rectangl r = new Rectangl (8, 10);
    Square s = new Square (10);
      r.Area ();
      r.Perimeter ();
      s.Area ();
      s.Perimeter ();



  }
}