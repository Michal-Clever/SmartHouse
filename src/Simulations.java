import printers.Printer;
import printers.HpPrinter;
import printers.LgPrinter;
import tv.PhilipsTv;
import tv.Tv;

public class Simulations {

    public static void main(String[] args) {



        Printer printerFirst = new LgPrinter();
        printerFirst.print("Lg test");

        Printer printerSecond = new HpPrinter();
        printerSecond.print("Hp test");

        Tv tvBig = new PhilipsTv();
        tvBig.showTheChanel("Polsat");
        tvBig.turnOff();
        tvBig.turnOn();

        turnOffAllDevices();

    }

    private static void turnOffAllDevices() {

    }
}
