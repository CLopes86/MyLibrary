package trabalhoPratico;


import java.util.Scanner;

public class Main {
    static int tamMax = 100;
    static String [] titulo = new String[tamMax];
    static  String [] autor = new String[tamMax];
    static int [] paginas = new int[tamMax];
    static int [] paginasLidas = new int[tamMax];
    static boolean [] emprestado = new  boolean[tamMax];
     static int nLivros = 0;

     public static  void apresentarMenuPrincipal(){
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
                     char opcaoVisualizar = apresentarSubMenuVisualizar();
                     switch (opcaoVisualizar){
                         case 'T':
                             visualizarTodos(titulo, autor, paginas, paginasLidas, emprestado, nLivros);
                             break;

                         case 'L':
                             visualizarLeitura(titulo, autor, paginas, paginasLidas, emprestado, nLivros);
                             break;

                         case 'R':
                             visualizarTerminados(titulo, autor, paginas, paginasLidas, emprestado, nLivros);
                             break;

                         case 'P':
                             visualizarPorLer(titulo, autor, paginas, paginasLidas, emprestado, nLivros);
                             break;

                         case 'E':
                             visualizarEmprestados(titulo, autor, paginas, paginasLidas, emprestado, nLivros);
                             break;
                             
                         case 'V':
                             break;
                             
                         default:
                             System.out.println("Opção inválida, tente novamente");
                             

                     }

                     break;

                 case 'E':
                     apresentarSubMenuEditar();
                     break;
                 case 'L':
                     apresentarSubMenuLer();
                     break;

                 case 'S':
                     System.out.println("Saindo do programa...");
                     System.exit(0);
                     break;

                 default:
                     System.out.println("Opção inválida. Tente novamente");

             }
         }while (opcao != 'S');

     }
    public static void visualizarTodos(String[] titulo, String[] autor, int[] paginas, int[] paginasLidas, boolean[] emprestado, int nLivros) {
         System.out.println("Todos os livros:");
         for (int i = 0; i < nLivros; i++){
             System.out.println("Titulo: " + titulo[i] + ", Autor: " + autor[i] +  ", Paginas: " + paginas[i] + ", Paginas lidas: "  + paginasLidas[i] + ", Emprestado: " + emprestado[i]);
         }
    }
    private static void visualizarLeitura(String[] titulo, String[] autor, int[] paginas, int[] paginasLidas, boolean[] emprestado, int nLivros) {
         System.out.println("Livros em Leitura:");
         for (int i = 0; i < nLivros; i++){
             if (paginasLidas[i] > 0 && paginasLidas[i] < paginas[i]){
               System.out.println("Titulo: " + titulo[i] + ", Autor: " + autor[i] + ", Paginas: " + paginas[i] + ", Paginas lidas: " + paginasLidas[i] + ", Emprestado: " +emprestado[i]);
             }
         }
    }
    private static void visualizarTerminados(String[] titulo, String[] autor, int[] paginas, int[] paginasLidas, boolean[] emprestado, int nLivros) {
         System.out.println("Livros terminados:");
         for (int i = 0; i < nLivros; i++)
             if (paginasLidas[i] == paginas[i]){
                 System.out.println("Titulo: " + titulo[i] + ", Autor: " + autor[i] + ", Paginas: " + paginas[i] + ", Paginas lidas: " + paginasLidas[i] + ", Emprestado: " +emprestado[i]);
             }
    }
    private static void visualizarPorLer(String[] titulo, String[] autor, int[] paginas, int[] paginasLidas, boolean[] emprestado, int nLivros) {
         System.out.println("Livros por Ler:");
         for (int i = 0; i < nLivros; i++){
             if (paginasLidas[i] == 0){
                 System.out.println("Titulo: " + titulo[i] + ", Autor: " + autor[i] + ", Paginas: " + paginas[i] + ", Paginas lidas: " + paginasLidas[i] + ", Emprestado: " +emprestado[i]);

             }
        }
    }

    private static void visualizarEmprestados(String[] titulo, String[] autor, int[] paginas, int[] paginasLidas, boolean[] emprestado, int nLivros) {
         System.out.println("Livros emprestados:");
         for (int i = 0; i < nLivros; i++){
             if (emprestado[i]){
                 System.out.println("Titulo: " + titulo[i] + ", Autor: " + autor[i] + ", Paginas: " + paginas[i] + ", Paginas lidas: " + paginasLidas[i] + ", Emprestado: " +emprestado[i]);
             }
         }
    }








    private static void apresentarSubMenuLer() {
    }



    public static char apresentarSubMenuVisualizar() {
         Scanner input = new Scanner(System.in);
         System.out.println("Menu Visualizar: ");
         System.out.println("(T)odos os livros");
         System.out.println("Livros em (L)eitura");
         System.out.println("Livros te(R)minados");
         System.out.println("Livros (P)or ler");
         System.out.println("Livros (E)mprestados");
         System.out.println("(V)oltar");
         System.out.println("Escolha uma opção: ");
         char opcao = Character.toUpperCase(input.next().charAt(0));
         return opcao;


    }

    private static char apresentarSubMenuEditar() {
         Scanner input1 = new Scanner(System.in);
         System.out.println("Menu Editar");
        System.out.println("Adicionar (l)ivro ");
        System.out.println("Procurar livro por (t)itulo");
        System.out.println("Procurar livro por (a)utor");
        System.out.println("Apagar livro por (p)osição");
        System.out.println("Apagar to(d)os os livros de um autor");
        System.out.println("(E)ditar livro");
        System.out.println("(V)oltar");
        System.out.println("Escolha uma opção: ");
        char opca01 = Character.toUpperCase(input1.next().charAt(0));
        return opca01;
    }


    public static void main(String[] args) {

         apresentarMenuPrincipal();
         apresentarSubMenuVisualizar();


        }
    }
