package dance.ballroom.syllabus;

import dance.ballroom.figure.Figure;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ouwakamatsu
 * @description Viennese Waltz
 */
@Data
@Component
public class VienneseWaltzFigures {
    @Autowired
    public Figure Reverse_Turn;

    @Autowired
    public Figure Natural_Turn;

    @Autowired
    public Figure Forward_Change_Natural_to_Reverse;

    @Autowired
    public Figure Forward_Change_Reverse_to_Natural;

    @Autowired
    public Figure Backward_Change_Natural_to_Reverse;

    @Autowired
    public Figure Backward_Change_Reverse_to_Natural;

    @Autowired
    public Figure Reverse_Fleckerl;

    @Autowired
    public Figure Natural_Fleckerl;

    @Autowired
    public Figure Contra_Check;


}