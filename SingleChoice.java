
package a1;

public class SingleChoice implements Question{
    
    protected String[] choice = new String[2];
    
    @Override
    public String[] choice(){
        choice[0] = "1. Right";
        choice[1] = "2. Wrong";
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
