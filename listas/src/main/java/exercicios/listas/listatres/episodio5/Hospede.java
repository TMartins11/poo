package exercicios.listas.listatres.episodio5;

/**
 * Representa um hóspede em um sistema de hotelaria.
 * Contém informações básicas como nome e sobrenome.
 *
 * <p>Esta classe demonstra conceitos de Classe e Objetos,
 * encapsulando atributos e fornecendo métodos para acesso.</p>
 *
 * @author thiago
 */
public class Hospede {
    private String nome; // campo, variável de instância, atributo.
    private String sobrenome;

    /**
     * Define o primeiro nome do hóspede.
     *
     * @param nome Nome do hóspede.
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Retorna o primeiro nome do hóspede.
     *
     * @return Nome do hóspede.
     */
    public String getNome(){
        return nome;
    }

    /**
     * Define o sobrenome do hóspede.
     * @param sobrenome Sobrenome do hóspede.*/
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    /**
     * Retorna o sobrenome do hóspede.
     * @return Sobrenome do hóspede.*/
    public String getSobrenome(){
        return sobrenome;
    }
}
