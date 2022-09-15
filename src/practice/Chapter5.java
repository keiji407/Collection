package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {
		
		Task t1 = new Task(LocalDate.of(2021,10,21),"牛乳を買う。");
	    Task t2 = new Task(LocalDate.of(2021,9,15),"○○社面談。");
	    Task t3 = new Task(LocalDate.of(2021,12,4),"手帳を買う。");
	    Task t4 = new Task(LocalDate.of(2021,8,10),"散髪に行く。");
	    Task t5 = new Task(LocalDate.of(2021,11,9),"スクールの課題を解く。");
	    
	    List<Task> task = new ArrayList<Task>();
	    task.add(t1);
	    task.add(t2);
	    task.add(t3);
	    task.add(t4);
	    task.add(t5);
	   
	    Collections.sort(task);
	    
	    for(int i=0;i<task.size();i++){
			System.out.println(task.get(i));
	    }

	}

}
