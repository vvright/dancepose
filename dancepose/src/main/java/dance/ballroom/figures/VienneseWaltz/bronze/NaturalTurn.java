package dance.ballroom.figures.VienneseWaltz.bronze;

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
        this.name = "NaturalTurn";
        this.nameInEnglish = "Natural Turn";
        this.level = "Bronze";
        this.beats = "123456";
        this.manCommenceAlignment = "Commence Facing DC";
        this.ladyCommenceAlignment = "Commence Backing DC";
        this.notes="May be overturned around a corner";
        this.getPrecedingFigures();
        this.getFollowingFigures();
    }

    @Override
    public Set<String> getPrecedingFigures(){
        Set<String> precedingFigures = Sets.newHashSet();
        precedingFigures.add("NaturalTurn");
        precedingFigures.add("ForwardChangeReverseToNatural");
        precedingFigures.add("NaturalFleckerl");
        //Preceding Step 4
        precedingFigures.add("BackwardChangeReverseToNatural");
        precedingFigures.add("NaturalFleckerl_123");

        return precedingFigures;
    }

    @Override
    public Set<String> getFollowingFigures(){
        Set<String> followingFigures = Sets.newHashSet();
        followingFigures.add("NaturalTurn");
        followingFigures.add("ForwardChangeNaturalToReverse");
        //Following Step 3
        followingFigures.add("BackwardChangeNaturalToReverse");
        return followingFigures;
    }

    @Override
    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();
        return footSteps;
    }

}
