package Structural.DecoratorPractice;

public class CloudStream implements Stream{
    @Override
    public void streamData(String Data){
        System.out.println("Storing " +Data);
    }
}
