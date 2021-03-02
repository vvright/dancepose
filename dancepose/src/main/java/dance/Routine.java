package dance;

import dance.ballroom.figures.Figure;
import lombok.Data;

import java.util.List;

/**
 * @author Song
 */
@Data
public class Routine {
    /**
     * 小节
     */
    public Integer bar;

    /**
     * "ABCD","ABC","AB","A"
     */
    public String line;

    public List<Figure> figures;

}
