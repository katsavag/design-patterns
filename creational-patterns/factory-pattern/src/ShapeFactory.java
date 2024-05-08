public class ShapeFactory {
    Shape createShape(ShapeEnum shapeEnum) throws Exception {
        switch (shapeEnum) {
            case Circle -> {
                return new Circle();
            }
            case Triangle -> {
                return new Triangle();
            }
            default -> throw new Exception("Shape not supported");
        }
    }
}
