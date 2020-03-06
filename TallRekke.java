import java.util.ArrayList;

class TallRekke {
    ArrayList<Tall> tallrekke = new ArrayList<Tall>();
    int antall;
    int teller = 0;

    public TallRekke(int a){
        antall = a;

    }

    public void leggTil(Tall t){

        if (tallrekke.size() <= antall){
            tallrekke.add(t);
            teller ++;
        }else{System.out.println("Ikke plass");}
    }



}
