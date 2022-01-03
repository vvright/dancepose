package dance.ballroom.figures.VienneseWaltz.bronze;

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
public class ForwardChangeNaturalToReverse extends Figure {
    public ForwardChangeNaturalToReverse() {
        this.stepColor = BoxColor.Green;
        this.followingStepColor = BoxColor.Red;

        this.name = "ForwardChangeNaturalToReverse";
        this.nameInEnglish = "Forward Change Natural To Reverse";
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
        precedingFigures.add("NaturalTurn");
        precedingFigures.add("ForwardChangeReverseToNatural");

        return precedingFigures;
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
        followingFigures.add("ReverseTurn");
        followingFigures.add("ForwardChangeReverseToNatural");
        return followingFigures;
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        return footSteps;
    }
}
