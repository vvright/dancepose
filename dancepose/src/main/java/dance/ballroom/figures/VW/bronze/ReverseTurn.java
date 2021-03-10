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
public class ReverseTurn extends Figure {
    public ReverseTurn() {
        this.name = "ReverseTurn";
        this.nameInEnglish = "Reverse Turn";
        this.level = "Bronze";
        this.beats = "123456";
        this.ManCommenceAlignment = "Commence Facing DW";
        this.LadyCommenceAlignment = "Commence Backing DW";
        this.notes ="1）May be overturned around a corner \n";
        this.notes += "2)May be curved toward centre to follow with (Silver) Reverse Fleckerls or (Gold) Contra Check in the middle of the floor";
        this.getPrecedingFigures();
        this.getFollowingFigures();
    }

    @Override
    public Set<String> getPrecedingFigures(){
        Set<String> precedingFigures = Sets.newHashSet();
        precedingFigures.add("ReverseTurn");
        precedingFigures.add("ForwardChangeNaturalToReverse");
        precedingFigures.add("ReverseFleckerl");
        //Preceding Step 4
        precedingFigures.add("BackwardChangeNaturalToReverse");
        precedingFigures.add("ReverseFleckerl_123");

        return precedingFigures;
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
        followingFigures.add("ReverseTurn");
        followingFigures.add("ForwardChangeReverseToNatural");
        followingFigures.add("ReverseFleckerl");
        followingFigures.add("ContraCheck");
        //Following Step 3
        followingFigures.add("BackwardChangeReverseToNatural");
        followingFigures.add("ReverseFleckerl_456");
        return followingFigures;
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        return footSteps;
    }
}
