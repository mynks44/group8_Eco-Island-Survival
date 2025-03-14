/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ecoisland;

/**
 *
 * @author suran
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EcoIslandSurvival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players (2-4): ");
        int numPlayers = Integer.parseInt(sc.nextLine());

        List<Player> players = new ArrayList<>();

        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter Player " + i + " name: ");
            String name = sc.nextLine();
            players.add(new Player(name));
        }

        Game game = new Game(players);
        game.manageRounds();

        Player winner = game.determineWinner();

        if (winner != null) {
            System.out.println("\n🏆 Winner: " + winner.getName());
            System.out.println("Final Resources: " + winner.getResources());
        } else {
            System.out.println("\nNo winner! All players failed to survive.");
        }
    }
}