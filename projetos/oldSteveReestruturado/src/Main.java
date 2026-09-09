
public static void main(String[] args) {


        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   VELHO STEVE - FÁBRICA DE PICARETAS MANUAL         ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        List<Picareta> picaretas = new ArrayList<>();
        Picareta p1 = new Picareta("madeira", 50, 5);
        picaretas.add(p1);
        Picareta p2 = new Picareta("pedra", 70, 8);
        picaretas.add(p2);
        Picareta p3 = new Picareta("ferro", 100, 12);
        picaretas.add(p3);


        System.out.println("\nPicaretas fabricadas:");
        for(Picareta p : picaretas){
            System.out.println(p.toString());
        }

        System.out.println("\n  Usando picaretas para minerar...");
        p1.executarFuncao();
        p2.executarFuncao();
        p3.executarFuncao();


        System.out.println("\n Reparando a picareta de ferro...");
        p3.repararFerramenta();

        System.out.println("\nEstado final das picaretas:");
        for(Picareta p : picaretas){
                p.exibirInformacoes();
        }




}
