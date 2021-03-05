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
public class NaturalFleckerl extends Figure {
    public NaturalFleckerl() {
        this.name = "NaturalFleckerl";
        this.nameInEnglish = "Natural Fleckerl";
        this.level = "Gold";
        this.beats = "123";
        this.ManCommenceAlignment = "Commence Facing Against LOD";
        this.LadyCcommenceAlignment = "Commence Facing LOD";
    }
    @Override
    public Set<String> getPrecedingFigures(){
        Set<String> precedingFigures = Sets.newHashSet();
        precedingFigures.add("NaturalFleckerl");
        precedingFigures.add("ContraCheck");
        return precedingFigures;
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
        followingFigures.add("NaturalTurn");
        //Following Step 3
        followingFigures.add("NaturalTurn_456");
        return followingFigures;
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        return footSteps;
    }
}
