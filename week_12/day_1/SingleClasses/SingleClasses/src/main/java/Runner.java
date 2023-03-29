public class Runner {
    public static void main(String[] args) {
    Bear bear = new Bear("Balu");
    String name = bear.getName();
    bear.setName("Pablo Escobear");
//    bear.name = "";
    name = bear.getName();
    System.out.println(name);
//    System.out.println(bear.name);
}
}
