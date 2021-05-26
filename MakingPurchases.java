/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * Created by Bonny Chen 
 * ICS3U1
 * April 29th, 2021
 */
public class MakingPurchases extends javax.swing.JFrame {

    /**
     * Creates new form MakingPurchases
     */
    public MakingPurchases() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        background = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        menuPanel2 = new javax.swing.JPanel();
        menuPanel1 = new javax.swing.JPanel();
        lblItem1 = new javax.swing.JLabel();
        lblItem2 = new javax.swing.JLabel();
        lblItem3 = new javax.swing.JLabel();
        lblItem4 = new javax.swing.JLabel();
        lblItem6 = new javax.swing.JLabel();
        lblItem5 = new javax.swing.JLabel();
        lblToppings = new javax.swing.JLabel();
        lblTapioca = new javax.swing.JLabel();
        txtItem1 = new javax.swing.JTextField();
        txtItem2 = new javax.swing.JTextField();
        txtItem3 = new javax.swing.JTextField();
        txtItem4 = new javax.swing.JTextField();
        txtItem5 = new javax.swing.JTextField();
        txtItem6 = new javax.swing.JTextField();
        btnCheckout = new javax.swing.JButton();
        txtTapioca = new javax.swing.JTextField();
        lblInstructions2 = new javax.swing.JLabel();
        lblGrassJelly = new javax.swing.JLabel();
        txtGrassJelly = new javax.swing.JTextField();
        lblInstructions1 = new javax.swing.JLabel();
        billPanel2 = new javax.swing.JPanel();
        billPanel1 = new javax.swing.JPanel();
        lblTax = new javax.swing.JLabel();
        logoBasket = new javax.swing.JLabel();
        txtTax = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        lblSubtotal = new javax.swing.JLabel();
        lblGrandTotal = new javax.swing.JLabel();
        txtGrandTotal = new javax.swing.JTextField();
        lblMessage1 = new javax.swing.JLabel();
        lblMessage2 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        lblInstructions3 = new javax.swing.JLabel();
        billPanel = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();

        jTextField6.setBackground(new java.awt.Color(246, 246, 255));
        jTextField6.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField6.setText("0");

        jTextField10.setBackground(new java.awt.Color(246, 246, 255));
        jTextField10.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField10.setText("0");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        background.setBackground(new java.awt.Color(246, 246, 255));

        logoPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bonny's Boba Shop ");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resized-image-Promo.jpeg"))); // NOI18N
        logo.setText("jLabel2");

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuPanel2.setBackground(new java.awt.Color(0, 0, 0));

        menuPanel1.setBackground(new java.awt.Color(255, 204, 153));

        lblItem1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblItem1.setText("Classic Milk Tea - $5.00");

        lblItem2.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblItem2.setText("Roasted Milk Tea - $5.50");

        lblItem3.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblItem3.setText("Jasmine Green Milk Tea - $5.25");

        lblItem4.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblItem4.setText("Taro Milk Tea - $6.00 ");

        lblItem6.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblItem6.setText("Thai Milk Tea - $6.25");

        lblItem5.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblItem5.setText("Brown Sugar Milk Tea - $6.00");

        lblToppings.setFont(new java.awt.Font("Bauhaus 93", 0, 26)); // NOI18N
        lblToppings.setText("Toppings -----------------------------------------------------");

        lblTapioca.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblTapioca.setText("Tapioca + $0.75 per drink");

