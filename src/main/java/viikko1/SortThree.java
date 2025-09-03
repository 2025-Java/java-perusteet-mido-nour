package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        // TODO
   int min;
   int mid;
   int max;

   if(a>= b && a>=c){
    max =a;
    if(b>=c){
        mid=b;
        min=c;
    }
    else{
        mid=c;
        min=b;
    }
   } else if(b>= a && b>=c) {
    max =b;
    if(c>=a){
        mid=c;
        min=a;
    }
    else{
        mid=a;
        min=c;
    }

   }else {
    max =c;
    if(a>=b){
        mid=a;
        min=b;
    }
    else{
        mid=b;
        min=a;
    }

   }

 return min+ ","+mid+","+max;
}
}
/*### 2. Kolmen luvun järjestäminen (`SortThree`)
Metodi `public static String ascending(int a, int b, int c)` 
palauttaa luvut nousevassa järjestyksessä muodossa `a,b,c` (ei välilyöntejä). */