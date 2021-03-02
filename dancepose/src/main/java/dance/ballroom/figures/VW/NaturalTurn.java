package dance.ballroom.figures.VW;

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
public class NaturalTurn extends Figure {

    public NaturalTurn() {
        this.name = "Natural Turn";
        this.level = "Bronze";
        this.beats = "123456";
        this.footSteps = getFootSteps();
        this.ManCommenceAlignment = "Commence facing DC";
        this.LadyCcommenceAlignment = "Commence backing DC";
        this.notes="May be overturned around a corner";
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        //TODO
        return footSteps;
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
        precedingFigures.add("1-3NaturalFleckerl");


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
}
