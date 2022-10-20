package dance.ballroom.choreography.segment;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import dance.ballroom.choreography.BoxColor;
import dance.ballroom.figures.Figure;
import dance.ballroom.figures.FootStep;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * @author Song
 */
@Data
public class VienneseWaltzReverseTurn456 extends Figure {
    public VienneseWaltzReverseTurn456() {
        this.stepColor = BoxColor.TwillGreen;
        this.followingStepColor = BoxColor.Red;

        this.name = "ReverseTurn";
        this.nameInEnglish = "Reverse Turn";
        this.level = "Bronze";
        this.beats = "123456";
        this.manCommenceAlignment = "Commence Facing DW";
        this.ladyCommenceAlignment = "Commence Backing DW";
        this.notes ="1）May be overturned around a corner \n";
        this.notes += "2)May be curved toward centre to follow with (Silver) Reverse Fleckerls or (Gold) Contra Check in the middle of the floor";

        this.getPrecedingFigures();
        this.getFollowingFigures();
    }

    @Override
    public Set<String> getPrecedingFigures(){
        Set<String> precedingFigures = Sets.newHashSet();
//        precedingFigures.add("ReverseTurn");
//        precedingFigures.add("ForwardChangeNaturalToReverse");
//        precedingFigures.add("ReverseFleckerl");
//        //Preceding Step 4
//        precedingFigures.add("BackwardChangeNaturalToReverse");
//        precedingFigures.add("ReverseFleckerl_123");

        return precedingFigures;
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
//        followingFigures.add("ReverseTurn");
//        followingFigures.add("ForwardChangeReverseToNatural");
//        followingFigures.add("ReverseFleckerl");
//        followingFigures.add("ContraCheck");
//        //Following Step 3
//        followingFigures.add("BackwardChangeReverseToNatural");
//        followingFigures.add("ReverseFleckerl_456");
        return followingFigures;
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        return footSteps;
    }
}
