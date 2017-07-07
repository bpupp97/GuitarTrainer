// Class of useful functions and constants

public class Theory {
	
	//#### INTERVALS ####
	//defined as {change in note, total change}
	public static int[] MIN_2ND = {1, 1};
	public static int[] MAJ_2ND = {1, 2};
	public static int[] MIN_3RD = {2, 3};
	public static int[] MAJ_3RD = {2, 4};
	public static int[] DIM_4TH = {3, 4};
	public static int[] PER_4TH = {3, 5};
	public static int[] AUG_4TH = {3, 6};
	public static int[] DIM_5TH = {4, 6};
	public static int[] PER_5TH = {4, 7};
	public static int[] AUG_5TH = {4, 8};
	public static int[] MIN_6TH = {5, 8};
	public static int[] MAJ_6TH = {5, 9};
	public static int[] MIN_7TH = {6, 10};
	public static int[] MAJ_7TH = {6, 11};
	public static int[] OCTAVE  = {7, 12};
	
	
	public static Note addInterval(Note note, int[] interval){
		Note newNote = new Note();
		newNote.setOctave(note.getOctave() + (note.getNote() + interval[0]) / 7);
		newNote.setNote((note.getNote() + interval[0]) % 7);
		newNote.setAccidentals(note.score() + interval[1] - newNote.score());
		return newNote;
	}
	
	public static Note subInterval(Note note, int[] interval){
		Note newNote = new Note();
		newNote.setOctave(note.getOctave() + (note.getNote() - interval[0] - 6) / 7); // sub 7 for proper rounding
		newNote.setNote((note.getNote() - interval[0] + 7) % 7); // add 8 for pos modulo
		newNote.setAccidentals(note.score() - interval[1] - newNote.score()); // add 12 for pos modulo
		return newNote;
	}
}
