package dance.ballroom.figure;

import dance.ballroom.choreography.BoxColor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
@RequiredArgsConstructor
public class Figure {
    public String name;
    public String level;
    public String timing;
    public String rotation;

    public Step[] steps;

    public String notes;

    public String commencedFacing;
    public String positionCommenceIn;

    public String endedFacing;
    public String positionEndIn;


    @NonNull
    public BoxColor color;//The left hand box shows the first step of the figure.
    @NonNull
    public BoxColor followingColor;//The right hand box shows the first step of the following figure.

    public Figure precedingFigure;
    public Figure followingFigure;

    public Figure[] precedings;//alternative
    public Figure[] followings;//alternative
}
