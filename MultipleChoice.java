//Multiple Choice Class

package a1;

public class MultipleChoice implements Question{
    protected String[] choice = new String[4];
    
    @Override
    public String[] choice(){
        choice[0] = "A";
        choice[1] = "B";
        choice[2] = "C";
        choice[3] = "D";
        return choice;
    }
    
    @Override
    public void setChoice(String choice, int i){
        this.choice[i] = choice;
    }
    
    @Override
    public String getChoice(int i){
        return choice[i];
    }
    
}
