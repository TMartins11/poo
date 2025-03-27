package exercicios.listas.listatres.episodio4;

// import java.util.*;  Indica ao compilador o local de todas as classes do pacote java.util

import java.util.Date; // Indica ao compilador o local de apenas uma classe.

// É melhor importar classes específicas em questão de perfomance, mas como indica somente o local onde procurar, não tem perda significativa.
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

        Date day = new Date();
        System.out.println("Milisegundos desde 1970: " + day.getTime() + "ms.");
    }
}
