
void main(String[] args)
    int resultado

    resultado = suma(1, 2, 3);

    Coche miCoche = new Coche();
    miCoche.ponerpuertas();
    System.out.println(miCoche.puertas);


int suma(int a, int b, int c)
    return a + b + c;

class Coche {
    int puertas = 0;

    void ponerpuertas () {
        this.puertas++;
    }
}