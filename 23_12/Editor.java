public class Editor {
    Text[] texts = new Text[3];
    Command undoList[] = new Command[5];
    int undoSteps = 0;

    public Editor() {
        texts[0] = new Text("Hello");
        texts[1] = new Text("Im");
        texts[2] = new Text("Hung");
    }

    public void display() {
        for (int i = 0; i < 3; i++) {
            texts[i].display();
        }
        System.out.println();
    }

    public void setBold(int i) {
        texts[i].makeBold();
        undoList[undoSteps++] = new ReceiveCommand(texts[i]);
    }

    public void undo() {
        undoList[undoSteps - 1].execute();
        undoList[undoSteps - 1] = null;
        undoSteps--;
    }
}
