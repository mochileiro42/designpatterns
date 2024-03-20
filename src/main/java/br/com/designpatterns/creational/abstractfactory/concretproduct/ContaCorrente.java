package br.com.designpatterns.creational.abstractfactory.concretproduct;

import br.com.designpatterns.creational.abstractfactory.abstractproduct.Conta;

// ConcreteProduct: Implementação específica do produto Conta para um banco
public class ContaCorrente implements Conta {
    @Override
    public void exibirDetalhes() {
        System.out.println("Conta Corrente criada.");
    }
}
