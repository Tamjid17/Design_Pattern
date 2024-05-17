package Creational.Builder;

public class Client {
    public static void main(String[] args) {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));
        presentation.addSlide(new Slide("Slide 3"));
        presentation.addSlide(new Slide("Slide 4"));

        var moviebuilder = new MovieBuilder();
        presentation.export(moviebuilder);
        var movie = moviebuilder.getMovie();

        var pdfbuilder = new PdfDocumentBuilder();
        presentation.export(pdfbuilder);
        var pdf = pdfbuilder.getPdfDocument();
    }
}
