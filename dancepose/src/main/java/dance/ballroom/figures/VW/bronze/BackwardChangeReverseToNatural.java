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
public class BackwardChangeReverseToNatural extends Figure {
    public BackwardChangeReverseToNatural() {
        this.name = "Backward Change Reverse To Natural";
        this.level = "Bronze";
    }
    @Override
    public Set<String> getPrecedingFigures(){
        Set<String> precedingFigures = Sets.newHashSet();
        //TODO
        precedingFigures.add("NaturalTurn");
        precedingFigures.add("ForwardChangeReverseToNatural");
        precedingFigures.add("NaturalFleckerl");
        //Preceding Step 4
        precedingFigures.add("BackwardChangeReverseToNatural");
        //123
        precedingFigures.add("NaturalFleckerl");

        return precedingFigures;
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
        //TODO
        followingFigures.add("NaturalTurn");
        followingFigures.add("ForwardChangeNaturalToReverse");
        //Following Step 3
        followingFigures.add("BackwardChangeNaturalToReverse");
        return followingFigures;
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        //TODO
        return footSteps;
    }
}
