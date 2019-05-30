
public abstract class Word
{
    private String word;
    
    public Word(String a){
    }
    
    public int wordLength(){
        return word.length();
    }
    
    public String getCurrentWord(){
        return word;
    }
    
    /*
     * The getWord method needs to distinguish for blanks and answers
     * However, building a seperate class Blank from Answers makes the system confusing
     * so, use command to specify whether getWord should return blank or a word
     */
    public abstract String getWord(String command);
}
