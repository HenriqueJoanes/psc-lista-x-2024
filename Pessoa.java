
public class Pessoa{

    private int idade;
    private int altura;
    private String genero;
    private String nacionalidade;
   
    public Pessoa (int idade, int altura, String genero, String nacionalidade) {

        this.idade = idade;
        this.altura = altura;
        this. genero = genero;
        this.nacionalidade = nacionalidade;
     
        
    }
    
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAltura(){
        return altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    }
