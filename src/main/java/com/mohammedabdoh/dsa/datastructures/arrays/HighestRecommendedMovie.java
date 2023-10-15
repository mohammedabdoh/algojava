package com.mohammedabdoh.dsa.datastructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HighestRecommendedMovie {
    public static void solution() {
        try (Scanner scanner = new Scanner(System.in)) {
            int T = scanner.nextInt();
            scanner.nextLine();
            
            int[] heightRatedMovies = new int[T];
            int counter = 0;

            while(T-- > 0) {
                int[] availability = StringArrayConverter.convertToIntArray(scanner.nextLine().split(" "));
                
                int numberOfAvailableMovies = availability[0];
                int availableSpace = availability[1];

                int heightRatedMovie = 0;

                while(numberOfAvailableMovies-- > 0) {
                    int[] movie = StringArrayConverter.convertToIntArray(scanner.nextLine().split(" "));
                    int movieRequiredSpace = movie[0];
                    int movieRate = movie[1];
                    
                    if(movieRequiredSpace <= availableSpace && movieRate >= heightRatedMovie) {
                        heightRatedMovie = movieRate;
                    }
                }

                heightRatedMovies[counter++] = heightRatedMovie;
            }

            Arrays.stream(heightRatedMovies).forEach(movieRate -> System.out.println(movieRate));
        }
    }
}
