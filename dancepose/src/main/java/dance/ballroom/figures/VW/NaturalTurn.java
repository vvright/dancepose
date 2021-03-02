package dance.ballroom.figures.VW;

import com.google.common.collect.Lists;
import dance.ballroom.figures.Figure;
import dance.ballroom.figures.FootStep;
import lombok.Data;

import java.util.List;

@Data
public class NaturalTurn extends Figure {

    public NaturalTurn() {
        this.name = "Natural Turn";
        this.level = "Bronze";
        this.footSteps = getFootSteps();
    }

    public List<FootStep> getFootSteps(){
        List<FootStep> footSteps = Lists.newArrayList();

        if(footSteps == null){
            //TO DO
        }
        return footSteps;
    }
}
