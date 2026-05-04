package com.example.movietickets;

import java.util.Scanner;

public class MovieTicketsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎬 Welcome to Movie Tickets App 🎟️");

        // Movie details
        String[] movies = {"Avengers", "Inception", "Interstellar"};
        int[] prices = {250, 200, 220};

        // Show available movies
        System.out.println("Available Movies:");
        for (int i = 0; i < movies.length; i++) {
            System.out.println((i + 1) + ". " + movies[i] + " - Rs." + prices[i]);
        }

        // User selects movie
        System.out.print("Choose a movie (1-3): ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > movies.length) {
            System.out.println("Invalid choice!");
            return;
        }

        // Number of tickets
        System.out.print("Enter number of tickets: ");
        int tickets = scanner.nextInt();

        int totalCost = tickets * prices[choice - 1];
        System.out.println("You booked " + tickets + " tickets for " + movies[choice - 1]);
        System.out.println("Total cost: Rs." + totalCost);

        scanner.close();
    }
}
