package dance.ballroom.choreography;

//The left hand box shows the first step of the figure.
//The right hand box shows the first step of the following figure.
public enum BoxColor {
    Green("Man: Right foot forward.\n" +
            "Lady: Left foot backward.\n", 1),
    Red("Man: Left foot forward.\n" +
            "Lady: Right foot backward.\n", 2),
    TwillGreen("Man: Right foot backward.\n" +
            "Lady: Left foot forward.\n", 3),
    TwillRed("Man: Left foot backward.\n" +
            "Lady: Right foot forward.\n", 4),
    Blue("Man: Promenade Position.\n" +
            "Lady: Promenade Position.\n", 5),
    Brown("Man: Heel Pull (RF side small step)\n" +
            "Lady: LF Side\n", 6);

    private String notes;
    private Integer index;

    private BoxColor(String notes, Integer index) {
        this.notes = notes;
        this.index = index;
    }

    public static void main(String[] args) {
        System.out.println(BoxColor.Green == BoxColor.Red);
    }

    public String getNotes() {
        return notes;
    }

    public Integer getIndex() {
        return index;
    }
}
