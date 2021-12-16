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
                    int contador = 1;
                    for(Pizza pizza : pizzas) {
                        System.out.print(contador++ + ": ");
                        System.out.println(pizza.getDescripcion());
                    }
                    break;
                case "2":
                    System.out.println("ingrese el código de las pizzas a comprar separado por coma (1,2) sin espacios");
                    String pizzasPorComprar = in.nextLine();
                    if (!"".equals(pizzasPorComprar.trim())) {
                        String response = procesarPizzas(pizzasPorComprar, pizzas,in);
                        System.out.println(response);
                    }else
                        System.out.println("No seleccionó pizzas");
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

    private static String procesarPizzas(String pizzasPorComprar, List<Pizza> pizzasDisponibles,Scanner in) {
        int total =0;
        String[] pizzas = pizzasPorComprar.split(",");
        for (String pizza : pizzas){
            int idx = Integer.parseInt(pizza);
            if (idx == 0 || idx > pizzasDisponibles.size())
                return "Una de las pizzas seleccionadas no está dentro de menu";
            total += pizzasDisponibles.get(idx -1).getPrecio();
        }
        String continuar;
        String response = "";
        do {
            System.out.println("El total es :" + total);
            System.out.print("¿Desea continuar?(S-N): ");
            continuar = in.nextLine();

            if ("S".equalsIgnoreCase(continuar))
                response = "Pizzas compradas con éxito";
            else if ("N".equalsIgnoreCase(continuar))
                response = "Canceló la compra";
            else
                System.out.println("Ingrese una opcion válida");
        }while (!"S".equalsIgnoreCase(continuar) || "N".equalsIgnoreCase(continuar));
        return response;
    }

}
