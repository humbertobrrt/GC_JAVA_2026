import java.util.Scanner;

public class Picareta implements Ferramenta {

    private String material;
    private int durabilidade;
    private int forca;

    public Picareta(String material, int durabilidade, int forca) {
        this.material = material;
        this.durabilidade = durabilidade;
        this.forca = forca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void exibirInformacoes(){
        System.out.println("\nInformações da piracareta!");
        System.out.println("Material: " + this.material);
        System.out.println("Durabilidade: " + this.durabilidade);
        System.out.println("Força: " + this.forca);
    }

    @Override
    public void executarFuncao(){

        System.out.println("\n=== MINERANDO COM PICARETA DE " + this.material.toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + durabilidade);
        System.out.println("Força: " + forca);

        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos blocos você deseja minerar oom essa picareta?");
        int blocos = ler.nextInt();

        System.out.println("Blocos a minerar: " + blocos);

        if (durabilidade <= 0) {
            System.out.println("Picareta quebrada!");
        }

        int blocosMinerados = 0;
        int durabilidadeRestante = durabilidade;

        for (int i = 0; i < blocos; i++) {
            if (durabilidadeRestante <= 0) {
                System.out.println(" Picareta quebrou no bloco " + (i + 1));
                break;
            }
            this.setDurabilidade(this.getDurabilidade() - blocosMinerados);
            blocosMinerados++;
        }

        System.out.println("\nMinerados " + blocosMinerados + " blocos");
        System.out.println("Durabilidade restante: " + durabilidadeRestante);

        if (durabilidadeRestante <= 0) {
            System.out.println(" A picareta de " + this.material + " quebrou completamente!");
        }

    }

    @Override
    public void repararFerramenta() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Quanto você deseja reparar sua picareta?");
        int quantidade = ler.nextInt();

        System.out.println("\n=== REPARANDO PICARETA DE " + this.material.toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + this.durabilidade);
        System.out.println("Quantidade a reparar: " + quantidade);

        int limiteMaximo = 0;

        switch (material.toLowerCase()) {
            case "madeira":
                limiteMaximo = 50;
                break;
            case "pedra":
                limiteMaximo = 70;
                break;
            case "ferro":
                limiteMaximo = 100;
                break;
            case "ouro":
                limiteMaximo = 30;
                break;
            default:
                limiteMaximo = 60;
        }

        int durabilidadeNova = this.durabilidade + quantidade;

        if (durabilidadeNova > limiteMaximo) {
            durabilidadeNova = limiteMaximo;
        }

        this.setDurabilidade(durabilidadeNova);

        System.out.println("Durabilidade nova: " + this.durabilidade);
    }

}
