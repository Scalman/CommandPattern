package Commands;

import java.awt.*;

/**
 * Created by Scalman on 2017-06-12.
 */
public interface Command {

    void execute(Shape currentShape);

    void undo();

    void redo();
}
