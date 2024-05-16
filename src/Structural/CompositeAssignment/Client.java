package Composite_DP;

public class Client {
    public static void main(String[] args) {
        File f1 = new File("text1.txt",2560);
        File f2 = new File("pic.jpg",1300);
        File f3 = new File("music.mp3", 900);
        File f4 = new File("installer.iso", 2900);
        File f5 = new File("cluster.zip", 3300);

        Folder fr1 = new Folder("Folder 1");
        Folder fr2 = new Folder("Folder 2");
        Folder fr3 = new Folder("Folder 3");
        Folder fr4 = new Folder("Folder 4");
        Folder fr5 = new Folder("Folder 5");
        Folder root = new Folder("Main Folder");

        fr1.addComponent(f1);
        fr1.addComponent(f5);
        fr2.addComponent(fr1);
        fr2.addComponent(f2);
        fr3.addComponent(fr2);
        fr3.addComponent(f3);
        fr4.addComponent(fr3);
        fr5.addComponent(f4);
        fr5.addComponent(fr4);
        root.addComponent(fr5);

        System.out.println(root.getSize());
    }
}
