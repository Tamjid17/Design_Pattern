package Structural.ProxyPractice;

public class EbookProxy implements Ebook{
    private String fileName;
    public EbookProxy(String fileName){
        this.fileName = fileName;
    }
    private RealEbook ebook;
    @Override
    public void show() {
        if(ebook == null)
            ebook = new RealEbook(fileName);

        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
