package dance.ballroom.routine;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import dance.ballroom.figures.Figure;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author Song
 */
@Data
public class Routine {
    /**
     * 小节
     */
    public Integer bars;

    public List<Figure> figures;

    /**
     * Dance Line "A","AB","ABC","ABCD"
     */
    public Map<String,List<Figure>> line;


    public Routine() {
        this.bars = 0;
        this.figures = Lists.newLinkedList();
    }

}
