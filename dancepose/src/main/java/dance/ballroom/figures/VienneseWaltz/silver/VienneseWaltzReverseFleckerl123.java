package dance.ballroom.figures.VienneseWaltz.silver;

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
public class VienneseWaltzReverseFleckerl123 extends Figure {
    public VienneseWaltzReverseFleckerl123() {
        this.stepColor = BoxColor.Green;
        this.followingStepColor = BoxColor.Green;

        this.name = "ReverseFleckerl";
        this.nameInEnglish = "Reverse Fleckerl";
        this.level = "Gold";
        this.beats = "123";
        this.manCommenceAlignment = "Commence Facing LOD";
        this.ladyCommenceAlignment = "Commence Backing DW";
    }
    @Override
    public Set<String> getPrecedingFigures(){
        Set<String> precedingFigures = Sets.newHashSet();
//        precedingFigures.add("ReverseTurn");
//        precedingFigures.add("ReverseFleckerl");
//        //Preceding Step 4
//        precedingFigures.add("ReverseTurn_123");
        return precedingFigures;
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
//        followingFigures.add("ReverseTurn");
//        followingFigures.add("ReverseFleckerl");
//        followingFigures.add("ContraCheck");
//        //Following Step 3
//        followingFigures.add("ReverseTurn_456");
        return followingFigures;
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        return footSteps;
    }
}
