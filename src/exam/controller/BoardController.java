package exam.controller;

public class BoardController {

	public void select() {
		System.out.println("로컬 작업");
	}

	public void insert() {
		System.out.println("서버 작업");
	}

	public void delete() {
		System.out.println("서버에서 delete 1");
	}

	public void update() {
		System.out.println("로컬에서 update 1");
	}
}
