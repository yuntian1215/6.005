package abc.sound;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class MusicTest{
	/**
	 * Testing strategy:
	 * 
	 * duration():
	 * # Note = 1, > 1
	 * # Rest = 1, > 1
	 * Concat
	 * 
	 * play():
	 * # Note
	 * # Rest
	 * # Chord
	 * Concat
	 * 
	 * equals() and hashCode():
	 * # Note
	 * # Rest
	 * # Choed
	 * Concat
	 * 
	 * toString():
	 * # Note
	 * # Rest	 
	 * # Chord
	 * Concat
	 * 
	 */
	
	@Test(expected=AssertionError.class)
	public void testAssertionsEnabled() {
		assert false; // make sure assertions are enabled with VM argument: -ea
	}
	
	// tests for duration
	// covers Note Rest Chord
	@Test
    public void testDurationNRC() {
		Note n1 = new Note(1, new Pitch('C'));
		Note n2 = new Note(1, new Pitch('E'));
		Note n3 = new Note(1, new Pitch('G'));
		
		Chord c1 = new Chord(Arrays.asList(n1, n2, n3));
		
		Rest m1 = new Rest(2);
		
		assertTrue("expected to be equal", n1.duration() == 1.0);
		assertTrue("expected to be equal", c1.duration() == 1.0);
		assertTrue("expected to be equal", m1.duration() == 2.0);
	}
	
	// covers Note Rest Concat
	@Test
    public void testDurationConcat() {
		Note n1 = new Note(1, new Pitch('C'));
		Note n2 = new Note(1, new Pitch('E'));
		Note n3 = new Note(1, new Pitch('G'));
		
		Chord c1 = new Chord(Arrays.asList(n1, n2, n3));
		
		Rest m1 = new Rest(2);
		
		Concat a1 = new Concat(n1, c1);
		Concat a2 = new Concat(a1, m1);
		
		
		assertTrue("expected to be equal", a1.duration() == 2.0);
		assertTrue("expected to be equal", a2.duration() == 4.0);
	}
	
	// tests for play()
	// covers Note
	@Test
    public void testPlayNote() {
		try {
			SequencePlayer player = new SequencePlayer(100, 2);
		
			Note n1 = new Note(1, new Pitch('C'));
			Note n2 = new Note(2, new Pitch('C'));
			Note n3 = new Note(1, new Pitch('D'));
			
			n1.play(player, 0);
			n2.play(player, 1);
			n3.play(player, 3);
			System.out.println(player);
			player.play();
			
	    	try {
				System.in.read();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}catch (MidiUnavailableException mue) {
			mue.printStackTrace();
		} catch (InvalidMidiDataException imde) {
			imde.printStackTrace();
		}
	}
	
	// covers Rest
	@Test
    public void testPlayRest() {
		try {
			SequencePlayer player = new SequencePlayer(100, 2);
		
			Note n1 = new Note(1, new Pitch('C'));
			Rest n2 = new Rest(2);
			Note n3 = new Note(1, new Pitch('G'));
			
			n1.play(player, 0);
			n2.play(player, 1);
			n3.play(player, 3);
			System.out.println(player);
			player.play();
			
	    	try {
				System.in.read();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}catch (MidiUnavailableException mue) {
			mue.printStackTrace();
		} catch (InvalidMidiDataException imde) {
			imde.printStackTrace();
		}
	}
	
	// covers Chord
	@Test
	public void testPlayChord() {
		try {
			SequencePlayer player = new SequencePlayer(100, 2);
			
			Note n1 = new Note(1, new Pitch('C'));
			Note n2 = new Note(1, new Pitch('E'));
			Note n3 = new Note(1, new Pitch('G'));
			
			Chord c1 = new Chord(Arrays.asList(n1, n2, n3));
				
			c1.play(player, 0);
			n1.play(player, 1);
			n2.play(player, 1);
			n3.play(player, 1);
			c1.play(player, 2);
			n2.play(player, 3);
			
			System.out.println(player);
			player.play();
				
		    try {
				System.in.read();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}catch (MidiUnavailableException mue) {
			mue.printStackTrace();
		} catch (InvalidMidiDataException imde) {
			imde.printStackTrace();
		}
	}
	
	// covers Concat
	@Test
	public void testPlayConcat() {
		try {
			SequencePlayer player = new SequencePlayer(100, 2);
			Note n1 = new Note(1, new Pitch('C'));
			Note n2 = new Note(1, new Pitch('E'));
			Note n3 = new Note(1, new Pitch('G'));
			Note n4 = new Note(1, new Pitch('B'));
			
			Chord c1 = new Chord(Arrays.asList(n1, n2, n3));
			Chord c2 = new Chord(Arrays.asList(n1, n2, n3, n4));
			
			Rest m1 = new Rest(1);
			
			Concat a1 = new Concat(c1, c2);
			Concat a2 = new Concat(a1, m1);
			Concat a3 = new Concat(a2, c1);
			
			a3.play(player, 0);
			
			System.out.println(player);
			player.play();
				
		    try {
				System.in.read();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}catch (MidiUnavailableException mue) {
			mue.printStackTrace();
		} catch (InvalidMidiDataException imde) {
			imde.printStackTrace();
		}

	}
    	
    	
	
	// tests for equals() and hashCode()
	// covers Note
    @Test
    public void testEqualsNote() {
    	Note n1 = new Note(1, new Pitch('C'));
    	Note n2 = new Note(1, new Pitch('C'));
    	Note n3 = new Note(2, new Pitch('C'));
    	Note n4 = new Note(1, new Pitch('D'));
    	
    	assertTrue("expected to be equal", n1.equals(n1));
        assertTrue("expected to be equal", n1.equals(n2));
        assertTrue("expected to be equal", n2.equals(n1));
        assertFalse("expected not to be equal", n1.equals(n3));
        assertFalse("expected not to be equal", n1.equals(n4));
        
        assertTrue("expected HashCodes to be equal", n1.hashCode() == n2.hashCode());
        assertFalse("expected HashCodes not to be equal", n1.hashCode() == n3.hashCode());
        assertFalse("expected HashCodes not to be equal", n1.hashCode() == n4.hashCode());
        assertFalse("expected HashCodes not to be equal", n3.hashCode() == n4.hashCode());
    }
    
    // covers Rest
    @Test
    public void testEqualsRest() {
    	Rest n1 = new Rest(1);
    	Rest n2 = new Rest(1);
    	Rest n3 = new Rest(2);
    	
    	assertTrue("expected to be equal", n1.equals(n1));
        assertTrue("expected to be equal", n1.equals(n2));
        assertTrue("expected to be equal", n2.equals(n1));
        assertFalse("expected not to be equal", n1.equals(n3));
        
        assertTrue("expected HashCodes to be equal", n1.hashCode() == n2.hashCode());
        assertFalse("expected HashCodes not to be equal", n1.hashCode() == n3.hashCode());
    	
    }
    
 // covers Chord
    @Test
    public void testEqualsChord() {
    	Note n4 = new Note(1, new Pitch('C'));
		Note n5 = new Note(1, new Pitch('E'));
		Note n6 = new Note(1, new Pitch('F'));
		
		Note n7 = new Note(2, new Pitch('C'));
		Note n8 = new Note(2, new Pitch('E'));
		Note n9 = new Note(2, new Pitch('F'));
		
		Note n10 = new Note(1, new Pitch('B'));
    	
    	Chord n1 = new Chord(Arrays.asList(n4, n5, n6));
    	Chord n2 = new Chord(Arrays.asList(n4, n5, n6));
    	Chord n3 = new Chord(Arrays.asList(n7, n8, n9));
    	Chord n11 = new Chord(Arrays.asList(n4, n5, n6, n10));
    	
    	assertTrue("expected to be equal", n1.equals(n1));
        assertTrue("expected to be equal", n1.equals(n2));
        assertTrue("expected to be equal", n2.equals(n1));
        assertFalse("expected not to be equal", n1.equals(n3));
        assertFalse("expected not to be equal", n1.equals(n4));
        
        assertTrue("expected HashCodes to be equal", n1.hashCode() == n2.hashCode());
        assertFalse("expected HashCodes not to be equal", n1.hashCode() == n3.hashCode());
        assertFalse("expected HashCodes not to be equal", n1.hashCode() == n4.hashCode());
        assertFalse("expected HashCodes not to be equal", n3.hashCode() == n4.hashCode());
    }
	
	// covers Concat
    @Test
    public void testEqualsConcat() {
    	Note n4 = new Note(1, new Pitch('C'));
		Note n5 = new Note(1, new Pitch('E'));
		Note n6 = new Note(1, new Pitch('F'));
		
		Note n7 = new Note(2, new Pitch('C'));
		Note n8 = new Note(2, new Pitch('E'));
		Note n9 = new Note(2, new Pitch('F'));
		
		Note n10 = new Note(1, new Pitch('B'));
    	
    	Chord n11 = new Chord(Arrays.asList(n4, n5, n6));
    	Chord n12 = new Chord(Arrays.asList(n7, n8, n9));
    	Chord n13 = new Chord(Arrays.asList(n4, n5, n6, n10));
    	
    	Rest n14 = new Rest(1);
    	Rest n15 = new Rest(2);
    	
    	Concat n1 = new Concat(n4, n5);
    	Concat n2 = new Concat(n11, n12);
    	Concat n3 = new Concat(n14, n15);
    	Concat n16 = new Concat(n11, n12);
    	Concat n17 = new Concat(n11, n13);
    	Concat m1 = new Concat(n4, n11);
    	Concat m2 = new Concat(n4, n14);
    	Concat m3 = new Concat(n11, n14);
    	
    	assertTrue("expected to be equal", n2.equals(n2));
        assertTrue("expected to be equal", n2.equals(n16));
        assertTrue("expected to be equal", n16.equals(n2));
        assertFalse("expected not to be equal", n2.equals(n17));
        
        assertTrue("expected HashCodes to be equal", n2.hashCode() == n16.hashCode());
        assertFalse("expected HashCodes not to be equal", n2.hashCode() == n1.hashCode());
        assertFalse("expected HashCodes not to be equal", n2.hashCode() == n3.hashCode());
        assertFalse("expected HashCodes not to be equal", n2.hashCode() == n17.hashCode());
        assertFalse("expected HashCodes not to be equal", n2.hashCode() == m1.hashCode());
        assertFalse("expected HashCodes not to be equal", n2.hashCode() == m2.hashCode());
        assertFalse("expected HashCodes not to be equal", n2.hashCode() == m3.hashCode());
    }
	
	
	
	// tests for toString()
	// covers Note
	@Test
	public void testToStringNote() {
		Music n = new Note(1, new Pitch('C'));
		assertEquals("Expected String 'C1.0'", n.toString(), "C1.0");
	}
	
	// covers Rest
	@Test
	public void testToStringRest() {
		Music m = new Rest(1);
		assertEquals("Expected String '.1.0'", m.toString(), ".1.0");
	}
	
	// covers Chord
	@Test
	public void testToStringChord() {
		Note n1 = new Note(1, new Pitch('C'));
		Note n2 = new Note(1, new Pitch('E'));
		Note n3 = new Note(1, new Pitch('F'));
		
		Music c1 = new Chord(Arrays.asList(n1, n2, n3));
		assertEquals("Expected String '[C1.0E1.0F1.0]'", c1.toString(), "[C1.0E1.0F1.0]");
	}
	
	// covers Concat
	@Test
	public void testToStringConcat() {
		Music n1 = new Note(1, new Pitch('C'));
		Music n2 = new Note(2, new Pitch('D').transpose(1));
		Music m1 = new Rest(1);
		Music m2 = new Rest(2);
		
		Music a1 = new Concat(n1, n2);
		Music a2 = new Concat(n1, m1);
		Music a3 = new Concat(m1, m2);
		
		Note n4 = new Note(1, new Pitch('C'));
		Note n5 = new Note(1, new Pitch('E'));
		Note n6 = new Note(1, new Pitch('F'));
		
		Music c1 = new Chord(Arrays.asList(n4, n5, n6));
		
		Music a4 = new Concat(n1, c1);
		
		
		assertEquals("Expected String 'C1.0 ^D2.0'", a1.toString(), "C1.0 ^D2.0");
		assertEquals("Expected String 'C1.0 .1.0'", a2.toString(), "C1.0 .1.0");
		assertEquals("Expected String '.1.0 .2.0'", a3.toString(), ".1.0 .2.0");
		assertEquals("Expected String 'C1.0 [C1.0E1.0F1.0]'", a4.toString(), "C1.0 [C1.0E1.0F1.0]");
	}
	
}