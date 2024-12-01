import model.Acessorio;
import model.Animal;
import model.Racao;
import service.AcessorioService;
import service.AnimalService;
import service.RacaoService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        AnimalService as = new AnimalService();
        RacaoService rs = new RacaoService();
        AcessorioService acs = new AcessorioService();

        int tipoOperacao;

        do {
            System.out.println("Para cadastrar, digite: 1.\nPara vender, digite: 2.\nPara sair, digite: 0.");
            tipoOperacao = sc.nextInt();

            switch (tipoOperacao) {
                case 1: // Cadastro
                    int tipoProduto;
                    System.out.println("Para cadastrar um animal, digite 1.\nPara cadastrar uma ração, digite 2.\nPara cadastrar acessórios, digite 3.\nPara sair, digite 0.");
                    do {
                        tipoProduto = sc.nextInt();
                        switch (tipoProduto) {
                            case 1: // Cadastro de Animal
                                Animal a = new Animal();
                                System.out.println("Qual espécie do animal que deseja cadastrar:");
                                a.setNome(sc2.nextLine());
                                System.out.println("Qual é a raça do animal:");
                                a.setRaca(sc2.nextLine());
                                System.out.println("Qual a idade do animal:");
                                a.setIdade(sc.nextDouble());
                                System.out.println("O animal está vacinado: (para sim digite 1, se não digite 0)");
                                int varVacina = sc.nextInt();
                                a.setVacinado(varVacina == 1);
                                System.out.println("Qual preço deste animal:");
                                a.setPreco(sc.nextDouble());
                                //animais.add(a);
                                as.adicionar(a);
                                System.out.println("Animal cadastrado com sucesso!");
                                break;

                            case 2: // Cadastro de Ração
                                Racao r = new Racao();
                                System.out.println("Qual nome desta ração:");
                                r.setNome(sc2.nextLine());
                                System.out.println("Para que tipo de animal é esta ração:");
                                r.setTipoAnimal(sc2.nextLine());
                                System.out.println("Peso desta ração:");
                                r.setPeso(sc.nextDouble());
                                System.out.println("Preço desta ração:");
                                r.setPreco(sc.nextDouble());
                                //racoes.add(r);
                                rs.adicionar(r);
                                System.out.println("Ração cadastrada com sucesso!");
                                break;

                            case 3: // Cadastro de Acessório
                                Acessorio ac = new Acessorio();
                                System.out.println("Qual animal usa este acessório:");
                                ac.setCatAcessorio(sc2.nextLine());
                                System.out.println("Qual nome deste acessório:");
                                ac.setNome(sc2.nextLine());
                                System.out.println("Qual preço deste acessório:");
                                ac.setPreco(sc.nextDouble());
                                //acessorios.add(ac);
                                acs.adicionar(ac);
                                System.out.println("Acessório cadastrado com sucesso!");
                                break;
                        }
                        System.out.println("Para cadastrar um animal, digite 1.\nPara cadastrar uma ração, digite 2.\nPara cadastrar acessórios, digite 3.\nPara sair, digite 0.");
                    } while (tipoProduto != 0);
                    break;

                case 2: // Venda
                    int vendaProduto;
                    System.out.println("Para vender um animal, digite 1.\nPara vender ração, digite 2.\nPara vender acessórios, digite 3.\nPara sair, digite 0.");
                    do {
                        vendaProduto = sc.nextInt();
                        switch (vendaProduto) {
                            case 1: // Venda de Animal
                                if (as.getAnimais().isEmpty()) {
                                    System.out.println("Não há animais cadastrados para venda.");
                                    System.out.println("Para vender um animal, digite 1.\nPara vender ração, digite 2.\nPara vender acessórios, digite 3.\nPara sair, digite 0.");
                                } else {
                                    System.out.println("Animais disponíveis:");
                                    for (int i = 0; i < as.getAnimais().size(); i++) {
                                        System.out.println(i + " - " + as.getAnimais().get(i));
                                    }
                                    System.out.println("Digite o índice do animal que deseja vender:");
                                    int index = sc.nextInt();
                                    if (index >= 0 && index < as.getAnimais().size()) {
                                        System.out.println("Animal vendido: " + as.getAnimais().get(index));
                                        as.remover(as.getAnimais().get(index));
                                        System.out.println("Para vender um animal, digite 1.\nPara vender ração, digite 2.\nPara vender acessórios, digite 3.\nPara sair, digite 0.");
                                    } else {
                                        System.out.println("Índice inválido.");
                                        System.out.println("Para vender um animal, digite 1.\nPara vender ração, digite 2.\nPara vender acessórios, digite 3.\nPara sair, digite 0.");
                                    }
                                }
                                break;

                            case 2: // Venda de Ração
                                if (rs.getRacoes().isEmpty()) {
                                    System.out.println("Não há rações cadastradas para venda.");
                                    System.out.println("Para vender um animal, digite 1.\nPara vender ração, digite 2.\nPara vender acessórios, digite 3.\nPara sair, digite 0.");
                                } else {
                                    System.out.println("Rações disponíveis:");
                                    for (int i = 0; i < rs.getRacoes().size(); i++) {
                                        System.out.println(i + " - " + rs.getRacoes().get(i));
                                    }
                                    System.out.println("Digite o índice da ração que deseja vender:");
                                    int index = sc.nextInt();
                                    if (index >= 0 && index < rs.getRacoes().size()) {
                                        System.out.println("Ração vendida: " + rs.getRacoes().get(index));
                                        rs.remover(rs.getRacoes().get(index));
                                        System.out.println("Para vender um animal, digite 1.\nPara vender ração, digite 2.\nPara vender acessórios, digite 3.\nPara sair, digite 0.");
                                    } else {
                                        System.out.println("Índice inválido.");
                                        System.out.println("Para vender um animal, digite 1.\nPara vender ração, digite 2.\nPara vender acessórios, digite 3.\nPara sair, digite 0.");
                                    }
                                }
                                break;

                            case 3: // Venda de Acessório
                                if (acs.getAcessorios().isEmpty()) {
                                    System.out.println("Não há acessórios cadastrados para venda.");
                                    System.out.println("Para vender um animal, digite 1.\nPara vender ração, digite 2.\nPara vender acessórios, digite 3.\nPara sair, digite 0.");
                                } else {
                                    System.out.println("Acessórios disponíveis:");
                                    for (int i = 0; i < acs.getAcessorios().size(); i++) {
                                        System.out.println(i + " - " + acs.getAcessorios().get(i));
                                    }
                                    System.out.println("Digite o índice do acessório que deseja vender:");
                                    int index = sc.nextInt();
                                    if (index >= 0 && index < acs.getAcessorios().size()) {
                                        System.out.println("Acessório vendido: " + acs.getAcessorios().get(index));
                                        acs.remover(acs.getAcessorios().get(index));
                                        System.out.println("Para vender um animal, digite 1.\nPara vender ração, digite 2.\nPara vender acessórios, digite 3.\nPara sair, digite 0.");
                                    } else {
                                        System.out.println("Índice inválido.");
                                        System.out.println("Para vender um animal, digite 1.\nPara vender ração, digite 2.\nPara vender acessórios, digite 3.\nPara sair, digite 0.");
                                    }
                                }
                                break;
                        }
                    } while (vendaProduto != 0);
                    break;
            }
        } while (tipoOperacao != 0);
    }
}

