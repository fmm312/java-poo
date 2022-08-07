package encapsulamento;

public class Encapsulamento {

    public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//
//		cliente.nome = "Felipe Menezes";
//		cliente.telefone = "85922334455";
//
//		System.out.println("Nome cliente: " + cliente.nome);


        Cliente cliente = new Cliente();

        cliente.setNome("Felipe Menezes");
        cliente.setTelefone("34922334455");

        System.out.println("Nome cliente: " + cliente.getNome());
        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("Último nome: " + cliente.getUltimoNome());



    }

}