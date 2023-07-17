package trabalhoPratico;


import java.util.Scanner;

public class Main {
    static int tamMax = 100;
    static String [] titulo = new String[tamMax];
    static  String [] autor = new String[tamMax];
    static int [] paginas = new int[tamMax];
    static int [] paginasLidas = new int[tamMax];
    boolean [] emprestado = new  boolean[tamMax];
     static int nLivros = 0;

     static  void apresentarMenuPrincipal(){
         Scanner scanner = new Scanner(System.in);
         char opcao;
         do {
             System.out.println("(V)isualizar");
             System.out.println("(E)ditar");
             System.out.println("(L)er");
             System.out.println("(S)air");
             opcao = scanner.next().charAt(0);
             opcao = Character.toUpperCase(opcao);

             switch (opcao){
                 case 'V':
                     apresentarSubMenuVisualizar();
                     break;

                 case 'E':
                     apresentarSubMenuEditar();
                     break;
                 case 'L':
                     apresentarSubMenuLer();
                     break;

                 case 'S':
                     System.out.println("Saindo do programa...");
                     break;

                 default:
                     System.out.println("Opção inválida. Tente novamente");

             }
         }while (opcao != 'S');

     }

    private static void apresentarSubMenuLer() {
    }

    private static void apresentarSubMenuEditar() {
    }

    private static void apresentarSubMenuVisualizar() {
    }


    public static void main(String[] args) {

         apresentarMenuPrincipal();


        }
    }
