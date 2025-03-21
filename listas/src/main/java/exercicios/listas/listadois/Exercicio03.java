package exercicios.listas.listadois;

/**
 * This is the third exercise: <b>Passing arguments</b>
 * @author thiago
 * */
public class Exercicio03 {
    public static void main(String[] args) {
        if(args.length > 0){
            System.out.println(args.length + " arguments provided: ");
            for(String arg : args){
                System.out.println(arg);
            }
        }else{
            System.out.println("No arguments were provided!");
        }
    }
}
