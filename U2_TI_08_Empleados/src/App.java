public class App {
    public static void main(String[] args) throws Exception {
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("1", "Uriel Gomez", 10.0, 80);
        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("2", "Ayudante del hada madrina", 2000.0, "Aqui si dan segugo social");

        System.out.println("Ejemplo de alguien que trabaja por horas: " + empleadoPorHoras.calcularSalario());
        System.out.println("Ejemplo de alguie que trabaja a tiempo completo: " + empleadoTiempoCompleto.calcularSalario());
    }
}
