package Structural.ProxyPractice;

public class RealEbook implements Ebook{
    String fileName;
    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load(){
        System.out.println("Loading the ebook " +fileName);
    }
    @Override
    public void show() {
        System.out.println("showing the ebook " +fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
