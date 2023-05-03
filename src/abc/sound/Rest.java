package abc.sound;

public class Rest implements Music {
	
	/**
	 * AF: Rest represents a musical rest
	 * AF(duration) = a rest lasts the duration 
	 * 
	 * Rep Invariant: Note has a non-negative duration.
	 * 
	 * Safety from rep exposure:
	 * duration field are private, final and immutable.
	 * 	
	 */
    
    private final double duration;

    private void checkRep() {
        assert duration >= 0;
    }
    
    /**
     * Make a Rest played for duration beats.
     * @param duration duration in beats, must be >= 0
     */
    public Rest(double duration) {
        this.duration = duration;
        checkRep();
    }
    
    /**
     * @return duration of this rest
     */
    public double duration() {
        return this.duration;
    }
    
    /**
     * Play this rest.
     */
    public void play(SequencePlayer player, double atBeat) {
        return;
    }

    @Override
    public int hashCode() {
        long durationBits = Double.doubleToLongBits(duration);
        return (int) (durationBits ^ (durationBits >>> 32));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        final Rest other = (Rest) obj;
        return duration == other.duration;
    }

    @Override
    public String toString() {
        return "." + duration;
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
    public Music transpose(int semitonesUp) {
        Rest restCopy = new Rest(this.duration);
        checkRep();
        return restCopy;
    }
}
