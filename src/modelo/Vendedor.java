package modelo;

public class Vendedor extends Persona{
    
    private String agencia;
    private Double porcentajeComision;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(Double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
    
    
}
