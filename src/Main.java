public class Main {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        Comando encender = new EncenderTelevisor(televisor);
        Comando apagar = new ApagarTelevisor(televisor);

        ControlRemoto control = new ControlRemoto();
        control.setComando(encender);
        control.presionarBoton();

        control.setComando(apagar);
        control.presionarBoton();
    }
}