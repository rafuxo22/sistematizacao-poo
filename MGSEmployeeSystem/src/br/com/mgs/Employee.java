package br.com.mgs;

public class Employee {
    private String name;
    private String id;
    private String allergies;
    private String medicalConditions;
    private String contactEmail;
    private String contactPhone;

    // Construtor
    public Employee(String name, String id, String allergies, String medicalConditions, String contactEmail, String contactPhone) {
        this.name = name;
        this.id = id;
        this.allergies = allergies;
        this.medicalConditions = medicalConditions;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
    }

    // Getters e Setters
    public String getName() { return name; }
    public String getId() { return id; }
    public String getAllergies() { return allergies; }
    public String getMedicalConditions() { return medicalConditions; }
    public String getContactEmail() { return contactEmail; }
    public String getContactPhone() { return contactPhone; }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", allergies='" + allergies + '\'' +
                ", medicalConditions='" + medicalConditions + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                '}';
    }
}
