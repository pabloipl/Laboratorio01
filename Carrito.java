import java.util.Random;

public class Carrito {

    public static void main(String[] args){

        

    }

    public static int[] generarCarrito(int[]carro){
        int p;
        int n;
        n=(int)(Math.random()*20)+1;
        carro=new int[n];

        int i=0;
        if(carro[i]<n+2){
            p=(int)(Math.random()*15)+1;
            carro[i]=p;
            i++;

        }

        return carro;
    }

    public static int leerCantidad(int productos){





    }


}
