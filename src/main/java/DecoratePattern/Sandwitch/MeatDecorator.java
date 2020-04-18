package DecoratePattern.Sandwitch;

public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwitch customSandwich){
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make()+ addMeat();
    }

    private String addMeat(){
        return " + turkey";
    }
}
