import java.text.SimpleDateFormat;
import java.util.Date;

public class AmexCard extends Card implements CardInterface {

    private final String MARCA = "AMEX";

    public AmexCard(int cardNumber, String cardHolder, Date fechaVencimiento) {
        super(cardNumber, cardHolder, fechaVencimiento);
    }

    public String getMARCA() {
        return MARCA;
    }

    @Override
    public double calcularTaza() {

        double taza = 0.1 * (Double.parseDouble(new SimpleDateFormat("MM").format(new Date())));

        if (taza < 0.3) {
            return 0.3;
        }
        if (taza > 5) {
            return 5;
        }
        return taza;
    }
}
