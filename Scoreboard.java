public class Scoreboard {

    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;

    public Scoreboard(String one, String two) 
    {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }
    public void recordPlay(int play) {
        if (play == 0)
        {
            if (teamOne.equals(activeTeam)) {
                activeTeam = teamTwo;
            }
            else {
                activeTeam = teamOne;
            }
        }
        else
        {
            if (teamOne.equals(activeTeam)) {
                teamOneScore += play;
            }
            else {
                teamTwoScore += play;
            }
        }
    }
    public String getScore() {
        return (teamOneScore + "-" + teamTwoScore + "-" + activeTeam);
    }
}