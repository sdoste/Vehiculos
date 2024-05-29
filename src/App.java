import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        // motos
        ArrayList<Moto> motos = new ArrayList<>();
        motos.add(new Moto(2, "Motor BMW", "Suspensión Invertida", "BMW Motorrad", "S 1000 RR", "Manillar Deportivo"));
        motos.add(new Moto(2, "Motor Harley-Davidson", "Suspensión Telescópica", "Harley-Davidson", "Street Glide", "Manillar Cruiser"));
        motos.add(new Moto(2, "Motor Ducati", "Suspensión Invertida", "Ducati", "Panigale V4", "Manillar Deportivo"));
        motos.add(new Moto(2, "Motor Yamaha", "Suspensión Invertida", "Yamaha", "YZF-R1", "Manillar Deportivo"));
        motos.add(new Moto(2, "Motor Kawasaki", "Suspensión Telescópica", "Kawasaki", "Ninja ZX-6R", "Manillar Deportivo"));

        // coches
        ArrayList<Coche> coches = new ArrayList<>();
        coches.add(new Coche(4, "Motor Audi", "Suspensión Independiente", "Audi", "A4", 5, "Gasolina"));
        coches.add(new Coche(4, "Motor BMW", "Suspensión Independiente", "BMW", "Serie 3", 5, "Gasolina"));
        coches.add(new Coche(4, "Motor Mercedes-Benz", "Suspensión Independiente", "Mercedes-Benz", "Clase C", 5, "Gasolina"));
        coches.add(new Coche(4, "Motor Toyota", "Suspensión Independiente", "Toyota", "Corolla", 5, "Gasolina"));
        coches.add(new Coche(4, "Motor Volkswagen", "Suspensión Independiente", "Volkswagen", "Golf", 5, "Gasolina"));

        // camiones
        ArrayList<Camion> camiones = new ArrayList<>();
        camiones.add(new Camion(6, "Motor Volvo", "Suspensión Neumática", "Volvo", "FH16", 20000.0f, "Diésel"));
        camiones.add(new Camion(6, "Motor Scania", "Suspensión Neumática", "Scania", "S-series", 18000.0f, "Diésel"));
        camiones.add(new Camion(6, "Motor Mercedes-Benz", "Suspensión Neumática", "Mercedes-Benz", "Actros", 22000.0f, "Diésel"));
        camiones.add(new Camion(6, "Motor MAN", "Suspensión Neumática", "MAN", "TGX", 19000.0f, "Diésel"));
        camiones.add(new Camion(6, "Motor DAF", "Suspensión Neumática", "DAF", "XF", 21000.0f, "Diésel"));

        //arraylist mixta
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        //motos
        vehiculos.add(new Moto(2, "Motor Honda", "Suspensión Invertida", "Honda", "CBR1000RR", "Manillar Deportivo"));
        vehiculos.add(new Moto(2, "Motor Suzuki", "Suspensión Telescópica", "Suzuki", "GSX-R1000", "Manillar Deportivo"));
        vehiculos.add(new Moto(2, "Motor Kawasaki", "Suspensión Invertida", "Kawasaki", "Ninja ZX-10R", "Manillar Deportivo"));
        //coches
        vehiculos.add(new Coche(4, "Motor Ford", "Suspensión Independiente", "Ford", "Mustang", 4, "Gasolina"));
        vehiculos.add(new Coche(4, "Motor Chevrolet", "Suspensión Independiente", "Chevrolet", "Camaro", 4, "Gasolina"));
        vehiculos.add(new Coche(4, "Motor Dodge", "Suspensión Independiente", "Dodge", "Challenger", 4, "Gasolina"));
        //camiones
        vehiculos.add(new Camion(6, "Motor Mack", "Suspensión Neumática", "Mack Trucks", "Anthem", 25000.0f, "Diésel"));
        vehiculos.add(new Camion(6, "Motor Kenworth", "Suspensión Neumática", "Kenworth", "W900", 26000.0f, "Diésel"));
        vehiculos.add(new Camion(6, "Motor Freightliner", "Suspensión Neumática", "Freightliner", "Cascadia", 24000.0f, "Diésel"));
        
        // ¿Cómo encontrarías un modelo en específico en cada arraylist?
        for (Moto moto: motos){
            if  (moto.getModelo().equals("Ninja ZX-6R")){
                System.out.println("Modelo moto encontrado. Marca: " + moto.getMarca());
            }
        }

        for (Coche coche: coches){
            if  (coche.getModelo().equals("Serie 3")){
                System.out.println("Modelo coche encontrado. Marca: " + coche.getMarca());
            }
        }
        
        for (Camion camion: camiones){
            if  (camion.getModelo().equals("FH16")){
                System.out.println("Modelo camión encontrado. Marca: " + camion.getMarca());
            }
        }

        for (Vehiculo vehiculo: vehiculos){
            if  (vehiculo.getModelo().equals("Anthem")){
                System.out.println("Modelo vehículo encontrado. Tipo vehículo: " + vehiculo.getClass().getSimpleName() + ". Marca: " + vehiculo.getMarca());
            }
        }

        ArrayList<String> marcas = new ArrayList<>();
        for (Vehiculo vehiculo: vehiculos){
            marcas.add(vehiculo.getMarca());
        }
        for (String marca : marcas){
            System.out.println(marca);
        }

        // - Prueba a recorrer cada array por características, del tipo: todos los nombres, marcas precios, etc
        
        // - ¿Cómo guardarías todas las marcas aparte?
        

    




    }
}
