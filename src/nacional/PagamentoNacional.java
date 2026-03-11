package nacional;

import interfaces.Pagamento;

public class PagamentoNacional implements Pagamento {
    @Override
    public boolean pagar(double valor) {
        System.out.println("[NACIONAL] Pagamento aprovado");
        return true;
    }
}
