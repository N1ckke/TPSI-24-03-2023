public class Main {
    public static void main(String[] args) {
        Magazzino m = new Magazzino();
        Base[] b = new Base[3];
        Fabbrica f0 = new Fabbrica("Alfa", 500, 800, m);
        Fabbrica f1 = new Fabbrica("Bravo", 450, 400, m);
        Fabbrica f2 = new Fabbrica("Charlie", 600, 300, m);
        Fabbrica f3 = new Fabbrica("Delta", 350, 600, m);
        Fabbrica f4 = new Fabbrica("Echo", 720, 200, m);
        b[0] = new Base("Marines", 3, 2000, m);
        b[1] = new Base("US Navy", 5, 2300, m);
        b[2] = new Base("Air Force", 7, 1500, m);
        f0.start();
        f1.start();
        f2.start();
        f3.start();
        f4.start();
        for(int i = 0; i < 3; i ++)
            b[i].start();
    }
}