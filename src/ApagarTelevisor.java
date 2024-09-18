class ApagarTelevisor implements Comando {
    private Televisor televisor;

    public ApagarTelevisor(Televisor televisor) {
        this.televisor = televisor;
    }

    public void ejecutar() {
        televisor.apagar();
    }
}