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
    public static void recordPlay(int play) 
    {

        if (play == 0)
        {
            if (activeTeam = teamOne)
            {
                activeTeam = teamTwo;
            }
            else if (activeTeam = teamTwo)
            {
                activeTeam = teamOne;
            }
        }
        else
        {
            if (activeTeam = teamOne) {
                teamOneScore += play;
            }
            else if (activeTeam = teamTwo) {
                teamtTwoScore += play;
            }
        }
    }
}