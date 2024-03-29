package dance.ballroom.figures.VienneseWaltz.gold;

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
public class VienneseWaltzContraCheck extends Figure {
    public VienneseWaltzContraCheck() {
        this.stepColor = BoxColor.Red;
        this.followingStepColor = BoxColor.Green;

        this.name = "ContraCheck";
        this.nameInEnglish = "Contra Check";
        this.level = "Gold";
        this.beats = "123";
        this.manCommenceAlignment = "Commence Facing LOD";
        this.ladyCommenceAlignment = "Commence Backing LOD";
    }
    @Override
    public Set<String> getPrecedingFigures(){
        Set<String> precedingFigures = Sets.newHashSet();
        precedingFigures.add("ReverseTurn");
        precedingFigures.add("ReverseFleckerl");

        return precedingFigures;
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
        followingFigures.add("NaturalFleckerl");
        return followingFigures;
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        return footSteps;
    }
}
