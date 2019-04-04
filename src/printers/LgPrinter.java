package printers;

import printers.drivers.Lg;

public class LgPrinter implements Printer {

    private Lg printLg;

    public LgPrinter() {
        printLg = new Lg();
    }

    @Override
    public void print(String textToPrint) {
        printLg.LgPrint(textToPrint); }
}