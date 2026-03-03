/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programação.i;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {

    private String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
    
       public Estudante () {
            this.nome = "Nobody";
        }
   
    public int obterIdade (Date hoje) {
        int idade = 0;
        // lógica para calcular idade
        return idade;
    }
        public String getNome() {
            return this.nome;
        }
   
        public void setNome(String nome){
            this.nome = nome;
        }
}