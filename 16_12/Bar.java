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
    public int getNewA() {
        return a;
    }
    public void setNewB(int b) {
        this.b = b;
    }
    public int getNewB() {
        return b;
    }
    public void setNewC(int c) {
        this.c = c;
    }
    public int getNewC() {
        return c;
    }
    @Override
    public void Update() {
        System.out.println("Current data: " + concreteSubject.getDataA());
        System.out.println("Current data: " + concreteSubject.getDataB());
        System.out.println("Current data: " + concreteSubject.getDataC());
    }
    
}
