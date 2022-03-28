import javax.swing.*;
import java.util.Date;

public class NaraCard extends Card{

    private final String MARCA = "NARA" ;

    public NaraCard(int cardNumber, String cardHolder, Date fechaVencimiento) {
        super(cardNumber, cardHolder, fechaVencimiento);

    }

    public String getMARCA() {
        return MARCA;
    }

    public double calcularTaza() {

        double dia = this.validarDiaIngresado();
        double taza = dia * 0.5;

        if (taza < 0.3) {
            return 0.3;
        }
        if (taza > 5) {
            return 5;
        }
        return taza;
    }

    public void obtenerInforme(){
        double importe = validarImporte();
        System.out.println("Informe: \n Taza: " + this.calcularTaza() + "\n Marca: " + this.getMARCA() + "\n Importe: " + importe);
    }
}
