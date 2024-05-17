package Structural.DecoratorPractice;

public class Client {
    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }
    public static void storeCreditCard(Stream stream){
        stream.streamData("1234-5678-9876-5432");
    }
}
