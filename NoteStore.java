import java.util.ArrayList;

public class NoteStore {

    ArrayList<TextNote> noteStorage = new ArrayList<TextNote>();

    public void storeNotes(String msg, String imgUrl){
        if(imgUrl==null){
            TextNote tmpNote = new TextNote(msg);
            noteStorage.add(tmpNote);
        }
        else
        {
            TextAndImageNote tmpNote = new TextAndImageNote(msg, imgUrl);
            noteStorage.add(tmpNote);
        }
    }

    public ArrayList<TextNote> getAllTextNotes() {
        ArrayList<TextNote> tmpStore = new ArrayList<TextNote>();

        for (TextNote item : noteStorage) {
            if (!(item instanceof TextAndImageNote)) {
                tmpStore.add(item);
            }
        }

        return tmpStore;
    }

    public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
        ArrayList<TextAndImageNote> tmpStore = new ArrayList<TextAndImageNote>();

        for (TextNote item : noteStorage) {
            if (item instanceof TextAndImageNote) {
                tmpStore.add((TextAndImageNote)item);
            }
        }

        return tmpStore;
    }


}
