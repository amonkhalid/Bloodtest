/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtest;

/**
 *
 * @author bxstx
 */
public class bloodtestApp {
    
    package bloodtest;

import java.util.*;

public class bloodtestApp {
    private PriorityQueue<patient> patientQueue;
    private LinkedList<String> noShowList;

    public bloodtestApp() {
        this.patientQueue = new PriorityQueue<>();
        this.noShowList = new LinkedList<>();
    }

    public void addPatient(patient p) {
        patientQueue.add(p);
    }

    public patient getNextPatient() {
        return patientQueue.poll();
    }

    public void addNoShow(String patientName) {
        if (noShowList.size() >= 5) {
            noShowList.removeFirst();  
        }
        noShowList.add(patientName);
    }
}

    
}
