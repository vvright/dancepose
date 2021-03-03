package dance.ballroom.figures.W;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import dance.ballroom.choreography.BoxColor;
import dance.ballroom.figures.Figure;

import java.util.List;
import java.util.Set;

/**
 * @author Song
 */

public class PrepStep extends Figure {

    public PrepStep() {
        this.name="Prep Step";
        this.level="PreBronze";
        this.notes="Although it is possible to commence at other alignments, the alignment given in the charts is almost always used";
        this.setColor(BoxColor.Red);
        this.setFollowingColor(BoxColor.Green);
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
