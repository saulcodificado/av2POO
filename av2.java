//Personagem.java
public abstract class Personagem {
    private String nome;
    private int nivel;
    private int pontosVida;

    public Personagem(String nome, int nivel, int pontosVida) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontosVida = pontosVida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public abstract String executarHabilidadeEspecial();

    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nNível: " + nivel
                + "\nPontos de vida: " + pontosVida
                + "\nHabilidade especial: " + executarHabilidadeEspecial();
    }
}
//Arqueiro.java
public class Arqueiro extends Personagem {
    private int numeroFlechas;
    private double precisao;

    public Arqueiro(String nome, int nivel, int pontosVida,
                    int numeroFlechas, double precisao) {
        super(nome, nivel, pontosVida);
        this.numeroFlechas = numeroFlechas;
        this.precisao = precisao;
    }

    public int getNumeroFlechas() {
        return numeroFlechas;
    }

    public void setNumeroFlechas(int numeroFlechas) {
        this.numeroFlechas = numeroFlechas;
    }

    public double getPrecisao() {
        return precisao;
    }

    public void setPrecisao(double precisao) {
        this.precisao = precisao;
    }

    @Override
    public String executarHabilidadeEspecial() {
        return "Chuva de flechas";
    }

    @Override
    public String toString() {
        return "\n--- ARQUEIRO ---\n"
                + super.toString()
                + "\nNúmero de flechas: " + numeroFlechas
                + "\nPrecisão: " + precisao + "%";
    }
}
//Cavaleiro.java
public class Cavaleiro extends Personagem {
    private int forcaEscudo;
    private String tipoArmadura;

    public Cavaleiro(String nome, int nivel, int pontosVida,
                     int forcaEscudo, String tipoArmadura) {
        super(nome, nivel, pontosVida);
        this.forcaEscudo = forcaEscudo;
        this.tipoArmadura = tipoArmadura;
    }

    public int getForcaEscudo() {
        return forcaEscudo;
    }

    public void setForcaEscudo(int forcaEscudo) {
        this.forcaEscudo = forcaEscudo;
    }

    public String getTipoArmadura() {
        return tipoArmadura;
    }

    public void setTipoArmadura(String tipoArmadura) {
        this.tipoArmadura = tipoArmadura;
    }

    @Override
    public String executarHabilidadeEspecial() {
        return "Investida com escudo";
    }

    @Override
    public String toString() {
        return "\n--- CAVALEIRO ---\n"
                + super.toString()
                + "\nForça do escudo: " + forcaEscudo
                + "\nTipo de armadura: " + tipoArmadura;
    }
}
//Mago.java
public class Mago extends Personagem {
    private int mana;
    private String escolaMagia;

    public Mago(String nome, int nivel, int pontosVida,
                int mana, String escolaMagia) {
        super(nome, nivel, pontosVida);
        this.mana = mana;
        this.escolaMagia = escolaMagia;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getEscolaMagia() {
        return escolaMagia;
    }

    public void setEscolaMagia(String escolaMagia) {
        this.escolaMagia = escolaMagia;
    }

    @Override
    public String executarHabilidadeEspecial() {
        return "Explosão mágica";
    }

    @Override
    public String toString() {
        return "\n--- MAGO ---\n"
                + super.toString()
                + "\nMana: " + mana
                + "\nEscola de magia: " + escolaMagia;
    }
}
//PrincipalRPG.java
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalRPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Personagem> personagens = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n RPG ");
            System.out.println("1 - Cadastrar arqueiro");
            System.out.println("2 - Cadastrar cavaleiro");
            System.out.println("3 - Cadastrar mago");
            System.out.println("4 - Listar personagens");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeArqueiro = sc.nextLine();

                    System.out.print("Nível: ");
                    int nivelArqueiro = sc.nextInt();

                    System.out.print("Pontos de vida: ");
                    int vidaArqueiro = sc.nextInt();

                    System.out.print("Número de flechas: ");
                    int flechas = sc.nextInt();

                    System.out.print("Precisão (%): ");
                    double precisao = sc.nextDouble();
                    sc.nextLine();

                    personagens.add(new Arqueiro(nomeArqueiro,
                            nivelArqueiro, vidaArqueiro, flechas, precisao));

                    System.out.println("Arqueiro cadastrado!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeCavaleiro = sc.nextLine();

                    System.out.print("Nível: ");
                    int nivelCavaleiro = sc.nextInt();

                    System.out.print("Pontos de vida: ");
                    int vidaCavaleiro = sc.nextInt();

                    System.out.print("Força do escudo: ");
                    int forca = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Tipo de armadura: ");
                    String armadura = sc.nextLine();

                    personagens.add(new Cavaleiro(nomeCavaleiro,
                            nivelCavaleiro, vidaCavaleiro, forca, armadura));

                    System.out.println("Cavaleiro cadastrado!");
                    break;

                case 3:
                    System.out.print("Nome: ");
                    String nomeMago = sc.nextLine();

                    System.out.print("Nível: ");
                    int nivelMago = sc.nextInt();

                    System.out.print("Pontos de vida: ");
                    int vidaMago = sc.nextInt();

                    System.out.print("Mana: ");
                    int mana = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Escola de magia: ");
                    String escola = sc.nextLine();

                    personagens.add(new Mago(nomeMago, nivelMago,
                            vidaMago, mana, escola));

                    System.out.println("Mago cadastrado!");
                    break;

                case 4:
                    if (personagens.isEmpty()) {
                        System.out.println("Nenhum personagem cadastrado.");
                    } else {
                        for (Personagem p : personagens) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do jogo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
