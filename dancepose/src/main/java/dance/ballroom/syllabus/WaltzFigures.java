package dance.ballroom.syllabus;

import dance.ballroom.choreography.WaltzFigureColor;
import dance.ballroom.figure.Figure;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ouwakamatsu
 * @description England Slow Waltz
 */
@Data
@Component
public class WaltzFigures {

    /**
     * 1
     */
    @Autowired
    public Figure Prep_Step;

    /**
     * PreBronze
     */
    @Autowired
    public Figure RF_Closed_Change;
    @Autowired
    public Figure LF_Closed_Change;

    @Autowired
    public Figure Natural_Turn;
    @Autowired
    public Figure Natural_Turn_1_3;
    @Autowired
    public Figure Natural_Turn_4_6;

    @Autowired
    public Figure Open_Natural_Turn;//CDSF Bronze
    @Autowired
    public Figure Open_Natural_Turn_from_PP;//DTV
    @Autowired
    public Figure Fallaway_Natural_Turn;//IDTA Gold

    @Autowired
    public Figure Reverse_Turn;
    @Autowired
    public Figure Reverse_Turn_1_3;
    @Autowired
    public Figure Reverse_Turn_4_6;

    @Autowired
    public Figure Natural_Spin_Turn;
    @Autowired
    public Figure Underturned_Natural_Spin_Turn;//variation
    @Autowired
    public Figure Quick_Natural_Spin_Turn;//IDTA Additional

    @Autowired
    public Figure Whisk;
    @Autowired
    public Figure Chasse_from_PP;//16

    /**
     * Bronze
     */
    @Autowired
    public Figure Closed_Impetus;
    @Autowired
    public Figure Hesitation_Change;
    @Autowired
    public Figure Outside_Change;
    @Autowired
    public Figure Outside_Change_to_PP;
    @Autowired
    public Figure Reverse_Corte;
    @Autowired
    public Figure Back_Whisk;
    @Autowired
    public Figure Basic_Weave;

    /**
     * variation
     */
    @Autowired
    public Figure Basic_Weave_to_PP;


    @Autowired
    public Figure Double_Reverse_Spin;
    @Autowired
    public Figure Reverse_Pivot;
    @Autowired
    public Figure Back_Lock;
    @Autowired
    public Figure Forward_Lock_Step;//IDTA
    @Autowired
    public Figure Progressive_Chasse_to_Right;//29

    /**
     * Silver
     */
    @Autowired
    public Figure Weave_from_PP;
    @Autowired
    public Figure Weave_from_PP_ending_in_PP;//variation
    @Autowired
    public Figure Closed_Telemark;
    @Autowired
    public Figure Open_Telemark;
    @Autowired
    public Figure Open_Impetus;
    @Autowired
    public Figure Cross_Hesitation;
    @Autowired
    public Figure Wing;
    @Autowired
    public Figure Outside_Spin;
    @Autowired
    public Figure Turning_Lock;
    @Autowired
    public Figure Turning_Lock_ended_in_PP;
    @Autowired
    public Figure Drag_Hesitation;
    @Autowired
    public Figure Underturned_Outside_Spin;//41

    /**
     * Gold
     */
    @Autowired
    public Figure Left_Whisk;
    @Autowired
    public Figure Left_Whisk_from_PP;//variation
    @Autowired
    public Figure Contra_Check;
    @Autowired
    public Figure Closed_Wing;
    @Autowired
    public Figure Turning_Lock_to_Right;
    @Autowired
    public Figure Turning_Lock_to_Right_Closed;//variation
    @Autowired
    public Figure Fallaway_Reverse_and_Slip_Pivot;
    @Autowired
    public Figure Hover_Corte;
    @Autowired
    public Figure Fallaway_Whisk;
    @Autowired
    public Figure Running_Spin_Turn;//51

    @Autowired
    public Set<Figure> figures;

    @Autowired
    public WaltzFigures(WaltzFigureColor waltzFigureColor) {
        initWaltzFigures(waltzFigureColor);

    }

