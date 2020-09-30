
package a1;

public class VotingService {
    
    protected int[] singleChoice;
    protected int[] multipleChoice;
    
    public VotingService(Question question){
        question.choice();
        singleChoice = new int[2];
        multipleChoice = new int [4];
    }
    
    public void acceptChoice(generateQuestion question, int i){
        if(question == generateQuestion.SINGLE){
            singleChoice[i]++;
        }
        else if(question == generateQuestion.MULTIPLE){
            multipleChoice[i]++;
        }
    }
    
    public void displayAnswer(generateQuestion question){
        if(question == generateQuestion.SINGLE){
            System.out.println("1. Right - " + singleChoice[0] + " students");
            System.out.println("2. Wrong - " + singleChoice[1] + " students");
        }
        else if(question == generateQuestion.MULTIPLE){
            System.out.println("A - " + multipleChoice[0] + " students");
            System.out.println("B - " + multipleChoice[1] + " students");
            System.out.println("C - " + multipleChoice[2] + " students");
            System.out.println("D - " + multipleChoice[3] + " students");
        }
    }
}
