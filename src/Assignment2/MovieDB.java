/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class MovieDB {

    private static final int BUFFER_SIZE = 2;
    int effectiveNbMovies = 0;
    Movie[] moviesList = new Movie[BUFFER_SIZE];

    public void add(Movie movie) {
        // check if the array is already full
        if (moviesList.length == effectiveNbMovies) {
            Movie[] newMovieList = new Movie[BUFFER_SIZE * 2];
            for (int i = 0; i < moviesList.length; i++) {
                newMovieList[i]=moviesList[i];
                
                
            }
            moviesList=newMovieList;
        }
        moviesList[effectiveNbMovies] = movie;
        effectiveNbMovies++;
    }

    void display() {
        
        for (int i = 0; i < effectiveNbMovies; i++) {
            Movie movie = moviesList[i];
            System.out.println("Movie: " + movie.getName() + ", " + movie.getReleaseYear());
//        }
        // for each variable "movie" of type "Movie" in "moviesList", do...
      // Equivalent to 
      //for (Movie movie : moviesList) {
        //    System.out.println("Movie: " + movie.getName() + ", " + movie.getReleaseYear());
        }
    }

    
}
