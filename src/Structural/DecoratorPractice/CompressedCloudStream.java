package Structural.DecoratorPractice;

public class CompressedCloudStream implements Stream{
    Stream stream;
    public CompressedCloudStream(Stream stream){
        this.stream = stream;
    }
    @Override
    public void streamData(String data) {
        String compressed = compress(data);
        stream.streamData(compressed);
    }
    private String compress(String data){
        return data.substring(1,5);
    }
}
