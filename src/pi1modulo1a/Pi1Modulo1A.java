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
        String[] matriculaAluno = new String[tamanho]; //automatico

        String[] nomeAluno = new String[tamanho];

        String[] emailAluno = new String[tamanho];
        String[] usuarioAluno = new String[tamanho];
        String[] senhaAluno = new String[tamanho];

        String[] sexoAluno = new String[tamanho];

        String[] telefoneAluno = new String[tamanho];

        String[] cpfAluno = new String[tamanho];
        String[] dataNascAluno = new String[tamanho];

        String[] enderecoAluno = new String[tamanho];
        String[] cepAluno = new String[tamanho];
        String[] logradouroAluno = new String[tamanho];
        String[] cidadeAluno = new String[tamanho];
        String[] estadoAluno = new String[tamanho];

        String[] categoriaENEMAluno = new String[tamanho];
        String[] materiaAluno = new String[tamanho];

        //  Array cadastrados para testes  //
        matriculaAluno[0] = "28120191124001";

        nomeAluno[0] = "Yasmin Melo";

        usuarioAluno[0] = "Cipen1938";
        senhaAluno[0] = "uo3eekoh0Ahz";

        emailAluno[0] = "yasmincarvalhomelo@teleworm.us";

        sexoAluno[0] = "2";
        telefoneAluno[0] = "(64) 7223-9093";
        cpfAluno[0] = "978.744.573-66";

        dataNascAluno[0] = "14/03/1938";

        cepAluno[0] = "75802-010";
        enderecoAluno[0] = "Rua 101 31";
        logradouroAluno[0] = "Rua";
        cidadeAluno[0] = "Jataí";
        estadoAluno[0] = "GO";

        categoriaENEMAluno[0] = "2";
        materiaAluno[0] = "3";

        //////////////////////////////////////
        //Input para Professor
        String[] matriculaProf = new String[tamanho];
        String[] nomeProf = new String[tamanho];
        String[] emailProf = new String[tamanho];
        String[] usuarioProf = new String[tamanho];
        String[] senhaProf = new String[tamanho];
        String[] dataNascProf = new String[tamanho];
        String[] telefoneProf = new String[tamanho];
        String[] cpfProf = new String[tamanho];
        String[] enderecoProf = new String[tamanho];
        String[] logradouroProf = new String[tamanho];
        String[] cidadeProf = new String[tamanho];
        String[] estadoProf = new String[tamanho];
        String[] categoriaENEMProf = new String[tamanho];
        String[] materiaProf = new String[tamanho];
        String[] sexoProf = new String[tamanho];

        int controle = 99;
        int posA = 1;
        int posP = 1;

        boolean encontrado;

        do {
            encontrado = true; //por padrão;

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
                int cadastrar = 0;
                switch (id) {
                    case "1":
                        cadastrar = 1;
                        break;
                    case "2":
                        cadastrar = 2;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Valor invalido!");
                }
                if (cadastrar == 1) {
                    nomeProf[posP] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                    usuarioProf[posP] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                    senhaProf[posP] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                    emailProf[posP] = JOptionPane.showInputDialog(null, "Informe um E-mail valido");
                    sexoProf[posP] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                    telefoneProf[posP] = JOptionPane.showInputDialog(null, "Informe numero de telefone com o DDD");
                    dataNascProf[posP] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                    cpfProf[posP] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                    enderecoProf[posP] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                    logradouroProf[posP] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                    cidadeProf[posP] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                    estadoProf[posP] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                    String aprenderouensinar = "";
                    int idMateria = 0;
                    String idCategoria = JOptionPane.showInputDialog(null,
                            "Qaul Categoria de ensino você pertence?\n\n"
                            + "1 Ciências Humanas e suas Tecnologias\n"
                            + "2 Ciências da Natureza e suas Tecnologias\n"
                            + "3 Linguagens, Códigos e suas Tecnologias\n"
                            + "4 Matemática e suas Tecnologias\n"
                            + "5 Redação.");

                    switch (idCategoria) {
                        case "1":
                            categoriaENEMProf[posP] = "Ciências Humanas e suas Tecnologias";

                            break;
                        case "2":
                            categoriaENEMProf[posP] = "Ciências da Natureza e suas Tecnologias";

                            break;
                        case "3":
                            categoriaENEMProf[posP] = "Linguagens, Códigos e suas Tecnologias";

                            break;
                        case "4":
                            categoriaENEMProf[posP] = "Matemática e suas Tecnologias";

                            break;
                        case "5":
                            categoriaENEMProf[posP] = "Redação";

                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Valor invalido!");
                    }
                    posP++;

                }
                if (cadastrar == 2) {
                    nomeAluno[posA] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                    usuarioAluno[posA] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                    senhaAluno[posA] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                    emailAluno[posA] = JOptionPane.showInputDialog(null, "Informe um E-mail valido");
                    sexoAluno[posA] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                    telefoneAluno[posA] = JOptionPane.showInputDialog(null, "Informe numero de telefone com o DDD");
                    dataNascAluno[posA] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                    cpfAluno[posA] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                    enderecoAluno[posA] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                    logradouroAluno[posA] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                    cidadeAluno[posA] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                    estadoAluno[posA] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                    String idCategoria = JOptionPane.showInputDialog(null,
                            "Qaul Categoria de ensino Gostaria de aprender?\n\n"
                            + "1 Ciências Humanas e suas Tecnologias\n"
                            + "2 Ciências da Natureza e suas Tecnologias\n"
                            + "3 Linguagens, Códigos e suas Tecnologias\n"
                            + "4 Matemática e suas Tecnologias\n"
                            + "5 Redação.");

                    switch (idCategoria) {
                        case "1":
                            categoriaENEMAluno[posA] = "Ciências Humanas e suas Tecnologias";

                            break;
                        case "2":
                            categoriaENEMAluno[posA] = "Ciências da Natureza e suas Tecnologias";

                            break;
                        case "3":
                            categoriaENEMAluno[posA] = "Linguagens, Códigos e suas Tecnologias";

                            break;
                        case "4":
                            categoriaENEMAluno[posA] = "Matemática e suas Tecnologias";

                            break;
                        case "5":
                            categoriaENEMAluno[posA] = "Redação";

                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Valor invalido!");
                    }

                    posA++;

                }

                controle = 99;

            }

            if (controle == 2) {

                String tipoUser = JOptionPane.showInputDialog(null, "1. Professor\n\n2. Aluno");

                int iduser = 0;
                switch (tipoUser) {
                    case "1":
                        iduser = 1;
                        break;

                    case "2":
                        iduser = 2;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Valor invalido!");
                }
                if (iduser == 1) {
                    String pesquisa = JOptionPane.showInputDialog(null, "Informe o nome de usuario");
                    for (int i = 0; i < posP; i++) {
                        if (usuarioProf[i].equals(pesquisa)) {
                            encontrado = true;
                            JOptionPane.showMessageDialog(null, ""
                                    + "Nome " + nomeProf[i]
                                    + "" + usuarioProf[i]
                                    + "" + sexoProf[i]
                                    + "" + emailProf[i]
                                    + "" + telefoneProf[i]
                                    + "" + dataNascProf[i]
                                    + "" + cpfProf[i]
                                    + "" + logradouroProf[i] + " " + enderecoProf[i]
                                    + "" + cidadeProf[i]
                                    + "" + estadoProf[i]
                                    + "" + categoriaENEMProf[i]
                            );

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
