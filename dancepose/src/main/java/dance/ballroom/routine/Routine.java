package dance.ballroom.routine;

import com.google.common.collect.Lists;
import dance.ballroom.figures.Figure;
import dance.ballroom.figures.VW.PrepStep;
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
    public Integer bars;

    /**
     * Dance Line "ABCD","ABC","AB","A"
     */
    public String line;

    public List<Figure> figures;

    public Routine(){
        this.figures = Lists.newLinkedList();
        figures.add(new PrepStep());
    }

}
