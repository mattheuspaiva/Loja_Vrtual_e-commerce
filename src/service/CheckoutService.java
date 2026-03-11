package service;

import fabricas.FornecedorFactory;
import interfaces.Frete;
import interfaces.NotaFiscal;
import interfaces.Pagamento;

public class CheckoutService {
    private final Pagamento pagamento;
    private final Frete frete;
    private final NotaFiscal notaFiscal;

    public CheckoutService(FornecedorFactory factory) {
        this.pagamento = factory.criarPagamento();
        this.frete = factory.criarFrete();
        this.notaFiscal = factory.criarNotaFiscal();
    }
    public void finalizarCompra(String pedidoId, double valorProdutos, double pesoKg, String cepDestino) {
        System.out.println("== CHECKOUT pedido " + pedidoId +" ==");

        double valorFrete = frete.calcularFrete(pesoKg, cepDestino);
        System.out.println("Frete calculado: " + valorFrete);

        double valorTotal = valorProdutos + valorFrete;
        System.out.println("Total: " + valorTotal);

        pagamento.pagar(valorTotal);

        String nf = notaFiscal.emitir(pedidoId, valorTotal);
        System.out.println("NF gerada: " + nf);

        System.out.println("Compra finalizada!");

    }
}
