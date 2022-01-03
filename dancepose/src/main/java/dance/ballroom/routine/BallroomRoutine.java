package dance.ballroom.routine;

import dance.ballroom.figures.Figure;
import lombok.Data;

import java.util.List;
import java.util.Scanner;
/**
 * @author Song
 */
@Data
class BallroomRoutine extends Routine {

    public List<Figure> addFigure(Routine routine, Figure figure) {
        routine.getFigures().add(figure);
        return routine.getFigures();
    }

    public List<Figure> addPrecedingFigure(Routine routine,int index, Figure figure){
        routine.getFigures().add(index, figure);
        return routine.getFigures();
    }

    public List<Figure> addFollowingFigure(Routine routine,int index, Figure figure){
        routine.getFigures().add(index,figure);
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
        System.out.println("Ballroom Dance Routine");
        System.out.println("======================");

        System.out.println("Waltz");
        System.out.println("Tango");
        System.out.println("Quickstep");
        System.out.println("Foxtrot");
        System.out.println("VienneseWaltz");
        System.out.println("Please input the type of ballroom dance:");

        Scanner cmdLine = new Scanner(System.in);

        String ballroomDanceType = cmdLine.next();
        System.out.println(ballroomDanceType);

        System.out.println("Please input bars of the routine:");
        Integer bar = Integer.valueOf(cmdLine.next());

        if (bar >= 1 && bar <= 32) {
            System.out.println(bar);
        }


        while (cmdLine.hasNext()) {
           String figureName = cmdLine.next();
//           Figure figure = new Figure(figureName);

        }


    }
}