    public static void main(String[] args) {
//        WaltzFigureColor waltzFigureColor = new WaltzFigureColor();
//        WaltzFigures waltzFigures = new WaltzFigures(waltzFigureColor);
//        ... ...
    }

    @Autowired
    @PostConstruct
    private void initWaltzFigures(WaltzFigureColor waltzFigureColor) {
        setWaltzFigureColor(waltzFigureColor);
        figures.add(Prep_Step);
        figures.add(Natural_Turn);
        figures.add(Forward_Lock_Step);
        figures.add(Reverse_Turn);
        figures.add(Double_Reverse_Spin);
        figures.add(Fallaway_Reverse_and_Slip_Pivot);
        figures.add(LF_Closed_Change);
        figures.add(Hesitation_Change);
        figures.add(Closed_Wing);
        figures.add(Quick_Natural_Spin_Turn);
        figures.add(RF_Closed_Change);
        figures.add(Closed_Telemark);
        figures.add(Natural_Spin_Turn);
        figures.add(Underturned_Natural_Spin_Turn);
        figures.add(Progressive_Chasse_to_Right);
        figures.add(Drag_Hesitation);
        figures.add(Natural_Turn_1_3);
        figures.add(Reverse_Turn_1_3);
        figures.add(Whisk);
        figures.add(Open_Telemark);
        figures.add(Contra_Check);
        figures.add(Basic_Weave);
        figures.add(Turning_Lock);
        figures.add(Turning_Lock_to_Right_Closed);
        figures.add(Reverse_Turn_4_6);
        figures.add(Reverse_Pivot);
        figures.add(Natural_Turn_4_6);
        figures.add(Outside_Change);
        figures.add(Outside_Spin);
        figures.add(Back_Lock);
        figures.add(Reverse_Corte);
        figures.add(Left_Whisk);
        figures.add(Hover_Corte);
        figures.add(Closed_Impetus);
        figures.add(Underturned_Outside_Spin);
        figures.add(Basic_Weave_to_PP);
        figures.add(Turning_Lock_ended_in_PP);
        figures.add(Turning_Lock_to_Right);
        figures.add(Outside_Change_to_PP);
        figures.add(Back_Whisk);
        figures.add(Open_Impetus);
        figures.add(Fallaway_Whisk);
        figures.add(Chasse_from_PP);
        figures.add(Weave_from_PP);
        figures.add(Fallaway_Natural_Turn);
        figures.add(Wing);
        figures.add(Cross_Hesitation);
        figures.add(Left_Whisk_from_PP);
        figures.add(Open_Natural_Turn_from_PP);
        figures.add(Weave_from_PP_ending_in_PP);
        figures.add(Running_Spin_Turn);
    }

