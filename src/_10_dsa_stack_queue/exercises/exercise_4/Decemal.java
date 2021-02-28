package _10_dsa_stack_queue.exercises.exercise_4;

public class Decemal {
    Object numberDec;

    public String decToBin(){
        Integer temp = (Integer) numberDec;
        String resuilt="";
        while (temp!=0){
            resuilt+=temp%2;
            temp=temp/2;
        }
        return resuilt;
    }

    public String decToHex(){
        Integer temp= (Integer) numberDec;
        String resuilt="";
        while (temp!=0){
            resuilt+=temp%16;
            temp=temp/16;
        }
        return resuilt;
    }
}
