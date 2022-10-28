public class Main {

    public static void main(String[] args) {

        Cliente joao = new Cliente();
        joao.setNome("Venilton");
        //joao.setEndereco(new Endereco("1058", "62088074", "Luziania", "Goiás", "Brasil", "Estrada das Magnolias"));
        joao.setEndereco(Endereco.builder().numero("1058").cep("62088074").cidade("Luziania").estado("Goias").pais("Brasil").rua("Estrada das Magnolias").build());

        System.out.println(joao.getEndereco().getRua());

        Conta cc = new ContaCorrente(joao);
        Conta poupanca = new ContaPoupanca(joao);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        poupanca.sacar(100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
