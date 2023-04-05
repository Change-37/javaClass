package ch16.generic;

public class GenericExam {
    public static void main(String[] args) {
        ThreeDPrinterDbject threeDPrinterDbject = new ThreeDPrinterDbject();
        Powder powder = new Powder();
        Plastic plastic = new Plastic();

        threeDPrinterDbject.setMaterial(plastic);
        System.out.println(threeDPrinterDbject.getMaterial());
        threeDPrinterDbject.setMaterial(powder);
        System.out.println(threeDPrinterDbject.getMaterial());

        ThreeDPrinterGeneric<Plastic> threeDPrinterGeneric = new ThreeDPrinterGeneric<>();
        threeDPrinterGeneric.setMaterial(plastic);
        System.out.println(threeDPrinterGeneric.getMaterial());
    }
}
