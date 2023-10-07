package secondstep;

import firststep.GenericPrint;
import firststep.Plastic;
import firststep.Powder;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrint<firststep.Powder> powderPrinter = new GenericPrint<>();
        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter);

        GenericPrint<firststep.Plastic> plasticPrinter = new GenericPrint<>();
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);
    }
}
