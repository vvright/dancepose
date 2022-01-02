package dance.ballroom.figures;

import dance.Gender;
import dance.ballroom.choreography.BoxColor;
import lombok.Data;

import java.util.List;
import java.util.Map;
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

    public String manCommenceAlignment;
    public String manCommencePosition;
    public String ladyCommenceAlignment;
    public String ladyCommencePosition;

    public String commencedFacing;
    public String commencedPosition;

    public String endedFacing;
    public String endedPosition;

    /**
     * The left hand box shows the first step of the figure.
     */
    public BoxColor stepColor;
    /**
     * The right hand box shows the first step of the following figure.
     */
    public BoxColor followingStepColor;

    public Figure precedingFigure;
    public Figure followingFigure;

    public Set<String> precedingFigures;
    public Set<String> followingFigures;

    public Map<String,Set<String>> precedingFiguresWithAlignment;
    public Map<String,Set<String>> followingFiguresWithAlignment;

    public Set<String> findPrecedingFiguresByAlignment(String commencedFacing, Map<String, Set<String>> precedingFigures) {
        return precedingFigures.get(commencedFacing);
    }

    public Set<String> findFollowingFiguresByAlignment(String endedFacing, Map<String, Set<String>> followingFigures) {
        return followingFigures.get(endedFacing);
    }

    public String notes;

    public Gender gender;
}
