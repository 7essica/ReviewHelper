
/**
 * Write a description of class Words here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NormalWord extends Word
{
    private String word;

    public NormalWord(String a)
    {
        //word = a;
        //where the problem is
        //the normal word keeps being null
        super(a);
    }
    
    public String getWord(String command){
        System.out.println(word);
        return word;
    }

}
