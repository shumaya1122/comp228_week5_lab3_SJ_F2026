package com.va.week5.lab3_SJ;

public class MainDriver {
	public static void main(String[] args) {
		// 1. Create objects
		Doctor doctor = new Doctor(101, "Dr. Adams", 45, "Cardiology", 200.0);
		Nurse nurse = new Nurse(102, "Nurse Bell", 30, "ICU", "Night");
		Surgeon surgeon = new Surgeon(103, "Dr. Cruz", 50, "Orthopedic", 500.0, "Knee Replacement", "Room 4");
		EmergencyDoctor emergencyDoctor = new EmergencyDoctor(104, "Dr. Diaz", 38, "Emergency Medicine", 350.0);

		// 2. Display details
		System.out.println(" Employee Details ");
		doctor.displayDetails();
		nurse.displayDetails();
		surgeon.displayDetails();
		emergencyDoctor.displayDetails();

		// 3. Specialized methods
		System.out.println("\n Specialized Methods ");
		doctor.diagnosePatient();
		nurse.assistPatient();
		surgeon.performSurgery();
		emergencyDoctor.handleEmergency();

		// 4. Method overriding
		System.out.println("\n Method Overriding ");
		doctor.performDuties();
		nurse.performDuties();
		surgeon.performDuties();
		emergencyDoctor.performDuties();

		// 5. Polymorphism - one Person reference, many behaviors
		System.out.println("\n Polymorphism ");
		Person person;

		person = new Doctor(105, "Dr. Evans", 42, "Neurology", 250.0);
		person.performDuties();

		person = new Nurse(106, "Nurse Ford", 28, "ER", "Day");
		person.performDuties();

		person = new Surgeon(107, "Dr. Gray", 55, "Cardiac", 700.0, "Heart Bypass", "Room 7");
		person.performDuties();

		person = new EmergencyDoctor(108, "Dr. Hall", 35, "Emergency Medicine", 300.0);
		person.performDuties();

		// 6. Interface methods
		System.out.println("\n Interface Methods ");
		emergencyDoctor.prescribeMedication();
		emergencyDoctor.generateBill();
	}
}
