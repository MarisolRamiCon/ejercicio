import java.util.Scanner;
public class condicionales {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();
        if(edad>=18 && edad<65) {
            System.out.println("Eres mayor de edad");
            if(edad >60){
                System.out.println("No puedes tramitar un préstamo");
            }
        }else if(edad>=65){
            System.out.println("Eres adulto mayor");
        } else{
            System.out.println("Eres menor de edad");
        }

    }
}
