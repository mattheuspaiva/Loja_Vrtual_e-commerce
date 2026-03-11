package nacional;

import interfaces.NotaFiscal;

public class NotaFiscalNacional implements NotaFiscal {
    @Override
    public String emitir(String pedidoId, double valor) {
        return "NF-NAC-" + pedidoId;
    }
}
