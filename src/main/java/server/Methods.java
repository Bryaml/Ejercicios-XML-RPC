package server;

public class Methods {
    public double addition(double num1, double num2){

        return (num1 + num2);
    }

    public String imc(String name, double height, double peso) {
        double imc = (peso / height* height);
        return "nombre" + name + "IMC"+ imc;
    }

    public int sumatoria(int numero1, int numero2) {
        int minimo = Math.min(numero1, numero2);
        int maximo = Math.max(numero1, numero2);
        return ((maximo + minimo) * (maximo + 1 - minimo)) / 2;
    }
    public String resultados(int num1, int num2, int num3, int num4){
        int producto = num1 * num2 * num3 * num4;
        int suma = num1 + num2 + num3 + num4;
        double promedio = (num1 + num2 + num3 + num4) / 4;

        return "Hola, el producto es: " + producto + ", la suma es: " + suma + ", el promedio es: " + promedio;
    }


}
