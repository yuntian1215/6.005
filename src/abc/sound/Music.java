package abc.sound;

import abc.sound.SequencePlayer;

/** 
 * Music represents a piece of music played by multiple instruments.
 */

public interface Music{
	
	/**
     * @return total duration of this piece in beats
     */
    public double duration();
    
    /**
     * Play this piece.
     * @param player player to play on
     * @param atBeat when to play
     */
    public void play(SequencePlayer player, double atBeat);
    
    public boolean isNote();
    
    public boolean isChord();
    
	
}