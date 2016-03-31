package wumpus;

import wumpus.Environment.Actions;

/**
 * The Agent that controls the player for each play, to be used to implement custom AI strategies.
 */
public interface Agent {
    /**
     * Returns the agent identification name.
     * @return The agent name
     */
    public String getName();

    /**
     * Executes every play to determine the next action.
     * @param player The player instance
     * @return The action to execute
     */
    public Actions getAction(Player player);
}