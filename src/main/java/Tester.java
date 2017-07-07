import java.util.ArrayList;

public class Tester {
	public static void main(String[] args){
		Note root = new Note(2,0,3); // use C natural in the 3rd octave as root
		ArrayList<Note> cMajor = new ArrayList<Note>();
		
		cMajor.add(root);	// dirty way to construct a scale for testing
		cMajor.add(Theory.addInterval(root, Theory.MAJ_2ND));
		cMajor.add(Theory.addInterval(root, Theory.MAJ_3RD));
		cMajor.add(Theory.addInterval(root, Theory.PER_4TH));
		cMajor.add(Theory.addInterval(root, Theory.PER_5TH));
		cMajor.add(Theory.addInterval(root, Theory.MAJ_6TH));
		cMajor.add(Theory.addInterval(root, Theory.MAJ_7TH));
		cMajor.add(Theory.addInterval(root, Theory.OCTAVE));
		
		System.out.println(cMajor);
	}
	
}
