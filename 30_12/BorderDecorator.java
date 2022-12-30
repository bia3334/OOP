public class BorderDecorator extends Decorator{

    public int borderDecorator;
    public BorderDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    public void DrawBorder() {
        borderDecorator = 5;
        System.out.println("Draw the border with length: " + borderDecorator);
    }

    @Override
    public void Draw() {
        super.Draw();
        DrawBorder();
    }
}
