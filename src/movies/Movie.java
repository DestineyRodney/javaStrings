package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public static void displayMovies(Movie[] movies){
        for (Movie movie : movies){
            System.out.println("Name: " + movie.getName() + " Category: " + movie.getCategory());
        }
    }

    public static void displayByGenre(Movie[] movies, String category){
        for (Movie movie : movies) {
            if(movie.getCategory().equalsIgnoreCase(category)){
                System.out.printf("Movie: %s Category: %s \n", movie.getName(), movie.getCategory()  );
            }
        }
    }
}
