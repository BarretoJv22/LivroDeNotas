
package pkg3009aula;


public class LivroDeNotas {
    private String nomeDoCurso;
    private String materia;
    private int nota1;
    private int nota2;
    private int nota3;
    private int media;
    
    public LivroDeNotas(String nomeDoCurso, String materia){
        this.nomeDoCurso = nomeDoCurso;
        this.materia = materia;
        
        
    } public void Curso1(){
        if (getNomeDoCurso().equals("matematica") && getMateria().equals("algebra")){
        System.out.println("bem vindo ao livro de notas");
    }else{ 
            System.out.println("Acesso inválido");
        }
    } public void LancarNota(){
       media = (nota1 + nota2 +nota3)/3;
       System.out.println("a média final é: " + media);
      
    
}
    

    
    public String getNomeDoCurso(){
        return nomeDoCurso;
    }

    
    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    
    public String getMateria() {
        return materia;
    }

    
    public void setMateria(String materia) {
        this.materia = materia;
    }

    
    public int getNota1() {
        return nota1;
    }

    
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    
    public int getNota2() {
        return nota2;
    }

   
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    /**
     * @return the nota3
     */
    public int getNota3() {
        return nota3;
    }

    /**
     * @param nota3 the nota3 to set
     */
    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    /**
     * @return the media
     */
    public int getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(int media) {
        this.media = media;
    }
}
    