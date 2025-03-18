/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtest;

public class patient {
    private String name;
    private int age;
    private String priority;
    private boolean fromHospital;
    private String gpDetails;

    public patient(String name, int age, String priority, boolean fromHospital, String gpDetails) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.fromHospital = fromHospital;
        this.gpDetails = gpDetails;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPriority() { return priority; }
    public boolean isFromHospital() { return fromHospital; }
    public String getGpDetails() { return gpDetails; }
}
