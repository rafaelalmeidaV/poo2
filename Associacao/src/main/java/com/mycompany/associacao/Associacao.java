/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.associacao;
import java.util.ArrayList;
/**
 *
 * @author rafap
 */
public class Associacao {

    public static void main(String[] args) {
       Funcionario func1 = new Funcionario("Rafael", "12345", "Presidente da republica", 2.0);
       Funcionario func2 = new Funcionario("Matheus", "24123", "Presidente da republica", 5.0);
       
       Empresa emp1 = new Empresa("Republica", "abubu", "Rua dos  bobos");
       
       emp1.setFuncionario(func1);
       emp1.setFuncionario(func2);
       
       emp1.gerarRelatorio();
    }
}
