import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CardTest {
    public static void main(String[] args) {

        Date vencimiento = null;
        try {
            vencimiento = new SimpleDateFormat("MM/yy").parse("04/22");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        NaraCard naraCard = new NaraCard(2222, "Daniel", vencimiento);
        AmexCard amexCard = new AmexCard(2222, "Daniel", vencimiento);

//        double importe = naraCard.validarImporte();
//        System.out.println("Importe = " + importe);
//        System.out.println("Taza de NARA Card = " + naraCard.calcularTaza());


        //Generacion de informe
        naraCard.obtenerInforme();

        //Validacion tarjeta
        System.out.println(naraCard.validarTarjeta(vencimiento));

        //Validacion de operacion
        System.out.println(naraCard.validarImporte());

        //Identificar si una tarjeta es distinta a la otra
        System.out.println(amexCard.compararTarjetas(amexCard, naraCard));

        //Calcular taza
        System.out.printf("Taza: %.2f", (amexCard.calcularTaza()));

    }
}
