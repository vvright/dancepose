package dance.ballroom.figure;

import dance.ballroom.choreography.BoxColor;
import org.springframework.stereotype.Component;

@Component
public class PrepStep extends Figure {

    public PrepStep() {
        super();
        this.setColor(BoxColor.Red);
        this.setFollowingColor(BoxColor.Green);
    }
}
