package abc.sound;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Chord implements Music{
	
	/**
	 * AF: Chord represents a musical chord
	 * AF(notes) = some notes combined as a chord, the duration is note.duration.
	 * 
	 * Rep Invariant: Chord has a non-null notes.
	 * 
	 * Safety from rep exposure:
	 * duration and note field are private, final and immutable.
	 * Use unmodifiableList to ensure the notes list is immutable.	
	 */
	
	private final double duration;
	private final List<Note> notes;
	
	private void checkRep() {
		assert duration >= 0;
		assert notes != null && !notes.isEmpty();
    }
	
	
    /**
     * Make a Chord played some notes at the same time for duration beats.
     * @param notes notes combined to the chord, must be non-null, and size >= 1.
     */
	public Chord(List<Note> notes){
		this.notes = Collections.unmodifiableList(notes);
		this.duration = notes.get(0).duration();
		checkRep();
	}
	
	public List<Note> getNotes() {
        List<Note> copyNotes = new ArrayList<Note>(notes);
        return copyNotes;
    }
	
	/**
     * @return duration of this chord
     */
    public double duration() {
        return duration;
    }
    
    /**
     * Play this chord.
     */
    public void play(SequencePlayer player, double atBeat) {
    	int ticksPerBeat = player.getTicksDefaultNote();
    	int noteTicksDuration = (int) (duration() * ticksPerBeat);
    	
    	Iterator<Note> iterator = notes.iterator();
    	while(iterator.hasNext()) {
    		Note note = iterator.next();
    		int thisNoteDuration = (int) (note.duration() * ticksPerBeat);
    		player.addNote(note.pitch().toMidiNote(), (int)atBeat, (int)thisNoteDuration);
    	}
    }
    
    @Override
    public int hashCode() {
    	int hash = 0;
    	final int prime = 31;
        long durationBits = Double.doubleToLongBits(duration);
        
        Iterator<Note> iterator = notes.iterator();
        while(iterator.hasNext()) {
    		Note note = iterator.next();
    		hash += note.hashCode();
    	}
        return hash + ((int) (durationBits ^ (durationBits >>> 32))) * prime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        final Chord other = (Chord) obj;
        Iterator<Note> iteratorThis = notes.iterator();
        Iterator<Note> iteratorOther = other.notes.iterator();
        
        while(iteratorThis.hasNext()) {
        	Note note = iteratorThis.next();
        	Note othernote = iteratorOther.next(); 
        	if(note != othernote) return false;
        }
        return true;
    }

    @Override
    public String toString() {
    	String s = "[";
    	
    	Iterator<Note> iterator = notes.iterator();
    	while(iterator.hasNext()) {
    		Note note = iterator.next();
    		s += note.toString();
    	}
    	
    	s += "]";
    	return s;
    }
    
    @Override
    public boolean isNote() {
    	return false;
    }
    
    @Override
    public boolean isChord() {
    	return true;
    }
	
    @Override
    public Chord transpose(int semitonesUp) {
        List<Note> notesCopy = new ArrayList<Note>(notes);
        for (Note note : notesCopy) {
            note = note.transpose(semitonesUp);
        }
        checkRep();
        return new Chord(notesCopy);
    }
}