public class CriandoClasses {

    public static void main(String[] args) {
        System.out.println("Especificacoes do cliente: ");
        Cliente cliente = new Cliente(); //tipo, nome da variavel = new nome da variavel(); new-> instanciar
        cliente.setCodigo(1);
        cliente.cadastrarEndereco("Rua 1");
        cliente.setNome("Paulo");

        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getNome());

        System.out.println("Especificacoes do produto: ");
       Produto produto = new Produto();
       produto.setCodigo(3);
       produto.setNome("hossomaki de salmao");
        System.out.println(produto.getCodigo());
        System.out.println(produto.getNome());

        System.out.println("identificacao de funcionario: ");

        Funcionario funcionario = new Funcionario();
        funcionario.setCodigo(2);
        funcionario.cadastrarEndereco("rua 2");
        funcionario.setNome("wellington");

        System.out.println(funcionario.getCodigo());
        System.out.println(funcionario.getEndereco());
        System.out.println(funcionario.getNome());

        System.out.println("Forma de pagamento: ");
        ItemVenda itemVenda = new ItemVenda();
       itemVenda.setFormaDePagamento("cartao de credito");

        System.out.println(itemVenda.getFormaDePagamento());

        System.out.println("valor da compra: ");
        Venda venda = new Venda();
        venda.setValorTotal(50);

        System.out.println("o valor total é de " + 50);

    }
}
