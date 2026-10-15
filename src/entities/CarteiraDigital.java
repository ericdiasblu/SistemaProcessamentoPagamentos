package entities;

public class CarteiraDigital extends Pagamento {

    private String identificadorConta;
    private String nomeCarteira;

    public String getIdentificadorConta() {
        return identificadorConta;
    }

    public void setIdentificadorConta(String identificadorConta) {
        this.identificadorConta = identificadorConta;
    }

    public String getNomeCarteira() {
        return nomeCarteira;
    }

    public void setNomeCarteira(String nomeCarteira) {
        this.nomeCarteira = nomeCarteira;
    }

    @Override
    public void realizarPagamento() {

    }

    @Override
    public void calcularTaxa() {

    }

    @Override
    public void consultarStatus() {

    }

    @Override
    public void confirmarPagamento() {

    }

    @Override
    public void cancelarPagamento() {

    }

    @Override
    public void validarPagamento() {

    }

    @Override
    public void notificarAlteracao() {

    }

    @Override
    public void consultarPagamento() {

    }
}
