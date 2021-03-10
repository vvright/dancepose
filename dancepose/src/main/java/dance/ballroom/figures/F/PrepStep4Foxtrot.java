package dance.ballroom.figures.F;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import dance.ballroom.figures.Figure;
import dance.ballroom.figures.FootStep;

import java.util.List;
import java.util.Set;

/**
 * @author Song
 */
public class PrepStep4Foxtrot extends Figure {
    public PrepStep4Foxtrot(){
        this.name="PrepStep4Foxtrot";
        this.nameInEnglish = "Prep Step";
    }
    @Override
    public Set<String> getPrecedingFigures() {
        Set<String> precedingFigures = Sets.newHashSet();
        return precedingFigures;
    }

    @Override
    public Set<String> getFollowingFigures() {
        Set<String> followingFigures = Sets.newHashSet();
        followingFigures.add("FeatherStep");
        return followingFigures;
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        return footSteps;
    }
}
