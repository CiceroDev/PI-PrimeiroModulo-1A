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
    @SuppressWarnings("empty-statement")
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

        String[] cidadeAluno = new String[tamanho];
        String[] estadoAluno = new String[tamanho];

        String[] categoriaENEMAluno = new String[tamanho];
        String[] materiaAluno = new String[tamanho];

        //  Array cadastrados para testes  //
        matriculaAluno[0] = "28120191124001";

        nomeAluno[0] = "Yasmin Melo";

        usuarioAluno[0] = "yasmin";
        senhaAluno[0] = "uo3eekoh0Ahz";

        emailAluno[0] = "yasmincarvalhomelo@teleworm.us";

        sexoAluno[0] = "2";
        telefoneAluno[0] = "(64) 7223-9093";
        cpfAluno[0] = "978.744.573-66";

        dataNascAluno[0] = "14/03/1938";

        cepAluno[0] = "75802-010";
        enderecoAluno[0] = "Rua 101 31";
        cidadeAluno[0] = "Jataí";
        estadoAluno[0] = "GO";

        categoriaENEMAluno[0] = "2";
        materiaAluno[0] = "3";

        //////////////////////////////////////
        //Input para Professor
        String[] matriculaProf = new String[tamanho];//auto increment
        String[] nomeProf = new String[tamanho];
        String[] emailProf = new String[tamanho];
        String[] usuarioProf = new String[tamanho];
        String[] senhaProf = new String[tamanho];
        String[] dataNascProf = new String[tamanho];
        String[] telefoneProf = new String[tamanho];
        String[] cpfProf = new String[tamanho];
        String[] enderecoProf = new String[tamanho];

        String[] cidadeProf = new String[tamanho];
        String[] estadoProf = new String[tamanho];
        String[] categoriaENEMProf = new String[tamanho];
        String[] materiaProf = new String[tamanho];
        String[] sexoProf = new String[tamanho];

        int controle = 6;
        int posA = 1;
        int posP = 1;

        boolean encontrado;

