public class SentenciasIf {
    public static void main(String[] args) {

        var edad = 17;

        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else if(edad >= 13 && edad < 18){
            System.out.println("Eres un adolecente");
        }
        else{
            System.out.println("Eres un niño");
        }

    }
}
