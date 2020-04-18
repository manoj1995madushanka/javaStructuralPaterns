package DecoratePattern.Sandwitch;

public class DressingDecorator extends SandwichDecorator {


    public DressingDecorator(Sandwitch customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return customSandwich.make() + addDressing();
    }

    private String addDressing(){
        return " + mustard";
    }
}
