
import java.util.ArrayList;
/**
 * Write a description of class Info here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Notes
{
    private ArrayList<Word> note;
    
    public Notes(String a){
        note = new ArrayList<Word>();
        String[] w = a.split(" ");
        for(String k:w){
            if(k.indexOf("'''") > 0){
                note.add(new Answer(k));
            }else{
                note.add(new NormalWord(k));
            }
        }
    }
    
    public void printBlankVer(){
        for(Word a : note){
            System.out.println(a.getWord("blank") + " ");
        }
    }
    
        public void printAnswerKey(){
        for(Word a : note){
            System.out.println(a.getWord("words") + " ");
        }
    }
}
