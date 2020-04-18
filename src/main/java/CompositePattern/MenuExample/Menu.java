package CompositePattern.MenuExample;

import java.util.Iterator;

public class Menu extends MenuComponent {

    public Menu(String name,String url){
        this.name = name;
        this.url = url;
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
        return menuComponent;
    }


    public String toString() {
        StringBuilder builder = new StringBuilder();
        // call to MenuComponent toString
        builder.append(print(this));

        // then iterate over all childrens
        Iterator<MenuComponent> itr = menuComponents.iterator();
        while(itr.hasNext()){
            MenuComponent menuComponent = itr.next();
            builder.append(menuComponent.toString());
        }
        return builder.toString();
    }
}
