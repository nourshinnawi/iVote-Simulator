
package a1;


enum generateQuestion {MULTIPLE, SINGLE;

    public static generateQuestion getRandom(){
            return generateQuestion.values()[(int) 
                    (Math.random()*generateQuestion.values().length)];
    }
};

public interface Question{
    
    public String[] choice();
    public void setChoice(String choice, int i);
    public String getChoice(int i);
    public enum generateQuestion{MULTIPLE, SINGLE};
}
