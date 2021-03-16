package dance.ballroom.rules;

/**
 * @author Song
 * @description Polar Coordinate System, the angle of LOD = 0
 *              alignment, position, facing, moving
 *              rotation can be calculated by alignment or position
 */

public enum Directions {
    /**
     *
     */
    LOD(0),
    /**
     *
     */
    Center(90),
    /**
     *
     */
    Wall(-90),
    /**
     *
     */
    DC(45),
    /**
     *
     */
    DCAgainstLOD(-135),
    /**
     *
     */
    DW(-45),
    /**
     *
     */
    DWAgainstLOD(135);

    int angle;

    Directions(int angle) {
        this.angle = angle;
    }
}
