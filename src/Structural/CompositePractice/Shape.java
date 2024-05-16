package Structural.CompositePractice;

public class Shape implements Component{
    String shapeName;
    public Shape(String shapeName){
        this.shapeName = shapeName;
    }

    @Override
    public void render() {
        System.out.println("Render " + shapeName);
    }

    @Override
    public void move() {
        System.out.println("Move " + shapeName);
    }
}
