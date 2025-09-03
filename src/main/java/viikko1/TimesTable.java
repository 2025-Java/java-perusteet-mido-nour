package viikko1;

public class TimesTable {
    public static String table(int n) {
        // TODO
    String rivinvaihto="";
        for ( int i=1; i<=10; i++){
        int tulos= n * i;
        rivinvaihto += n + " x " + i + " = " + tulos;

        if (i < 11){
         rivinvaihto += "\n";

        }
    }

            
            return rivinvaihto;
      
    }
}

/*### 3. Kertotaulu (`TimesTable`)
Metodi `public static String table(int n)` palauttaa n:n kertotaulun 1..10, 
rivit muodossa `n x i = tulos` ja jokaisen rivin lopussa `\n`.
 */