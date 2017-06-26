package package1;        //This java file is inside package named package1 inside src folder.

public class Circle extends Figure     //Declaring the class which inherited by Figure class. 
{
	double areaCircle;      //double variable to store the value of area of circle.
	double perimeterCircle;     //double variable to store the value of perimeter of circle.
	double piValue=3.141;     //Value of pi.
	
	public Circle(double dim1)     //Constructor.
	{
		super.dim1=dim1;          //Initializing the diameter of circle.
	}
	
	public void findArea()
	{
		areaCircle=(piValue*dim1*dim1)/4;           //Finding the area of circle.
		
		System.out.println("The Area of circle is "+areaCircle);     //Printing the area of circle.
	}
	
	public void findPerimeter()
	{
		perimeterCircle = piValue * dim1 ;       //Finding the perimeter of the circle.
		
		System.out.println("The perimeter of the circle is "+perimeterCircle);       //Printing the perimeter value of circle.
	}
	
}    //End of Circle class.