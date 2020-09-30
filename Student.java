
package a1;

public class Student {
    
    protected String id;
    protected String answer;
    
    public Student(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void setAnswer(String answer){
        this.answer = answer;
    }
    
    public String getAnswer(){
        return answer;
    }
}
