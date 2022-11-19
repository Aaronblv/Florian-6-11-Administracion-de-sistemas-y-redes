package calculadoraa;

public class calculadora {

    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicar(int numero1, int numero2){
        return numero1 * numero2;
    }

    public int dividir(int numero1, int numero2) {
        return numero1 / numero2;
    }

    public double raizCuadratica(int a, int b, int c){
        if(a == 0 || b == 0)  { throw new ArithmeticException(); }

        double preMasMenos = Math.sqrt((b * b) - (4 * a * c));
        double postMasMenosPositivo = (-b + preMasMenos)/2*a;
        double postMasMenosNegativo = (-b - preMasMenos)/2*a;

        double[] resultado = {postMasMenosPositivo,postMasMenosNegativo};
        return resultado;
    }
}
