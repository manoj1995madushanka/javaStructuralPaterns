package DecoratePattern.Sandwitch;

public class MakeSandwich {
    public void testSandwich(){
        Sandwitch sandwitch = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwitch.make());
    }
}
