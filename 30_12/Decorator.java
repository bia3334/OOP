public abstract class Decorator implements VisualComponent {
    protected VisualComponent visualComponent;

    public Decorator(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }

    public VisualComponent gVisualComponent() {
        return visualComponent;
    }

    public void setVisual(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }

    @Override
    public void Draw() {
        this.visualComponent.Draw();
    }
}
