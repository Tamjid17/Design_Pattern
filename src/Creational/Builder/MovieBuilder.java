package Creational.Builder;

public class MovieBuilder implements  PresentationBuilder{
    Movie movie = new Movie();
    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText());
    }

    public Movie getMovie() {
        return movie;
    }
}
