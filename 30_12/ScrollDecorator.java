public class ScrollDecorator extends Decorator{

    public int scrollTo;
    public ScrollDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    public void ScrollTo() {
        scrollTo = 5;
        System.out.println("Scroll to page: " + scrollTo);
    }
    @Override
    public void Draw() {
        super.Draw();
        ScrollTo();
    }
    
}