        txtItem1.setBackground(new java.awt.Color(246, 246, 255));
        txtItem1.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        txtItem1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtItem1.setText("0");
        txtItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItem1ActionPerformed(evt);
            }
        });

        txtItem2.setBackground(new java.awt.Color(246, 246, 255));
        txtItem2.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        txtItem2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtItem2.setText("0");
        txtItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItem2ActionPerformed(evt);
            }
        });

        txtItem3.setBackground(new java.awt.Color(246, 246, 255));
        txtItem3.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        txtItem3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtItem3.setText("0");
        txtItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItem3ActionPerformed(evt);
            }
        });

        txtItem4.setBackground(new java.awt.Color(246, 246, 255));
        txtItem4.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        txtItem4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtItem4.setText("0");
        txtItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItem4ActionPerformed(evt);
            }
        });

        txtItem5.setBackground(new java.awt.Color(246, 246, 255));
        txtItem5.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        txtItem5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtItem5.setText("0");
        txtItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItem5ActionPerformed(evt);
            }
        });

        txtItem6.setBackground(new java.awt.Color(246, 246, 255));
        txtItem6.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        txtItem6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtItem6.setText("0");
        txtItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItem6ActionPerformed(evt);
            }
        });

        btnCheckout.setBackground(new java.awt.Color(0, 0, 0));
        btnCheckout.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        btnCheckout.setForeground(new java.awt.Color(255, 204, 153));
        btnCheckout.setText("Checkout");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        txtTapioca.setBackground(new java.awt.Color(246, 246, 255));
        txtTapioca.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        txtTapioca.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTapioca.setText("0");
        txtTapioca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTapiocaActionPerformed(evt);
            }
        });

        lblInstructions2.setFont(new java.awt.Font("Bauhaus 93", 0, 17)); // NOI18N
        lblInstructions2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructions2.setText("Enter the number of drinks you want toppings in:");

        lblGrassJelly.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblGrassJelly.setText("Grass Jelly + $0.50 per drink");

        txtGrassJelly.setBackground(new java.awt.Color(246, 246, 255));
        txtGrassJelly.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        txtGrassJelly.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGrassJelly.setText("0");
        txtGrassJelly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrassJellyActionPerformed(evt);
            }
        });

        lblInstructions1.setBackground(new java.awt.Color(255, 204, 153));
        lblInstructions1.setFont(new java.awt.Font("Bauhaus 93", 0, 17)); // NOI18N
        lblInstructions1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInstructions1.setText("Enter the number of drinks you would like to purchase:");

        javax.swing.GroupLayout menuPanel1Layout = new javax.swing.GroupLayout(menuPanel1);
        menuPanel1.setLayout(menuPanel1Layout);
        menuPanel1Layout.setHorizontalGroup(
            menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(menuPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanel1Layout.createSequentialGroup()
                        .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuPanel1Layout.createSequentialGroup()
                                .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblItem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblItem4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblItem5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtItem5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(txtItem4)
                            .addComponent(txtItem3)
                            .addComponent(txtItem2)
                            .addComponent(txtItem1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanel1Layout.createSequentialGroup()
                        .addComponent(lblItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(txtItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblToppings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menuPanel1Layout.createSequentialGroup()
                        .addComponent(lblTapioca, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTapioca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuPanel1Layout.createSequentialGroup()
                        .addComponent(lblInstructions2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(menuPanel1Layout.createSequentialGroup()
                        .addComponent(lblGrassJelly)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGrassJelly, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblInstructions1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuPanel1Layout.setVerticalGroup(
            menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblInstructions1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuPanel1Layout.createSequentialGroup()
                        .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItem1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblItem2)
                            .addComponent(txtItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblItem3)
                            .addComponent(txtItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblItem4)
                            .addComponent(txtItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblItem5)
                            .addComponent(txtItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItem6))
                        .addGap(15, 15, 15)
                        .addComponent(lblToppings)
                        .addGap(2, 2, 2)
                        .addComponent(lblInstructions2)
                        .addGap(36, 36, 36))
                    .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTapioca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTapioca)))
                .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGrassJelly)
                    .addComponent(txtGrassJelly, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCheckout)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuPanel2Layout = new javax.swing.GroupLayout(menuPanel2);
        menuPanel2.setLayout(menuPanel2Layout);
        menuPanel2Layout.setHorizontalGroup(
            menuPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuPanel2Layout.setVerticalGroup(
            menuPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        billPanel2.setBackground(new java.awt.Color(0, 0, 0));

        billPanel1.setBackground(new java.awt.Color(255, 204, 153));

        lblTax.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblTax.setText("Tax (13%): ");

        logoBasket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoBasket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shopping-basket-icon-800x566.png"))); // NOI18N

        txtTax.setBackground(new java.awt.Color(246, 246, 255));
        txtTax.setFont(new java.awt.Font("Bauhaus 93", 0, 20)); // NOI18N
        txtTax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTax.setText("$0.00");
        txtTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaxActionPerformed(evt);
            }
        });

        txtSubtotal.setBackground(new java.awt.Color(246, 246, 255));
        txtSubtotal.setFont(new java.awt.Font("Bauhaus 93", 0, 20)); // NOI18N
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSubtotal.setText("$0.00");
        txtSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtotalActionPerformed(evt);
            }
        });

        lblSubtotal.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblSubtotal.setText("Subtotal:");

        lblGrandTotal.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblGrandTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrandTotal.setText("Grand Total: ");

        txtGrandTotal.setBackground(new java.awt.Color(246, 246, 255));
        txtGrandTotal.setFont(new java.awt.Font("Bauhaus 93", 0, 52)); // NOI18N
        txtGrandTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGrandTotal.setText("$0.00");
        txtGrandTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrandTotalActionPerformed(evt);
            }
        });

        lblMessage1.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lblMessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage1.setText("Thank you for buying");

        lblMessage2.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lblMessage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage2.setText("our bubble tea :)");

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setFont(new java.awt.Font("Bauhaus 93", 0, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 204, 153));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblInstructions3.setBackground(new java.awt.Color(255, 204, 153));
        lblInstructions3.setFont(new java.awt.Font("Bauhaus 93", 0, 17)); // NOI18N
        lblInstructions3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructions3.setText("Calculated payment:");

        javax.swing.GroupLayout billPanel1Layout = new javax.swing.GroupLayout(billPanel1);
        billPanel1.setLayout(billPanel1Layout);
        billPanel1Layout.setHorizontalGroup(
            billPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGrandTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoBasket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(billPanel1Layout.createSequentialGroup()
                        .addGroup(billPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTax)
                            .addComponent(lblSubtotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(billPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTax)))
                    .addComponent(txtGrandTotal)
                    .addComponent(lblMessage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(lblMessage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstructions3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(billPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        billPanel1Layout.setVerticalGroup(
            billPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblInstructions3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(logoBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(billPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTax)
                    .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(billPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubtotal)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGrandTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout billPanel2Layout = new javax.swing.GroupLayout(billPanel2);
        billPanel2.setLayout(billPanel2Layout);
        billPanel2Layout.setHorizontalGroup(
            billPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        billPanel2Layout.setVerticalGroup(
            billPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        billPanel.setBackground(new java.awt.Color(0, 0, 0));

        lblTitle2.setFont(new java.awt.Font("Bauhaus 93", 0, 44)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(255, 204, 153));
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("Billing");

        javax.swing.GroupLayout billPanelLayout = new javax.swing.GroupLayout(billPanel);
        billPanel.setLayout(billPanelLayout);
        billPanelLayout.setHorizontalGroup(
            billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        billPanelLayout.setVerticalGroup(
            billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(menuPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(billPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(billPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItem1ActionPerformed

    private void txtItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItem2ActionPerformed

    private void txtItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItem3ActionPerformed

    private void txtItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItem4ActionPerformed

    private void txtItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItem5ActionPerformed

    private void txtItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItem6ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void txtTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaxActionPerformed

    private void txtSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotalActionPerformed

    private void txtGrandTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrandTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrandTotalActionPerformed

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed

        // Integer Variables (Item Menu) 
        int boba1;
        int boba2;
        int boba3;
        int boba4;
        int boba5;
        int boba6;
        int tapioca;
        int grassJelly;

        // Double Variables (Costs)
        double tax;
        double subtotal;
        double grandTotal;
        double roundTax;

        // Takes the input from the user
        boba1 = Integer.parseInt(txtItem1.getText());
        boba2 = Integer.parseInt(txtItem2.getText());
        boba3 = Integer.parseInt(txtItem3.getText());
        boba4 = Integer.parseInt(txtItem4.getText());
        boba5 = Integer.parseInt(txtItem5.getText());
        boba6 = Integer.parseInt(txtItem6.getText());
        tapioca = Integer.parseInt(txtTapioca.getText());
        grassJelly = Integer.parseInt(txtGrassJelly.getText());

        // Checkout calculations 
        subtotal = (boba1 * 5) + (boba2 * 5.50) + (boba3 * 5.25) + (boba4 * 6) + (boba5 * 6) + (boba6 * 6.25) + (tapioca * 0.75) + (grassJelly * 0.50);
        tax = subtotal * 0.13;
        roundTax = Math.round(tax * 100) / 100.0;
        grandTotal = subtotal + roundTax;

        // Outputs total cost in dollars with 2 decimal places 
        txtTax.setText(String.format("$%.2f", roundTax));
        txtSubtotal.setText(String.format("$%.2f", subtotal));
        txtGrandTotal.setText(String.format("$%.2f", grandTotal));


    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void txtTapiocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTapiocaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTapiocaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        // Clears all input from the user and resets everything back to 0 
        txtItem1.setText(String.valueOf(0));
        txtItem2.setText(String.valueOf(0));
        txtItem3.setText(String.valueOf(0));
        txtItem4.setText(String.valueOf(0));
        txtItem5.setText(String.valueOf(0));
        txtItem6.setText(String.valueOf(0));
        txtTapioca.setText(String.valueOf(0));
        txtGrassJelly.setText(String.valueOf(0));
        txtTax.setText(String.valueOf("$" + 0 + ".00"));
        txtSubtotal.setText(String.valueOf("$" + 0 + ".00"));
        txtGrandTotal.setText(String.valueOf("$" + 0 + ".00"));

    }//GEN-LAST:event_btnClearActionPerformed

    private void txtGrassJellyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrassJellyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrassJellyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MakingPurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakingPurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakingPurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakingPurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakingPurchases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel billPanel;
    private javax.swing.JPanel billPanel1;
    private javax.swing.JPanel billPanel2;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblGrandTotal;
    private javax.swing.JLabel lblGrassJelly;
    private javax.swing.JLabel lblInstructions1;
    private javax.swing.JLabel lblInstructions2;
    private javax.swing.JLabel lblInstructions3;
    private javax.swing.JLabel lblItem1;
    private javax.swing.JLabel lblItem2;
    private javax.swing.JLabel lblItem3;
    private javax.swing.JLabel lblItem4;
    private javax.swing.JLabel lblItem5;
    private javax.swing.JLabel lblItem6;
    private javax.swing.JLabel lblMessage1;
    private javax.swing.JLabel lblMessage2;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTapioca;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblToppings;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoBasket;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel menuPanel1;
    private javax.swing.JPanel menuPanel2;
    private javax.swing.JTextField txtGrandTotal;
    private javax.swing.JTextField txtGrassJelly;
    private javax.swing.JTextField txtItem1;
    private javax.swing.JTextField txtItem2;
    private javax.swing.JTextField txtItem3;
    private javax.swing.JTextField txtItem4;
    private javax.swing.JTextField txtItem5;
    private javax.swing.JTextField txtItem6;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTapioca;
    private javax.swing.JTextField txtTax;
    // End of variables declaration//GEN-END:variables
}
