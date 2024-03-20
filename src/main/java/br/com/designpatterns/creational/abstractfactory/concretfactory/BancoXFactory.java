package br.com.designpatterns.creational.abstractfactory.concretfactory;

import br.com.designpatterns.creational.abstractfactory.BancoFactory;
import br.com.designpatterns.creational.abstractfactory.abstractproduct.CartaoCredito;
import br.com.designpatterns.creational.abstractfactory.abstractproduct.Conta;
import br.com.designpatterns.creational.abstractfactory.concretproduct.CartaoCreditoGold;
import br.com.designpatterns.creational.abstractfactory.concretproduct.ContaCorrente;
// ConcreteFactory: Implementação específica da fábrica para um banco
public class BancoXFactory implements BancoFactory {
    @Override
    public Conta criarConta() {
        return new ContaCorrente();
    }

    @Override
    public CartaoCredito criarCartaoCredito() {
        return new CartaoCreditoGold();
    }
}
