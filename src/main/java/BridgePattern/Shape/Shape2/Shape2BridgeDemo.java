package BridgePattern.Shape.Shape2;

public class Shape2BridgeDemo {
    public void shape2(){
        Color blue = new Blue();
        Shape square = new Square(blue);
        Color red = new Red();
        Shape circle = new Circle(red);

        square.applyColor();
        circle.applyColor();
    }

}
