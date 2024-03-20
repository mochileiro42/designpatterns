package br.com.designpatterns.creational.abstractfactory;

import br.com.designpatterns.creational.abstractfactory.abstractproduct.CartaoCredito;
import br.com.designpatterns.creational.abstractfactory.abstractproduct.Conta;

// AbstractFactory: Interface para a fábrica abstrata de produtos bancários
public interface BancoFactory {
    Conta criarConta();
    CartaoCredito criarCartaoCredito();
}
