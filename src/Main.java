public class Main {
    public static void main(String[] args) {
        coche micoche = new coche();
        micoche.aumentarpuertas();
        micoche.aumentarpuertas();
        micoche.aumentarpuertas();
        System.out.println(micoche.puertas);
    }



}
class coche {
    public int puertas = 4;
    public void aumentarpuertas(){
        this.puertas++;
    }
}
