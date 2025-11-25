class Circulo extends FiguraGeometrica{
    
    private double raio;
    private double PI = 3.14;
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularPerimetro(){
        
        return 2 * PI * raio;
    }
    
    @Override
    public double calcularArea(){
        
        return PI * raio * raio;
    }
    
    
}