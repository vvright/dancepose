package dance.ballroom.figures.VW.silver;

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
public class ReverseFleckerl extends Figure {
    public ReverseFleckerl() {
        this.name = "ReverseFleckerl";
        this.nameInEnglish = "Reverse Fleckerl";
        this.level = "Gold";
        this.beats = "123";
        this.ManCommenceAlignment = "Commence Facing LOD";
        this.LadyCommenceAlignment = "Commence Backing DW";
    }
    @Override
    public Set<String> getPrecedingFigures(){
        Set<String> precedingFigures = Sets.newHashSet();
        precedingFigures.add("ReverseTurn");
        precedingFigures.add("ReverseFleckerl");
        //Preceding Step 4
        precedingFigures.add("ReverseTurn_123");
        return precedingFigures;
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
        followingFigures.add("ReverseTurn");
        followingFigures.add("ReverseFleckerl");
        followingFigures.add("ContraCheck");
        //Following Step 3
        followingFigures.add("ReverseTurn_456");
        return followingFigures;
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        return footSteps;
    }
}
