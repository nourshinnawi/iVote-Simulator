// Assignment #1
// Nour Shinnawi
// 9/29/20
// CS 3650.01

package a1;
import java.util.Random;

public class SimulationDriver {

    public static void main(String[] args) {
        VotingService votingService = null;
        Question question = null;
        generateQuestion  randomQuestion = generateQuestion.getRandom();
        
        Random num = new Random();
        int students = num.nextInt(50) + 1;
        Student[] numStudents = new Student[students];
  
        if(randomQuestion == generateQuestion.SINGLE){
            question = new SingleChoice();
            votingService = new VotingService(question);
            
            System.out.println("The question is single choice: ");
            for(int i = 0; i< 2; i++){
                System.out.println(question.getChoice(i));
            }
        }
        else if(randomQuestion == generateQuestion.MULTIPLE){
            question = new MultipleChoice();
            votingService = new VotingService(question);
            
            System.out.println("The question is multiple choice: ");
            for(int i = 0; i< 4; i++){
                System.out.print(question.getChoice(i)+" ");
            }
            System.out.println();
        }
        System.out.println();
	System.out.println("There are " + students + 
                " students total. They picked the following answers:");
        
	System.out.println();
        
        for(int i = 0; i < students; i++){
            numStudents[i] = new Student(Integer.toString(i));
            
            if(randomQuestion == generateQuestion.SINGLE){
                int j = num.nextInt(question.choice().length);
                numStudents[i].setAnswer(question.getChoice(j));
                votingService.acceptChoice(randomQuestion, j);
            }
            else if(randomQuestion == generateQuestion.MULTIPLE){
                int j = num.nextInt(question.choice().length);
                numStudents[i].setAnswer(question.getChoice(j));
                votingService.acceptChoice(randomQuestion, j);
            }
        }
        
        votingService.displayAnswer(randomQuestion);
    }
}
