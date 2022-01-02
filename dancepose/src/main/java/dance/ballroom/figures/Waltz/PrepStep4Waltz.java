package dance.ballroom.figures.Waltz;

import com.google.common.collect.Sets;
import dance.ballroom.choreography.BoxColor;
import dance.ballroom.figures.Figure;

import java.util.Set;

/**
 * @author Song
 */

public class PrepStep4Waltz extends Figure {

    public PrepStep4Waltz() {
        this.name="PrepStep";
        this.nameInEnglish="Prep Step";
        this.level="PreBronze";
        this.notes="Although it is possible to commence at other alignments, the alignment given in the charts is almost always used";
        this.setStepColor(BoxColor.Red);
        this.setFollowingStepColor(BoxColor.Green);
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
        //Ended Facing DC
        followingFigures.add("RFClosedChange");
        //Ended Facing DW
        followingFigures.add("NaturalTurn");
        followingFigures.add("NaturalSpinTurn");
        followingFigures.add("HesitationChange");

        return followingFigures;
    }
}
