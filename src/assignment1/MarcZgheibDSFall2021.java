/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class MarcZgheibDSFall2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of movies to be rated:");
        int numbOfMovies = scan.nextInt();
        String names[] = new String[numbOfMovies];
        int i = 0;

        for (i=0;i<numbOfMovies;i++)
        {
            System.out.println("Enter the name of movie " + (i+1));
            Scanner get = new Scanner(System.in);
            String movieName = get.nextLine();
            names[i]=movieName;
        }
        System.out.println("Enter the number of attendees: ");
        Scanner attend = new Scanner(System.in);
        int numOfAttendees = attend.nextInt();
        int counter=0;
        do
        {
            System.out.println("Welcome to Cinema Critics!");
            for(int j=0; j<numbOfMovies; j++)
            {
                System.out.println("Please, enter a rating between 1 and 5 for " + names[j] + ":");
                Scanner rate = new Scanner(System.in);
                int rating = rate.nextInt();
            }
            counter++;
            System.out.println("Thanks!");
        }
        while(counter<numOfAttendees);
    }

}
