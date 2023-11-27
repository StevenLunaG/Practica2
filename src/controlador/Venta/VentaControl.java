package controlador.Venta;

import controlador.DAO.DaoImplement;
import controlador.TDA.listas.DynamicList;
import modelo.Venta;

public class VentaControl extends DaoImplement<Venta>{
    private DynamicList<Venta> ventas;
    private Venta venta;

    public VentaControl() {
        super(Venta.class);
    }

    public DynamicList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(DynamicList<Venta> ventas) {
        this.ventas = ventas;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

        
    public Boolean persist(){
        venta.setId(all().getLenght() + 1);
        return persist(venta);
    }
}
