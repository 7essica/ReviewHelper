
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
    }
        
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String strInput = in.nextLine();
        
        notes = new ArrayList<Sentence>();
        
        while (!"quit".equalsIgnoreCase(strInput)) {
            Sentence s = new Sentence(strInput);
            notes.add(s);
            s.printBlankVer();
            System.out.println();
            strInput = in.nextLine();
        }
        
        System.out.println("--------------ANSWER KEY---------------");
        
        for(Sentence k : notes){
            k.printAnswerKey();
        }
    }
    
    
}
