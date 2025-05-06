import java.util.*;
import java.sql.Time;

class Docente {
    private int id_docente;
    private String nombre;
    private String preferenciasNotificacion;

    public Docente(int id_docente, String nombre, String preferenciasNotificacion) {
        this.id_docente = id_docente;
        this.nombre = nombre;
        this.preferenciasNotificacion = preferenciasNotificacion;
    }

    public void configurarNotificacion() {
        System.out.println("Configurando notificaciones para " + nombre);
    }

    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }
}

class Sala {
    private int id_sala;
    private int capacidad;

    public Sala(int id_sala, int capacidad) {
        this.id_sala = id_sala;
        this.capacidad = capacidad;
    }

    public boolean estaDisponible() {
        return true; // Aquí iría la lógica real
    }
}

class Notificacion {
    private String tipo;
    private String mensaje;
    private Date fechaEnvio;
    private boolean leida;

    public Notificacion(String tipo, String mensaje) {
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.fechaEnvio = new Date();
        this.leida = false;
    }

    public void marcarComoLeida() {
        this.leida = true;
    }
}

class Horario {
    private int id_Horario;
    private Sala sala;
    private Docente docente;
    private Time horaInicio;
    private Time horaFin;
    private String estado;

    public Horario(int id_Horario, Sala sala, Docente docente, Time horaInicio, Time horaFin, String estado) {
        this.id_Horario = id_Horario;
        this.sala = sala;
        this.docente = docente;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estado = estado;
    }

    public boolean estaDisponible() {
        return "disponible".equalsIgnoreCase(estado) && sala.estaDisponible();
    }

    public int getIdHorario() {
        return id_Horario;
    }
}

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
        System.out.println("Exportando horarios...");
    }

    public boolean aplicarFiltro() {
        return true;
    }

    public boolean editarHorario() {
        return true;
    }

    public boolean eliminarHorario() {
        return true;
    }
}

class Sistema {
    private List<Horario> horarios = new ArrayList<>();
    private List<Docente> docentes = new ArrayList<>();
    private List<Sala> salas = new ArrayList<>();
    private List<Notificacion> notificaciones = new ArrayList<>();

    public List<Horario> obtenerHorarios() {
        return horarios;
    }

    public boolean agendarHorario(Horario nuevo) {
        horarios.add(nuevo);
        return true;
    }

    public boolean editarHorario(int id, Horario actualizado) {
        for (int i = 0; i < horarios.size(); i++) {
            if (horarios.get(i).getIdHorario() == id) {
                horarios.set(i, actualizado);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarHorario(int id) {
        return horarios.removeIf(h -> h.getIdHorario() == id);
    }

    public boolean buscarDisponibilidad(Horario horario) {
        return horario.estaDisponible();
    }

    public void notificarCambio(String mensaje) {
        for (Docente docente : docentes) {
            docente.recibirNotificacion(mensaje);
        }
    }
}