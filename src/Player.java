/**
 * Player Class
 * Tracks each players' information, such as the team and the score
 * @author Ricky Wong
 * @version 12-30-2022
 */

public class Player {
    private String team;
    private int score;

    /**
     * Creates a Player object
     *
     * @param team  team name for the player
     * @param score score for the player
     */
    public Player(String team, int score) {
        this.team = team;
        this.score = score;

    }
}
