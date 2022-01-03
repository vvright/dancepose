package dance.ballroom.choreography;

import dance.ballroom.figures.Figure;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WaltzFigureColor implements FigureColor {

    public void setStepColor_Green_Green(Figure figure) {
        figure.setStepColor(BoxColor.Green);
        figure.setFollowingStepColor(BoxColor.Green);
    }

    public void setStepColor_Green_Red(Figure figure) {
        figure.setStepColor(BoxColor.Green);
        figure.setFollowingStepColor(BoxColor.Red);
    }

    public void setStepColor_Red_Red(Figure figure) {
        figure.setStepColor(BoxColor.Red);
        figure.setFollowingStepColor(BoxColor.Red);
    }

    public void setStepColor_Red_Green(Figure figure) {
        figure.setStepColor(BoxColor.Red);
        figure.setFollowingStepColor(BoxColor.Green);
    }

    public void setStepColor_Green_TwillGreen(Figure figure) {
        figure.setStepColor(BoxColor.Green);
        figure.setFollowingStepColor(BoxColor.TwillGreen);
    }

    public void setStepColor_Green_TwillRed(Figure figure) {
        figure.setStepColor(BoxColor.Green);
        figure.setFollowingStepColor(BoxColor.TwillRed);
    }

    public void setStepColor_Red_TwillRed(Figure figure) {
        figure.setStepColor(BoxColor.Red);
        figure.setFollowingStepColor(BoxColor.TwillRed);
    }

    public void setStepColor_Red_TwillGreen(Figure figure) {
        figure.setStepColor(BoxColor.Red);
        figure.setFollowingStepColor(BoxColor.TwillGreen);
    }

    public void setStepColor_Red_Blue(Figure figure) {
        figure.setStepColor(BoxColor.Red);
        figure.setFollowingStepColor(BoxColor.Blue);
    }

    public void setStepColor_Green_Blue(Figure figure) {
        figure.setStepColor(BoxColor.Green);
        figure.setFollowingStepColor(BoxColor.Blue);
    }

    public void setStepColor_TwillGreen_Green(Figure figure) {
        figure.setStepColor(BoxColor.TwillGreen);
        figure.setFollowingStepColor(BoxColor.Green);
    }

    public void setStepColor_TwillGreen_Red(Figure figure) {
        figure.setStepColor(BoxColor.TwillGreen);
        figure.setFollowingStepColor(BoxColor.Red);
    }

    public void setStepColor_TwillRed_Red(Figure figure) {
        figure.setStepColor(BoxColor.TwillRed);
        figure.setFollowingStepColor(BoxColor.Red);
    }

    public void setStepColor_TwillRed_Green(Figure figure) {
        figure.setStepColor(BoxColor.TwillRed);
        figure.setFollowingStepColor(BoxColor.Green);
    }

    public void setStepColor_TwillGreen_TwillGreen(Figure figure) {
        //None in Syllabus.
    }

    public void setStepColor_TwillGreen_TwillRed(Figure figure) {
        figure.setStepColor(BoxColor.TwillGreen);
        figure.setFollowingStepColor(BoxColor.TwillRed);
    }

    public void setStepColor_TwillRed_TwillRed(Figure figure) {
        figure.setStepColor(BoxColor.TwillRed);
        figure.setFollowingStepColor(BoxColor.TwillRed);
    }

    public void setStepColor_TwillGreen_Blue(Figure figure) {
        figure.setStepColor(BoxColor.TwillGreen);
        figure.setFollowingStepColor(BoxColor.Blue);
    }

    public void setStepColor_TwillRed_Blue(Figure figure) {
        figure.setStepColor(BoxColor.TwillRed);
        figure.setFollowingStepColor(BoxColor.Blue);
    }

    public void setStepColor_Blue_Green(Figure figure) {
        figure.setStepColor(BoxColor.Blue);
        figure.setFollowingStepColor(BoxColor.Green);
    }

    public void setStepColor_Blue_Red(Figure figure) {
        figure.setStepColor(BoxColor.Blue);
        figure.setFollowingStepColor(BoxColor.Red);
    }

    public void setStepColor_Blue_TwillGreen(Figure figure) {
        //None in Syllabus.
    }

    public void setStepColor_Blue_TwillRed(Figure figure) {
        figure.setStepColor(BoxColor.Blue);
        figure.setFollowingStepColor(BoxColor.TwillRed);
    }

    public void setStepColor_Blue_Blue(Figure figure) {
        figure.setStepColor(BoxColor.Blue);
        figure.setFollowingStepColor(BoxColor.Blue);
    }

    public void setStepColor_TwillRed_TwillGreen(Figure figure) {
        figure.setStepColor(BoxColor.TwillRed);
        figure.setFollowingStepColor(BoxColor.TwillGreen);
    }
}
