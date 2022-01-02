package dance.ballroom.figures.VienneseWaltz.bronze;

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
public class ClosedChangeBackwardReverseToNatural extends Figure {
    public ClosedChangeBackwardReverseToNatural() {
        this.name = "BackwardChangeReverseToNatural";
        this.nameInEnglish = "Backward Change Reverse To Natural";
        this.level = "Bronze";
        this.beats = "123";
        this.manCommenceAlignment = "";
        this.ladyCommenceAlignment = "";
        this.getPrecedingFigures();
        this.getFollowingFigures();
    }
    @Override
    public Set<String> getPrecedingFigures(){
        Set<String> precedingFigures = Sets.newHashSet();
        precedingFigures.add("BackwardChangeNaturalToReverse");
        //123
        precedingFigures.add("ReverseTurn_123");
        return precedingFigures;
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
        followingFigures.add("BackwardChangeNaturalToReverse");
        //456
        followingFigures.add("NaturalTurn_456");
        return followingFigures;
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        return footSteps;
    }
}
