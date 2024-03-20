package br.com.designpatterns.creational.abstractfactory.concretproduct;

import br.com.designpatterns.creational.abstractfactory.abstractproduct.CartaoCredito;

// ConcreteProduct: Implementação específica do produto Cartão de Crédito para um banco
public class CartaoCreditoGold implements CartaoCredito {
    @Override
    public void exibirDetalhes() {
        System.out.println("Cartão de Crédito Gold criado.");
    }
}
