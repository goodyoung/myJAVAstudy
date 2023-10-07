package firststep;

public class GenericPrinteTest {
    public static void main(String[] args) {
        GenericPrint<Powder> powderPrinter = new GenericPrint<>();
        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter);

        GenericPrint<Object> plasticPrinter = new GenericPrint<>();
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);
    }
}
