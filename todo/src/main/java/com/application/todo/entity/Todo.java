package com.application.todo.entity;

public class Todo {
	private Integer id;
	private String task;
	private Boolean isDone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Boolean isDone() {
		return isDone;
	}

	public void setIsDone(boolean bool) {
		this.isDone = bool;
	}
}
