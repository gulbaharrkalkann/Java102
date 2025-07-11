package Generic.GenerizMetotlar;

public class Print {

    public static <T> void printArray(T[] array) {
        for (T i: array) {
            System.out.println(i);
        }
    }
    //Bİz bu kod satırını yazarak aşağıdaki kod karmaşasından kendimizi kurtarmış oluyoruz;
    /*

        for (String i: a){
            System.out.println(i);
        }
        for (Integer i: b){
            System.out.println(i);
        }
        for (Character i: c){
            System.out.println(i);
        }
     */
}
