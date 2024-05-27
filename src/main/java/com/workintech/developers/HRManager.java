package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, int salary,
                     JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }
    public void addEmployee(JuniorDeveloper juniorDev) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDev;
                System.out.println("JuniorDeveloper added");
                return;
            }
        }
        System.out.println("No available slot for JuniorDeveloper");
    }

    public void addEmployee(MidDeveloper midDev) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDev;
                System.out.println("MidDeveloper added");
                return;
            }
        }
        System.out.println("No available slot for MidDeveloper");
    }

    public void addEmployee(SeniorDeveloper seniorDev) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDev;
                System.out.println("SeniorDeveloper added");
                return;
            }
        }
        System.out.println("No available slot for SeniorDeveloper");
    }
    @Override
    public void work() {
        System.out.println(getName()+" hr manager starts to working...");
        setSalary(getSalary() + 400);
    }
}
