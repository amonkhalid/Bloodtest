/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package bloodtest;


public class bloodtestGUI extends javax.swing.JFrame {

 
    public bloodtestGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblPriority = new javax.swing.JLabel();
        lblGP = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        comboPriority = new javax.swing.JComboBox<>();
        chkFromHospital = new javax.swing.JCheckBox();
        txtGPDetails = new javax.swing.JTextField();
        btnAddPatient = new javax.swing.JButton();
        btnProcessNext = new javax.swing.JButton();
        btnShowNoShows = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        btnMarkNoShow = new javax.swing.JButton();
        btnShowPatients = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setText("Name");

        lblAge.setText("Age");

        lblPriority.setText("Priority");

        lblGP.setText("GP");

        comboPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High Priority", "Medium Priority", "Low Priority", " " }));

        chkFromHospital.setText("From Hospital");

        btnAddPatient.setText("Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        btnProcessNext.setText("Process Patient");
        btnProcessNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessNextActionPerformed(evt);
            }
        });

        btnShowNoShows.setText("Show No-shows");
        btnShowNoShows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowNoShowsActionPerformed(evt);
            }
        });

        displayArea.setColumns(20);
        displayArea.setRows(5);
        jScrollPane1.setViewportView(displayArea);

        btnMarkNoShow.setText("Mark No-Show");
        btnMarkNoShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkNoShowActionPerformed(evt);
            }
        });

        btnShowPatients.setText("Show all Patients");
        btnShowPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPatientsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(btnShowNoShows)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnShowPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMarkNoShow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPriority, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblGP, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboPriority, javax.swing.GroupLayout.Alignment.TRAILING, 0, 126, Short.MAX_VALUE))
                                .addGap(82, 82, 82)
                                .addComponent(btnAddPatient)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcessNext))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkFromHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtGPDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(btnMarkNoShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddPatient)
                    .addComponent(btnProcessNext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPriority)
                    .addComponent(comboPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGP)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkFromHospital)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGPDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnShowPatients)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(btnShowNoShows)
                        .addGap(30, 30, 30)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
           String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        String priority = (String) comboPriority.getSelectedItem();
        boolean fromHospital = chkFromHospital.isSelected();
        String gpDetails = txtGPDetails.getText();
        
        scheduler.addPatient(new patient(name, age, priority, fromHospital, gpDetails));
        displayArea.append("Added: " + name + "\n");
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void btnProcessNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessNextActionPerformed
   patient next = scheduler.getNextPatient();
        displayArea.append("Next Patient: " + (next != null ? next.getName() : "None") + "\n");
    }                              
    }//GEN-LAST:event_btnProcessNextActionPerformed

    private void btnShowNoShowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowNoShowsActionPerformed

    }//GEN-LAST:event_btnShowNoShowsActionPerformed

    private void btnMarkNoShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkNoShowActionPerformed
     
    }//GEN-LAST:event_btnMarkNoShowActionPerformed

    private void btnShowPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPatientsActionPerformed
        List<patient> patients = scheduler.getAllPatients();

        if (patients.isEmpty()) {
            displayArea.append("No patients in the queue.\n");
            return;
        }

        displayArea.append("Patient List:\n");

        for (patient p : patients) {
            displayArea.append("Name: " + p.getName() +
                    ", Age: " + p.getAge() +
                    ", Priority: " + p.getPriority() +
                    ", From Hospital: " + (p.isFromHospital() ? "Yes": "No") +
                    ", GP: " + p.getGpDetails() + "\n");                             
    }//GEN-LAST:event_btnShowPatientsActionPerformed
     
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnMarkNoShow;
    private javax.swing.JButton btnProcessNext;
    private javax.swing.JButton btnShowNoShows;
    private javax.swing.JButton btnShowPatients;
    private javax.swing.JCheckBox chkFromHospital;
    private javax.swing.JComboBox<String> comboPriority;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblGP;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPriority;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGPDetails;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
