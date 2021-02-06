package dance.ballroom.figure;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class Step {
    public String beat;//节拍
    public String positionCommenceIn;
    public String commencedFacing;

    public String footstep;//步法foot position, position of feet
    public String turn;//转度amount of turn
    public String alignment;
    public String moving;

    public String timing;
    public String position;
    public String RiseAndFall;
    public String sway;
    public String footwork;//脚法

    public String notes;
}
