package package1;      //This java file is inside package named package1 inside src folder.

public class Rectangle extends Figure     //Declaring the class which inherited by Figure class. 
{
	double dim2;      //Second variable to represent second side length.
	//First side length is represented by dim1 declared in parent class.
	double areaRectangle;      //double variable to store the value of area of Rectangle.
	double perimeterRectangle;     //double variable to store the value of perimeter of Rectangle.
	
	public Rectangle(double dim1,double dim2)     //Constructor.
	{
		super.dim1=dim1;          //Initializing the first side of Rectangle.
		this.dim2=dim2;           //Initializing the second side of Rectangle.
	}
	
	public void findArea()
	{
		areaRectangle= dim1 * dim2 ;           //Finding the area of Rectangle.
		
		System.out.println("The Area of Rectangle is "+areaRectangle);     //Printing the area of Rectangle.
	}
	
	public void findPerimeter()
	{
		perimeterRectangle = 2 * (dim1 + dim2);       //Finding the perimeter of the Rectangle.
		
		System.out.println("The perimeter of the Rectangle is "+perimeterRectangle);       //Printing the perimeter value of Rectangle.
	}
}    //End of Rectangle class.