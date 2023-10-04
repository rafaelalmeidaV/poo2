public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Inicio do main");
        System.out.println("Fim do main");

        try{
            metodo1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e);
        }
    }

    public static void metodo1() {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    public static void metodo2() {
        System.out.println("Inicio do metodo2");
        int array[];
        array = new int[10];
        for (int i = 0; i <= 15; i++) {
            array[i] = i;
            System.out.println(i);
        }
        System.out.println("Fim do metodo2");
    }


}
