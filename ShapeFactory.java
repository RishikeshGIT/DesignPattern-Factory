package designpatterns.factory;

public class ShapeFactory {
	
	public static Shape getShape(String shapeType) {
		switch(shapeType) {
		case "Circle":
			return new Circle();
		case "Square":
			return new Square();
		case "Rectangle":
			return new Rectangle();
		default:
			return null;
		}
	}
}
