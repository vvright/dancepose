package dance.ballroom.figures;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Song
 */

@Data
@NoArgsConstructor
public class FootStep {
    /**
     * 节拍
     */
    public Integer beat;

    /**
     * 步法foot position, position of feet
     */
    public String footstep;

    /**
     * 转度amount of turn
     */
    public String turn;
    public String alignment;
    public String moving;

    public String timing;
    public String position;
    public String RiseAndFall;
    public String CBM;
    public String sway;

    /**
     * 脚法
     */
    public String footwork;

    public String notes;
}
