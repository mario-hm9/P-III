import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\nIntrouduzca el precio/kg de las manzanas: ");
 
        Scanner scanner = new Scanner(System.in);

        
        Fruta manzana = new Fruta();
        double precioManzana = scanner.nextDouble();
        //aplicar el IVA
        precioManzana = (double) (precioManzana + precioManzana * 0.21);
        manzana.setPrecioKg(precioManzana); 

        Fruta pera = new Fruta();
        System.out.print("Introuduzca el precio/kg de las peras: ");
        double precioPera = scanner.nextDouble();
        //aplicar el IVA
        precioPera = (double) (precioPera + precioPera * 0.21);
        pera.setPrecioKg(precioPera);

        //cuantas manzanas
        System.out.print("\nPor favor, indique cuántas manzanas desea: ");
        int cantidadManzanas = scanner.nextInt();
        manzana.setCantidad(cantidadManzanas);

        //cuantas peras
        System.out.print("Por favor, indique cuántas peras desea: ");
        int cantidadPeras = scanner.nextInt();
        pera.setCantidad(cantidadPeras);
        
        


        scanner.close();

        System.out.println("\n|------------------------------------------------------------------|");
        System.out.println("| Cliente |                                                    | 1 |");
        System.out.println("|------------------------------------------------------------------|");
        System.out.printf("| Manzanas | %7.2f kg | precio en Kg con IVA %7.2f | %7.2f € |\n", manzana.getCantidad(), manzana.getPrecioKg(), manzana.getCantidad()*manzana.getPrecioKg());
        System.out.println("|------------------------------------------------------------------|");
        System.out.printf("| Peras    | %7.2f kg | precio en Kg con IVA %7.2f | %7.2f € |\n", pera.getCantidad(), pera.getPrecioKg(), pera.getCantidad()*pera.getPrecioKg());
        System.out.println("|------------------------------------------------------------------|");
        System.out.printf("| Total con IVA %6.2f €                                           |\n", manzana.getCantidad()*manzana.getPrecioKg() + pera.getCantidad()*pera.getPrecioKg());
        System.out.println("|------------------------------------------------------------------|\n");






    }
}
