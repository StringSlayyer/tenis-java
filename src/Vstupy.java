import java.util.Scanner;

public class Vstupy {
    Scanner sc = new Scanner(System.in,"UTF-8");

    Text text = new Text();

    public int input(){
        text.otazky();
        int skener = sc.nextInt();
        return skener;
    }

}
