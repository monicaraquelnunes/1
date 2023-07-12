package br.com.ia.geral;

import br.com.ia.interfaces.Ipessoa;

public class Pessoa implements Ipessoa {
    @Override
    public String tipoPessoa(String tipo) {
        if(tipo == "F"){
            return "feminino";
        }else {
            return "masculino";
        }
    }

    @Override
    public String corPelePessoa() {
        return "Cor pele pessoa";
    }

    @Override
    public String alturaPessoa() {
        return "Altura pessoa";
    }

    @Override
    public String vestimentaPessoa() {
        return null;
    }
}
