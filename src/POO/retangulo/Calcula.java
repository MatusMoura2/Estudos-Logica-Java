package POO.retangulo;

public class Calcula {

	 public static float calcularArea(Retangulo retangulo) {
	        return retangulo.getLado01() * retangulo.getLado02();
	    }

	    public static float calcularPerimetro(Retangulo retangulo) {
	        return 2 * (retangulo.getLado01() + retangulo.getLado02());
	    }
}
