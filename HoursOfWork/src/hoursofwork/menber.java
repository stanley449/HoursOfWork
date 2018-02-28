
package hoursofwork;
import java.util.Scanner;
public class menber {
    String name;
    double[][] workingTime = new double[40][2];
    Scanner input = new Scanner(System.in);
    menber(String name ){
        name = this.name;
    }
    
    void inputWorkingTime(int monthDay){
        for(int i = 0; i < monthDay; i++){
            System.out.print("上班:");
            System.out.print("下班:");
        }
    }
}
