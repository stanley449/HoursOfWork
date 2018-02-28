
package hoursofwork;
import java.util.Scanner;
public class HoursOfWork {
    public static void main(String[] args) {
        int k=0;
        int nametime = 0;
        int monthDay;
        menber[] menbers = new menber[10];
        while(k==0){
            System.out.println("1.新建員工上下班紀錄");
            System.out.println("2.查看員工上下班紀錄");
            System.out.println("3.修改員工上下班紀錄");
            System.out.println("4.薪資設定");
            System.out.println("0.離開");
            System.out.print("-->");

            Scanner input = new Scanner(System.in);
            int console = input.nextInt();

            switch(console){
                case 1:
                    System.out.print("請輸入當月天數:");
                    monthDay = input.nextInt();
                    System.out.print("姓名:");
                    menbers[nametime++] = new menber(input.next());
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;
                
                case 0:
                    k = 1;
                    break;
                default:
                    System.out.println("輸入錯誤，請重新輸入\n");
            }
        }
    }
    
}
