package com.hcs.designpatterns.creational.prototype.example2;

public class PrototypeDemo {

	public static void main(String[] args) {
		Employee helton = new Employee("Helton Souza", "Software Developer", "Development Department");
		Employee clonedHelton = helton.getClone();
		helton.setSurname("Fox");
		/* 
		 * Clone of Object will do a shadow copy, not a deep-copy.
		 * (if Job wasn't a CloneabledObject) -> I set the job properties of the original object, the cloned object will change too.
		 */
		helton.getJob().setName("Tester");
		helton.getJob().setDepartment("Testing Department");
		System.out.println(helton);
		System.out.println("");
		System.out.println(clonedHelton);
	}
	
}
