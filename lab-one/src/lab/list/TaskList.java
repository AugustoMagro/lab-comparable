package lab.list;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
	private List<Task> taskList;

	public TaskList() {
		this.taskList = new ArrayList<>();
	}
	
	public void addTask(String description) {
		taskList.add(new Task(description));
	}
	
	public void removeTask(String description) {
		List<Task> taskToRemove = new ArrayList<>();
		for (Task t: taskList) {
			if (t.getDescription().equalsIgnoreCase(description)) {
				taskToRemove.add(t);
			}
		}
		taskList.removeAll(taskToRemove);
	}
	
	public int totalNumberTasks() {
		return taskList.size();
	}
	
	public void getDescriptionTask() {
		System.out.println(taskList);
	}
	
	public static void main(String[] args) {
		TaskList taskList = new TaskList();
		
		taskList.addTask("Task 1");
		taskList.addTask("Task 2");
		taskList.getDescriptionTask();
		
		System.out.println(taskList.totalNumberTasks());
		
		taskList.removeTask("Task 1");
		System.out.println(taskList.totalNumberTasks());
		
	}
	
}
