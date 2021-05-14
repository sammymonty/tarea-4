
/**
 * Write a description of class TAREA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TAREA
{
    public int termino(int n){
        int numeroAn = 1;
        int numeroAc = 1;
        System.out.print(numeroAc + " ");
        for(int i = 0; i <= n ; i++){
            numeroAc = numeroAn + 1;
            System.out.print(numeroAc + " ");
            numeroAn= numeroAc;
            numeroAc = numeroAn +2;
            System.out.print(numeroAc + " ");
            numeroAn= numeroAc;
            numeroAc = numeroAn +3;
            System.out.print(numeroAc + " ");
            numeroAn= numeroAc;
            numeroAc = numeroAn +2;
            System.out.print(numeroAc + " ");
            numeroAn= numeroAc;
                    }
        return numeroAc;
    }
        public int padovan(int n){
        int numeroAnt = 1;
        System.out.print(numeroAnt + " ");
        int numeroAnt2 = 1;
        System.out.print(numeroAnt2 + " ");
        int numeroAnt3 = 1;
        System.out.print(numeroAnt3 + " ");
        int actual = 0;
        for(int i = 0; i <= n; i++){
            actual = numeroAnt2 + numeroAnt3;
            System.out.print(actual + " ");
            numeroAnt3 = numeroAnt2;
            numeroAnt2 = numeroAnt;
            numeroAnt  = actual;
        }
        return actual;
    }


}
