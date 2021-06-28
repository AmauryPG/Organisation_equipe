package Detail;

public class Match {
    // assumption the match is 1v1
    private Team teamA;
    private Team teamB;

    public Match() {
        this.teamA = null;
        this.teamB = null;
    }

    public Match(Team teamA, Team teamB) {
        if (teamA == null || teamB == null) {
            System.out.println("ERROR CONSTRUCTOR IN MATCH INSTANCE ARGUMENT teamA CAN NOT BE NULL");
        } else {
            this.teamA = teamA;
            this.teamB = teamB;
        }
    }

    public Team getTeamA() {
        return this.teamA;
    }

    public void setTeamA(Team teamA) {
        if (teamA != null) {
            this.teamA = teamA;
        } else {
            System.out.println("ERROR setTeamA IN MATCH INSTANCE ARGUMENT CAN NOT BE NULL");
        }
    }

    public Team getTeamB() {
        return this.teamB;
    }

    public void setTeamB(Team teamB) {
        if (teamB != null) {
            this.teamB = teamB;
        } else {
            System.out.println("ERROR setTeamB IN MATCH INSTANCE ARGUMENT CAN NOT BE NULL");
        }
    }
}
