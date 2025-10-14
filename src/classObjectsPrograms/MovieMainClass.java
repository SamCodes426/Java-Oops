package classObjectsPrograms;

public class MovieMainClass {
    public static void main(String[] args) {
        Movie m1 = new Movie("Interstellar", "Christopher Nolan", 150,5,"sci-fi");
        m1.play();
        m1.pause();
        m1.stop();
        m1.displayDetails();
    }
}

class Movie{
    public String title;
    public String director;
    public int duration;
    public int rating;
    public String genre;

    public Movie(String title, String director, int duration, int rating, String genre){
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.rating = rating;
        this.genre = genre;
    }

    public void play(){
        System.out.println("the movie is playing");
    }

    public void pause(){
        System.out.println("the movie is paused");
    }

    public void stop(){
        System.out.println("the movie is stopped");
    }

    public void displayDetails(){

        System.out.println(title);
        System.out.println(director);
        System.out.println(duration);
        System.out.println(rating);
        System.out.println(genre);
    }

}
