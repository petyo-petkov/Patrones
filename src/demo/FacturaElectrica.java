package demo;

public class FacturaElectrica {
    double impuesto = 21;

    public double calcularImpuesto(double precio){
        return precio * impuesto / 100;
    }

    public double calcularPrecioUsusario(){
        return 0.50 * calcularImpuesto(0.50);
    }
    public double calcularPrecioEmpresa(){
        return 0.90 * calcularImpuesto(0.90);
    }
}
