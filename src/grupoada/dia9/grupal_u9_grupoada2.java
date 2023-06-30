package grupoada.dia9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class grupal_u9_grupoada2 {
    public static void main(String[] args) {
        List<Cliente2> cliente2s = new ArrayList<>();
        List<Capacitacion2> capacitaciones = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int cantidadClientes;

        System.out.print("Ingrese la cantidad de trabajadores: ");
        cantidadClientes = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer el entero

        for (int i = 0; i < cantidadClientes; i++) {
            System.out.println("Ingrese los datos del cliente " + (i + 1) + ":");
            System.out.print("RUT: ");
            int rut = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Empresa: ");
            String empresa = scanner.nextLine();

            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();

            System.out.print("Comuna: ");
            String comuna = scanner.nextLine();

            System.out.print("Número de teléfono: ");
            int telefono = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Número de la capacitación: ");
            int numeroCapacitacion = scanner.nextInt();
            scanner.nextLine();

            Cliente2 cliente2 = new Cliente2(rut, nombre, empresa, direccion, comuna, telefono, numeroCapacitacion);
            cliente2s.add(cliente2);
            System.out.println();
        }

        int cantidadCapacitaciones;

        System.out.print("Ingrese la cantidad de capacitaciones: ");
        cantidadCapacitaciones = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer el entero

        for (int i = 0; i < cantidadCapacitaciones; i++) {
            System.out.println("Ingrese los datos de la capacitación " + (i + 1) + ":");
            System.out.print("Número de la capacitación: ");
            int numeroCapacitacion = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Empresa: ");
            String empresa = scanner.nextLine();

            System.out.print("Fecha de capacitación: ");
            String fechaCapacitacion = scanner.nextLine();

            System.out.print("Hora: ");
            String hora = scanner.nextLine();

            System.out.print("Lugar: ");
            String lugar = scanner.nextLine();

            System.out.print("Duración en minutos: ");
            int duracion = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Cantidad de asistentes: ");
            int cantidadAsistentes = scanner.nextInt();
            scanner.nextLine();

            Capacitacion2 capacitacion2 = new Capacitacion2(numeroCapacitacion, empresa, fechaCapacitacion, hora, lugar, duracion, cantidadAsistentes);
            capacitaciones.add(capacitacion2);
            System.out.println();
        }

        System.out.println("Datos de las empresas que solicitaron capacitación:");
        for (Cliente2 cliente2 : cliente2s) {
            for (Capacitacion2 capacitacion2 : capacitaciones) {
                if (cliente2.getNumeroCapacitacion() == capacitacion2.getNumeroCapacitacion()) {
                    System.out.println("Empresa: " + cliente2.getEmpresa());
                    System.out.println("Datos de la capacitación:");
                    System.out.println(capacitacion2.toString());
                    break;
                }
            }
        }

        int menores25 = 0;
        int entre26y35 = 0;
        int mayores35 = 0;

        for (Cliente2 cliente2 : cliente2s) {
            // Obtener la capacitación asociada al cliente
            Capacitacion2 capacitacion2 = null;
            for (Capacitacion2 cap : capacitaciones) {
                if (cap.getNumeroCapacitacion() == cliente2.getNumeroCapacitacion()) {
                    capacitacion2 = cap;
                    break;
                }
            }

            if (capacitacion2 != null) {
                if (capacitacion2.calcularEdadPromedio() < 25) {
                    menores25++;
                } else if (capacitacion2.calcularEdadPromedio() >= 26 && capacitacion2.calcularEdadPromedio() <= 35) {
                    entre26y35++;
                } else {
                    mayores35++;
                }
            }
        }

        System.out.println("\nCantidad de personas según rango de edad:");
        System.out.println("Menores a 25 años: " + menores25);
        System.out.println("Entre 26 y 35 años: " + entre26y35);
        System.out.println("Mayores a 35 años: " + mayores35);
    }
}

class Cliente2 {
    private int rut;
    private String nombre;
    private String empresa;
    private String direccion;
    private String comuna;
    private int telefono;
    private int numeroCapacitacion;

    public Cliente2(int rut, String nombre, String empresa, String direccion, String comuna, int telefono,
                    int numeroCapacitacion) {
        this.rut = rut;
        this.nombre = nombre;
        this.empresa = empresa;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefono = telefono;
        this.numeroCapacitacion = numeroCapacitacion;
    }

    public int getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getNumeroCapacitacion() {
        return numeroCapacitacion;
    }
}

class Capacitacion2 {
    private int numeroCapacitacion;
    private String empresa;
    private String fechaCapacitacion;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    public Capacitacion2(int numeroCapacitacion, String empresa, String fechaCapacitacion, String hora, String lugar,
                         int duracion, int cantidadAsistentes) {
        this.numeroCapacitacion = numeroCapacitacion;
        this.empresa = empresa;
        this.fechaCapacitacion = fechaCapacitacion;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public int getNumeroCapacitacion() {
        return numeroCapacitacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getFechaCapacitacion() {
        return fechaCapacitacion;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public int calcularEdadPromedio() {
        // Lógica para calcular la edad promedio de los asistentes
        // Aquí puedes implementar tu propia lógica para calcular la edad promedio
        // Puedes usar la fecha de nacimiento de los asistentes para calcular la edad
        // o cualquier otro método que consideres apropiado.
        // Por simplicidad, asumamos que ya tenemos un método que retorna la edad promedio.
        return 30; // Valor de ejemplo, reemplaza con tu lógica real.
    }

    @Override
    public String toString() {
        return "Capacitación:\n" +
                "Número de la capacitación: " + numeroCapacitacion + "\n" +
                "Empresa: " + empresa + "\n" +
                "Fecha de capacitación: " + fechaCapacitacion + "\n" +
                "Hora: " + hora + "\n" +
                "Lugar: " + lugar + "\n" +
                "Duración (en minutos): " + duracion + "\n" +
                "Cantidad de asistentes: " + cantidadAsistentes + "\n";
    }
}
