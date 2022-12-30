public class Main {
    public static void main(String[] args) {
        VisualComponent visualComponent = new ScrollDecorator(new TextView());
        visualComponent.Draw();
        System.out.println("------------------------");
        VisualComponent visualComponent2 = new BorderDecorator(new ScrollDecorator(new TextView()));
        visualComponent2.Draw();
    }
}