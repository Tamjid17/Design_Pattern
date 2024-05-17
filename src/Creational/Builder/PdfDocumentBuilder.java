package Creational.Builder;

public class PdfDocumentBuilder implements PresentationBuilder{
    PdfDocument pdf = new PdfDocument();

    @Override
    public void addSlide(Slide slide) {
        pdf.addPage(slide.getText());
    }

    public PdfDocument getPdfDocument() {
        return pdf;
    }
}
