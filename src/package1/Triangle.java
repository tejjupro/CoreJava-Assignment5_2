package package1;      //This java file is inside package named package1 inside src folder.

public class Triangle extends Figure        //Declaring the class which inherited by Figure class.
{
     //Here, we are assuming the equilateral triangle, and dim1 defined in super class is side length of this triangle.
	double areaTriangle;      //double variable to store the value of area of Triangle.
	double perimeterTriangle;     //double variable to store the value of perimeter of Triangle.
	double sqrtOfThree=1.7320;     //double variable to store the value of square root of three which is used in Area formula.
	
	public Triangle(double dim1)     //Constructor.
	{
		super.dim1=dim1;          //Initializing the first side of Triangle.
	}
	
	public void findArea()
	{
		areaTriangle= (sqrtOfThree * dim1 * dim1)/4;           //Finding the area of Triangle.
		
		System.out.println("The Area of Triangle is "+areaTriangle);     //Printing the area of Triangle.
	}
	
	public void findPerimeter()
	{
		perimeterTriangle = 3 * dim1 ;       //Finding the perimeter of the Triangle.
		
		System.out.println("The perimeter of the Triangle is "+perimeterTriangle);       //Printing the perimeter value of Triangle.
	}
}     //End of Triangle class.