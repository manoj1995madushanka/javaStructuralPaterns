package DecoratePattern.Sandwitch;
// decoratot
public abstract class SandwichDecorator implements Sandwitch {
    protected Sandwitch customSandwich;

    public SandwichDecorator(Sandwitch customSandwich){
        this.customSandwich = customSandwich;
    }

    public String make(){
        return customSandwich.make();
    }
}
