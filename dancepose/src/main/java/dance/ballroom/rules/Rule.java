package dance.ballroom.rules;

import dance.ballroom.figures.Figure;

import java.util.Set;

/**
 * @author Song
 */
public interface Rule {
    Set<Figure> precedingFigures(Figure figure);

    Set<Figure> followingFigures(Figure figure);
}
