package dance.ballroom.routine;

import dance.ballroom.figures.Figure;
import lombok.Data;

import java.util.List;
import java.util.Scanner;
/**
 * @author Song
 */
@Data
class BallroomDanceRoutine extends Routine {

    public List<Figure> addFigure(Routine routine, Figure figure) {
        routine.getFigures().add(figure);
        return routine.getFigures();
    }

    public List<Figure> addPrecedingFigure(Routine routine,int index, Figure figure){
        routine.getFigures().add(index, figure);
        return routine.getFigures();
    }

    public List<Figure> addFollowingFigure(Routine routine,int index, Figure figure){
        routine.getFigures().add(index+1,figure);
        return routine.getFigures();
    }

    public List<Figure> updateSelectedFigure(Routine routine, int index, Figure figure){
        routine.getFigures().set(index, figure);
        return routine.getFigures();
    }

    public List<Figure> deleteSelectedFigure(Routine routine, int index){
        routine.getFigures().remove(index);
        return routine.getFigures();
    }

    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("Ballroom Dance Rootine");
        System.out.println("======================");

        Scanner cmdLine = new Scanner(System.in);
        while (cmdLine.hasNext()) {
            Integer bar = new Integer(cmdLine.next());
            if (bar >= 1 && bar <= 32) {
                System.out.println(bar);
            }
        }
    }
}