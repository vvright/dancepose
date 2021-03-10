package dance.ballroom.figures.VW.bronze;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import dance.ballroom.figures.Figure;
import dance.ballroom.figures.FootStep;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * @author Song
 */
@Data
public class ClosedChangeBackwardNaturalToReverse extends Figure {

    public ClosedChangeBackwardNaturalToReverse() {
        this.name = "BackwardChangeNaturalToReverse";
        this.nameInEnglish = "Backward Change Natural To Reverse";
        this.level = "Bronze";
        this.beats = "123";
        this.ManCommenceAlignment = "";
        this.LadyCommenceAlignment = "";
        this.getPrecedingFigures();
        this.getFollowingFigures();
    }

    @Override
    public Set<String> getPrecedingFigures(){
        Set<String> precedingFigures = Sets.newHashSet();
        precedingFigures.add("BackwardChangeReverseToNatural");
        //123
        precedingFigures.add("NaturalTurn_123");
        return precedingFigures;
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
        followingFigures.add("BackwardChangeReverseToNatural");
        //456
        followingFigures.add("ReverseTurn_456");
        return followingFigures;
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        //TODO
        return footSteps;
    }
}
