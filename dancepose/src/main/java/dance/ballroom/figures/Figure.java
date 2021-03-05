package dance.ballroom.figures;

import dance.Gender;
import dance.ballroom.choreography.BoxColor;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * @author Song
 */

@Data
public class Figure {
    public String name;
    public String nameInEnglish;
    public String nameInChinese;
    public String level;

    public String beats;

    public List<FootStep> footSteps;

    public String rotation;

    public String ManCommenceAlignment;
    public String LadyCcommenceAlignment;

    public String commenceFacing;
    public String commencePosition;

    public String endFacing;
    public String endPosition;

    /**
     * The left hand box shows the first step of the figure.
     */
    public BoxColor color;
    /**
     * The right hand box shows the first step of the following figure.
     */
    public BoxColor followingColor;

    public Figure precedingFigure;
    public Figure followingFigure;

    public Set<String> precedingFigures;
    public Set<String> followingFigures;

    public String notes;

    public Gender gender;
}
