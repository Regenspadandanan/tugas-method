public class TugasMethod {
public static void main(String[] args){
    skor(55);
}
    static void skor(int nilai) {
     if(nilai>=100) {
            System.out.println("invalid number");
        } else if (nilai>=91) {
            System.out.println("Nilai anda; A");    
        } else if (nilai>=76) {
            System.out.println("Nilai anda; B");
        } else if (nilai>=51){
            System.out.println("Nilai anda; C");
        } else if (nilai>=26) {
            System.out.println("Nilai anda; D");
        } else if (nilai>=0) {
            System.out.println("Nilai anda; E");
        }
    }
}