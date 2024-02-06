public class App {
    public static void main(String[] args) throws Exception {
        
        String original = "abcde FGHIJ ABC DEFG";

        String s01 = original.toLowerCase(); // Tudo menusculo
        String s02 = original.toUpperCase(); // Tudo maiusculo
        String s03 = original.trim(); // recorta espaço vazio
        String s04 = original.substring(2); // começar a partir da posição x
        String s05 = original.substring(2, 9); // começar e terminar na posição x e y
        String s06 = original.replace('a', 'x'); // substitui o caracter x por y
        String s07 = original.replace("abc", "xy"); //substitui abc por xy

        int i = original.indexOf("bc"); //faz a variavel receber valor da posição inicial de "bc"
        int j = original.lastIndexOf("bc"); //faz a variavel receber o valor da posicão final de "bc" 

        System.out.println("Original: -" + original + "-"); 
        System.out.println("toLowerCase: -" + s01 + "-"); 
        System.out.println("toUpperCase: -" + s02 + "-"); 
        System.out.println("trim: -" + s03 + "-");  
        System.out.println("substring(2): -" + s04 + "-"); 
        System.out.println("substring(2, 9): -" + s05 + "-"); 
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
    }
}
