
package a1;

public interface Question{
    
    public String[] choice();
    public void setChoice(String choice, int i);
    public String getChoice(int i);
    public enum generateQuestion{MULTIPLE, SINGLE};
}
