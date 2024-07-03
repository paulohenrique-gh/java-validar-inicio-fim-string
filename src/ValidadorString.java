public class ValidadorString {
    public static boolean validarString(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }

        if (str1.isEmpty() && !str2.isEmpty() ||
                str2.isEmpty() && !str1.isEmpty()) {
            return false;
        }

        String fimPalavra1 = str1.substring(str1.length() - 2);
        String comecoPalavra2 = str2.substring(0, 2);

        return fimPalavra1.equals(comecoPalavra2);
    }
}
