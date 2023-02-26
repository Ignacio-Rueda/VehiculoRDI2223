
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoRDI2223 miVehiculoRDI2223;
        int stockActual;
        
        miVehiculoRDI2223 = new VehiculoRDI2223("Seat",18000,100);
        stockActual = operativaVehiculoRDI2223(miVehiculoRDI2223, 50); 
        System.out.println("El stock actual es"+ stockActual );
    }

    private static int operativaVehiculoRDI2223(VehiculoRDI2223 miVehiculoRDI2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoRDI2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoRDI2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoRDI2223.obtenerStock();
        return stockActual;
    }

}
    
