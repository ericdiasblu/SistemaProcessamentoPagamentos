import entities.CartaoCredito;
import entities.Pagamento;
import entities.enums.TipoBandeira;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pagamento p1 = new CartaoCredito(
                1000.0,
                java.time.LocalDateTime.now(),
                entities.enums.StatusPagamento.PENDENTE,
                "Compra em loja",
                entities.enums.TipoPagamento.CREDITO,
                "1234 5678 9012 3456",
                "João da Silva",
                123,
                LocalDate.of(2025, 12, 31),
                TipoBandeira.VISA,
                5000.0,
                12
        );

    }
}