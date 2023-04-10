/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.ii;

import java.util.Scanner;

/**
 *
 * @author PC2
 */
public class CLASEIV {
            static double global = 5;
    public static void main(String[] args) {
        funciones calculo=new funciones();
        
       /* Primer Ejercicio
        System.out.println("Ingrese las horas trabajadas: ");
        Scanner in=new Scanner(System.in);
        int horas=in.nextInt();
        calculo.calculolaboral(horas); */
        
        /*String resp;
        do {
            
        int[] ejemplo2= new int[]{3,5,8,2,7};
        System.out.println("Introduzca un número entero: ");
        Scanner in=new Scanner(System.in);
        int numero=in.nextInt();
        boolean val=calculo.buscador(ejemplo2, numero);
        System.out.println(val);
        System.out.println("Desea Seguir buscando (S/N): ");
        // Ingresar Otro Valor
        Scanner in2= new Scanner(System.in);
        resp=in2.nextLine(); 
        
        }while (resp.equals("S"));*/
        
        //Ejemplo 3
        
        /* int suma=0;
        double[] arreglo=new double[]{10.1,11.2,12.3,13.4,14.5};
        for (int i=0;i<arreglo.length; i++){
            suma+=arreglo[i];
        }
        double media = suma/(arreglo.length);
        System.out.println(arreglo.length);
        System.out.println(media); 
        */
        


        /* metodo(3,"global");
        System.out.println(( int ) global );
        */
       
        /* System.out.println("Ingrese un valor para Double: ");
        Scanner in=new Scanner(System.in);
        int enteroD=in.nextInt();
        double retornoD = calculo.SumaDouble(enteroD);
        System.out.println(retornoD);
        
        System.out.println("Ingrese un Valor para Int: ");
        Scanner in2=new Scanner(System.in);
        int enteroI=in2.nextInt();
        int retornoI= calculo.SumaInt(enteroI);
        System.out.println(retornoI);
        */
        
        System.out.println("Introduzca el tiempo en horas: ");
        Scanner in=new Scanner(System.in);
        double tiempo=in.nextDouble();
        calculo.parking(tiempo);
        
    }
    
   
    public static void metodo (int num , String cadena ){
switch ( cadena . charAt ( cadena . length () -1)){
case 'f':
global += num;
break ;
case 'r':
global -= num;
break ;
case 'l':
global *= num;
break ;default :global /= num;}}
    

 
    
}
