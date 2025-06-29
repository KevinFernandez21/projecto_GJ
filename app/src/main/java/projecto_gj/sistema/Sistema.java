package projecto_gj.sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projecto_gj.modelo.*;
import projecto_gj.modelo.enums.*;

public class Sistema {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Proveedor> proveedores = new ArrayList<>();
    private static List<Tecnico> tecnicos = new ArrayList<>();
    private static List<Servicio> servicios = new ArrayList<>();
    private static List<Orden> ordenes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void inicializarApp() {
        // Crear 2 técnicos
        tecnicos.add(new Tecnico(1, "Álvaro López", "0991234567", "Motor"));
        tecnicos.add(new Tecnico(2, "Mario Barcos", "0991234568", "Transmisión"));
        
        // Crear 4 clientes (2 personales, 2 empresariales)
        clientes.add(new Cliente("Av. Principal 123", TipoCliente.PERSONAL, 
                                "0912345678", "Juan Pérez", "0991234569"));
        clientes.add(new Cliente("Calle Secundaria 456", TipoCliente.PERSONAL, 
                                "0912345679", "María García", "0991234570"));
        clientes.add(new Cliente("Zona Industrial", TipoCliente.EMPRESARIAL, 
                                "0991234567001", "Empresa ABC S.A", "042345678"));
        clientes.add(new Cliente("Centro Comercial", TipoCliente.EMPRESARIAL, 
                                "0991234568001", "Grupo HG S.A", "042345679"));
        
        // Crear 6 servicios
        servicios.add(new Servicio("Cambio de aceite", 20.0));
        servicios.add(new Servicio("Cambio de filtro", 15.0));
        servicios.add(new Servicio("Alineación", 25.0));
        servicios.add(new Servicio("Balanceo", 18.0));
        servicios.add(new Servicio("Revisión frenos", 30.0));
        servicios.add(new Servicio("Cambio de llantas", 50.0));
        
        // Crear 2 proveedores
        proveedores.add(new Proveedor("Repuestos automotrices", 
                                     1, "Repuestos del Norte", "0991234571"));
        proveedores.add(new Proveedor("Aceites y lubricantes", 
                                     2, "Lubricantes SA", "0991234572"));
        
        // Crear 4 órdenes (2 por técnico)
        List<DetalleServicio> detalles1 = new ArrayList<>();
        detalles1.add(new DetalleServicio(servicios.get(0), 1));
        detalles1.add(new DetalleServicio(servicios.get(1), 1));
        ordenes.add(new Orden(clientes.get(0), "15-06-2025", TipoAutomovil.AUTOMOVIL, 
                             "ABC-1234", detalles1, tecnicos.get(0)));
        
        List<DetalleServicio> detalles2 = new ArrayList<>();
        detalles2.add(new DetalleServicio(servicios.get(2), 1));
        detalles2.add(new DetalleServicio(servicios.get(3), 1));
        ordenes.add(new Orden(clientes.get(2), "16-06-2025", TipoAutomovil.BUS, 
                             "XYZ-5678", detalles2, tecnicos.get(0)));
        
        List<DetalleServicio> detalles3 = new ArrayList<>();
        detalles3.add(new DetalleServicio(servicios.get(4), 1));
        detalles3.add(new DetalleServicio(servicios.get(5), 1));
        ordenes.add(new Orden(clientes.get(1), "17-06-2025", TipoAutomovil.MOTOCICLETAS, 
                             "MOT-9876", detalles3, tecnicos.get(1)));
        
        List<DetalleServicio> detalles4 = new ArrayList<>();
        detalles4.add(new DetalleServicio(servicios.get(0), 2));
        detalles4.add(new DetalleServicio(servicios.get(4), 1));
        ordenes.add(new Orden(clientes.get(3), "18-06-2025", TipoAutomovil.AUTOMOVIL, 
                             "EMP-4567", detalles4, tecnicos.get(1)));
        
        System.out.println("=== SISTEMA INICIALIZADO CORRECTAMENTE ===");
    }
    
    public static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== TECNICENTRO RP S.A ===");
            System.out.println("1. Administrar clientes");
            System.out.println("2. Administrar proveedores");
            System.out.println("3. Administrar técnicos");
            System.out.println("4. Administrar servicios");
            System.out.println("5. Generar orden de servicios");
            System.out.println("6. Registrar falta de insumos");
            System.out.println("7. Generar facturas a empresas");
            System.out.println("8. Reporte de ingresos por servicios");
            System.out.println("9. Reporte de atenciones por técnico");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            switch(opcion) {
                case 1:
                    administrarClientes();
                    break;
                case 2:
                    administrarProveedores();
                    break;
                case 3:
                    administrarTecnicos();
                    break;
                case 4:
                    administrarServicios();
                    break;
                case 5:
                    generarOrdenServicios();
                    break;
                case 6:
                    registrarFaltaInsumos();
                    break;
                case 7:
                    generarFacturasEmpresas();
                    break;
                case 8:
                    reporteIngresosPorServicios();
                    break;
                case 9:
                    reporteAtencionesPorTecnico();
                    break;
                case 10:
                    System.out.println("¡Gracias por usar el sistema Tecnicentro RP!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while(opcion != 10);
    }
    
    // Métodos placeholder para cada opción del menú
    public static void administrarClientes() {
        System.out.println("\n=== ADMINISTRAR CLIENTES ===");
        // Mostrar lista de clientes
        for(Cliente cliente : clientes) {
            System.out.println(cliente.to_string());
        }
        // Aquí se implementaría el submenú de clientes
        System.out.println("Funcionalidad de administrar clientes pendiente de implementar");
    }
    
    public static void administrarProveedores() {
        System.out.println("\n=== ADMINISTRAR PROVEEDORES ===");
        // Mostrar lista de proveedores
        for(Proveedor proveedor : proveedores) {
            System.out.println(proveedor.to_string());
        }
        System.out.println("Funcionalidad de administrar proveedores pendiente de implementar");
    }
    
    public static void administrarTecnicos() {
        System.out.println("\n=== ADMINISTRAR TÉCNICOS ===");
        // Mostrar lista de técnicos
        for(Tecnico tecnico : tecnicos) {
            System.out.println(tecnico.to_string());
        }
        System.out.println("Funcionalidad de administrar técnicos pendiente de implementar");
    }
    
    public static void administrarServicios() {
        System.out.println("\n=== ADMINISTRAR SERVICIOS ===");
        // Mostrar lista de servicios
        for(Servicio servicio : servicios) {
            System.out.println(servicio.toString());
        }
        System.out.println("Funcionalidad de administrar servicios pendiente de implementar");
    }
    
    public static void generarOrdenServicios() {
        System.out.println("\n=== GENERAR ORDEN DE SERVICIOS ===");
        System.out.println("Funcionalidad pendiente de implementar");
    }
    
    public static void registrarFaltaInsumos() {
        System.out.println("\n=== REGISTRAR FALTA DE INSUMOS ===");
        System.out.println("Funcionalidad pendiente de implementar");
    }
    
    public static void generarFacturasEmpresas() {
        System.out.println("\n=== GENERAR FACTURAS A EMPRESAS ===");
        System.out.println("Funcionalidad pendiente de implementar");
    }
    
    public static void reporteIngresosPorServicios() {
        System.out.println("\n=== REPORTE DE INGRESOS POR SERVICIOS ===");
        System.out.println("Funcionalidad pendiente de implementar");
    }
    
    public static void reporteAtencionesPorTecnico() {
        System.out.println("\n=== REPORTE DE ATENCIONES POR TÉCNICO ===");
        System.out.println("Funcionalidad pendiente de implementar");
    }

    
}
