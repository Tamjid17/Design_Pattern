package Structural.CompositePractice;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
    private List<Component> components = new ArrayList<>();

    public void add(Component Shape){
        components.add(Shape);
    }

    @Override
    public void render() {
        for(var component: components)
            component.render();
    }

    @Override
    public void move() {
        for(var component: components)
            component.move();
    }
}
