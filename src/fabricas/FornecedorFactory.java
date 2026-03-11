package fabricas;

import interfaces.Frete;
import interfaces.NotaFiscal;
import interfaces.Pagamento;

public interface FornecedorFactory {
    public Pagamento criarPagamento();
    public Frete criarFrete();
    public NotaFiscal criarNotaFiscal();
}
