public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; 

        switch (plano) {
            case "T": {
                System.out.println("5gb de YouTube");
                break;
            }
            case "M":{
                System.out.println("Whats e Instgram gratis");
                break;
            }

            case "B":{
                System.out.println("100 minutos de ligação");
                break;
            }

            default:
                System.out.println("Não Encontrado");

        }
    }    
}
