public class Main {
    public static void main(String[] args) throws Exception {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape triangle = shapeFactory.createShape(ShapeEnum.Triangle);
        Shape circle = shapeFactory.createShape(ShapeEnum.Circle);

        triangle.draw();
        circle.draw();
    }
}