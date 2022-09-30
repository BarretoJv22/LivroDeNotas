
package pkg3009aula;

import javax.swing.JOptionPane;
public class TesteLivroDeNotas {

    
    public static void main(String[] args) {
        String nomeDoCurso = JOptionPane.showInputDialog("digite o nome do curso");
        String materia = JOptionPane.showInputDialog("digite o nome da materia");
        LivroDeNotas curso = new LivroDeNotas(nomeDoCurso, materia);
        curso.Curso1();
        
        int nota1 = Integer.parseInt(JOptionPane.showInputDialog("digite a primeira nota"));
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog("digite a primeira nota"));
        int nota3 = Integer.parseInt(JOptionPane.showInputDialog("digite a primeira nota"));
        
        curso.setNota1(nota1);
        curso.setNota2(nota2);
        curso.setNota3(nota3);
        curso.LancarNota();
    }
    
}
