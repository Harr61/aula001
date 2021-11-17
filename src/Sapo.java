public class Sapo {

    public static void main(String[] args) {
        String sapo = "o sapo não lava o pé";

        sapo = sapo.replaceAll("[aeiouAEIOUãé]", "a");
        System.out.println(sapo);
        sapo = sapo.replace("aa", "a");
        System.out.println(sapo);
        System.out.println(sapo.replace("a","e"));
        System.out.println(sapo.replace("a","i"));
        System.out.println(sapo.replace("a","o"));
        System.out.println(sapo.replace("a","u"));
    }
}