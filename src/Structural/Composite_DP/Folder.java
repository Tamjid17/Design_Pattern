package Composite_DP;
import java.util.ArrayList;
import java.util.List;
public class Folder implements FileComponent{
    private String name;
    private List<FileComponent> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addComponent(FileComponent component) {
        children.add(component);
    }

    public void removeComponent(FileComponent component) {
        children.remove(component);
    }
    @Override
    public int getSize(){
        int totalSize = 0;
        for (FileComponent component : children) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}
