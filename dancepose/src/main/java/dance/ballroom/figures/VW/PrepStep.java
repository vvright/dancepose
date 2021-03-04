package dance.ballroom.figures.VW;

import com.google.common.collect.Sets;
import dance.ballroom.choreography.BoxColor;
import dance.ballroom.figures.Figure;

import java.util.Set;

/**
 * @author Song
 */

public class PrepStep extends Figure {

    public PrepStep() {
        this.name="Prep Step";
        this.level="PreBronze";
        this.beats = "123";
        this.ManCommenceAlignment = "";
        this.LadyCcommenceAlignment = "";
        this.setColor(BoxColor.Red);
        this.setFollowingColor(BoxColor.Green);
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
        followingFigures.add("NaturalTurn");
        return followingFigures;
    }
}
