package dance.ballroom.figures;

import dance.ballroom.choreography.BoxColor;

public class PrepStep extends Figure {

    public PrepStep() {
        super();
        this.setColor(BoxColor.Red);
        this.setFollowingColor(BoxColor.Green);
    }
}
