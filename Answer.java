
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
        super(ans.substring(ans.indexOf("'''")+1));
    }
    
    /*    public String getBlank(){
        for(int i = 0; i < this.wordLength(); i++){
            blank += "_";
        }
        return blank;
    }*/
    
    public String getWord(String command){
        if(command.equals("blank")){
            String b = "";
            for(int i = 0; i < this.wordLength(); i++){
                b += "_";
            }
            System.out.println(b);
            return b;
        }else{
            System.out.println(getCurrentWord());
            return "___" + getCurrentWord() + "___";
        }
    }
    
}
