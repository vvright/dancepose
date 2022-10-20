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
public class VienneseWaltzNaturalFleckerl123 extends Figure {
    public VienneseWaltzNaturalFleckerl123() {
        this.stepColor = BoxColor.Green;
        this.followingStepColor = BoxColor.Green;

        this.name = "NaturalFleckerl";
        this.nameInEnglish = "Natural Fleckerl";
        this.level = "Gold";
        this.beats = "123";
        this.manCommenceAlignment = "Commence Facing Against LOD";
        this.ladyCommenceAlignment = "Commence Facing LOD";
    }
    @Override
    public Set<String> getPrecedingFigures(){
        Set<String> precedingFigures = Sets.newHashSet();
//        precedingFigures.add("NaturalFleckerl");
//        precedingFigures.add("ContraCheck");
        return precedingFigures;
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
//        followingFigures.add("NaturalTurn");
//        //Following Step 3
//        followingFigures.add("NaturalTurn_456");
        return followingFigures;
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        return footSteps;
    }
}
