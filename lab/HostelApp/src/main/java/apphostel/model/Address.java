package apphostel.model;

/**
 * Essa classe existe afim de registrar o endereço de um cliente do hostel, exercitando noções de construtores e métodos de um modo geral.
 *
 * @author thiago
 * */
public class Address {
    private String address;
    private String zipcode;
    private String city;
    private String state;


    // O construtor é iniciado como vazio para prover valores padrões ao novo objeto criado, o construtor vazio chama o construtor com parâmetros.
    public Address(){
        this("","not provided",null);
    }

    public Address(String address, String zipcode, String state){
        this.address = address;
        this.zipcode = zipcode;
        this.state = state;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getZipcode(){
        return zipcode;
    }

    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public static void main(String[] args){
        Address address = new Address();
        String logradouro = address.getAddress();
        String estado = address.getState();
        String cidade = address.getCity();
        String cep = address.getZipcode();

        System.out.println("Dados do endereço criado:");
        System.out.println(cidade + " " + estado + " " + logradouro + " " + cep);

        Address endereco2 = new Address("Rua Coronel Manoel Teixeira", "33678-000", "MG");

        endereco2.setCity("Alfenas");
        System.out.println("Dados do segunddo endereço criado:");
        System.out.println(endereco2.getAddress() + " " + endereco2.getCity() + " " + endereco2.getState() + " " + endereco2.getZipcode());
    }
}
