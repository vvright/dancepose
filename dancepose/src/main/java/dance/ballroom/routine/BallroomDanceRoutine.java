package dance.ballroom.routine;

import dance.ballroom.figures.Figure;
import dance.ballroom.figures.VW.PrepStep_VW;
import lombok.Data;

import java.util.List;
import java.util.Scanner;

@Data
class BallroomDanceRoutine extends Routine {

    public Figure getPrecedingFigure(Figure figure) {
        return figure.getPrecedingFigure();
    }

    public Figure getFollowingFigure(Figure figure) {
        return figure.getFollowingFigure();
    }

    public Figure getLastFigure(Routine routine) {
        List<Figure> figures = routine.getFigures();
        Figure figure = new PrepStep_VW();
        if (figures.size() != 0) {
            figure = routine.getFigures().get(figures.size() - 1);
        }
        return figure;
    }

    public List<Figure> addFigure(Routine routine, Figure figure) {

        routine.getFigures().add(figure);
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