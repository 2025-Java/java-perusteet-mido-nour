package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        // TODO
        if(arr.length == 0){
        return 0.0;
        }

        int summa=0;
        for (int i=0; i< arr.length; i++){
            summa = summa + arr[i];

        }

        double keskiarvo= (double)summa/ arr.length;
        return keskiarvo;
    }
    public static int max(int[] arr) {
        // TODO
        if (arr.length ==0){
        return Integer.MIN_VALUE;
        }
        int max=0;
        for( int i =0; i< arr.length; i++){
            if (arr[i]>max){
            max= arr[i];
            }
        }
        return max;
    }
}
/* 5. Taulukon keskiarvo ja maksimi (`ArrayStats`)
- `public static double average(int[] arr)` — palauta keskiarvo `double`-tyyppisenä, tyhjän taulukon tapauksessa `0.0`.
- `public static int max(int[] arr)` — palauta suurin arvo, tyhjän taulukon tapauksessa `Integer.MIN_VALUE`.
 */

