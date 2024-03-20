package br.com.designpatterns.creational.abstractfactory.client;

import br.com.designpatterns.creational.abstractfactory.BancoFactory;
import br.com.designpatterns.creational.abstractfactory.abstractproduct.CartaoCredito;
import br.com.designpatterns.creational.abstractfactory.abstractproduct.Conta;
import br.com.designpatterns.creational.abstractfactory.concretfactory.BancoXFactory;
import br.com.designpatterns.creational.abstractfactory.concretfactory.BancoYFactory;

// Client: Utiliza as fábricas abstratas e os produtos através de suas interfaces
public class Cliente {
    public static void main(String[] args) {
        // Utilizando a fábrica do Banco X
        BancoFactory bancoXFactory = new BancoXFactory();
        Conta contaX = bancoXFactory.criarConta();
        CartaoCredito cartaoX = bancoXFactory.criarCartaoCredito();

        contaX.exibirDetalhes();
        if (cartaoX != null) {
            cartaoX.exibirDetalhes();
        } else {
            System.out.println("Este banco não oferece cartão de crédito.");
        }

        // Utilizando a fábrica do Banco Y
        BancoFactory bancoYFactory = new BancoYFactory();
        Conta contaY = bancoYFactory.criarConta();
        CartaoCredito cartaoY = bancoYFactory.criarCartaoCredito();

        contaY.exibirDetalhes();
        if (cartaoY != null) {
            cartaoY.exibirDetalhes();
        } else {
            System.out.println("Este banco não oferece cartão de crédito.");
        }
    }
}
