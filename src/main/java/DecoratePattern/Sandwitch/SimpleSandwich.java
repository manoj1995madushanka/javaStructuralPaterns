package DecoratePattern.Sandwitch;

// concrete component
public class SimpleSandwich implements Sandwitch{

    @Override
    public String make() {
        return "Bread";
    }
}
