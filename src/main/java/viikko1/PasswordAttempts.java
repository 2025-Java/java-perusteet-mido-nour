package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        // TODO

        String oikeasalasana ="java123";

        for(int i=0; i<3; i++){
            if (i < tries.length){
                if(tries[i] == (oikeasalasana)){
                 return "Tervetuloa!";
            }
        }
        }
        return "Liian monta virheellistä yritystä.";
    }
}

/*### 4. Salasanayritykset (`PasswordAttempts`)
Metodi `public static String login(String[] tries)` — oikea salasana on `java123`. 
Tarkista **enintään kolme** ensimmäistä yritystä.
- Palauta `Tervetuloa!` jos jokin niistä on oikein.
- Muuten `Liian monta virheellistä yritystä.` */