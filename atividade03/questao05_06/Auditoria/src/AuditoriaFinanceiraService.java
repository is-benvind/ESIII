import java.util.List;

public class AuditoriaFinanceiraService {
    public void realizarAuditoria(List<Auditavel> auditaveis) {
        for (Auditavel auditable : auditaveis) {
            if (auditable.executarAuditoria()) {
                System.out.println("Auditoria realizada com sucesso.");
            } else {
                System.out.println("Erro na auditoria.");
            }
        }
    }
}

