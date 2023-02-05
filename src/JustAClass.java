/**
 * Created by aos on 26.04.2017.
 * Updated by aos on 17.02.2021.
 */
public class JustAClass {

    //TODO: Arbeite die Methoden von oben nach unten ab. Teste immer über die Klasse MainProgramm, ob die Methode das gewünschte liefert.
    /**
     * Bestimmt eine zufällige ganze Zahl zwischen 1 und 6 (Grenzen einschließlich).
     * @return
     */
    private int getRandom(){
        int rand = (int)(Math.random()*6) + 1;
        System.out.println("Random: " + rand);
        return rand;
    }


    /**
     * Summiert bis zur Zahl n einschließlich alle ganzen Zahlen auf und
     * gibt die Summe zurück.
     * @param n
     * @return
     */
    public int sumUpIt(int n){
        int sum = 0;

        for(int i = n; i != 0;){
            sum+=i;

            if(i<0) i++;
            else i--;
        }

        return sum;
    }

    /**
     * Summiert bis zur Zahl n einschließlich alle ganzen Zahlen auf und
     * gibt die Summe zurück.
     * @param n
     * @return
     */
    public int sumUpRek(int n){
        int sum = 0;

        if(n != 0){
            sum += n;

            if(n>0){
                sum += sumUpRek(n-1);
            }else{
                sum += sumUpRek(n+1);
            }
        }


        return sum;
    }

    /**
     * Bestimmt n zufällige Ergebnisse zwischen 1 und 6 (Grenzen einschließlich),
     * summiert diese auf und gibt die Summe zurück.
     * @param n
     * @return
     */
    public int sumUpRandomIt(int n){
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += getRandom();
        }

        return sum;
    }

    /**
     * Bestimmt n zufällige Ergebnisse zwischen 1 und 6 (Grenzen einschließlich),
     * summiert diese auf und gibt die Summe zurück.
     * @param n
     * @return
     */
    public int sumUpRandomRek(int n){
        return 0;
    }

    /**
     * Bestimmt n zufällige positive, ganze Zahlen zwischen 1 und 6.
     * Gibt die größte dieser zufälligen Zahlen zurück.
     * @param n
     * @return die größte zufällig Zahl, die im Verlauf der Methode erstellt wurde.
     */
    public int biggestOfRandomIt(int n){
        return -1;
    }

    /**
     * Bestimmt n zufällige positive, ganze Zahlen zwischen 1 und 6.
     * Gibt die größte dieser zufälligen Zahlen zurück.
     * @param n
     * @return die größte zufällig Zahl, die im Verlauf der Methode erstellt wurde.
     */
    public int biggestOfRandomRek(int n){
        return -1;
    }

    /**
     * Ein Klassiker und den rekursiv zu implementeirenden Methoden ist die Fibonacci-Zahlenfolge: 1, 1, 2, 3, 5, 8, 13, 21, ...
     * Hierbei gilt:
     *    für n = 1 wird 1 zurückgegeben
     *    für n = 2 wird 1 zurückgegeben
     *    für n > 2 wird fib(n-1) + fib(n-2) zurückgegeben.
     * @param n
     * @return die n-te Fibonacci-Zahl
     */
    public int fib(int n){
        return -1;
    }
}
