package internacional;

import interfaces.Pagamento;

public class PagamentoInternacional implements Pagamento {
    @Override
    public boolean pagar(double valor) {
        System.out.println("[INTERNACIONAL] Pagamento aprovado com taxa");
        return true;
    }
}
