package co.com.cedesistemas.java2.files;

import co.com.cedesistemas.java2.model.*;

import java.io.File;
import java.util.*;

public class ProcessPizzaFileUtilities {
    private static final Map<Integer, Salsa> salsasDisponibles = new HashMap<>();
    private static final Map<Integer, Vegetal> vegetalesDisponibles = new HashMap<>();
    private static final Map<String, Carne> carnesDisponibles = new HashMap<>();

    static {
        salsasDisponibles.put(1, new Salsa(1, "Salsa de Tomate", 500, "Tomate", 10));
        salsasDisponibles.put(2, new Salsa(2, "Salsa Rosada", 500, "Salsa Rosada", 10));
        salsasDisponibles.put(3, new Salsa(3, "Salsa de Leña", 1000, "Salsa de leña", 10));
        salsasDisponibles.put(4, new Salsa(4, "Salsa de piña", 500, "piña", 10));
        vegetalesDisponibles.put(1, new Vegetal(1, "tomate", 100.0, 2000));
        vegetalesDisponibles.put(2, new Vegetal(2, "piña", 100.0, 2000));
        vegetalesDisponibles.put(3, new Vegetal(3, "cebolla", 100.0, 2000));
        carnesDisponibles.put("Tocineta", new Carne("Tocineta", 5000, new Madurez("Fresca", 2), 100.0, "Colanta"));
        carnesDisponibles.put("Peperoni", new Carne("Peperoni", 5000, new Madurez("Fresca", 2), 100.0, "Colanta"));
        carnesDisponibles.put("Jamon", new Carne("Jamon", 4000, new Madurez("Fresca", 5), 150.0, "Colanta"));
        carnesDisponibles.put("Chorizo", new Carne("Chorizo", 5000, new Madurez("Fresca", 2), 100.0, "Colanta"));
    }

    public static List<Pizza> loadPizzasFromFile(String filePath) {

        List<Pizza> pizzas = new ArrayList<>();
        try {
            System.out.println("*********************************************************");
            System.out.println("**********LECTURA DE DATOS DESDE ARCHIVO PLANO***********");
            System.out.println("archivo: "+filePath);
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String lineaActual = scanner.nextLine();
                StringTokenizer str = new StringTokenizer(lineaActual, "\\|");
                Pizza pizza = new Pizza();
                pizza.setNombre(str.nextToken());
                pizza.setVegetales(getVegetables(str.nextToken()));
                pizza.setMasa(getMasa(str.nextToken()));
                pizza.setCarnes(getCarnes(str.nextToken()));
                pizza.setSalsas(getSalsas(str.nextToken()));
                pizza.calcularPrecio();
                pizzas.add(pizza);
            }
            System.out.println("********************LECTURA FINALIZADA********************");
            System.out.println("**********************************************************");

        } catch (Exception ex) {
            System.err.println("Error desconocido " + ex.getMessage());
        }
        return pizzas;
    }

    private static Map<String, Carne> getCarnes(String carnes) {
        String[] nombresCarnes = carnes.split(",");
        Map<String, Carne> mapCarnes = new HashMap<>();
        for (String nombreCarne : nombresCarnes) {
            Carne carne = carnesDisponibles.get(nombreCarne);
            if (carne != null) {
                mapCarnes.put(nombreCarne, carne);
            } else
                throw new IllegalArgumentException(String.format("La carne %s no se encuentra disponible", nombreCarne));
        }
        return mapCarnes;
    }

    private static Masa getMasa(String idMasa) {
        Masa masa;
        switch (Integer.parseInt(idMasa)) {
            case 1:
                masa = new MasaAmericana("Masa Americana", 500.0, 10000, 400);
                break;
            case 2:
                masa = new MasaAsiatica("Masa Asiatica", 500.0, 12000, "China", "beige");
                break;
            case 3:
                masa = new MasaNapolitana("Masa Napolitana", 500.0, 15000, "Francia");
                break;
            default:
                throw new IllegalStateException("El codigo de la masa no está registrado: " + idMasa);
        }
        return masa;
    }

    private static List<Vegetal> getVegetables(String idVegetales) {
        List<Vegetal> vegetalesResponse = new ArrayList<>();
        if (!"".equals(idVegetales.trim())) {
            String[] vegetales = idVegetales.split(",");
            for (String id : vegetales) {
                Vegetal vegetal = vegetalesDisponibles.get(Integer.parseInt(id));
                if (vegetal != null) {
                    vegetalesResponse.add(vegetal);
                } else
                    throw new IllegalArgumentException(String.format("El vegetal con id %s no se encuentra disponible", id));
            }
        }
        return vegetalesResponse;
    }

    private static List<Salsa> getSalsas(String idsSalsas) {
        List<Salsa> salsasResponse = new ArrayList<>();
        if (!"".equals(idsSalsas.trim())) {
            String[] salsas = idsSalsas.split(",");
            for (String id : salsas) {
                Salsa salsa = salsasDisponibles.get(Integer.parseInt(id));
                if (salsa != null) {
                    salsasResponse.add(salsa);
                } else
                    throw new IllegalArgumentException(String.format("La salsa con id %s no se encuentra disponible", id));
            }
        }
        return salsasResponse;
    }
}
