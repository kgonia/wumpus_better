import java.util.Random;

import wumpus.Agent;
import wumpus.Environment.Actions;
import wumpus.Player;

/**
 * The fake agent does random actions.
 */
public class RandomAgent implements Agent {
    public Random random = new Random();
    public Actions[] actions = {
            Actions.GO_FORWARD,
            Actions.GO_FORWARD,
            Actions.GO_FORWARD,
            Actions.GO_FORWARD,
            Actions.TURN_LEFT,
            Actions.TURN_RIGHT,
            Actions.GRAB,
            Actions.SHOOT
    };

    public String getName() {
        return "Random Agent";
    }

    public Actions getAction(Player player) {
        int x = player.getX();
        int y = player.getY();
        // Feel the perceptions
        boolean bump = player.hasBump();
        boolean breeze = player.hasBreeze();
        boolean stench = player.hasStench();
        boolean scream = player.hasScream();
        boolean glitter = player.hasGlitter();

        if (bump || breeze || stench || scream || glitter) {
            // TODO: Do some action based on the players perception...
        }

        // Print the board
        System.out.println(player.render());

        return actions[random.nextInt(actions.length - 1)];
    }
}