package org.example.encapsulamento.versao2;

public class Veiculo {
    private double carga;
    private double cargaMaxima;

    public Veiculo (double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    public double getCarga() {
        return carga;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public boolean adicionarCaixa(double peso){
        double tmp = carga + peso;
        if(tmp < cargaMaxima){
            carga = tmp;
            return true;
        }else{
            return false;
        }
    }
}