////////////////////////////////////////////////////////////////////////////////
        do {
            encontrado = false; //por padrão;

            //Menu Painel de controle
            String op = JOptionPane.showInputDialog(null, "1. Cadastrar\n"
                    + "2. Alterar\n"
                    + "3. Excluir\n"
                    + "4. Pesquisar\n"
                    + "5. Listar\n"
                    + "0. Sair", "Pasinel de Controle", 1);
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

            // Cadastrar Novo usuario
            if (controle == 1) {

                //Pegunta se vai cadastrar um aluno ou professor
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

                //cadastra um professor
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
                    controle = 99;

                }
/////////////////////cadastra um aluno///////////////////////////////////
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

///////////////////////// Altera os cadastros //////////////////////////////
            if (controle == 2) {

                String id2 = JOptionPane.showInputDialog(null, "1. Professor\n2. Aluno");

                int alterar = 0;
                switch (id2) {
                    case "1":
                        alterar = 1;
                        break;
                    case "2":
                        alterar = 2;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Valor invalido!");
                }

///////////////////// se aulerar == 1  autera o professor///////////////////
                if (alterar == 1) {
                    String pesquisa = JOptionPane.showInputDialog(null, "Informe o nome de usuario");
                    for (int i = 0; i < posA; i++) {
                        if (usuarioProf[i].equals(pesquisa)) {

                            encontrado = true;

                            nomeProf[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                            usuarioProf[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                            senhaProf[posP] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                            emailProf[i] = JOptionPane.showInputDialog(null, "Informe um E-mail valido");
                            sexoProf[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                            telefoneProf[i] = JOptionPane.showInputDialog(null, "Informe numero de telefone com o DDD");
                            dataNascProf[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                            cpfProf[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                            enderecoProf[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                            cidadeProf[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                            estadoProf[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");

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

                        }
                    }
                }

///////////////////// se aulerar == 1  autera o Aluno ///////////////////////
                if (alterar == 2) {
                    String pesquisa = JOptionPane.showInputDialog(null, "Informe o nome de usuario");
                    for (int i = 0; i < posA; i++) {
                        if (usuarioAluno[i].equals(pesquisa)) {

                            encontrado = true;

                            nomeAluno[posA] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                            usuarioAluno[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                            senhaAluno[posA] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                            emailAluno[i] = JOptionPane.showInputDialog(null, "Informe um E-mail valido");
                            sexoAluno[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                            telefoneAluno[i] = JOptionPane.showInputDialog(null, "Informe numero de telefone com o DDD");
                            dataNascAluno[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                            cpfAluno[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                            enderecoAluno[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                            cidadeAluno[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");
                            estadoAluno[i] = JOptionPane.showInputDialog(null, "Informe o nome completo");

                            String idCategoria = JOptionPane.showInputDialog(null,
                                    "Qaul Categoria de ensino Gostaria de aprender?\n\n"
                                    + "1 Ciências Humanas e suas Tecnologias\n"
                                    + "2 Ciências da Natureza e suas Tecnologias\n"
                                    + "3 Linguagens, Códigos e suas Tecnologias\n"
                                    + "4 Matemática e suas Tecnologias\n"
                                    + "5 Redação.");

                            switch (idCategoria) {
                                case "1":
                                    categoriaENEMAluno[i] = "Ciências Humanas e suas Tecnologias";

                                    break;
                                case "2":
                                    categoriaENEMAluno[i] = "Ciências da Natureza e suas Tecnologias";

                                    break;
                                case "3":
                                    categoriaENEMAluno[i] = "Linguagens, Códigos e suas Tecnologias";

                                    break;
                                case "4":
                                    categoriaENEMAluno[i] = "Matemática e suas Tecnologias";

                                    break;
                                case "5":
                                    categoriaENEMAluno[i] = "Redação";

                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Valor invalido!");

                            }
                        }

                        controle = 99;

                    }
                }
                if (encontrado == false) {
                    JOptionPane.showMessageDialog(null, "Não encontrado!");
                }
            }
/////////////////////// exclui um cadastro //////////////////////////////////

            if (controle == 3) {

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

                            matriculaProf[i] = "";
                            nomeProf[i] = "";
                            usuarioProf[i] = "";
                            senhaProf[i] = "";
                            dataNascProf[i] = "";
                            telefoneProf[i] = "";
                            cpfProf[i] = "";
                            enderecoProf[i] = "";

                            cidadeProf[i] = "";
                            estadoProf[i] = "";
                            categoriaENEMProf[i] = "";
                            materiaProf[i] = "";
                            sexoProf[i] = "";

                        }
                    }

                }
                if (iduser == 2) {
                    String pesquisa = JOptionPane.showInputDialog(null, "Informe o nome de usuario");
                    for (int i = 0; i < posA; i++) {
                        if (usuarioProf[i].equals(pesquisa)) {

                            encontrado = true;

                            matriculaAluno[i] = "";
                            nomeAluno[i] = "";
                            usuarioAluno[i] = "";
                            senhaAluno[i] = "";
                            dataNascAluno[i] = "";
                            telefoneAluno[i] = "";
                            cpfAluno[i] = "";
                            enderecoAluno[i] = "";

                            cidadeAluno[i] = "";
                            estadoAluno[i] = "";
                            categoriaENEMAluno[i] = "";
                            materiaAluno[i] = "";
                            sexoProf[i] = "";

                        }

                    }
                    controle = 99;
                    if (encontrado == false) {
                        JOptionPane.showMessageDialog(null, "Não encontrado!");
                    }

                }
            }

////////////////Pesquisa usuarios / Professor e Aluno //////////////////////
            if (controle == 4) {

                String id3 = JOptionPane.showInputDialog(null, "1. Professor\n2. Aluno");
                int pesquisar = 0;
                switch (id3) {
                    case "1":
                        pesquisar = 1;
                        break;
                    case "2":
                        pesquisar = 2;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Valor invalido!");
                }

                if (pesquisar == 1) {
                    String pesquisa = JOptionPane.showInputDialog(null, "Informe o nome de usuario");
                    for (int i = 0; i < posP; i++) {
                        if (usuarioProf[i].equals(pesquisa)) {

                            encontrado = true;

                            JOptionPane.showMessageDialog(null, ""
                                    + "Nome: " + nomeProf[i] + "/n"
                                    + "Usuario: " + usuarioProf[i] + "/n"
                                    + "Sexo: " + sexoProf[i] + "/n"
                                    + "E-mail: " + emailProf[i] + "/n"
                                    + "Telefone: " + telefoneProf[i] + "/n"
                                    + "Data Nascimento: " + dataNascProf[i] + "/n"
                                    + "CPF: " + cpfProf[i] + "/n"
                                    + "Endereço: " + enderecoProf[i] + "/n"
                                    + "Cidade: " + cidadeProf[i] + "/n"
                                    + "Estafo: " + estadoProf[i] + "/n"
                                    + "Categoria: " + categoriaENEMProf[i] + "/n"
                            );
                        }
                        if (encontrado == false) {
                            JOptionPane.showMessageDialog(null, "Não encontrado!");
                        }

                    }

                }
                if (pesquisar == 2) {

                    String pesquisa = JOptionPane.showInputDialog(null, "Informe o nome de usuario");

                    for (int i = 0; i < posA; i++) {

                        if (usuarioAluno[i].equals(pesquisa)) {

                            encontrado = true;

                            JOptionPane.showMessageDialog(null, ""
                                    + "Nome: " + nomeAluno[i] + "\n"
                                    + "Usuario: " + usuarioAluno[i] + "\n"
                                    + "Sexo: " + sexoAluno[i] + "\n"
                                    + "E-mail: " + emailAluno[i] + "\n"
                                    + "Telefone: " + telefoneAluno[i] + "\n"
                                    + "Data Nascimento: " + dataNascAluno[i] + "\n"
                                    + "CPF: " + cpfAluno[i] + "\n"
                                    + "Endereço: " + enderecoAluno[i] + "\n"
                                    + "Cidade: " + cidadeAluno[i] + "\n"
                                    + "Estafo: " + estadoAluno[i] + "\n"
                                    + "Categoria: " + categoriaENEMAluno[i] + "\n");
                        }

                    }
                    controle = 99;
                    if (encontrado == false) {
                        JOptionPane.showMessageDialog(null, "Não encontrado!");

                    }

                }

            }
            if (controle == 5) {

                String id3 = JOptionPane.showInputDialog(null, "1. Professor\n2. Aluno");
                int Lista = 0;
                switch (id3) {
                    case "1":
                        Lista = 1;
                        break;
                    case "2":
                        Lista = 2;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Valor invalido!");
                }
                if (Lista == 1) {
                    for (int i = 0; i < posP; i++) {
                        JOptionPane.showMessageDialog(null,
                                "Nome: " + nomeProf[i] + "\n"
                                + "Usuario: " + usuarioProf[i] + "\n"
                                + "CPF: " + cpfProf[i] + "\n");

                    }

                }
                if (Lista == 2) {
                    for (int i = 0; i < posA; i++) {
                        JOptionPane.showMessageDialog(null,
                                "Nome: " + nomeAluno[i] + "\n"
                                + "Usuario: " + usuarioAluno[i] + "\n"
                                + "CPF: " + cpfAluno[i] + "\n");

                    }

                }
                controle = 99;
            }

        } while (controle != 0);
        JOptionPane.showMessageDialog(null, "Programa encerrado!");

    }

}
