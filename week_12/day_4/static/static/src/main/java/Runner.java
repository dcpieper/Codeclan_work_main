public class Runner {
    public static void main(String[] args) {
        Vat obj1 = new Vat();
        Vat obj2 = new Vat();



        obj1.vat_percentage = "20%";

        System.out.println(obj1.vat_percentage);
        System.out.println(obj2.vat_percentage);

        obj2.vat_percentage = "30%";
        System.out.println(obj1.vat_percentage);

        Food.setup();
    }
}
