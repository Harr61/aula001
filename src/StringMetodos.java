import java.util.Locale;

public class StringMetodos {

    public static void main(String[] args) {
        String frase = "Hoje estou estudando java!";

        //charAT
        System.out.println("Buscando o caractera com base no indice 10:" + frase.charAt(10));
        // concat
        System.out.println(frase.concat("Usando concat para concatenar"));
        //contais
        System.out.println(frase.contains("amo"));
        //equals
        System.out.println(frase.equals(""));
        //equalsIgnoreCase
        System.out.println(frase.equalsIgnoreCase(""));
        //indexOf
        System.out.println(frase.indexOf("t"));
        //LastIndexOf
        System.out.println(frase.lastIndexOf("t"));
        //Length
        System.out.println(frase.length());
        //toLowerCase
        System.out.println(frase.toLowerCase());
        //to UpperCase
        System.out.println(frase.toUpperCase());
        //Trim
        System.out.println(frase.trim());
        //replace
        System.out.println(frase.replace("e", "A"));
        //substring
        String nome = "Fulano de tal beltrano e ciclano";
        System.out.println(nome.substring(0,20));
        nome = "fulano";
        if (nome.length() > 20) {
            System.out.println(nome.substring(0, 20));
        }else {
            System.out.println(nome);
        }

        Long numero = 1L;

        String tempplate = "O valor do premio para o %d º colocado é %2d";
        System.out.println(String.format(tempplate, 1, 1000));
        System.out.println(String.format(tempplate, 1, 800));
        System.out.println(String.format(tempplate, 1, 500));

        String linha = "134 12354 156741 Guilbert";
        String[] split = linha.split(" ");
        for (String valor : split){
            System.out.println(valor);
        }

    }

}
