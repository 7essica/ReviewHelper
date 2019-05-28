
/**
 * Write a description of class Blank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Answer extends Word
{
    private String blank = "";
    
    public Answer(String ans)
    {
        super(ans);
    }
    
    public String getBlank(){
        for(int i = 0; i < this.wordLength(); i++){
            blank += "_";
        }
        return blank;
    }
    
    public String getWord(String command){
        if(command.equals("blank")){
            return getBlank();
        }else{
            return "___" + getCurrentWord() + "___";
        }
    }
    
}
