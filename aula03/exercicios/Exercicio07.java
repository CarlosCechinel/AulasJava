package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner novo = new Scanner(System.in);
        final int NUMERO_TURMAS =2;
        final int NUMERO_ALUNOS =2;
        double media, mediat, mediaf;

        mediaf=0;

        for (int turma = 1 ; turma <= NUMERO_TURMAS; turma++ ) {
            System.out.println("\nTurma "+ turma);
            mediat=0;

            for (int aluno = 1; aluno <= NUMERO_ALUNOS; aluno++) {
                System.out.print("Digite a média do aluno " + aluno+": ");
                media= novo.nextDouble();
                mediat= mediat+media;
                
            }
            mediat=mediat/ NUMERO_ALUNOS;
            System.out.println("Média turma: " + mediat);
            mediaf= mediaf+mediat;
        }
        mediaf= mediaf/NUMERO_TURMAS;
        System.out.println("A média geral é de " + mediaf);
        novo.close();
    }
    
}
