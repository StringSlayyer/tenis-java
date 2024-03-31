public class Main {
    public static void main(String[] args) {

        Logika vypocet = new Logika();
        Text text = new Text();
        Vstupy vstup = new Vstupy();
        int x = 1;
        int input;

        while(vypocet.hrac1.sety < 2 && vypocet.hrac2.sety < 2) {
            for (int i = 0; i < x; i++) {
                input = vstup.input();
                if (input < 1 || input > 2) {
                    x++;
                } else {
                    if (input == 1) {
                        vypocet.hrac1.body++;
                    }
                    if (input == 2) {
                        vypocet.hrac2.body++;
                    }
                    vypocet.vypocet();
                    text.stav(vypocet);
                    break;
                    }
                }

            }
        if(vypocet.hrac1.sety == 2){
            text.vyhra1();
        }else{
            text.vyhra2();
        }
    }
}
