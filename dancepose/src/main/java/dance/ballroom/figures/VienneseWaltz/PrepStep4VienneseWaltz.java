package dance.ballroom.figures.VienneseWaltz;

import com.google.common.collect.Sets;
import dance.ballroom.choreography.BoxColor;
import dance.ballroom.figures.Figure;

import java.util.Set;

/**
 * @author Song
 */

public class PrepStep4VienneseWaltz extends Figure {

    public PrepStep4VienneseWaltz() {
        this.name="PrepStep";
        this.nameInEnglish="Prep Step";
        this.level="PreBronze";
        this.beats = "123";
        this.manCommenceAlignment = "";
        this.ladyCommenceAlignment = "";
        this.setStepColor(BoxColor.Red);
        this.setFollowingStepColor(BoxColor.Green);
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
        followingFigures.add("NaturalTurn");
        return followingFigures;
    }
}
