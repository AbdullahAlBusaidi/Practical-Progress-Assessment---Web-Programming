import java.util.ArrayList;

public class NoteStore {

	ArrayList<TextNote> TextNotes=new ArrayList<TextNote>();
	ArrayList<TextAndImageNote> TextAndImageNotes=new ArrayList<TextAndImageNote>();
	
	String n,u;
	
	public void storeNote(String n,String u) {
		if (u=="") {
			TextNote note1 = new TextNote();
			note1.note1=n;
			TextNotes.add(note1);
			
		}
		else {
			TextAndImageNote note2 = new TextAndImageNote();
			note2.note=n;
			note2.image=u;
			TextAndImageNotes.add(note2);
			
		}
	}
	
	public ArrayList<TextNote> getAllTextNotes() {
		return TextNotes;
	}
	
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		return TextAndImageNotes;
	}
	
}
