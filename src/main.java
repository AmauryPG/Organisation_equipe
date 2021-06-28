import Detail.Match;
import Detail.Team;
import Logic.Calculate;

import java.util.ArrayList;

class main {
    public static void main(String[] args) {
        int nbrSlots = 10;

        Team team0 = new Team("NULL");

        Team team1 = new Team("Crocodile");
        Team team2 = new Team("Requin Vert");
        Team team3 = new Team("Anime");

        Team team4 = new Team("Ninja");
        Team team5 = new Team("Chat rouge");
        Team team6 = new Team("Eclaire");

        ArrayList<Team> liste = new ArrayList<>();
        liste.add(team1);
        liste.add(team2);
        liste.add(team3);
        liste.add(team4);
        liste.add(team5);
        liste.add(team6);

        Calculate calculate = new Calculate();

        ArrayList<Match> test = new ArrayList<>();
        test = calculate.uniquePermutation(liste);

        for (int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i).getTeamA().getName());
            System.out.print(" vs ");
            System.out.println(test.get(i).getTeamB().getName());
        }
        System.out.println();

        test = calculate.fillAllSlots(test, 20);

        for (int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i).getTeamA().getName());
            System.out.print(" vs ");
            System.out.println(test.get(i).getTeamB().getName());
        }

    }
}