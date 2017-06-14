package Commands;

import java.awt.*;

/**
 * Created by Scalman on 2017-06-12.
 */
public class Move implements Command {

    private Point p1;
    private Point p2;

    public Move(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public void execute(Shape currentShape) {

    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
