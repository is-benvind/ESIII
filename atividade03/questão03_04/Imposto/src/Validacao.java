import java.util.List;

interface Validacao {
    boolean validar(ImpostoDeRenda impostoDeRenda);
}

class ValidacaoCPF implements Validacao {
    @Override
    public boolean validar(ImpostoDeRenda impostoDeRenda) {
        String cpf = impostoDeRenda.getCpfContribuinte();
        return cpf.matches("\\d{11}");
    }
}

class ValidacaoTamanhoCPF implements Validacao {
    @Override
    public boolean validar(ImpostoDeRenda impostoDeRenda) {
        String cpf = impostoDeRenda.getCpfContribuinte();
        return cpf.length() == 11;
    }
}

class ValidacaoRendimentosNaoNegativos implements Validacao {
    @Override
    public boolean validar(ImpostoDeRenda impostoDeRenda) {
        List<Double> rendimentos = impostoDeRenda.getRendimentos();
        return rendimentos.stream().allMatch(valor -> valor >= 0);
    }
}

class ValidacaoDespesasNaoNegativas implements Validacao {
    @Override
    public boolean validar(ImpostoDeRenda impostoDeRenda) {
        List<Double> despesas = impostoDeRenda.getDespesas();
        return despesas.stream().allMatch(valor -> valor >= 0);
    }
}

class ValidacaoNumeroRendimentos implements Validacao {
    @Override
    public boolean validar(ImpostoDeRenda impostoDeRenda) {
        List<Double> rendimentos = impostoDeRenda.getRendimentos();
        return rendimentos.size() <= 5;
    }
}
