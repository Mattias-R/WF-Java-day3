public class Task3 {
    public static void main(String[] args){
        String text="hallo das ist ein sehr wichtiger test zum testen";
        String text2 = " dieser string hat weniger von allem";
        System.out.println(text.indexOf("ein")); // returns the beginning number of this word
        System.out.println(text.startsWith("ist")); // returns true or false
        System.out.println(text.compareTo(text2)); // returns a number
        System.out.println(text2.trim()); // delete the space before and after the string
        System.out.println(text.replace("hallo","tschüss")); // replace the word
        System.out.println(text.replaceAll(text,text2)); // it replaces everything
        System.out.println(text.split("a"));  // dont know
    }
}
