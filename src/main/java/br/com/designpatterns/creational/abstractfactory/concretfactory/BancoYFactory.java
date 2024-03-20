package br.com.designpatterns.creational.abstractfactory.concretfactory;

import br.com.designpatterns.creational.abstractfactory.BancoFactory;
import br.com.designpatterns.creational.abstractfactory.abstractproduct.CartaoCredito;
import br.com.designpatterns.creational.abstractfactory.abstractproduct.Conta;
import br.com.designpatterns.creational.abstractfactory.concretproduct.ContaPoupanca;

// ConcreteFactory: Implementação específica da fábrica para outro banco
public class BancoYFactory implements BancoFactory {
    @Override
    public Conta criarConta() {
        return new ContaPoupanca();
    }

    @Override
    public CartaoCredito criarCartaoCredito() {
        return null; // Banco Y não oferece cartão de crédito
    }
}
