package CompositePattern.MenuExample;

public class CompositeMainMenu {
    public void mainMenu(){
        Menu mainMenu = new Menu("Main","/main");

        MenuItem safetyMenuItem = new MenuItem("safety","/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims","/claims");
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personol Claims",".personalClaims");
        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());
    }
}
