public class ProjetoTeste {

    public static void main(String[] args) {
        String ambiente = args[0];

        if (args[0].equals("dev")) {
            System.out.println("Hello World");

        } else if (args[0].equals("user")) {
            System.out.println("Hello user");
        }else {
            System.out.println("insira um caratere valido");
        }


    }

}