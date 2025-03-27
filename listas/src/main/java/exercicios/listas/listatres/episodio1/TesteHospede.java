package exercicios.listas.listatres.episodio1;

/**
 * Cria objetos para representar hóspedes em um hotel.
 * <p>Exercita conceitos de objetos e classes.</p>
 *
 * @author thiago
 */
public class TesteHospede {
    public static void main(String[] args) {
        Hospede rodrigo = new Hospede();
        rodrigo.setNome("Rodrigo");
        rodrigo.setSobrenome("Martins Pagliares");

        System.out.println("Nome: " + rodrigo.getNome());
        System.out.println("Sobrenome: " + rodrigo.getSobrenome());

        Hospede mariana = new Hospede();
        mariana.setNome("Mariana");
        mariana.setSobrenome("Pereira");

        System.out.println("Nome: " + mariana.getNome());
        System.out.println("Sobrenome: " + mariana.getSobrenome());
    }
}
