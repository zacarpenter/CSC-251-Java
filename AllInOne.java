/*
 * Zachary Carpenter & Charah Wheeler
 * CSC 251 Library Group Project
 * 2/25/2022
 * 
 * Partner - Charah Wheeler
 */

package net.dtcc.lib;

public class AllInOne {
	
	// Area
	
	
	public double Rectangle(double l, double w ) {
		return l * w;
	}
	
	// area square = side^2 or side*side
	public double Square(double squareSide) {
		return squareSide * squareSide;
	}
	
	public double Triangle(double b, double h ) {
		return 0.5 *b * h;
	}
	
	// area circle = PI*r^2 or PI*(r*r)
	public double Circle(double cirRadius) {
		return Math.PI * (cirRadius * cirRadius);
	}
	
	public double Trapezoid(double a, double b, double h ) {
		return 0.5 * (a + b) * h;
	}
	
	// area ellipse = PI*r1*r2
	public double Ellipse(double ellRadius1, double ellRadius2) {
		return Math.PI * ellRadius1 * ellRadius2;
	}
	
	public double Pentagon(double apothem, double perimeter ) {
		return 0.5 * (apothem) * (perimeter);
	}
	
	// area parallelogram = b*h
	public double Parallelogram(double parBase, double parHeight) {
		return parBase * parHeight;
	}
	
	public double Rhombus(double p, double q ) {
		return (p * q) / 2;
	}
	
	// area hexagon = ((3*Sqrt3)/2) * (s*s)
	public double Hexagon(double hexSide) {
		return (((3 * Math.sqrt(3)) / 2) * (hexSide * hexSide));
	}
	
	public double Polygon(double apothem, double numSides, double sideLen) {
		return 0.5 * (apothem) * (numSides) * (sideLen);
	}
	
	
	// Fractions
	
	/*
	 *  adding fractions - identify least common denominator = denominator * denominator
	 *  create equivalent fractions = numerator * (common denominator * denominator)
	 *  add the numerators
	 *  display
	 */
	public String AddingFractions(int aNom1, int aDenom1, int aNom2, int aDenom2) {
		String addedFractionResult = "";
		int commonDenom = aDenom1 * aDenom2;
		int addedFraction = (aNom1 * (commonDenom/aDenom1)) + (aNom2 * (commonDenom/aDenom2));
		
		addedFractionResult = aNom1 + "/" + aDenom1 + " + " + aNom2 + "/" + aDenom2 + " = " + addedFraction + "/" + commonDenom;
		
		return addedFractionResult; 
	}
	
	public double SubtractingTwoFractions (double numOne, double denOne, double numTwo, double denTwo, double firstNum, double secondNum) {
		firstNum = numOne/denOne;
		secondNum = numTwo/denTwo;
		
		return firstNum - secondNum;
	}
	
	// multiplying fractions =  numerator * numerator over denominator * denominator
	public String MultiplyFractions(int mNom1, int mDenom1, int mNom2, int mDenom2) {
		String multiplyFractionResult = "";
		int multiplyNom = mNom1 * mNom2;
		int multiplyDenom = mDenom1 * mDenom2;
		
		multiplyFractionResult = mNom1 + "/" + mDenom1 + " * " + mNom2 + "/" + mDenom2 + " = " + multiplyNom + "/" + multiplyDenom;
		
		return multiplyFractionResult;
	}
	
	public double DividingTwoFractions (double numOne, double denOne, double numTwo, double denTwo, double firstNum, double secondNum) {
		firstNum = numOne/denOne;
		secondNum = numTwo/denTwo;
		
		return firstNum / secondNum;
	}
	
	
	// Binary
	
	// binary -> decimal conversion
	public int BinaryToDecimal(int binary) {
		int decimal = 0;
		int pow = 0;
		
		while(true) {
			if(binary == 0) {
				break;
			}
			else {
				int i = binary % 10;
				decimal += i * Math.pow(2, pow);
				binary = binary / 10;
				pow++;
			}
		}
		
		return decimal;
	}
	
	// Temperature
	
	public double CelciusToFahrenheit (double c) {
		return (c * 1.8) + 32;
	}
	
	// celsius -> kelvin = c + 273.15
	public double CelsiusToKelvin(double celToKel) {
		return celToKel + 273.15;
	}
	
	public double FahrenheitToCelcius (double f) {
		return (f - 32) * .5556;
	}
	
	// fahrenheit -> kelvin = (f + 459.67) * 5/9
	public double FahrenheitToKelvin(double fahToKel) {
		return ((fahToKel - 32.0) * (5.0/9.0)) + 273.15;
	}
	
	
	// Volume
	
	public double VolumeOfCube (double s) {
		return Math.pow(s, 3);
	}
	
	// volume box = l*w*h
	public double BoxVolume(double boxLength, double boxWidth, double boxHeight) {
		return boxLength * boxWidth * boxHeight;
	}
	
	public double VolumeOfCylinder (double r, double h ) {
		return h * Math.PI * Math.pow(r, 2);
	}
	
	// volume cone = (h*PI*(r*r))/3
	public double ConeVolume(double coneHeight, double coneRadius) {
		return (coneHeight * Math.PI * (coneRadius * coneRadius)) / 3;
	}
	
	public double VolumeOfSphere (double r) {
		return (4.0/3.0) * (Math.PI) * (Math.pow(r, 3));
	}
	
	
	// Perimeter
	
	// perimeter square = 4*side
	public double SquarePerimeter(double sqSide) {
		return 4 * sqSide;
	}
	
	public double PerimeterOfRectangle (double l, double w) {
		return 2 * (l + w);
	}
	
	
	// Circumference
	
	// circumference circle = 2*PI*r
	public double Circumference(double circleRadius) {
		return 2 * Math.PI * circleRadius;
	}
	
	
	// Pythagorus Theorem
	
	public double PythagorusTheorem (double a, double b) {
		return Math.sqrt((Math.pow(a, 2)) + (Math.pow(b,2)));
	}

}
