import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Clase Sala
class Sala {
    private int idSala;
    private int capacidad;

    public Sala(int idSala, int capacidad) {
        this.idSala = idSala;
        this.capacidad = capacidad;
    }

    public boolean estaDisponible() {
        // Lógica para verificar disponibilidad (puede consultar BD)
        return true; // Placeholder
    }

    // Getters y Setters
    public int getIdSala() { return idSala; }
    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
}

// Clase Docente
class Docente {
    private int idDocente;
    private String nombre;
    private String preferenciasNotificacion;

    public Docente(int idDocente, String nombre, String preferenciasNotificacion) {
        this.idDocente = idDocente;
        this.nombre = nombre;
        this.preferenciasNotificacion = preferenciasNotificacion;
    }

    public void configurarNotificacion() {
        System.out.println("Notificación configurada para " + nombre);
    }

    public void recibirNotificacion() {
        System.out.println(nombre + " recibió una notificación");
    }

    // Getters y Setters
    public int getIdDocente() { return idDocente; }
    public String getNombre() { return nombre; }
    public String getPreferenciasNotificacion() { return preferenciasNotificacion; }
    public void setPreferenciasNotificacion(String preferenciasNotificacion) {
        this.preferenciasNotificacion = preferenciasNotificacion;
    }
}

// Clase Notificacion
class Notificacion {
    private String tipoMensaje;
    private String mensaje;
    private LocalDateTime fechaEnvio;
    private boolean leida;

    public Notificacion(String tipoMensaje, String mensaje, LocalDateTime fechaEnvio) {
        this.tipoMensaje = tipoMensaje;
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
        this.leida = false;
    }

    public void marcarComoLeida() {
        this.leida = true;
        System.out.println("Notificación marcada como leída");
    }

    // Getters y Setters
    public String getTipoMensaje() { return tipoMensaje; }
    public String getMensaje() { return mensaje; }
    public LocalDateTime getFechaEnvio() { return fechaEnvio; }
    public boolean isLeida() { return leida; }
}

// Clase Horario
class Horario {
    private int idHorario;
    private Sala sala;
    private Docente docente;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;
    private String estado;

    public Horario(int idHorario, Sala sala, Docente docente, LocalDateTime horaInicio, 
                   LocalDateTime horaFin, String estado) {
        this.idHorario = idHorario;
        this.sala = sala;
        this.docente = docente;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estado = estado;
    }

    public boolean estaDisponible() {
        return sala.estaDisponible() && !estado.equals("inactivo");
    }

    // Getters y Setters
    public int getIdHorario() { return idHorario; }
    public Sala getSala() { return sala; }
    public Docente getDocente() { return docente; }
    public LocalDateTime getHoraInicio() { return horaInicio; }
    public LocalDateTime getHoraFin() { return horaFin; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}

// Clase Sistema
class Sistema {
    private List<Horario> horarios;
    private List<Docente> docentes;
    private List<Notificacion> notificaciones;

    public Sistema() {
        this.horarios = new ArrayList<>();
        this.docentes = new ArrayList<>();
        this.notificaciones = new ArrayList<>();
    }

    public List<Horario> obtenerHorarios() {
        return horarios; // Simula consulta a BD
    }

    public boolean agendarHorario(Horario horario) {
        if (horario.estaDisponible()) {
            horarios.add(horario);
            notificarCambio(horario);
            return true;
        }
        return false;
    }

    public boolean eliminarHorario(int idHorario) {
        Horario toRemove = horarios.stream()
            .filter(h -> h.getIdHorario() == idHorario)
            .findFirst().orElse(null);
        if (toRemove != null) {
            horarios.remove(toRemove);
            notificarCambio(toRemove);
            return true;
        }
        return false;
    }

    public boolean buscarDisponibilidad() {
        return true; // Placeholder
    }

    public void notificarCambio(Horario horario) {
        Notificacion notif = new Notificacion("cambio", 
            "Horario modificado para " + horario.getDocente().getNombre(), 
            LocalDateTime.now());
        notificaciones.add(notif);
        horario.getDocente().recibirNotificacion();
    }
}

// Clase Administrador
class Administrador {
    private String nombre;
    private int id;
    private String correo;

    public Administrador(String nombre, int id, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
    }

    public void solicitarExportarHorarios() {
        System.out.println("Exportando horarios para " + nombre);
    }

    public boolean aplicarFiltros() {
        return true; // Placeholder
    }

    public boolean editarHorario(Horario horario) {
        return true; // Placeholder
    }

    public boolean eliminarHorario(int idHorario, Sistema sistema) {
        return sistema.eliminarHorario(idHorario);
    }
}

// Clase Principal para Pruebas
public class ScheduleManagementSystem {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Sala sala = new Sala(1, 30);
        Docente docente = new Docente(1, "Juan Pérez", "email");
        Horario horario = new Horario(1, sala, docente, LocalDateTime.now(), 
            LocalDateTime.now().plusHours(2), "activo");
        Administrador admin = new Administrador("Admin1", 1, "admin@inst.edu");

        // Prueba de agendamiento
        sistema.agendarHorario(horario);
        System.out.println("Horarios: " + sistema.obtenerHorarios().size());

        // Prueba de eliminación
        admin.eliminarHorario(1, sistema);
        System.out.println("Horarios tras eliminar: " + sistema.obtenerHorarios().size());

        // Prueba de exportación
        admin.solicitarExportarHorarios();
    }
}