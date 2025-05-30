
public class Practice{
    // call my name and say hi Bhavneet you win ....that lottery jackpot for 100 Millions Dollars $$ .
   public static void iWin(int i){
    for(int k=0; k<=i;k++){
        System.out.println("Bhavneet you win ....that lottery jackpot for 100 Millions Dollars $$ " + " Thanks universe " + k+"times");
    }
    }

    public static void main(String[] args) {
      float[] floats = new float[3];
        boolean[] bools = new boolean[3];
        char[] chars = new char[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("float[" + i + "]: " + floats[i]);   // 0.0
            System.out.println("boolean[" + i + "]: " + bools[i]); // false
            System.out.println("char[" + i + "]: [" + chars[i] + "]"); // Looks empty
    }
}
}