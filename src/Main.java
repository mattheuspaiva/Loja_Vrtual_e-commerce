import fabricas.FornecedorFactory;
import fabricas.FornecedorInternacionalFactory;
import fabricas.FornecedorNacionalFactory;
import service.CheckoutService;

public static void main(String[] args){
    String pedidoId = "PED-01";
    double valorProdutos = 100.0;
    double pesoKg = 5.0;
    String cepDestino = "58500-000";

    FornecedorFactory nacionalFactory= new FornecedorNacionalFactory();
    CheckoutService checkoutServiceNacional= new CheckoutService(nacionalFactory);

    checkoutServiceNacional.finalizarCompra(pedidoId,valorProdutos,pesoKg,cepDestino);
    System.out.println();

    FornecedorFactory internacionalFactory= new FornecedorInternacionalFactory();
    CheckoutService checkoutServiceInternacional= new CheckoutService(internacionalFactory);

    checkoutServiceInternacional.finalizarCompra(pedidoId,valorProdutos,pesoKg,cepDestino);
}