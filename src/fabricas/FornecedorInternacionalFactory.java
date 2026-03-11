package fabricas;

import interfaces.Frete;
import interfaces.NotaFiscal;
import interfaces.Pagamento;
import internacional.FreteInternacional;
import internacional.NotaFiscalInternacional;
import internacional.PagamentoInternacional;

public class FornecedorInternacionalFactory implements FornecedorFactory{
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoInternacional();
    }

    @Override
    public Frete criarFrete() {
        return new FreteInternacional();
    }

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalInternacional();
    }
}
