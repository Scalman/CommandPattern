import Commands.Command;

import java.awt.*;
import java.util.Stack;

/**
 * Created by Scalman on 2017-06-12.
 */
public class CmdManager {

    private Stack<Command> undoStack = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public CmdManager() {}

    public void makeCommand(Command c, Shape s){
        if (c == null || s == null)
            return;

        c.execute(s);
        undoStack.push(c);
    }

    public void undoCommand(){
        if (undoStack.isEmpty())
            return;

        Command previousCommand = undoStack.pop();
        redoStack.push(previousCommand);
        previousCommand.undo();
    }

    public void redoCommand(){
        if (redoStack.isEmpty())
            return;

        Command previousCommand = redoStack.pop();
        undoStack.push(previousCommand);
        previousCommand.redo();
    }

}
