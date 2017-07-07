
public class Note {
	private int note;			// represents base note, range 0 - 6
	private int accidentals;	// represents sharp/flat modifiers, range -2 - 2
	private int octave;			// represents note octave, (practical) range 3 - 7, allows 0 - 8
	
	private static int[] SCORES = {0, 2, 3, 5, 7, 8, 10}; //used to solve awkward spacing problem with natural notes
	private static String[] ACCMAP = {"bbb", "bb", "b", "", "#", "x", "#x"};
	
	Note (int note, int accidentals, int octave){
		setNote(note);
		setAccidentals(accidentals);
		setOctave(octave);
	}
	
	Note (){
		this(0, 0, 3); // use A3 as default note, as it is the lowest feasible 'A' on guitar
	}
	
	public void setNote(int n){
		if (n < 0 || n > 6) throw new OutOfRangeException(n + " is an invalid note value (R: 0..6).");
		note = n;
	}
	public void setAccidentals(int a){
		if (a < -3 || a > 3) throw new OutOfRangeException(a + " is an invalid accidental modifier (R: -2..2).");
		accidentals = a;
	}
	public void setOctave(int o){
		if (o < 0 || o > 8) throw new OutOfRangeException(o + "is an invalid octave (R: 0..8).");
		octave = o;
	}
	
	public int getNote(){ return note; }
	public int getAccidentals(){ return accidentals; }
	public int getOctave(){ return octave; }
	
	public int score(){
		return octave * 12 + SCORES[note] + accidentals;
	}
	
	public String toString(){
		return ((char) (65 + (note % 7)) + ACCMAP[accidentals + 3]) + octave;
	}
	
}
