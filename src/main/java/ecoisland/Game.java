/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecoisland;

/**
 *
 * @author suran
 */
import java.util.List;
import java.util.Scanner;

public class Game {

    private List<Player> players;

    public Game(List<Player> players) {
        this.players = players;
    }

    public void manageRounds() {
        Scanner sc = new Scanner(System.in);

        for (int round = 1; round <= 7; round++) {
            System.out.println("\n=== Round " + round + " ===");
            for (Player player : players) {
                System.out.println("\nPlayer: " + player.getName());
                System.out.println("Current Resources: " + player.getResources());

                int food = getValidInput(sc, "Food to consume: ");
                int water = getValidInput(sc, "Water to consume: ");
                int wood = getValidInput(sc, "Wood to consume: ");

                player.getResources().consumeResource(food, water, wood);

                if (!player.checkSurvival()) {
                    System.out.println(player.getName() + " did not survive!");
                } else {
                    System.out.println(player.getName() + " survived!");
                }
            }
        }
    }

    private int getValidInput(Scanner sc, String prompt) {
        int input;
        while (true) {
            System.out.print(prompt);
            try {
                input = Integer.parseInt(sc.nextLine());
                if (input >= 0) break;
                System.out.println("Please enter a positive integer.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return input;
    }

    public Player determineWinner() {
        Player winner = null;
        int maxResources = -1;

        for (Player player : players) {
            if (player.checkSurvival() && player.getResources().totalResources() > maxResources) {
                maxResources = player.getResources().totalResources();
                winner = player;
            }
        }

        return winner;
    }
}