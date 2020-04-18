package BridgePattern.Shape.Shape1;

public class Shape1BridgeDemo {
    public void shape1Demo(){
        Circle circle = new BlueCircle();
        Square square = new RedSquare();

        // think we need to create different classes for diffrent colors this is so time cost work so we implement this using bridge pattern
        circle.applyColor();
        square.applyColor();
    }
}
