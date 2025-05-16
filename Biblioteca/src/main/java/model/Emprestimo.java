/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aluno
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
        
public class Emprestimo{
    private LocalDate Data_Emprestimo;
    private LocalDate Data_Devolucao;
    private boolean Atraso;
    private int Multa;

    public Emprestimo(LocalDate Data_Emprestimo, LocalDate Data_Devolucao, boolean Atraso) {
        this.Data_Emprestimo = Data_Emprestimo;
        this.Data_Devolucao = Data_Devolucao;
        this.Atraso = Atraso;
    }
    
    public boolean Verificar_Atraso(){
        if(Data_Devolucao == NULL){
        setData_Devolucao.(LocalDate.now());
    }
        long diasEntre = ChronoUnit.DAYS.between(Data_Emprestimo, Data_Devolucao);
            return diasEntre > 7;
        
}

    public boolean Verificar_Disponibilidade(){      
            if (Atraso == true) {
                Calcular_Multa(diasEntre);
                System.out.println("Livro devolvido com atraso.");
            } else {
                System.out.println("Livro devolvido no prazo.");
            }
        }
}
     public int Calcular_Multa(int Atrasos){
        int Valor = 0,50;

}     
        
    
    
