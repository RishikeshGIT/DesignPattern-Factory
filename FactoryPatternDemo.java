package designpatterns.factory;

import java.util.Scanner;

public class FactoryPatternDemo {

	public static void main (String[] args) {
		
		System.out.print("Which shape do you want to draw:");
		Scanner scanner = new Scanner(System.in);
		String shapeRequired = scanner.nextLine().trim();
		scanner.close();
		
		Shape shape = ShapeFactory.getShape(shapeRequired);
		shape.draw();
	}
}
