package Structural.DecoratorPractice;

public class EncryptedCloudStream implements Stream{
    Stream stream;
    public EncryptedCloudStream(Stream stream){
        this.stream = stream;
    }
    @Override
    public void streamData(String Data){
        var encrypted = encrypt(Data);
        stream.streamData(encrypted);
    }
    private String encrypt(String Data){
        return "@#^$&$%*^$%#$^@^&$*$^%%&^%";
    }
}
