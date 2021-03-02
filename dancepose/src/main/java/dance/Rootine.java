package dance;

import dance.ballroom.figures.Figure;
import lombok.Data;

import java.util.List;

@Data
public class Rootine {
    //小节
    public Integer bar;

    //"ABCD","ABC","AB","A"
    public String line;

    public List<Figure> figures;

}
