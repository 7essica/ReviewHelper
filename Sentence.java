
import java.util.ArrayList;
/**
 * Write a description of class Info here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sentence
{
    private ArrayList<Word> sentence;
    
    public Sentence(String a){
        sentence = new ArrayList<Word>();
        String[] w = a.split(" ");
       
        for(String k:w){
            if(k.indexOf("x") != -1){
                System.out.println("answer found!");
                Answer ans = new Answer(k);
                sentence.add(ans);
            }else{
                NormalWord n = new NormalWord(k);
                sentence.add(n);
            }
        }
    }
    
    public void printBlankVer(){
        for(Word a : sentence){
            System.out.print(a.getWord("blank") + " ");
        }
    }
    
        public void printAnswerKey(){
        for(Word a : sentence){
            System.out.print(a.getWord("words") + " ");
        }
    }
}
