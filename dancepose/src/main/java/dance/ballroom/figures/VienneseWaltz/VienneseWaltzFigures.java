package dance.ballroom.figures.VienneseWaltz;

import dance.ballroom.choreography.BoxColor;
import dance.ballroom.figures.Figure;
import dance.ballroom.figures.VienneseWaltz.bronze.*;
import dance.ballroom.figures.VienneseWaltz.gold.VienneseWaltzContraCheck;
import dance.ballroom.figures.VienneseWaltz.gold.VienneseWaltzNaturalFleckerl;
import dance.ballroom.figures.VienneseWaltz.silver.VienneseWaltzReverseFleckerl;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Data
public class VienneseWaltzFigures {
    Map<String, Figure> figuresByName = new HashMap<String, Figure>();

    Map<BoxColor, Set<Figure>> figuresByBoxColor = new HashMap<BoxColor, Set<Figure>>();
    public VienneseWaltzFigures(){
        Figure naturalTurn = new VienneseWaltzNaturalTurn();
//        Figure naturalTurn123 = new VienneseWaltzNaturalTurn123();
//        Figure naturalTurn456 = new VienneseWaltzNaturalTurn456();

        Figure reverseTurn = new VienneseWaltzReverseTurn();
//        Figure reverseTurn123 = new VienneseWaltzReverseTurn123();
//        Figure reverseTurn456 = new VienneseWaltzReverseTurn456();

        Figure naturalToReverseBackwardChange = new BackwardChangeNaturalToReverse();
        Figure reverseToNaturalBackwardChange = new BackwardChangeReverseToNatural();

        Figure naturalToReverseForwardChange = new ForwardChangeNaturalToReverse();
        Figure reverseToNaturalForwardChange = new ForwardChangeReverseToNatural();

        Figure reverseFleckerl = new VienneseWaltzReverseFleckerl();
//        Figure reverseFleckerl123 = new VienneseWaltzReverseFleckerl123();
//        Figure reverseFleckerl456 = new VienneseWaltzReverseFleckerl456();

        Figure naturalFleckerl = new VienneseWaltzNaturalFleckerl();
//        Figure naturalFleckerl123 = new VienneseWaltzNaturalFleckerl123();
//        Figure naturalFleckerl456 = new VienneseWaltzNaturalFleckerl456();

        Figure contraCheck = new VienneseWaltzContraCheck();

        figuresByName.put("NaturalTurn",naturalTurn);
//        figuresByName.put("NaturalTurn123",naturalTurn123);
//        figuresByName.put("NaturalTurn456",naturalTurn456);
        figuresByName.put("ReverseTurn",reverseTurn);
//        figuresByName.put("ReverseTurn123",reverseTurn123);
//        figuresByName.put("ReverseTurn456",reverseTurn456);

        figuresByName.put("NaturalToReverseBackwardChange",naturalToReverseBackwardChange);
        figuresByName.put("ReverseToNaturalBackwardChange",reverseToNaturalBackwardChange);
        figuresByName.put("NaturalToReverseForwardChange",naturalToReverseForwardChange);
        figuresByName.put("ReverseToNaturalForwardChange",reverseToNaturalForwardChange);

        figuresByName.put("ReverseFleckerl",reverseFleckerl);
//        figuresByName.put("ReverseFleckerl123",reverseFleckerl123);
//        figuresByName.put("ReverseFleckerl456",reverseFleckerl456);

        figuresByName.put("NaturalFleckerl",naturalFleckerl);
//        figuresByName.put("NaturalFleckerl123",naturalFleckerl123);
//        figuresByName.put("NaturalFleckerl456",naturalFleckerl456);

        figuresByName.put("ContraCheck",contraCheck);

    }

}
