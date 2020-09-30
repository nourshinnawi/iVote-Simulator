//

package a1;

public enum generateQuestion {MULTIPLE, SINGLE;

    public static generateQuestion getRandom(){
            return generateQuestion.values()[(int) 
                    (Math.random()*generateQuestion.values().length)];
    }};
