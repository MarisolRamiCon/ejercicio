import java.util.Scanner;
public class prueba2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        int num3 = sc.nextInt();
        System.out.println("Introduce el cuarto numero");
        int num4 = sc.nextInt();
        if(num1>num2 && num1>num3 && num1>num4) {
            System.out.println("El mayor numero es: " + num1);
        }else if(num2>num3 && num2>num4){
            System.out.println("El mayor numero es: " + num2);
        } else if(num3>num4){
            System.out.println("El mayor número es: " + num3);
        }else{
            System.out.println("El mayor numero es: " + num4);
        }


    }
}
