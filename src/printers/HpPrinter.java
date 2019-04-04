package printers;

import printers.drivers.Hp;

public class HpPrinter implements Printer {

    private Hp printHp;

    public HpPrinter() {
        printHp = new Hp();
    }

    @Override
    public void print(String textToPrint) {
        printHp.HpPrint(textToPrint);
    }
}
