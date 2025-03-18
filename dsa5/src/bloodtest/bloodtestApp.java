/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author bxstx
 */
public class bloodtestApp {
    
    private PriorityQueue<patient> patientQueue;
    private LinkedList<String> noShowList;
    private HashMap<String, String> gpDetailsMap;

    public bloodtestApp() {
        this.patientQueue = new PriorityQueue<>();
        this.noShowList = new LinkedList<>();
        this.gpDetailsMap = new HashMap<>();
    }

    public void addPatient(patient p) {
        patientQueue.add(p);
        gpDetailsMap.put(p.getName(), p.getGpDetails());
    }

    public patient getNextPatient() {
        return patientQueue.poll();
    }

    public void addNoShow(String patientName) {  
        if (noShowList.size() >= 5) {
            noShowList.removeFirst();  // Keep only the last 5 no-shows
        }
        noShowList.add(patientName);
    }
    
    public List<String> getNoShowList() {
        return new ArrayList<>(noShowList);
    }

    public List<patient> getAllPatients() {
        return new ArrayList<>(patientQueue);
    }
    
    
}




    
