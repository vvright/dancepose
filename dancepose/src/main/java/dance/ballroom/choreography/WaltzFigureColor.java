package dance.ballroom.choreography;

import dance.ballroom.figure.Figure;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class WaltzFigureColor implements FigureColor {

    @Override
    public void setStepColor_Green_Green(Figure figure) {
        figure.setColor(BoxColor.Green);
        figure.setFollowingColor(BoxColor.Green);
    }

    @Override
    public void setStepColor_Green_Red(Figure figure) {
        figure.setColor(BoxColor.Green);
        figure.setFollowingColor(BoxColor.Red);
    }

    @Override
    public void setStepColor_Red_Red(Figure figure) {
        figure.setColor(BoxColor.Red);
        figure.setFollowingColor(BoxColor.Red);
    }

    @Override
    public void setStepColor_Red_Green(Figure figure) {
        figure.setColor(BoxColor.Red);
        figure.setFollowingColor(BoxColor.Green);
    }

    @Override
    public void setStepColor_Green_TwillGreen(Figure figure) {
        figure.setColor(BoxColor.Green);
        figure.setFollowingColor(BoxColor.TwillGreen);
    }

    @Override
    public void setStepColor_Green_TwillRed(Figure figure) {
        figure.setColor(BoxColor.Green);
        figure.setFollowingColor(BoxColor.TwillRed);
    }

    @Override
    public void setStepColor_Red_TwillRed(Figure figure) {
        figure.setColor(BoxColor.Red);
        figure.setFollowingColor(BoxColor.TwillRed);
    }

    @Override
    public void setStepColor_Red_TwillGreen(Figure figure) {
        figure.setColor(BoxColor.Red);
        figure.setFollowingColor(BoxColor.TwillGreen);
    }

    @Override
    public void setStepColor_Red_Blue(Figure figure) {
        figure.setColor(BoxColor.Red);
        figure.setFollowingColor(BoxColor.Blue);
    }

    @Override
    public void setStepColor_Green_Blue(Figure figure) {
        figure.setColor(BoxColor.Green);
        figure.setFollowingColor(BoxColor.Blue);
    }

    @Override
    public void setStepColor_TwillGreen_Green(Figure figure) {
        figure.setColor(BoxColor.TwillGreen);
        figure.setFollowingColor(BoxColor.Green);
    }

    @Override
    public void setStepColor_TwillGreen_Red(Figure figure) {
        figure.setColor(BoxColor.TwillGreen);
        figure.setFollowingColor(BoxColor.Red);
    }

    @Override
    public void setStepColor_TwillRed_Red(Figure figure) {
        figure.setColor(BoxColor.TwillRed);
        figure.setFollowingColor(BoxColor.Red);
    }

    @Override
    public void setStepColor_TwillRed_Green(Figure figure) {
        figure.setColor(BoxColor.TwillRed);
        figure.setFollowingColor(BoxColor.Green);
    }

    @Override
    public void setStepColor_TwillGreen_TwillGreen(Figure figure) {
        //None in Syllabus.
    }

    @Override
    public void setStepColor_TwillGreen_TwillRed(Figure figure) {
        figure.setColor(BoxColor.TwillGreen);
        figure.setFollowingColor(BoxColor.TwillRed);
    }

    @Override
    public void setStepColor_TwillRed_TwillRed(Figure figure) {
        figure.setColor(BoxColor.TwillRed);
        figure.setFollowingColor(BoxColor.TwillRed);
    }

    @Override
    public void setStepColor_TwillGreen_Blue(Figure figure) {
        figure.setColor(BoxColor.TwillGreen);
        figure.setFollowingColor(BoxColor.Blue);
    }

    @Override
    public void setStepColor_TwillRed_Blue(Figure figure) {
        figure.setColor(BoxColor.TwillRed);
        figure.setFollowingColor(BoxColor.Blue);
    }

    @Override
    public void setStepColor_Blue_Green(Figure figure) {
        figure.setColor(BoxColor.Blue);
        figure.setFollowingColor(BoxColor.Green);
    }

    @Override
    public void setStepColor_Blue_Red(Figure figure) {
        figure.setColor(BoxColor.Blue);
        figure.setFollowingColor(BoxColor.Red);
    }

    @Override
    public void setStepColor_Blue_TwillGreen(Figure figure) {
        //None in Syllabus.
    }

    @Override
    public void setStepColor_Blue_TwillRed(Figure figure) {
        figure.setColor(BoxColor.Blue);
        figure.setFollowingColor(BoxColor.TwillRed);
    }

    @Override
    public void setStepColor_Blue_Blue(Figure figure) {
        figure.setColor(BoxColor.Blue);
        figure.setFollowingColor(BoxColor.Blue);
    }

    @Override
    public void setStepColor_TwillRed_TwillGreen(Figure figure) {
        figure.setColor(BoxColor.TwillRed);
        figure.setFollowingColor(BoxColor.TwillGreen);
    }
}
