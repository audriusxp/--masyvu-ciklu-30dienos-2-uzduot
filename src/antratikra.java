import java.util.ArrayList;
import java.util.Scanner;

public class antratikra {
    public static void main(String[] args) {
        ArrayList<Double>masyvas=nuskaitytiSkaicius();
        System.out.println("masyvas = " + masyvas);
        int didesni= didesnisUzPirma(masyvas);
        System.out.println("didesni = " + didesni);

    }
    public static ArrayList<Double>  nuskaitytiSkaicius(){
            ArrayList<Double>skaiciai= new ArrayList<>();
            Scanner skaitytuvas = new Scanner(System.in);
            System.out.println("iveskite kiek skaiciu bus sarase " + skaiciai);
            int n= skaitytuvas.nextInt();
            for (int i = 0; i <n ; i++) {
                skaiciai.add((double) skaitytuvas.nextInt());{

                }
            }
        return skaiciai;
    }
    public static int didesnisUzPirma(ArrayList<Double>skaiciai){
            double didesni = skaiciai.get(0);
        for ( double skaicius : skaiciai) {
            if ( skaicius >  didesni) {
                didesni += 1;

            }
        }

        return  didesni;
    } 


}




