package com.va.week5.lab3_SJ;


public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable {

    public EmergencyDoctor(int personId, String name, int age, String specialization, double consultationFee) {
        super(personId, name, age, specialization, consultationFee);
    }

    public void handleEmergency() {
        System.out.println(getName() + " is handling an emergency!");
    }

    @Override
    public void prescribeMedication() {
        System.out.println(getName() + " prescribed emergency medication.");
    }

    @Override
    public void generateBill() {
        System.out.println("Emergency bill generated for " + getName() + "'s patient.");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " (EmergencyDoctor) is responding to emergencies.");
    }
}