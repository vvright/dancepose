package dance.ballroom.figures;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FootStep {
    public Integer beat;//节拍

    public String footstep;//步法foot position, position of feet
    public String turn;//转度amount of turn
    public String alignment;
    public String moving;

    public String timing;
    public String position;
    public String RiseAndFall;
    public String CBM;
    public String sway;
    public String footwork;//脚法

    public String notes;
}
