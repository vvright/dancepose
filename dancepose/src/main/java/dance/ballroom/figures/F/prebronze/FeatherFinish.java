package dance.ballroom.figures.F.prebronze;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import dance.ballroom.figures.Figure;
import dance.ballroom.figures.FootStep;

import java.util.List;
import java.util.Set;


/**
 * @author Song
 */
public class FeatherFinish extends Figure {
    public FeatherFinish(){
        this.name="FeatherFinish";
        this.nameInEnglish="Feather Finish";
    }
    @Override
    public Set<String> getPrecedingFigures() {
        Set<String> precedingFigures = Sets.newHashSet();
        return precedingFigures;
    }

    @Override
    public Set<String> getFollowingFigures() {
        Set<String> followingFigures = Sets.newHashSet();
        return followingFigures;
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        return footSteps;
    }
}
