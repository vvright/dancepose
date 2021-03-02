package dance;

import lombok.Data;

import java.util.Scanner;

@Data
class BallroomDanceRoutine {

    public Routine generateVienneseWaltzRoutine(){
        Routine routine = new Routine();
        return routine;
    }

    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("Ballroom Dance Rootine");
        System.out.println("======================");

        Scanner cmdLine = new Scanner(System.in);
        while (cmdLine.hasNext()){
            Integer bar = new Integer(cmdLine.next());
            if(bar >= 1 && bar <= 32) {
                System.out.println(bar);
            }
        }
    }
}