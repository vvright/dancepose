package dance.ballroom.figures.VW.gold;

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
public class ContraCheck extends Figure {
    public ContraCheck() {
        this.name = "ContraCheck";
        this.nameInEnglish = "Contra Check";
        this.level = "Gold";
        this.beats = "123";
        this.ManCommenceAlignment = "Commence Facing LOD";
        this.LadyCcommenceAlignment = "Commence Backing LOD";
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
