public class Fabbrica extends Thread {
    private String name;
    private int productionTime;
    private int distance;
    private Magazzino mag;
    public Fabbrica(String name, int productioTime, int distance, Magazzino m) {
        this.name = name;
        this.productionTime = productioTime;
        this.distance = distance;
        mag = m;
    }

    @Override
    public void run() {

        for (int i = 0; ; i++) {
            try {
                sleep((int) (productionTime + (distance * 0.1)));
            } catch (InterruptedException e) {
                ;   //  TMCH
            }
            mag.newPlane(name + i);

        }

    }

}