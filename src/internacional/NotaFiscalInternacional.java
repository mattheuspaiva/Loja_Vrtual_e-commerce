package internacional;

import interfaces.NotaFiscal;

public class NotaFiscalInternacional implements NotaFiscal {
    @Override
    public String emitir(String pedidoId, double valor) {
        return "NF-INT-" + pedidoId;
    }
}
