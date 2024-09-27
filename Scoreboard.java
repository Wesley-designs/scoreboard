public class Scoreboard {

    private String teamOne;
    private String teamTwo;

    public Scoreboard(String one, String two) 
    {
        teamOne = one;
        teamTwo = two;
    }
    public static void recordPlay(int play) 
    {
        boolean activeTeam = true;

        if (play = 0)
        {
            activeTeam = !activeTeam;
        }
        else
        {
            
        }
    }
}