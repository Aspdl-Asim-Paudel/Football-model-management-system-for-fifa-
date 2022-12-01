import modal.Players;
import modal.Teams;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        System.out.println("Test!");
        Players p1 = new Players("Lukuka", 49, 9,9);
        Players p2 = new Players("Khazrins", 59, 91,98);
        Players p3 = new Players("Leonardo de mistiri", 19, 91,8);
        Players p4 = new Players("Mbeppa", 27, 89,7);
        Players p5 = new Players("Pele", 290, 999,99);
        ArrayList<Players> players = new ArrayList<Players>() ;
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        Teams retired = new Teams("The retired", "Avengers", "n/a", "GreeNnReD", players);
        Players b1 = new Players("NepaleiNotPossible", 79, -99,1) ;
        Players b2 = new Players("Dark chocolate", 89, 999999,2) ;
        Players b3 = new Players("hahaha", 99, 999,3) ;
        Players n1 = new Players("Coffee", 99, 9999999,4) ;
        Players n2 = new Players("Youngest", 1, 1,5) ;
        Players n3 = new Players("late", 99, 999,6) ;
        ArrayList<Players> Britisher_players = new ArrayList<Players>() ;
        ArrayList<Players> Nepal_players = new ArrayList<Players>() ;
        Britisher_players.add(b1);
        Britisher_players.add(b2);
        Britisher_players.add(b3);
        Nepal_players.add(n1);
        Nepal_players.add(n2);
        Nepal_players.add(n3);
        Teams Britisher = new Teams("Britisher", "Fist", "G", "White", Britisher_players );
        Teams Nepal = new Teams("Nepal","Last", "E", "red", Nepal_players );
    }
}
