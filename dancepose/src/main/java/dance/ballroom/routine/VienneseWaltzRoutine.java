package dance.ballroom.routine;

import dance.ballroom.figures.Figure;
import dance.ballroom.figures.VienneseWaltz.VienneseWaltzFigures;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Song
 * @description with rules for checking figures
 */

public class VienneseWaltzRoutine {
    List<Figure> routine = new ArrayList<Figure>() ;

    public static void main(String[] args){
        System.out.println("======================");
        System.out.println("Viennese Waltz Dance Routine");
        System.out.println("======================");

        Scanner cmdLine = new Scanner(System.in);

        System.out.println("Please input bars of the routine:");
        Integer bars = Integer.valueOf(cmdLine.next());

        if (bars >= 1 && bars <= 32) {
            System.out.println("You type routine bars is: "+ bars);
        }

        System.out.println("Viennese Waltz Figures are belows: ");

        VienneseWaltzFigures VWFigures = new VienneseWaltzFigures();
        for (Map.Entry<String, Figure> entry : VWFigures.getFiguresByName().entrySet()) {
                System.out.println(entry.getKey());
        }

        System.out.println("Please choose one Figures to add in your routine: ");
        while (cmdLine.hasNext()) {
            String figureName = cmdLine.next();
            Figure figure = VWFigures.getFiguresByName().get(figureName);

            System.out.println(figureName+" Step Color: "+ figure.getStepColor());
            System.out.println(figureName+" Following Step Color: "+ figure.getFollowingStepColor());

            System.out.println("We advice the next Figure is: ");

        }
    }

}
