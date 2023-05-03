package abc.sound;

public class Note implements Music {
	
	/**
	 * AF: Note represents a musical note
	 * AF(duration, pitch) = a note lasts the duration at the pitch. 
	 * 
	 * Rep Invariant: Note has a non-negative duration and non-null pitch.
	 * 
	 * Safety from rep exposure:
	 * duration and pitch field are private, final and immutable.
	 * 	
	 */
    
    private final double duration;
    private final Pitch pitch;
    
    private void checkRep() {
        assert duration >= 0;
        assert pitch != null;
    }
    
    /**
     * Make a Note played at a pitch for duration beats.
     * @param duration duration in beats, must be >= 0
     * @param pitch pitch to play
     */
    public Note(double duration, Pitch pitch) {
        this.duration = duration;
        this.pitch = pitch;
        checkRep();
    }
    
    /**
     * @return duration of this note
     */
    public double duration() {
        return duration;
    }
    
    /**
     * @return pitch of this note
     */
    public Pitch pitch() {
        return pitch;
    }
    
    /**
     * Play this note.
     */
    public void play(SequencePlayer player, double atBeat) {
    	int ticksPerBeat = player.getTicksDefaultNote();
        int newDuration = (int) (this.duration * ticksPerBeat);
        player.addNote(pitch.toMidiNote(), (int)atBeat, (int)newDuration);
    }

    @Override
    public int hashCode() {
        long durationBits = Double.doubleToLongBits(duration);
        return (int) (durationBits ^ (durationBits >>> 32))
                + pitch.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        final Note other = (Note) obj;
        return duration == other.duration
                && pitch.equals(other.pitch);
    }

    @Override
    public String toString() {
        return pitch.toString() + duration;
    }
    
    @Override
    public boolean isNote() {
    	return true;
    }
    
    @Override
    public boolean isChord() {
    	return false;
    }
    
    @Override
    public Note transpose(int semitonesUp) {
        Pitch newPitch = this.pitch.transpose(semitonesUp);
        return new Note(this.duration, newPitch);
    }
}
