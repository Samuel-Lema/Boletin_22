package main;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbFullName = new javax.swing.JLabel();
        lbUserID = new javax.swing.JLabel();
        lbGroup = new javax.swing.JLabel();
        lbDirectory = new javax.swing.JLabel();
        lbLoginShell = new javax.swing.JLabel();
        lbPassConfim = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        tfFullName = new javax.swing.JTextField();
        tfUserName = new javax.swing.JTextField();
        tfUserID = new javax.swing.JTextField();
        tfDirectory = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        tfPassConfirm = new javax.swing.JPasswordField();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cbGroup = new javax.swing.JComboBox<>();
        cbLoginShell = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New User...");

        lbTitle.setText("Create a new User");

        lbUserName.setText("User Name:");

        lbFullName.setText("Full Name:");

        lbUserID.setText("User ID:");

        lbGroup.setText("Group:");

        lbDirectory.setText("Home Directory:");

        lbLoginShell.setText("Login Shell:");

        lbPassConfim.setText("Confirm:");

        lbPassword.setText("Password:");

        tfFullName.setText("User mary");

        tfUserName.setText("mary");

        tfPassword.setText("jPasswordField1");

        tfPassConfirm.setText("jPasswordField1");

        btnOK.setText("Ok");

        btnCancel.setText("Cancel");

        cbGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "staff", "user" }));

        cbLoginShell.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "/bin/ksh", "/bin/shell" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTitle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbGroup, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCancel)
                                .addGap(18, 18, 18)
                                .addComponent(btnOK))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbFullName)
                                    .addComponent(lbUserName)
                                    .addComponent(lbUserID)
                                    .addComponent(lbDirectory)
                                    .addComponent(lbLoginShell)
                                    .addComponent(lbPassword)
                                    .addComponent(lbPassConfim))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPassword)
                                    .addComponent(tfDirectory)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbLoginShell, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tfPassConfirm)
                                    .addComponent(tfUserID)
                                    .addComponent(tfFullName)
                                    .addComponent(tfUserName))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUserName)
                    .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFullName)
                    .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUserID)
                    .addComponent(tfUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGroup)
                    .addComponent(cbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDirectory)
                    .addComponent(tfDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLoginShell)
                    .addComponent(cbLoginShell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassConfim)
                    .addComponent(tfPassConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox<String> cbGroup;
    private javax.swing.JComboBox<String> cbLoginShell;
    private javax.swing.JLabel lbDirectory;
    private javax.swing.JLabel lbFullName;
    private javax.swing.JLabel lbGroup;
    private javax.swing.JLabel lbLoginShell;
    private javax.swing.JLabel lbPassConfim;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUserID;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JTextField tfDirectory;
    private javax.swing.JTextField tfFullName;
    private javax.swing.JPasswordField tfPassConfirm;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUserID;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables
}
