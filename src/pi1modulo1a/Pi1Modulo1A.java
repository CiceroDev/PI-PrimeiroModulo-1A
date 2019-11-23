/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi1modulo1a;

import javax.swing.JOptionPane;

/**
 *
 * @author Cícero
 */
public class Pi1Modulo1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int tamanho = 30;
        
        //Input para Alunos
        String[] matriculaAluno = new String[tamanho];
        String[] nomeAluno = new String[tamanho];
        String[] emailAluno = new String[tamanho];
        String[] usuarioAluno = new String[tamanho];
        String[] senhaAluno = new String[tamanho];
        String[] fataNascAluno = new String[tamanho];
        String[] telefoneAluno = new String[tamanho];
        String[] cpfAluno = new String[tamanho];
        String[] endereco = new String[tamanho];
        String[] logradouro = new String[tamanho];
        String[] cidadeAluno = new String[tamanho];
        String[] estado = new String[tamanho];
        String[] categoriaENEMAluno = new String[tamanho];
        String[] materiaAluno = new String[tamanho];
       
        //Input para Professor
        String[] matriculaProf = new String[tamanho];
        String[] nomeProf = new String[tamanho];
        String[] emailProf = new String[tamanho];
        String[] usuarioProf = new String[tamanho];
        String[] senhaProf = new String[tamanho];
        String[] fataNascProf = new String[tamanho];
        String[] telefoneProf = new String[tamanho];
        String[] cpfProf = new String[tamanho];
        String[] enderecoProf = new String[tamanho];
        String[] logradouroProf = new String[tamanho];
        String[] cidadeAlunoProf = new String[tamanho];
        String[] estadoProf = new String[tamanho];
        String[] categoriaENEMProf = new String[tamanho];
        String[] materiaProf = new String[tamanho];
        String[] nestrelasProf = new String[tamanho];
        
        
        int controle = 99;
        int pos = 0;

        boolean encontrado;

        do {
            encontrado = true ; //por padrão;

            String op = JOptionPane.showInputDialog(null, "1. Cadastrar\n"
                    + "2. Alterar\n"
                    + "3. Excluir\n"
                    + "4. Pesquisar\n"
                    + "5. Listar\n"
                    + "0. Sair", "AGENDA", 1);
            switch (op) {
                case "1":
                    controle = 1;
                    break;
                case "2":
                    controle = 2;
                    break;
                case "3":
                    controle = 3;
                    break;
                case "4":
                    controle = 4;
                    break;
                case "5":
                    controle = 5;
                    break;
                case "0":
                    controle = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor incorreto digite um numero entre 0 e 5");
            }
            if (controle == 1) {

                String id = JOptionPane.showInputDialog(null, "1. Professor\n2. Aluno");
                switch (id) {
                    case "1":
                        profOuAluno[pos] = "1";
                        break;
                    case "2":
                        profOuAluno[pos] = "2";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Valor invalido!");
                }

                controle = Integer.parseInt(profOuAluno[pos]);

                nome[pos] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                email[pos] = JOptionPane.showInputDialog(null, "Informe um E-mail valido");
                usuario[pos] = JOptionPane.showInputDialog(null, "Informe o nome de usúario");
                senha[pos] = JOptionPane.showInputDialog(null, "Informe a Senha");
                telefone[pos] = JOptionPane.showInputDialog(null, "Informe numero de telefone com o DDD");

                String aprenderouensinar = "";
                aprenderouensinar = (controle == 1) ? "ensinar" : "aprender";

                String idCategoria = JOptionPane.showInputDialog(null,
                        "Qaul Categoria deseja " + aprenderouensinar + "\n"
                        + "1 Ciências Humanas e suas Tecnologias\n"
                        + "2 Ciências da Natureza e suas Tecnologias\n"
                        + "3 Linguagens, Códigos e suas Tecnologias\n"
                        + "4 Matemática e suas Tecnologias\n"
                        + "5 Redação.");

                switch (idCategoria) {
                    case "1":
                        categoria[pos] = "Ciências Humanas e suas Tecnologias";
                        break;
                    case "2":
                        categoria[pos] = "Ciências da Natureza e suas Tecnologias";
                        break;
                    case "3":
                        categoria[pos] = "Linguagens, Códigos e suas Tecnologias";
                        break;
                    case "4":
                        categoria[pos] = "Matemática e suas Tecnologias";
                        break;
                    case "5":
                        categoria[pos] = "Redação";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Valor invalido!");
                }
                pos++;
                controle = 99;

            }

            if (controle == 2) {

                String pesquisa = JOptionPane.showInputDialog(null, "Informe o nome de usuario");
                for (int i = 0; i < pos; i++) {
                    if (usuario[i].equals(pesquisa)) {

                        encontrado = true;
                        String id = JOptionPane.showInputDialog(null, "1. Professor\n2. Aluno");
                        switch (id) {
                            case "1":
                                profOuAluno[pos] = "1";
                                break;
                            case "2":
                                profOuAluno[pos] = "2";
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Valor invalido!");
                        }
                        nome[pos] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                        email[pos] = JOptionPane.showInputDialog(null, "Informe um E-mail valido");
                        usuario[pos] = JOptionPane.showInputDialog(null, "Informe o nome de usúario");
                        senha[pos] = JOptionPane.showInputDialog(null, "Informe a Senha");
                        telefone[pos] = JOptionPane.showInputDialog(null, "Informe numero de telefone com o DDD");

                        String aprenderouensinar = "";
                        aprenderouensinar = (controle == 1) ? "ensinar" : "aprender";

                        String idCategoria = JOptionPane.showInputDialog(null,
                                "Qaul Categoria deseja " + aprenderouensinar + "\n"
                                + "1 Ciências Humanas e suas Tecnologias\n"
                                + "2 Ciências da Natureza e suas Tecnologias\n"
                                + "3 Linguagens, Códigos e suas Tecnologias\n"
                                + "4 Matemática e suas Tecnologias\n"
                                + "5 Redação.");

                        switch (idCategoria) {
                            case "1":
                                categoria[pos] = "Ciências Humanas e suas Tecnologias";
                                break;
                            case "2":
                                categoria[pos] = "Ciências da Natureza e suas Tecnologias";
                                break;
                            case "3":
                                categoria[pos] = "Linguagens, Códigos e suas Tecnologias";
                                break;
                            case "4":
                                categoria[pos] = "Matemática e suas Tecnologias";
                                break;
                            case "5":
                                categoria[pos] = "Redação";
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Valor invalido!");
                        }

                    }
                }
                controle = 99;

            }

            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "Não encontrado!");
            }
            if (controle == 3) {

                String pesquisa = JOptionPane.showInputDialog(null, "Informe o nome de usuario");
                for (int i = 0; i < pos; i++) {
                    if (usuario[i].equals(pesquisa)) {
                        encontrado = true;
                        nome[i] = "";
                        email[i] = "";
                        usuario[i] = "";
                        senha[i] = "";
                        telefone[i] = "";

                        profOuAluno[i] = "";

                        categoria[i] = "";
                        materia[i] = "";

                    }

                }
                controle = 99;

            }

            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "Não encontrado!");
            }
            if (controle == 4) {

                String pesquisa = JOptionPane.showInputDialog(null, "Informe o nome de usuario");
                for (int i = 0; i < pos; i++) {
                    if (usuario[i].equals(pesquisa)) {
                        encontrado = true;

                        int pA = Integer.parseInt(profOuAluno[i]) % 2;
                        String aprenderouensinar = "";
                        aprenderouensinar = (pA == 1) ? "Professor" : "Aluno";

                        JOptionPane.showMessageDialog(null,
                                "Nome: " + nome[i] + "\n"
                                + "E-mail: " + email[i] + "\n"
                                + "Nome: " + usuario[i] + "\n"
                                + "Telefone: " + telefone[i] + "\n"
                                + aprenderouensinar + "\n"
                                + "Categoria: " + categoria[i] + "\n"
                                + "Materia: " + materia[i] + "\n"
                        );

                    }

                }
                controle = 99;

            }

            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "Não encontrado!");
            }

        } while (controle != 0);
        JOptionPane.showMessageDialog(null, "Programa encerrado!");

    }

}
