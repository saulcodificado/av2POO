//Moradia.java:
public abstract class Moradia {
    private String endereco;
    private double area;
    private double valorAluguel;

    public Moradia(String endereco, double area, double valorAluguel) {
        this.endereco = endereco;
        this.area = area;
        this.valorAluguel = valorAluguel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public abstract double calcularImposto();

    @Override
    public String toString() {
        return "Endereço: " + endereco
                + "\nÁrea: " + area + " m²"
                + "\nAluguel: R$ " + valorAluguel
                + "\nImposto: R$ " + calcularImposto();
    }
}

//Casa.java
public class Casa extends Moradia {
    private double tamanhoQuintal;
    private int numeroAndares;

    public Casa(String endereco, double area, double valorAluguel,
                double tamanhoQuintal, int numeroAndares) {
        super(endereco, area, valorAluguel);
        this.tamanhoQuintal = tamanhoQuintal;
        this.numeroAndares = numeroAndares;
    }

    public double getTamanhoQuintal() {
        return tamanhoQuintal;
    }

    public void setTamanhoQuintal(double tamanhoQuintal) {
        this.tamanhoQuintal = tamanhoQuintal;
    }

    public int getNumeroAndares() {
        return numeroAndares;
    }

    public void setNumeroAndares(int numeroAndares) {
        this.numeroAndares = numeroAndares;
    }

    @Override
    public double calcularImposto() {
        return getValorAluguel() * 0.05;
    }

    @Override
    public String toString() {
        return "\n CASA \n"
                + super.toString()
                + "\nTamanho do quintal: " + tamanhoQuintal + " m²"
                + "\nNúmero de andares: " + numeroAndares;
    }
}
//Apartamento.java
public class Apartamento extends Moradia {
    private int andar;
    private double valorCondominio;
    private int numeroBloco;

    public Apartamento(String endereco, double area, double valorAluguel,
                       int andar, double valorCondominio, int numeroBloco) {
        super(endereco, area, valorAluguel);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
        this.numeroBloco = numeroBloco;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public int getNumeroBloco() {
        return numeroBloco;
    }

    public void setNumeroBloco(int numeroBloco) {
        this.numeroBloco = numeroBloco;
    }

    @Override
    public double calcularImposto() {
        return getValorAluguel() * 0.03;
    }

    @Override
    public String toString() {
        return "\n APARTAMENTO \n"
                + super.toString()
                + "\nAndar: " + andar
                + "\nCondomínio: R$ " + valorCondominio
                + "\nNúmero do bloco: " + numeroBloco;
    }
}
//PrincipalMoradia.java
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalMoradia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Moradia> moradias = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n SISTEMA DE MORADIAS ");
            System.out.println("1 - Cadastrar casa");
            System.out.println("2 - Cadastrar apartamento");
            System.out.println("3 - Listar moradias");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Endereço: ");
                    String enderecoCasa = sc.nextLine();

                    System.out.print("Área em m²: ");
                    double areaCasa = sc.nextDouble();

                    System.out.print("Valor do aluguel: ");
                    double aluguelCasa = sc.nextDouble();

                    System.out.print("Tamanho do quintal em m²: ");
                    double quintal = sc.nextDouble();

                    System.out.print("Número de andares: ");
                    int andares = sc.nextInt();
                    sc.nextLine();

                    moradias.add(new Casa(enderecoCasa, areaCasa,
                            aluguelCasa, quintal, andares));

                    System.out.println("Casa cadastrada!");
                    break;

                case 2:
                    System.out.print("Endereço: ");
                    String enderecoApto = sc.nextLine();

                    System.out.print("Área em m²: ");
                    double areaApto = sc.nextDouble();

                    System.out.print("Valor do aluguel: ");
                    double aluguelApto = sc.nextDouble();

                    System.out.print("Andar: ");
                    int andar = sc.nextInt();

                    System.out.print("Valor do condomínio: ");
                    double condominio = sc.nextDouble();

                    System.out.print("Número do bloco: ");
                    int bloco = sc.nextInt();
                    sc.nextLine();

                    moradias.add(new Apartamento(enderecoApto, areaApto,
                            aluguelApto, andar, condominio, bloco));

                    System.out.println("Apartamento cadastrado!");
                    break;

                case 3:
                    if (moradias.isEmpty()) {
                        System.out.println("Nenhuma moradia cadastrada.");
                    } else {
                        for (Moradia m : moradias) {
                            System.out.println(m);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
