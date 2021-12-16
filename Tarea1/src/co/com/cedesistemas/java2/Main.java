package co.com.cedesistemas.java2;

import co.com.cedesistemas.java2.files.ProcessPizzaFileUtilities;
import co.com.cedesistemas.java2.model.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Pizza> pizzas = ProcessPizzaFileUtilities.loadPizzasFromFile("C:\\Cursos\\JavaII\\Tarea1\\src\\co\\com\\cedesistemas\\java2\\files\\pizzas.txt");
        MenuPrincipal(pizzas);
    }

    private static void MenuPrincipal(List<Pizza> pizzas) {
        boolean globalExit = false;

        while(!globalExit){
            System.out.println("Seleccione una opcion:");
            System.out.println("1:Ver listado de pizzas");
            System.out.println("2: Comprar pizzas");
            System.out.println("3: Finalizar");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            switch (s){
                case "1":
                    for(Pizza pizza : pizzas) {
                        System.out.print("1: ");
                        System.out.println(pizza.getDescripcion());
                    }
                    break;
                case "2":
                    System.out.println("ingrese el código de las pizzas a comprar separado por coma (1,2) sin espacios");
                    String pizzasPorComprar = in.nextLine();

                    break;
                case "3":
                    System.out.println("Finalizando...");
                    globalExit =true;
                    break;
                default:
                    System.out.println("Ingrese una opcion válida");
                    break;

            }
        }
    }

}
