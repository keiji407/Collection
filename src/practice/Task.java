package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task>{
	//implements Comparable<Task>
	
	private LocalDate date;
	private String content;
	
	public Task(LocalDate date ,String content) {
		this.date = date;
		this.content = content;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	
	@Override
	public int compareTo(Task t) {
		return this.date.compareTo(t.date);
	}
	
	@Override
	public String toString() {
		return this.date + " " + this.content;
	}
	

}
