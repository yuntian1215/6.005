package abc.sound;

public class Concat implements Music {
	/**
	 * AF: Concat represents two pieces of music played one after the other.
	 * AF(first, second) = concat first music with second one.
	 * 					 = first music + second music 
	 * 
	 * Rep Invariant: Concat has non-null first and second music.
	 * 
	 * Safety from rep exposure:
	 * Music field are private, final and immutable.
	 * 	
	 */
    
    private final Music first;
    private final Music second;
    
    private void checkRep() {
        assert first != null;
        assert second != null;
    }
    
    /**
     * Make a Music sequence that plays m1 followed by m2.
     * @param m1 music to play first
     * @param m2 music to play second
     */
    public Concat(Music m1, Music m2) {
        this.first = m1;
        this.second = m2;
        checkRep();
    }
    
    /**
     * @return first piece in this concatenation
     */
    public Music first() {
        return this.first;
    }
    
    /**
     * @return second piece in this concatenation
     */
    public Music second() {
        return this.second;
    }
    
    /**
     * @return duration of this concatenation
     */
    public double duration() {
        return first.duration() + second.duration();
    }
    
    /**
     * Play this concatenation.
     */
    public void play(SequencePlayer player, double atBeat) {
        first.play(player, atBeat);
        int secondBeat = (int) (atBeat + first.duration() * player.getTicksDefaultNote());
        second.play(player, atBeat + secondBeat);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return first.hashCode() + prime * second.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        final Concat other = (Concat) obj;
        return first.equals(other.first) && second.equals(other.second);
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
    
    @Override
    public boolean isNote() {
    	return false;
    }
    
    @Override
    public boolean isChord() {
    	return false;
    }
    
    @Override
    public abc.sound.Music transpose(int semitonesUp) {
        // TODO Auto-generated method stub
        return null;
    }
}
