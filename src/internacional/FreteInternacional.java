package internacional;

import interfaces.Frete;

public class FreteInternacional implements Frete {
    @Override
    public double calcularFrete(double pesoKg, String cepDestino) {
        return 40.0 + (pesoKg * 5.0);
    }
}
