import java.util.List;

public class TesteAdciona {
    public static void main (String[] args) {
        ConjuntoEspalhamemento conjunto = new ConjuntoEspalhamemento();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");

        List<String> palavras = conjunto.pegaTodas();

        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
