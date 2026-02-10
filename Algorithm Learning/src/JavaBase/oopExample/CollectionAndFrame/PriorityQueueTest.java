package JavaBase.oopExample.CollectionAndFrame;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student{
    private String name;
    private int chineseScore;
    private int mathScore;

    public  Student(String name,int chineseScore,int mathScore){
        this.name = name;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getChineseScore(){
        return chineseScore;
    }

    public void setChineseScore(int chineseScore){
        this.chineseScore = chineseScore;
    }

    public int getMathScore(){
        return mathScore;
    }

    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", 总成绩=" + (chineseScore + mathScore) +
                '}';

    }

}


class StudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getChineseScore()+s2.getMathScore(),s1.getChineseScore()+s1.getMathScore());
    }
}



public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new StudentComparator());


        queue.offer(new Student("neil",90,80));
        System.out.println(queue);

        queue.offer(new Student("tom",100,90));
        System.out.println(queue);

        queue.offer(new Student("tony",60,40));
        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}
