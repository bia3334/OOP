public class Test {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.display();
        editor.setBold(1);
        editor.display();
        editor.undo();
        editor.display();

    }
}
