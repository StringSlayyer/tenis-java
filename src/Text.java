public class Text {

    String otazka = "Kdo dal bod? Jestli první, zadejte číslo 1, jestli druhý, zadejte číslo 2.";

    public void otazky(){
        System.out.println(otazka);
    }

    public void stav(Logika logika){
        System.out.println("Aktuální skoré: " + logika.hrac1.body2[logika.hrac1.body] + ":" + logika.hrac2.body2[logika.hrac2.body] + "/" + logika.hrac1.gemy + ":" + logika.hrac2.gemy + "/" + logika.hrac1.sety + ":" + logika.hrac2.sety);
    }

    public void vyhra1(){
        System.out.println("Vyhrál hráč číslo 1");
    }

    public void vyhra2(){
        System.out.println("Vyhrál hráč číslo 2");
    }


}
