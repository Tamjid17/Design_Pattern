package Structural.ProxyPractice;

public class Client {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c", "d"};

        for(var fileName: fileNames){
            library.add(new EbookProxy(fileName));
        }
        library.openEbook("b");
    }
}
