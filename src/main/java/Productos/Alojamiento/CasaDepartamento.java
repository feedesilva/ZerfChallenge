package Productos.Alojamiento;


public class CasaDepartamento extends Alojamiento {
    private int cantAmbientes;

    public CasaDepartamento(String direccion, int cantNoches, int cantAmbientes) {
        super(direccion, cantNoches);
        this.cantAmbientes = cantAmbientes;
    }

    //tambien puede hacerse con una cadena de if-else. Lo veo más prolijo y mantenible de esta manera
    @Override
    public double getPrecio() {
        switch (cantAmbientes){
            case 1: return 15000 * cantNoches;
            case 2:
            case 3:
            case 4: return 30000 * cantNoches;
            default:
                if(cantAmbientes > 4) {
                    return 50000 * cantNoches; //para más de 4 ambientes
                } else {
                    return 0; //en caso de que no se cumpla ninguna condición
                }
        }
    }

    //podría usarse lombok para el getter. Al ser uno solo, no lo veo necesario
    public int getCantAmbientes() {
        return cantAmbientes;
    }
}
