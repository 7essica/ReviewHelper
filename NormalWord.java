
/**
 * Write a description of class Words here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NormalWord extends Word
{

    public NormalWord(String a)
    {
        super(a);
    }
    
    public String getWord(String command){
        return getCurrentWord();
    }

}
