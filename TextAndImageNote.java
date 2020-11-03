
public class TextAndImageNote extends TextNote{

    private String imgUrl;

    public TextAndImageNote(String noteStr, String imgStr) {
        super(noteStr);
        imgUrl = imgStr;
    }

    public void setImg(String imgStr) {
        imgUrl = imgStr;
    }

    public String getImg() {
        return imgUrl;
    }
    
}
