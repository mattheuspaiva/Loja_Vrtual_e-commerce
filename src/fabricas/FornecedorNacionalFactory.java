package fabricas;

import interfaces.Frete;
import interfaces.NotaFiscal;
import interfaces.Pagamento;
import nacional.FreteNacional;
import nacional.NotaFiscalNacional;
import nacional.PagamentoNacional;

public class FornecedorNacionalFactory implements FornecedorFactory{
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoNacional();
    }

    @Override
    public Frete criarFrete() {
        return new FreteNacional();
    }

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalNacional();
    }
}
