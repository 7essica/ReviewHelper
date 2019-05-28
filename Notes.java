
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Notes
{
    private static ArrayList<Sentence> notes;
    
    public Notes(){
        notes = new ArrayList<Sentence>();
    }
        
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String strInput = in.nextLine();
        
        while (!"quit".equalsIgnoreCase(strInput)) {
            Sentence s = new Sentence(strInput);
            notes.add(s);
            s.printBlankVer();
            strInput = in.nextLine();
        }
        
        System.out.println("--------------ANSWER KEY---------------");
        
        for(Sentence k : notes){
            k.printAnswerKey();
        }
    }
    
    
}
