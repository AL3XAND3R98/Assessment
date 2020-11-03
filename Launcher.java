import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        NoteStore noteStore = new NoteStore();

        noteStore.storeNotes("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems", null);
        noteStore.storeNotes("Few books to read - Ikigai, How to win friends and influence people", null);

        noteStore.storeNotes("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
        noteStore.storeNotes("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");

        displayTextNotes(noteStore);
        displayTextAndImageNotes(noteStore);

    }

    public static void displayTextNotes(NoteStore noteStore)
    {
        ArrayList<TextNote> tmpList = noteStore.getAllTextNotes();
        int count = 1;
        for (TextNote note : tmpList) {
            System.out.println("Text Note "+count+ ": "+ note.getNote());
        }
    }

    public static void displayTextAndImageNotes(NoteStore noteStore) 
    {
        ArrayList<TextAndImageNote> tmpList = noteStore.getAllTextAndImageNotes();
        int count= 1;
        for (TextAndImageNote note : tmpList) {
            System.out.println("Text And Image Note " + count + ": " + note.getNote()+", "+ note.getImg());
        }
    }
}
