package data;

import java.util.GregorianCalendar;

public class Data {
    public static String retornarData() {
        GregorianCalendar gc = new GregorianCalendar();
        String dia = Integer.toString(gc.get(gc.DAY_OF_MONTH));
        String mes = Integer.toString(gc.get(gc.MONTH));
        String ano = Integer.toString(gc.get(gc.YEAR));
        String hora = Integer.toString(gc.get(gc.HOUR));
        String minuto = Integer.toString(gc.get(gc.MINUTE));
        String segundo = Integer.toString(gc.get(gc.SECOND));
        if (gc.get(gc.DAY_OF_MONTH) < 10) {
            dia = "0" + gc.get(gc.DAY_OF_MONTH);
        }
        if (gc.get(gc.MONTH) < 10) {
            mes = "0" + gc.get(gc.MONTH);
        }
        if (gc.get(gc.HOUR) < 10) {
            hora = "0" + gc.get(gc.HOUR);
        }
        if (gc.get(gc.MINUTE) < 10) {
            minuto = "0" + gc.get(gc.MINUTE);
        }
        if (gc.get(gc.SECOND) < 10) {
            segundo = "0" + gc.get(gc.SECOND);
        }
        return dia + "/" + mes + "/" + ano + " às " + hora + ":" + minuto + ":" + segundo;
    }
}
