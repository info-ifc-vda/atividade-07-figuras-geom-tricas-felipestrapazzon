public class FigurasMain{
	public static void main(String[] args) {
		
		FiguraGeometrica c = new Circulo(5);
        FiguraGeometrica q = new Quadrado(4);
        FiguraGeometrica t = new Triangulo(3, 4, 5, 3, 4);

        System.out.println("Círculo:");
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());

        System.out.println("\nQuadrado:");
        System.out.println("Área: " + q.calcularArea());
        System.out.println("Perímetro: " + q.calcularPerimetro());

        System.out.println("\nTriângulo:");
        System.out.println("Área: " + t.calcularArea());
        System.out.println("Perímetro: " + t.calcularPerimetro());
    }
}

