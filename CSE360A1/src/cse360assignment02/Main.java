package cse360assignment02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddingMachine add = new AddingMachine();
		System.out.println(add.toString());
		add.add(27);
		add.subtract(22);
		System.out.println(add.toString());
		System.out.println(add.getTotal());
		add.clear();
		System.out.println(add.toString());
		

	}

}
