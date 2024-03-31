public class Logika {
    Player hrac1 = new Player();
    Player hrac2 = new Player();

    public void vypocet(){
        if(hrac1.body == 4 && hrac2.body <= 2){
            hrac1.gemy++;
            hrac1.body = 0;
            hrac2.body = 0;
        }else if(hrac2.body == 4 && hrac1.body <= 2){
            hrac2.gemy++;
            hrac2.body = 0;
            hrac1.body = 0;
        }else if(hrac1.gemy >= 6 && hrac1.gemy - hrac2.gemy >= 2){
            hrac1.sety++;
            hrac1.gemy = 0;
            hrac2.gemy = 0;
        }else if(hrac2.gemy >= 6 && hrac2.gemy - hrac1.gemy >=2){
            hrac2.sety++;
            hrac2.gemy = 0;
            hrac1.gemy = 0;
        }else if(hrac1.body == 4 && hrac2.body == 4){
            hrac1.body = 3;
            hrac2.body = 3;
        }else if(hrac1.body == 5){
            hrac1.gemy++;
            hrac1.body = 0;
            hrac2.body = 0;
        }else if(hrac2.body == 5){
            hrac2.gemy++;
            hrac1.body = 0;
            hrac2.body = 0;
        }
    }

}
