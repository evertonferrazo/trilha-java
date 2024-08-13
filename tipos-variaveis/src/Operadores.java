import java.lang.invoke.StringConcatFactory;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Everton " + "Ferraz " + "de Oliveira";

        int numero = 5;
        numero++;
        //numero++ = (numero = numero + 1);
        //System.out.println( ++ numero);

        //boolean variavel = true;
        //System.out.println(!variavel); // "!" Nega a atribuição
    
        int a, b;
        a = 6;
        b = 5;

        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

    }
}
