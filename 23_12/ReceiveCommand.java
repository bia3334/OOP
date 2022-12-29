import java.util.ArrayList;

public class ReceiveCommand implements Command{
    Text target;
    private int index;
    private ArrayList<Command> commands = new ArrayList<>();

    public ReceiveCommand(ArrayList<Command> commands) {
        this.commands = commands;
    }

    public ReceiveCommand(Text target) {
        this.target = target;
    }

    public ReceiveCommand() {
        commands = new ArrayList<Command>();
        index = 0;
    }

    public void add(Command command) {
        index ++;
        commands.add(command);
    }

    public void remove(Command command) {
        index --;
        commands.remove(index);
    }

    @Override
    public void execute() {
        target.makeNormal();
    }
    
}
