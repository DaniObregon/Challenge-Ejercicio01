import javax.swing.*;
import java.util.Date;

public class Card {

    private int cardNumber;
    private String cardHolder;
    private Date fechaVencimiento;
    private final int LIMITE = 1000;

    public Card(int cardNumber, String cardHolder, Date fechaVencimiento) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Card{" +
                ", cardNumber=" + cardNumber +
                ", cardHolder='" + cardHolder + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", LIMITE=" + LIMITE +
                '}';
    }

    public String compararTarjetas(Card card1, Card card2){
        return card1.equals(card2) ? "Tarjetas iguales" : "Las tarjetas no son iguales";
    }

    public String validarTarjeta(Date fechaVencimiento){
        return fechaVencimiento.before(new Date()) ? "Vencida" : "Habilitada";
    }

    public String validarOperacion(double monto){
        return monto < 1000 ? "Operacion valida" : "Operacion no permitida";
    }

    public double validarImporte(){
        boolean importeValido = false;
        Double number = 0.0;
        do {
            String importe = JOptionPane.showInputDialog("Ingresar el importe: ");
            try {
                number = Double.parseDouble(importe);
                if(number < 1000 && number > 0){
                    importeValido = true;
                }else {
                    JOptionPane.showMessageDialog(null,"Ingrese un importe valido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Ingrese un importe valido", "Error", JOptionPane.ERROR_MESSAGE);
                importeValido = false;
            }
        } while (!importeValido);
        return number;
    }

    public double validarDiaIngresado(){
        boolean diaValido = false;
        Double number = 0.0;
        do {
            String dia = JOptionPane.showInputDialog("Ingresar el dia: ");
            try {
                number = Double.parseDouble(dia);
                if(number < 32 && number > 0 && (number - Math.floor(number) == 0)){
                    diaValido = true;
                }else{
                    JOptionPane.showMessageDialog(null,"Ingrese un dia valido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Ingrese un dia valido", "Error", JOptionPane.ERROR_MESSAGE);
                diaValido = false;
            }
        } while (!diaValido);
        return number;
    }

    public double validarMesIngresado(){
        boolean diaValido = false;
        Double number = 0.0;
        do {
            String dia = JOptionPane.showInputDialog("Ingresar el mes: ");
            try {
                number = Double.parseDouble(dia);
                if(number < 13 && number > 0 && (number - Math.floor(number) == 0)){
                    diaValido = true;
                }else{
                    JOptionPane.showMessageDialog(null,"Ingrese un mes valido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Ingrese un mes valido", "Error", JOptionPane.ERROR_MESSAGE);
                diaValido = false;
            }
        } while (!diaValido);
        return number;
    }

    public double validarAnioIngresado(){
        boolean anioValido = false;
        Double number = 0.0;
        do {
            String dia = JOptionPane.showInputDialog("Ingresar el anio: ");
            try {
                number = Double.parseDouble(dia);
                if(number > 21 && (number - Math.floor(number) == 0)){
                    anioValido = true;
                }else {
                    JOptionPane.showMessageDialog(null,"Ingrese un anio valido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Ingrese un anio valido", "Error", JOptionPane.ERROR_MESSAGE);
                anioValido = false;
            }
        } while (!anioValido);
        return number;
    }
}
