package br.com.ia.principal;

import br.com.ia.parentes.*;

public class App {
    public static void main(String[] args) {
        Idoso individuo = new Idoso();
        System.out.println("Este é um idoso");
        System.out.println(individuo.tipoPessoa("M"));
        System.out.println(individuo.corPelePessoa());
        System.out.println(individuo.alturaPessoa());
        System.out.println(individuo.vestimentaPessoa());
    }
}
