/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aluno
 */
public class Livro {
    
    private String Titulo;
    private String Autor;
    private String ISBN;
    private String Genero;
    private boolean Status;
   
    public Livro(String Titulo, String Autor, String ISBN, boolean Status, String Genero) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.Genero = Genero;
        this.Status = Status;
    }
  
}
