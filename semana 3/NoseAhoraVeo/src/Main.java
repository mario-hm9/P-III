import com.coti.tools.Esdia;

public class Main {
    public static void main(String[] args) throws Exception {

        Persona[] personas = new Persona[3];

        for (int i = 0; i<3; i++){
            personas[i] = new Persona();

            //nombre

            String nombre = Esdia.readString(("\nIntroduzca el nombre de la persona "+(i+1)+": "));
            /*
            esto de arriba se puede hacer también así:
            String prompt = String.format("Introduzca el nombre de la persona %d: ", i);
            String nombre = Esdia.readString(prompt);
            */
            personas[i].setNombre(nombre);

            //peso

            String promptPeso = String.format("Introduzca el peso de la persona %d: ", i);
            double peso = Esdia.readDouble(promptPeso);
            personas[i].setPeso(peso);

            //altura

            String promptAltura = String.format("Introduzca la altura de la persona %d: ", i);
            double altura = Esdia.readDouble(promptAltura);
            personas[i].setAltura(altura);

            
        }

        Persona masAlta = personas[0];
        Persona masPesada = personas[0];

        for (int i = 1; i<personas.length; i++){
            if (personas[i].getAltura() > masAlta.getAltura()){
                masAlta = personas[i];
            }
            if (personas[i].getPeso() > masPesada.getPeso()){
                masPesada = personas[i];
            }
        }

        System.out.println("\nLa persona más alta es "+masAlta.getNombre()+", que mide "+masAlta.getAltura()+" metros.");
        
        System.out.println("La persona más pesada es "+masPesada.getNombre()+", que pesa "+ masPesada.getPeso()+" kilos.");


    }
}
