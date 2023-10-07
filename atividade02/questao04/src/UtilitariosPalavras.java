public class UtilitariosPalavras {
    private String texto;

    public UtilitariosPalavras(String texto){
        this.texto = texto;
    }

    public String removerEspacos() {
        if(texto ==null){
            return null;
        }

        String textoSemEspacos = texto.replaceAll("\\s+", "");

        return textoSemEspacos;
    }

    public String[] quebrarEmPalavras() {
        if(texto==null){
            return null;
        }

        String[] palavras = texto.split("\\s+");

        return palavras;
    }

}