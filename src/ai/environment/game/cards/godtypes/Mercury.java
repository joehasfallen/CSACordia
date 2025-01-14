package src.ai.environment.game.cards.godtypes;

import src.ai.environment.ConcordiaGame;
import src.ai.environment.game.player.Player;

/**
 * A basic class to represent the Roman god Mercury.
 *
 * @author devinlinux
 */
public class Mercury extends RomanGodType {

    /**
     * Method to calculate the score for a player given the game that
     * the player is playing
     *
     * @param player the player to calculate the score for
     * @param game   the game that the player is playing
     * @return the score for the player
     */
    @Override
    public int calculateScore(Player player, ConcordiaGame game) {
        return 0;
    }
}
