package dance.ballroom.routine;

import dance.ballroom.figures.Figure;

/**
 * @author Song
 * @description used for no adjusted figure with rules to occupy place in routine
 */
public class PendingFigure extends Figure {
    public PendingFigure() {
        this.name = "PendingFigure";
        this.notes = "not a figure , just used for choreography";
    }
}
