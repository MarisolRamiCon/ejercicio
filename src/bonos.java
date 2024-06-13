import java.util.Scanner;
public class bonos {
    public static void main(String[] args){
        Scanner re=new Scanner(System.in);
        System.out.println("Introduce tus retardos");
        int Retardos= re.nextInt();
        switch(Retardos){
            case 0:
                System.out.println("Eres acreedor al bono de puntualidad");
                break;
            case 1:
                System.out.println("Se te descontará el día");
                break;
            case 3:
                System.out.println("Suspensión al final del mes.");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
}
