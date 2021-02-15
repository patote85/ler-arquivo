public class Arquivo {
    public int id;
    public String nome;
    public String registro;

    public Arquivo() {
        this.id = id;
        this.nome = nome;
        this.registro = registro;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void chamaOLer() extends void LerArquivo{
//        LerArquivo arquivo = new LerArquivo();
        LerArquivo.ler();
//        registro = setRegistro(LerArquivo.ler(linha));
    }
}
