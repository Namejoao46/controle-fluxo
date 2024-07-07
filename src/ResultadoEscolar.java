public class ResultadoEscolar {
    public static void main(String[] args) {
        double media = 7;
        double nota = 6.9;

        if (nota >= media ){ //*if sempre primeiro */
            System.out.println("Aprovado");
        }
        else if (nota >= 5 && nota < 7){
            System.out.println("recuperação");
        }
        else{
        System.out.println("reprovado"); //*else sempre o ultimo */
        }
        System.out.println(nota);
    }
}
