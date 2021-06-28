package Logic;

import Detail.Match;
import Detail.Team;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Random;

public class Calculate {
    // method to create a array of all the unique permutation
    public ArrayList<Match> uniquePermutation(ArrayList<Team> teams) {
        int teamSize = teams.size();
        ArrayList<Match> permutation = new ArrayList<>();
        boolean loop = false;

        for (int i = 0; i < teamSize; i++) {
            for (int k = 0; k < teamSize; k++) {
                //condition to not check the teams against itself
                if(i != k){
                    Match temp = new Match();
                    //condition to get every time the teams on
                    //the right teams A and B
                    if(i < k)
                    {
                        temp.setTeamA(teams.get(i));
                        temp.setTeamB(teams.get(k));
                    }
                    else
                    {
                        temp.setTeamA(teams.get(k));
                        temp.setTeamB(teams.get(i));
                    }

                    //check if the match already exist
                    for(int p = 0; p < permutation.size();p++)
                    {
                        if(permutation.get(p).getTeamA() == temp.getTeamA()
                                && permutation.get(p).getTeamB() == temp.getTeamB())
                        {
                            loop = true;
                            break;
                        }
                    }

                    //add the match if it doesn't exist
                    if(!loop)
                    {
                        permutation.add(temp);
                    }
                    else
                    {
                        loop = false;
                    }
                }
            }
        }
        return permutation;
    }

    //create the list at random
    public ArrayList<Match> fillAllSlots(ArrayList<Match> permutation, int slots)
    {
        Random rand = new Random();

        if(slots < permutation.size())
        {
            System.out.println("ERROR THE FIRST CONDITION IS BROKEN. All teams must play against all teams at least once.");
            return null;
        }
        else
        {
            int delta = slots - permutation.size();

            for(int i = 0; i < delta; i++)
            {
                permutation.add(permutation.get(rand.nextInt(permutation.size())));
            }
            return permutation;
        }
    }
}
