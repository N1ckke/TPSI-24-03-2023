public class Base extends Thread{
    private String name;
    private int nRequest;
    private int time;
    private Magazzino mag;

    public Base(String name, int nRequest, int time, Magazzino m){
        this.name = name;
        this.nRequest = nRequest;
        this.time = time;
        mag = m;
    }

    public synchronized int getNumberOfRequest(){
        return nRequest;
    }
    public synchronized String getNameOfTheBAse(){
        return name;
    }@Override
    public void run(){

        if(mag.getNumberOfAirplane() == 10){
            for(int i = 0; i < this.getNumberOfRequest() ; i ++) {
                mag.getPlane(this.getNumberOfRequest(), this.getNameOfTheBAse());
                notifyAll();
            }
        }
    }
}
