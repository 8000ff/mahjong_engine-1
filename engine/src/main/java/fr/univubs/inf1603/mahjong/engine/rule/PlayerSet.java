package fr.univubs.inf1603.mahjong.engine.rule;

/**
 * PlayerSet represents the state of all tiles a player has; including the player's hand, tiles set down, winds from the round 
 * and from the player, conditions about a tile drawn or stolen. 
 * Using to create different set from a situation.
 * @author Pierre Guriel--Fardel, Anton Cosnefroy
 */

import fr.univubs.inf1603.mahjong.engine.game.GameTile;
import java.util.ArrayList;
import java.util.Collection;

public class PlayerSet {
    private GameTile winningTile;
    private Collection<Combination> hand;
    private Collection<Combination> concealed;
    private Collection<Combination> melds;
    private Collection<SupremeHonor> supremeHonors;
    private boolean drawnFromWall;
    private boolean takenFromDiscard;
    private WindHonor.Wind roundWind;
    private WindHonor.Wind playerWind;
    
    /**
     *
     * @param winningTile It's the tile drawn from the wall or stolen, it's a winning tile if we win with her
     * @param hand  The hand of the player, it's a representation of combinations in the hand
     * @param concealed If we have a concealed combination like Kong
     * @param melds Tiles set down by the player
     * @param supremeHonors If seasons or flowers was set down
     * @param drawnFromWall A boolean, if a tile was drawn from the wall
     * @param takenFromDiscard A boolean, if a tile was stolen
     * @param roundWind Wind of the round, it's influencing the scoring
     * @param playerWind Wind of a player, it's influencing the scoring
     */
    public PlayerSet(GameTile winningTile, Collection<Combination> hand, Collection<Combination> concealed, Collection<Combination> melds, Collection<SupremeHonor> supremeHonors,
            boolean drawnFromWall, boolean takenFromDiscard, WindHonor.Wind roundWind, WindHonor.Wind playerWind){
        this.winningTile = winningTile;
        this.hand = new ArrayList<Combination>(hand);
        this.concealed = new ArrayList<Combination>(concealed);
        this.melds = new ArrayList<Combination>(melds);
        this.supremeHonors = new ArrayList<SupremeHonor>(supremeHonors);
        this.drawnFromWall = drawnFromWall;
        this.takenFromDiscard = takenFromDiscard;
        this.roundWind = roundWind;
        this.playerWind = playerWind;
    }
    
    /**
     *
     * @return winningTile The last tile drawn or stolen which allow us to win 
     */
    public GameTile getWinningTile(){
        return this.winningTile;
    }
    
    /**
     *
     * @return hand It's a list of combination in the player's hand
     */
    public Collection<Combination> getHand(){
        return this.hand;
    }
    
    /**
     *
     * @return concealed It's a list of combination if some tiles are hidden
     */
    public Collection<Combination> getConcealed(){
        return this.concealed;
    }
    
    /**
     *
     * @return melds It's a list of combination about tiles set down
     */
    public Collection<Combination> getMelds(){
        return this.melds;
    }
    
    /**
     *
     * @return It's a list of supremeHonors set down
     */
    public Collection<SupremeHonor> getSupremeHonors(){
        return this.supremeHonors;
    }
    
    /**
     *
     * @return true or false if the last tile was drawn from the wall
     */
    public boolean isDrawnForWall(){
        return this.drawnFromWall;
    }
    
    /**
     *
     * @return true or false if the last tile was stolen
     */
    public boolean isTakenFromDiscard(){
        return this.takenFromDiscard;
    }
    
    /**
     *
     * @return the wind during this round if his a upward or downward wind
     */
    public WindHonor.Wind getRoundWind(){
        return this.roundWind;
    }
    
    /**
     *
     * @return the wind of the player, it could be east, south, weast or north
     */
    public WindHonor.Wind getPlayerWind(){
        return this.playerWind;
    }
}