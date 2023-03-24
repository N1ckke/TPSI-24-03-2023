import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Magazzino{
    private ArrayList<Aereo> plane;
    public Magazzino(){
        plane = new ArrayList<Aereo>();

    }
    public synchronized void newPlane(String name){
        while(getNumberOfAirplane() == 10 ){
            try {
                wait();
            } catch (InterruptedException e) {
                ;   //  TMCH
            }
        }
        notifyAll();
        plane.add(new Aereo(name));
    }
    public synchronized int getNumberOfAirplane(){
        return plane.size();
    }
    public synchronized void getPlane(int numberOfRequest, String name){
        while(getNumberOfAirplane() < 10){
            try {
                wait();
            } catch (InterruptedException e) {
                ;   //  TMCH
            }
        }
        notifyAll();
        for(int i = 0; i < numberOfRequest; i ++)
            plane.remove(i);
        System.out.println("Consegnati " + numberOfRequest + "aerei alla base militare: " + name);

    }

}