package global;
import java.text.DecimalFormat; 

public class FormatoDecimal {
    public static String duasCasas(double numero) {
        DecimalFormat df = new DecimalFormat("0.##");
        String nr = df.format(numero);
        return nr;
    }
}
