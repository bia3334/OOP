public class Text {
    private String text;
    private boolean isBold;

    public Text(String str) {
        text = str;
    }

    public void makeBold() {
        isBold = true;
    }

    public void makeNormal() {
        isBold = false;
    }
    
    public void display() {
        if (isBold) {
            System.out.println("**" + text + "**");
        } else {
            System.out.println(text);
        }
    }
}
