package dance;

import dance.ballroom.figure.Figure;
import dance.ballroom.syllabus.WaltzFigures;
import lombok.Data;

import java.util.Scanner;

@Data
public class Rootine {
    private Integer bar;//小节
    private Figure[] figures;
    private String line;//"ABCD","ABC","AB","A"

    private WaltzFigures waltzFigures;

    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println("你输入了：" + str);
        }
    }
}
