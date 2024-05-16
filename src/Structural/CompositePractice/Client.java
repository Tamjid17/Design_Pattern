package Structural.CompositePractice;

public class Client {
    public static void main(String[] args) {
        var circles = new Group();
        circles.add(new Shape("circle1"));
        circles.add(new Shape("circle2"));
        var triangles = new Group();
        triangles.add(new Shape("triangle1"));
        triangles.add(new Shape("triangle2"));
        var group = new Group();
        group.add(circles);
        group.add(triangles);
        group.render();
        group.move();
    }
}
