import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    protected ArrayList<Observer> obs = new ArrayList<>();
    private int a,b,c;

    public void setData(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        Notify();
    }

    public void setDataA(int a) {
        this.a = a;
    }

    public void setDataB(int b) {
        this.b = b;
    }

    public void setDataC(int c) {
        this.c = c;
    }

    public int getDataA() {
        return a;
    }

    public int getDataB() {
        return b;
    }

    public int getDataC() {
        return c;
    }

    @Override
    public void Attach(Observer observer) {
        obs.add(observer);
        
    }


    @Override
    public void Notify() {
        for (Observer observer : obs) {
            observer.Update();
        }
    }
    
}
