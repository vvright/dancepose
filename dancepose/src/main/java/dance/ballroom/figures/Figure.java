package dance.ballroom.figures;

import dance.ballroom.choreography.BoxColor;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class Figure {
    public String name;
    public String level;

    public List<FootStep> footSteps;

    public String rotation;

    public String commencedFacing;
    public String positionCommenceIn;

    public String endedFacing;
    public String positionEndIn;

    public BoxColor color;//The left hand box shows the first step of the figure.
    public BoxColor followingColor;//The right hand box shows the first step of the following figure.

    public Figure precedingFigure;
    public Figure followingFigure;

    public Set<FootStep> precedings;//alternative
    public Set<FootStep> followings;//alternative

    public String notes;
}
