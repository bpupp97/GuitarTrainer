import java.util.ArrayList;

public class Measure {
	// time, key, notes, clef?, next measure
	// all measures have a time and key, inherited from last measure or declared
	// if time or key matches last measure, draw functions will catch and handle
	private int[] time; // 1x2 array, eg. 3/4 time is {3, 4}
	private ArrayList<Note> key; // holds all notes in the key, key[0] is the root
	private Measure nextMeasure; // create linked list of measures
	private Note[] Notes;
	
	Measure (int[] time, ArrayList<Note> key) {
		setTime(time);
		this.key = key;
	}
	
	Measure (Measure lastMeasure) {
		this(lastMeasure.getTime(), lastMeasure.getKey());
		lastMeasure.setNext(this);
	}
	
	public void setNext(Measure n) { nextMeasure = n; }
	public void setTime(int[] t) {
		if (t.length > 2) throw new OutOfRangeException("Too many elements in time signature (" + t.length + ").");
		time = t;
	}
	
	public int[] getTime() { return time; }
	public ArrayList<Note> getKey() { return key; }
	public Measure next() { return nextMeasure; }
	
}
