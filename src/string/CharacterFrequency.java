package string;

public class CharacterFrequency {
    public static void main(String[] args){
        System.out.println('A' - 'a');
        System.out.println((char)('A' + 32));
        System.out.println((char)('a' - 32));
        String str = "sapthagiri";
        int[] freq = new int[26]; //All alphabets included
        //Pangram
        //A quick brown fox jumps over the lazy dog
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                System.out.println((char) (i + 'a') + "->" + freq[i]);
            }
        }






    }



}
