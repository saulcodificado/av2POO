//Heroi.java
public abstract class Heroi {
    private String nome;
    private int idade;
    private int nivelPoder;

    public Heroi(String nome, int idade, int nivelPoder) {
        this.nome = nome;
        this.idade = idade;
        this.nivelPoder = nivelPoder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public abstract String usarPoderEspecial();

    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nIdade: " + idade
                + "\nNível de poder: " + nivelPoder
                + "\nPoder especial: " + usarPoderEspecial();
    }
}
//HomemAranha.java
public class HomemAranha extends Heroi {
    private int quantidadeTeias;
    private int agilidade;

    public HomemAranha(String nome, int idade, int nivelPoder,
                       int quantidadeTeias, int agilidade) {
        super(nome, idade, nivelPoder);
        this.quantidadeTeias = quantidadeTeias;
        this.agilidade = agilidade;
    }

    public int getQuantidadeTeias() {
        return quantidadeTeias;
    }

    public void setQuantidadeTeias(int quantidadeTeias) {
        this.quantidadeTeias = quantidadeTeias;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    @Override
    public String usarPoderEspecial() {
        return "Lançar teias e escalar paredes";
    }

    @Override
    public String toString() {
        return "\n HOMEM-ARANHA \n"
                + super.toString()
                + "\nQuantidade de teias: " + quantidadeTeias
                + "\nAgilidade: " + agilidade;
    }
}
//Hulk.java
public class Hulk extends Heroi {
    private int forcaFisica;
    private int nivelRaiva;

    public Hulk(String nome, int idade, int nivelPoder,
                int forcaFisica, int nivelRaiva) {
        super(nome, idade, nivelPoder);
        this.forcaFisica = forcaFisica;
        this.nivelRaiva = nivelRaiva;
    }

    public int getForcaFisica() {
        return forcaFisica;
    }

    public void setForcaFisica(int forcaFisica) {
        this.forcaFisica = forcaFisica;
    }

    public int getNivelRaiva() {
        return nivelRaiva;
    }

    public void setNivelRaiva(int nivelRaiva) {
        this.nivelRaiva = nivelRaiva;
    }

    @Override
    public String usarPoderEspecial() {
        return "Superforça e salto gigante";
    }

    @Override
    public String toString() {
        return "\n HULK \n"
                + super.toString()
                + "\nForça física: " + forcaFisica
                + "\nNível de raiva: " + nivelRaiva;
    }
}
//Wolverine.java
public class Wolverine extends Heroi {
    private int regeneracao;
    private String tipoGarras;

    public Wolverine(String nome, int idade, int nivelPoder,
                     int regeneracao, String tipoGarras) {
        super(nome, idade, nivelPoder);
        this.regeneracao = regeneracao;
        this.tipoGarras = tipoGarras;
    }

    public int getRegeneracao() {
        return regeneracao;
    }

    public void setRegeneracao(int regeneracao) {
        this.regeneracao = regeneracao;
    }

    public String getTipoGarras() {
        return tipoGarras;
    }

    public void setTipoGarras(String tipoGarras) {
        this.tipoGarras = tipoGarras;
    }

    @Override
    public String usarPoderEspecial() {
        return "Fator de cura e garras retráteis";
    }

    @Override
    public String toString() {
        return "\n WOLVERINE \n"
                + super.toString()
                + "\nNível de regeneração: " + regeneracao
                + "\nTipo de garras: " + tipoGarras;
    }
}
//PrincipalHeroi.java
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalHeroi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Heroi> herois = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n SISTEMA DE CADASTRO DE HEROIS ");
            System.out.println("1 - Cadastrar Homem-Aranha");
            System.out.println("2 - Cadastrar Hulk");
            System.out.println("3 - Cadastrar Wolverine");
            System.out.println("4 - Listar todos os herois");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do heroi: ");
                    String nomeAranha = sc.nextLine();

                    System.out.print("Idade: ");
                    int idadeAranha = sc.nextInt();

                    System.out.print("Nivel de poder: ");
                    int poderAranha = sc.nextInt();

                    System.out.print("Quantidade de teias: ");
                    int teias = sc.nextInt();

                    System.out.print("Agilidade: ");
                    int agilidade = sc.nextInt();
                    sc.nextLine();

                    herois.add(new HomemAranha(nomeAranha,
                            idadeAranha, poderAranha,
                            teias, agilidade));

                    System.out.println("Homem-Aranha cadastrado!");
                    break;

                case 2:
                    System.out.print("Nome do heroi: ");
                    String nomeHulk = sc.nextLine();

                    System.out.print("Idade: ");
                    int idadeHulk = sc.nextInt();

                    System.out.print("Nivel de poder: ");
                    int poderHulk = sc.nextInt();

                    System.out.print("Forca fisica: ");
                    int forca = sc.nextInt();

                    System.out.print("Nivel de raiva: ");
                    int raiva = sc.nextInt();
                    sc.nextLine();

                    herois.add(new Hulk(nomeHulk, idadeHulk,
                            poderHulk, forca, raiva));

                    System.out.println("Hulk cadastrado!");
                    break;

                case 3:
                    System.out.print("Nome do heroi: ");
                    String nomeWolverine = sc.nextLine();

                    System.out.print("Idade: ");
                    int idadeWolverine = sc.nextInt();

                    System.out.print("Nivel de poder: ");
                    int poderWolverine = sc.nextInt();

                    System.out.print("Nivel de regeneracao: ");
                    int regeneracao = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Tipo de garras: ");
                    String garras = sc.nextLine();

                    herois.add(new Wolverine(nomeWolverine,
                            idadeWolverine, poderWolverine,
                            regeneracao, garras));

                    System.out.println("Wolverine cadastrado!");
                    break;

                case 4:
                    if (herois.isEmpty()) {
                        System.out.println(
                                "Nenhum heroi cadastrado.");
                    } else {
                        System.out.println("\n HEROIS CADASTRADOS ");

                        for (Heroi heroi : herois) {
                            System.out.println(heroi);
                            System.out.println("-------------------------");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
