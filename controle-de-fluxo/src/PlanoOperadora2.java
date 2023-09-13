public class PlanoOperadora2 {

    public static void main(String[] args) {

        String plano = "T";

        switch (plano) {
            case ("T"): {
                System.out.println("5 GB DE YOUTUBE ");
            }
            case ("M"): {
                System.out.println("WHATSAPP E INSTRAGRAM ILIMITADO");
            }

            case ("B"): {
                System.out.println("100 MINUTOS DE LIGACÃO");
                    break;
            }

            default:
                System.out.println("PLANO NÃO IDENTIFICADO");

        }

    }

}
