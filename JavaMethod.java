public class JavaMethod{

    public static void main(String[] args){
        System.out.println(validateNumber(40));
    }

    static void myMethod(){
        System.out.println("methode execute");
    }

    static void delete(int angka){
        System.out.println("berhasil menghapus mahasiswa " + angka);
    }
    static void human(String nama, int umur){
        System.out.println("nama :" + nama + ", umur ;" + umur);
    }
    static boolean validateNumber(int angka) {
        if(angka > 20){
            return true;
        }else{
            return false;
        }
    }
}