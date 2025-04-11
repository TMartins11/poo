package org.example;

public class TestePonto {
    public static void main(String[] args) {

        Ponto primeiroPonto = new Ponto();
        Ponto segundoPonto = new Ponto(400,230);

        primeiroPonto.setX(200);
        primeiroPonto.setY(200);

        int x1, y1 = 0;
        x1 = primeiroPonto.getX();
        y1 = primeiroPonto.getY();

        int x2, y2 = 0;
        x2 = segundoPonto.getX();
        y2 = segundoPonto.getY();

        System.out.println("Coordenadas do primeiro ponto (x,y): (" + x1 + "," + y1 + ")");
        System.out.println("Coordenadas do segundo ponto (x,y): (" + x2 + "," + y2 + ")");

        System.out.println("\nCriação de uma segunda referência para o segundo ponto, chamada outraRefSegundoPonto");
        Ponto outraRefSegundoPonto = segundoPonto;

        int x3, y3 = 0;
        x3 = outraRefSegundoPonto.getX();
        y3 = outraRefSegundoPonto.getY();

        System.out.println("\nExibindo o conteúdo de todas as referências\n");

        System.out.println("Coordenadas do primeiro ponto (x,y): (" + x1 + "," + y1 + ")");
        System.out.println("Coordenadas do segundo ponto (x,y): (" + x2 + "," + y2 + ")");
        System.out.println("Coordenadas do objeto apontado pela referência outraRefSegundoPonto (x,y): ("  + x3  + "," + y3 + ")");

        segundoPonto.setX(840);
        segundoPonto.setY(350);

        x2 = segundoPonto.getX();
        y2 = segundoPonto.getY();
        
        System.out.println("\nAlterando as coordenadas do segundo ponto para: (" + x2 + "," + y2 + ")");
    }
}