// exemplo de problema

public class Superman {
    void voar() {
        System.out.println("Sobrevoando a cidade");
    }

    void dispararLazer() {
        System.out.println("Disparando lazers");
    }

    void congelar() {
        System.out.println("Congelando inimigo");
    }
}

class HomemDeFerro extends Superman {
    void voar() {
        System.out.println("Sobrevoando a cidade");
    }

    void dispararLazers() {
        System.out.println("Disparando lazers");
    }

    // Sobrescreve o método congelar para não fazer nada
    @Override
    void congelar() {
        // Não faz nada
    }
}

class HomemDeGelo extends Superman {
    @Override
    void voar() {
        // Não faz nada
    }

    @Override
    void dispararLazer() {
        // Não faz nada
    }

    void congelar() {
        System.out.println("Congelando inimigo");
    }
}

// Solução do problema

interface Voo {
    void voar();
}

interface Lazers {
    void dispararLazers();
}

interface Congelar {
    void congelar();
}

class Superman implements Voo, Lazers, Congelar {
    void voar() {
        System.out.println("Sobrevoando a cidade");
    }

    void dispararLazer() {
        System.out.println("Disparando lazers");
    }

    void congelar() {
        System.out.println("Congelando inimigo");
    }
}

class HomemDeFerro implements Voo, Lazers {
    void voar() {
        System.out.println("Sobrevoando a cidade");
    }

    void dispararLazers() {
        System.out.println("Disparando lazers");
    }

}

class HomemDeGelo implements Congelar {
    void congelar() {
        System.out.println("Congelando inimigo");
    }
}