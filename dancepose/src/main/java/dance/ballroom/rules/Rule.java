package dance.ballroom.rules;

import dance.ballroom.figures.Figure;

import java.util.Set;

public interface Rule {
    public Set<Figure> precedingFigures(Figure figure);

    public Set<Figure> followingFigures(Figure figure);
}
