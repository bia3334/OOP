public class Bar implements Observer{

    private int a,b,c;
    ConcreteSubject concreteSubject;
    public Bar(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
        concreteSubject.Attach(this);
    }

    public void setNewA(int a) {
        this.a = a;
    }
    @Override
    public void Update() {
        System.out.println("Current data: " );
    }
    
}