    @Autowired
    private void setWaltzFigureColor(WaltzFigureColor waltzFigureColor) {
        waltzFigureColor.setStepColor_Red_Green(Prep_Step);
        waltzFigureColor.setStepColor_Green_Green(Natural_Turn);
        waltzFigureColor.setStepColor_Green_Green(Forward_Lock_Step);

        waltzFigureColor.setStepColor_Red_Red(Reverse_Turn);
        waltzFigureColor.setStepColor_Red_Red(Double_Reverse_Spin);
        waltzFigureColor.setStepColor_Red_Red(Fallaway_Reverse_and_Slip_Pivot);

        waltzFigureColor.setStepColor_Green_Red(LF_Closed_Change);//Natural to Reverse
        waltzFigureColor.setStepColor_Green_Red(Hesitation_Change);
        waltzFigureColor.setStepColor_Green_Red(Closed_Wing);
        waltzFigureColor.setStepColor_Green_Red(Quick_Natural_Spin_Turn);
        waltzFigureColor.setStepColor_Red_Green(RF_Closed_Change);//Reverse to Natural
        waltzFigureColor.setStepColor_Red_Green(Closed_Telemark);

        waltzFigureColor.setStepColor_Green_TwillGreen(Natural_Spin_Turn);
        waltzFigureColor.setStepColor_Green_TwillGreen(Underturned_Natural_Spin_Turn);

        waltzFigureColor.setStepColor_Red_TwillRed(Progressive_Chasse_to_Right);
        waltzFigureColor.setStepColor_Red_TwillRed(Drag_Hesitation);

        waltzFigureColor.setStepColor_Green_TwillRed(Natural_Turn_1_3);

        waltzFigureColor.setStepColor_Red_TwillGreen(Reverse_Turn_1_3);

        waltzFigureColor.setStepColor_Red_Blue(Whisk);
        waltzFigureColor.setStepColor_Red_Blue(Open_Telemark);
        waltzFigureColor.setStepColor_Red_Blue(Contra_Check);

        waltzFigureColor.setStepColor_TwillGreen_Green(Basic_Weave);
        waltzFigureColor.setStepColor_TwillGreen_Green(Turning_Lock);
        waltzFigureColor.setStepColor_TwillGreen_Green(Turning_Lock_to_Right_Closed);

        waltzFigureColor.setStepColor_TwillGreen_Red(Reverse_Turn_4_6);
        waltzFigureColor.setStepColor_TwillGreen_Red(Reverse_Pivot);

        waltzFigureColor.setStepColor_TwillRed_Green(Natural_Turn_4_6);
        waltzFigureColor.setStepColor_TwillRed_Green(Outside_Change);
        waltzFigureColor.setStepColor_TwillRed_Green(Outside_Spin);

        waltzFigureColor.setStepColor_TwillRed_TwillRed(Back_Lock);

        waltzFigureColor.setStepColor_TwillGreen_TwillRed(Reverse_Corte);
        waltzFigureColor.setStepColor_TwillGreen_TwillRed(Left_Whisk);
        waltzFigureColor.setStepColor_TwillGreen_TwillRed(Hover_Corte);

        waltzFigureColor.setStepColor_TwillRed_TwillGreen(Closed_Impetus);
        waltzFigureColor.setStepColor_TwillRed_TwillGreen(Underturned_Outside_Spin);

        waltzFigureColor.setStepColor_TwillGreen_Blue(Basic_Weave_to_PP);
        waltzFigureColor.setStepColor_TwillGreen_Blue(Turning_Lock_ended_in_PP);
        waltzFigureColor.setStepColor_TwillGreen_Blue(Turning_Lock_to_Right);

        waltzFigureColor.setStepColor_TwillRed_Blue(Outside_Change_to_PP);
        waltzFigureColor.setStepColor_TwillRed_Blue(Back_Whisk);
        waltzFigureColor.setStepColor_TwillRed_Blue(Open_Impetus);
        waltzFigureColor.setStepColor_TwillRed_Blue(Fallaway_Whisk);

        waltzFigureColor.setStepColor_Blue_Green(Chasse_from_PP);
        waltzFigureColor.setStepColor_Blue_Green(Weave_from_PP);
        waltzFigureColor.setStepColor_Blue_Green(Fallaway_Natural_Turn);

        waltzFigureColor.setStepColor_Blue_Red(Wing);

        waltzFigureColor.setStepColor_Blue_TwillRed(Cross_Hesitation);
        waltzFigureColor.setStepColor_Blue_TwillRed(Left_Whisk_from_PP);
        waltzFigureColor.setStepColor_Blue_TwillRed(Open_Natural_Turn_from_PP);

        waltzFigureColor.setStepColor_Blue_Blue(Weave_from_PP_ending_in_PP);

        waltzFigureColor.setStepColor_TwillRed_TwillGreen(Running_Spin_Turn);
    }

    public Set<Figure> findFollowingFiguresByFigure(Figure figure) {
        Set<Figure> followingFigures = new HashSet<>();
        for (Figure f : figures) {
            //right box color is left box color of following figure
            if (figure.followingColor == f.color) {
                followingFigures.add(f);
            }
        }
        return followingFigures;
    }

    public Set<Figure> findPrecedingFiguresByFigure(Figure figure) {
        Set<Figure> precedingFigures = new HashSet<>();
        for (Figure f : figures) {
            //left box color is right box color of preceding figure
            if (figure.color == f.followingColor) {
                precedingFigures.add(f);
            }
        }
        return precedingFigures;
    }
}
