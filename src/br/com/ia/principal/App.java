package br.com.ia.principal;

import br.com.ia.parentes.*;

public class App {
    public static void main(String[] args) {
        Crianca individuo = new Crianca();
        System.out.println(individuo.quemSou());
        System.out.println(individuo.tipoPessoa("F"));
        System.out.println(individuo.corPelePessoa());
        System.out.println(individuo.alturaPessoa());
        System.out.println(individuo.vestimentaPessoa());
    }
}
