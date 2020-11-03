import java.util.ArrayList;


public class Launcher {

	static NoteStore getnotes = new NoteStore();
	
	public static void main(String[] args) {
		
		NoteStore notestore = new NoteStore();
		
		notestore.storeNote("Java is a set of computer software and specifications developed by Jamed Gosling at Sun Microsystems",
							"");
		
		notestore.storeNote("Few books to read - Ikigai, How to win friends and influence people",
							"");
		
		notestore.storeNote("The shopping list on my fridge",
							"//foo/bar1/bar2/imgset1.jpg");
		
		notestore.storeNote("The size label of Jack's shirt",
							"//foo/bar1/bar2/imgset2.jpg");
		
		
	
		System.out.println(notestore.getAllTextNotes());
		System.out.println(notestore.getAllTextAndImageNotes());
		
		displayTextNotes();
		displayTextAndImageNotes();
		
	}
	
	public static ArrayList<TextNote> displayTextNotes() {
		System.out.println("Text Note 1:" +getnotes.getAllTextNotes());
		return getnotes.getAllTextNotes();
	}
	
	
	public static ArrayList<TextAndImageNote> displayTextAndImageNotes() {
		System.out.println("Text and Image Note 1: "+getnotes.getAllTextAndImageNotes());
		return getnotes.getAllTextAndImageNotes();
	}

}
