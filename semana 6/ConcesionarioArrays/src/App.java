public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");

        int indice = 0;
        int borrar=0;

        Coches[] coches = new Coches[4];

        for(int i=0; i<coches.length; i++){
            coches[i] = new Coches();
            coches[i] = Coches.anadirCoche(coches[i]);
            indice++;
        }
        borrar=1;
        coches = Coches.eliminarCoche(coches, borrar, indice);
        indice--;

        for(int i=0; i<indice; i++){
        System.out.printf("coches %d %s %s %s\n",i, coches[i].getColor(), coches[i].getMarca(), coches[i].getModelo());
        }
        

    }
    
}
