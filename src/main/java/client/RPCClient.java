package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Scanner ss = new Scanner(System.in);
        //imc
        System.out.printf("Dame tu nombre ");
        String name = ss.next();
        System.out.printf("Dame tu peso ");
        Double height = ss.nextDouble();
        System.out.printf("Dame tu altura ");
        Double peso = ss.nextDouble();
        Object[]data = {name,height,peso} ;
        String response = (String) client.execute("Methods.imc",data);
        System.out.println(response);
//

//promedio, suma, multiplicacion

//        System.out.println("Escribe un numero: ");
//        int num1 = ss.nextInt();
//
//        System.out.println("Escribe otro numero: ");
//        int num2 = ss.nextInt();
//
//        System.out.println("Escribe otro numero: ");
//        int num3 = ss.nextInt();
//
//        System.out.println("Escribe otro numero: ");
//        int num4 = ss.nextInt();
//
//        Object[] datos ={num1, num2, num3, num4};
//
//        String response2 = (String) client.execute("Methods.resultados", datos);
//
//        System.out.println(response2 + "\n");


        //suma
        //System.out.printf("Dame un numero ");
       // int numero1 = ss.nextInt();
       // System.out.printf("Dame dame otro numero ");
        //int numero2 = ss.nextInt();
       // Object[]data = {numero1,numero2} ;
       // int response = (int) client.execute("Methods.sumatoria",data);
       // System.out.println(response);


        //arreglo
       // int numeros [] = new int[5];
      //  for (int i =0; i < numeros.length; i++)
   //    {
    //        System.out.println("introduzca el numero ");
   //       numeros[i]= ss.nextInt();
    //   }
   //     System.out.println("\nImprimir");
    //    Arrays.sort(numeros);
     // for(int i :numeros){
     //     System.out.println(i);
   //   }




        //   client.setConfig(config);
        // Object[] numbers = {5.0,5D};
        ///Double response = (Double) client.execute("Methods.addition",numbers);
        // System.out.println("Result->" + response);
    }
}
