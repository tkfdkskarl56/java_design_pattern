package DPP_Order;

import DPP_Login.LoginLog;
import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author MongGu
 */
public class Order extends javax.swing.JFrame {
    LoginLog loginlog = new LoginLog();
    static int friedricenum=0;
    static int tteokbokkinum=0;
    static int ramennum=0;
    static int addegg=0;
    static int addcheese=0;
    static int addrice=0;
    int RowCount;
    String UserName;
    
    /**
     * Creates new form Order
     */
    public Order() {
        initComponents();
        
        DRINKPanel.setVisible(false);
        FOODPanel.setVisible(false);
        SNACKPanel.setVisible(false);
        NoCategories.setVisible(true);
        
        DRINKPanel.setEnabled(false);
        FOODPanel.setEnabled(false);
        SNACKPanel.setEnabled(false);
        NoCategories.setEnabled(true);
        
        RowCount = 0;
        UserName = loginlog.getName();
        UserNameField.setText(UserName + " 님");   // 고객 객체 정보 받아와서 고객이름 지정
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foodDeco = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        addEgg = new javax.swing.JButton();
        addCheeze = new javax.swing.JButton();
        addRice = new javax.swing.JButton();
        OK = new javax.swing.JButton();
        drinkDeco = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        OK1 = new javax.swing.JButton();
        large = new javax.swing.JButton();
        small = new javax.swing.JButton();
        medium = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MenuTable = new javax.swing.JTable();
        NoCategories = new javax.swing.JPanel();
        DRINKPanel = new javax.swing.JPanel();
        coke = new javax.swing.JButton();
        cyder = new javax.swing.JButton();
        fanta = new javax.swing.JButton();
        FOODPanel = new javax.swing.JPanel();
        dduckbboki = new javax.swing.JButton();
        friedRice = new javax.swing.JButton();
        ramen = new javax.swing.JButton();
        SNACKPanel = new javax.swing.JPanel();
        friedPotato = new javax.swing.JButton();
        hotDog = new javax.swing.JButton();
        cheezeStick = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        UserNameField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        order = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        foodDeco.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        foodDeco.setMinimumSize(new java.awt.Dimension(500, 270));

        jPanel1.setBackground(new java.awt.Color(106, 116, 145));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addEgg.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        addEgg.setText("계란 추가");
        addEgg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addEgg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEggMouseClicked(evt);
            }
        });
        addEgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEggActionPerformed(evt);
            }
        });
        jPanel1.add(addEgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 102));

        addCheeze.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        addCheeze.setText("치즈 추가");
        addCheeze.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCheeze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCheezeMouseClicked(evt);
            }
        });
        jPanel1.add(addCheeze, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 140, 102));

        addRice.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        addRice.setText("밥 추가");
        addRice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addRice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRiceMouseClicked(evt);
            }
        });
        jPanel1.add(addRice, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 140, 102));

        OK.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        OK.setText("선택 완료");
        OK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKMouseClicked(evt);
            }
        });
        jPanel1.add(OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 160, 50));

        javax.swing.GroupLayout foodDecoLayout = new javax.swing.GroupLayout(foodDeco.getContentPane());
        foodDeco.getContentPane().setLayout(foodDecoLayout);
        foodDecoLayout.setHorizontalGroup(
            foodDecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        foodDecoLayout.setVerticalGroup(
            foodDecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        drinkDeco.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        drinkDeco.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(106, 116, 145));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OK1.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        OK1.setText("선택 완료");
        OK1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OK1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OK1MouseClicked(evt);
            }
        });
        jPanel3.add(OK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 160, 50));

        large.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        large.setText("Large");
        large.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        large.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                largeMouseClicked(evt);
            }
        });
        jPanel3.add(large, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 140, 102));

        small.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        small.setText("Small");
        small.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        small.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                smallMouseClicked(evt);
            }
        });
        jPanel3.add(small, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 102));

        medium.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        medium.setText("Medium");
        medium.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        medium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mediumMouseClicked(evt);
            }
        });
        jPanel3.add(medium, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 140, 102));

        drinkDeco.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 270));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 15, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("맑은 고딕", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("담은 메뉴");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        MenuTable.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        MenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "메뉴", "가격"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MenuTable.setRowHeight(20);
        MenuTable.setShowVerticalLines(false);
        jScrollPane2.setViewportView(MenuTable);
        if (MenuTable.getColumnModel().getColumnCount() > 0) {
            MenuTable.getColumnModel().getColumn(0).setResizable(false);
            MenuTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, 310));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 500));

        NoCategories.setBackground(new java.awt.Color(32, 47, 90));

        javax.swing.GroupLayout NoCategoriesLayout = new javax.swing.GroupLayout(NoCategories);
        NoCategories.setLayout(NoCategoriesLayout);
        NoCategoriesLayout.setHorizontalGroup(
            NoCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        NoCategoriesLayout.setVerticalGroup(
            NoCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        getContentPane().add(NoCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 690, 270));

        DRINKPanel.setBackground(new java.awt.Color(32, 47, 90));
        DRINKPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        coke.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        coke.setText("콜라");
        coke.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        coke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cokeMouseClicked(evt);
            }
        });
        DRINKPanel.add(coke, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 190, 110));

        cyder.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        cyder.setText("사이다");
        cyder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cyder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cyderMouseClicked(evt);
            }
        });
        DRINKPanel.add(cyder, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 190, 110));

        fanta.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        fanta.setText("환타");
        fanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fantaMouseClicked(evt);
            }
        });
        DRINKPanel.add(fanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 190, 110));

        getContentPane().add(DRINKPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 690, 270));

        FOODPanel.setBackground(new java.awt.Color(32, 47, 90));
        FOODPanel.setMinimumSize(new java.awt.Dimension(650, 240));
        FOODPanel.setPreferredSize(new java.awt.Dimension(650, 240));
        FOODPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dduckbboki.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        dduckbboki.setText("떡볶이");
        dduckbboki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dduckbbokiMouseClicked(evt);
            }
        });
        dduckbboki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dduckbbokiActionPerformed(evt);
            }
        });
        FOODPanel.add(dduckbboki, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 190, 110));

        friedRice.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        friedRice.setText("볶음밥");
        friedRice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friedRiceMouseClicked(evt);
            }
        });
        FOODPanel.add(friedRice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 190, 110));

        ramen.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        ramen.setText("라면");
        ramen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ramenMouseClicked(evt);
            }
        });
        ramen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramenActionPerformed(evt);
            }
        });
        FOODPanel.add(ramen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 190, 110));

        getContentPane().add(FOODPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 690, 270));
        FOODPanel.getAccessibleContext().setAccessibleParent(this);

        SNACKPanel.setBackground(new java.awt.Color(32, 47, 90));
        SNACKPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        friedPotato.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        friedPotato.setText("감자튀김");
        friedPotato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friedPotatoMouseClicked(evt);
            }
        });
        SNACKPanel.add(friedPotato, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 190, 110));

        hotDog.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        hotDog.setText("핫도그");
        hotDog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hotDogMouseClicked(evt);
            }
        });
        SNACKPanel.add(hotDog, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 190, 110));

        cheezeStick.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        cheezeStick.setText("치즈스틱");
        cheezeStick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cheezeStickMouseClicked(evt);
            }
        });
        SNACKPanel.add(cheezeStick, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 190, 110));

        getContentPane().add(SNACKPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 690, 270));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserNameField.setEditable(false);
        UserNameField.setBackground(new java.awt.Color(255, 255, 255));
        UserNameField.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        UserNameField.setBorder(null);
        UserNameField.setFocusable(false);
        jPanel4.add(UserNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 90, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 690, 50));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 1, 36)); // NOI18N
        jLabel4.setText("음식 주문");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jLabel5.setText("메뉴를 담아서 주문해주세요.");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        refresh.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        refresh.setText("초기화");
        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        jPanel5.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 110, 50));

        order.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        order.setText("주문하기");
        order.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderMouseClicked(evt);
            }
        });
        jPanel5.add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 110, 50));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 690, 110));

        jPanel7.setBackground(new java.awt.Color(32, 47, 90));

        jPanel6.setBackground(new java.awt.Color(106, 116, 145));

        jLabel7.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Categories");

        jLabel9.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("drink");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("food");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("snack");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(47, 47, 47)
                .addComponent(jLabel10)
                .addGap(41, 41, 41)
                .addComponent(jLabel11)
                .addGap(35, 35, 35))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 690, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // drink 카테고리 선택
        DRINKPanel.setVisible(true);
        FOODPanel.setVisible(false);
        SNACKPanel.setVisible(false);
        NoCategories.setVisible(false);
        
        DRINKPanel.setEnabled(true);
        FOODPanel.setEnabled(false);
        SNACKPanel.setEnabled(false);
        NoCategories.setEnabled(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // food 카테고리 선택
        DRINKPanel.setVisible(false);
        FOODPanel.setVisible(true);
        SNACKPanel.setVisible(false);
        NoCategories.setVisible(false);
        
        DRINKPanel.setEnabled(false);
        FOODPanel.setEnabled(true);
        SNACKPanel.setEnabled(false);
        NoCategories.setEnabled(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // snack 카테고리 선택
        DRINKPanel.setVisible(false);
        FOODPanel.setVisible(false);
        SNACKPanel.setVisible(true);
        NoCategories.setVisible(false);
        
        DRINKPanel.setEnabled(false);
        FOODPanel.setEnabled(false);
        SNACKPanel.setEnabled(true);
        NoCategories.setEnabled(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        // 초기화 버튼 클릭
        
        for(int i=0; i<14; i++) {
            MenuTable.setValueAt("", i, 0);
            MenuTable.setValueAt("", i, 1);
        }
        
        RowCount = 0;
        
    }//GEN-LAST:event_refreshMouseClicked

    private void orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseClicked
        // 주문 버튼 클릭
        
        if(RowCount == 0) { // 메뉴를 아무것도 고르지 않았을 경우
            JOptionPane.showInternalMessageDialog(null, "메뉴를 골라주세요.");
            
        } else {        // 정상적으로 주문이 되었을 경우
                        
            String filePath = "c:\\Temp\\test.txt";           // 저장할 임시 파일 경로
            int cost = 0;       // 총 주문 금액
            String orderText = "";      // 주문 내역
            
            for(int i=0; i<RowCount; i++) {
                orderText += (String) MenuTable.getValueAt(i,0) + ", ";
            }
            
            
            for(int i=0; i<RowCount; i++) {
                // cost[i] = (int) MenuTable.getValueAt(i,1);
                cost += (int) MenuTable.getValueAt(i,1);
            }
            
                        
            try {
                FileWriter fileWriter = new FileWriter(filePath, true);
                fileWriter.write(UserName + "님의 주문 : " + orderText + "총 주문 금액 = " + cost + "\n\n");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            for(int i=0; i<14; i++) {
                MenuTable.setValueAt("", i, 0);
                MenuTable.setValueAt("", i, 1);
            }
            RowCount = 0;
            
            JOptionPane.showInternalMessageDialog(null, "주문이 접수되었습니다.");
        }
        
    }//GEN-LAST:event_orderMouseClicked

    private void cokeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cokeMouseClicked
        // 콜라 클릭
        
        if (RowCount < 14) {
            MenuTable.setValueAt("콜라", RowCount, 0);
            MenuTable.setValueAt(1500, RowCount, 1);
            
            drinkDeco.setVisible(true);
            drinkDeco.setLocation(200, 200);
            drinkDeco.setSize(510, 300);
       
            RowCount++;
        } else {
            JOptionPane.showInternalMessageDialog(null, "더 이상 주문할 수 없습니다.");
        }
    }//GEN-LAST:event_cokeMouseClicked

    private void cyderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cyderMouseClicked
        // 사이다 클릭
        
        if (RowCount < 14) {
            MenuTable.setValueAt("사이다", RowCount, 0);
            MenuTable.setValueAt(1400, RowCount, 1);
            
            drinkDeco.setVisible(true);
            drinkDeco.setLocation(200, 200);
            drinkDeco.setSize(510, 300);
        
            RowCount++;
        } else {
            JOptionPane.showInternalMessageDialog(null, "더 이상 주문할 수 없습니다.");
        }
    }//GEN-LAST:event_cyderMouseClicked

    private void fantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fantaMouseClicked
        // 환타 클릭
        
        if (RowCount < 14) {
            MenuTable.setValueAt("환타", RowCount, 0);
            MenuTable.setValueAt(1200, RowCount, 1);
            
            drinkDeco.setVisible(true);
            drinkDeco.setLocation(200, 200);
            drinkDeco.setSize(510, 300);
        
            RowCount++;
        } else {
            JOptionPane.showInternalMessageDialog(null, "더 이상 주문할 수 없습니다.");
        }
    }//GEN-LAST:event_fantaMouseClicked

    private void ramenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ramenMouseClicked
        // 라면 클릭
        ramennum=1;
        if (RowCount < 14) {
            MenuTable.setValueAt("라면", RowCount, 0);
            MenuTable.setValueAt(3000, RowCount, 1);
            
            foodDeco.setVisible(true);
            foodDeco.setLocation(200, 200);
            foodDeco.setSize(510, 300);

            RowCount++;
        } else {
            JOptionPane.showInternalMessageDialog(null, "더 이상 주문할 수 없습니다.");
        }
    }//GEN-LAST:event_ramenMouseClicked

    private void friedRiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friedRiceMouseClicked
        // 볶음밥 클릭
        friedricenum=1;
        if (RowCount < 14) {
            MenuTable.setValueAt("볶음밥", RowCount, 0);
            MenuTable.setValueAt(3500, RowCount, 1);
            
            foodDeco.setVisible(true);
            foodDeco.setLocation(200, 200);
            foodDeco.setSize(510, 300);
        
            RowCount++;
        } else {
            JOptionPane.showInternalMessageDialog(null, "더 이상 주문할 수 없습니다.");
        }
    }//GEN-LAST:event_friedRiceMouseClicked

    private void dduckbbokiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dduckbbokiMouseClicked
        // 떡볶이 클릭
        tteokbokkinum=1;
        if (RowCount < 14) {
            MenuTable.setValueAt("떡볶이", RowCount, 0);
            MenuTable.setValueAt(4000, RowCount, 1);
            
            foodDeco.setVisible(true);
            foodDeco.setLocation(200, 200);
            foodDeco.setSize(510, 300);
        
            RowCount++;
        } else {
            JOptionPane.showInternalMessageDialog(null, "더 이상 주문할 수 없습니다.");
        }
    }//GEN-LAST:event_dduckbbokiMouseClicked

    private void hotDogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotDogMouseClicked
        // 핫도그 클릭
        
        if (RowCount < 14) {
            MenuTable.setValueAt("핫도그", RowCount, 0);
            MenuTable.setValueAt(2300, RowCount, 1);
        
            RowCount++;
        } else {
            JOptionPane.showInternalMessageDialog(null, "더 이상 주문할 수 없습니다.");
        }
    }//GEN-LAST:event_hotDogMouseClicked

    private void cheezeStickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cheezeStickMouseClicked
        // 치즈스틱 클릭
        
        if (RowCount < 14) {
            MenuTable.setValueAt("치즈스틱", RowCount, 0);
            MenuTable.setValueAt(2200, RowCount, 1);
        
            RowCount++;
        } else {
            JOptionPane.showInternalMessageDialog(null, "더 이상 주문할 수 없습니다.");
        }
    }//GEN-LAST:event_cheezeStickMouseClicked

    private void friedPotatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friedPotatoMouseClicked
        // 감자튀김 클릭
        
        if (RowCount < 14) {
            MenuTable.setValueAt("감자튀김", RowCount, 0);
            MenuTable.setValueAt(2500, RowCount, 1);
        
            RowCount++;
        } else {
            JOptionPane.showInternalMessageDialog(null, "더 이상 주문할 수 없습니다.");
        }
    }//GEN-LAST:event_friedPotatoMouseClicked

    private void addEggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEggMouseClicked
        // 계란 추가 클릭
        addegg++;
    }//GEN-LAST:event_addEggMouseClicked

    private void addCheezeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCheezeMouseClicked
        // 치즈 추가 클릭
        addcheese++;
    }//GEN-LAST:event_addCheezeMouseClicked

    private void addRiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRiceMouseClicked
        // 밥 추가 클릭
        addrice++;
    }//GEN-LAST:event_addRiceMouseClicked

    private void OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseClicked
        // 선택 완료 클릭
        if(ramennum>0){
            
            Food ramen = new Ramen();
            for(int i=0;i<addegg;i++){
                ramen = new AddEgg(ramen);
            }
            for(int i=0;i<addcheese;i++){
                ramen = new AddCheese(ramen);
            }
            for(int i=0;i<addrice;i++){
                ramen = new AddRice(ramen);
            }
            JOptionPane.showMessageDialog(null,"메뉴는 : "+ramen.getFoodName()+"입니다.\n총 가격은"+ramen.cost()+"입니다.");
            MenuTable.setValueAt(ramen.getFoodName(), RowCount-1, 0);
            MenuTable.setValueAt(ramen.cost(), RowCount-1, 1);
            ramennum=0;
            foodDeco.setVisible(false);
            
        }else if(tteokbokkinum>0){
            
            Food teokbokki = new Tteokbokki();
            for(int i=0;i<addegg;i++){
                teokbokki = new AddEgg(teokbokki);
            }
            for(int i=0;i<addcheese;i++){
                teokbokki = new AddCheese(teokbokki);
            }
            for(int i=0;i<addrice;i++){
                teokbokki = new AddRice(teokbokki);
            }
            JOptionPane.showMessageDialog(null,"메뉴는 : "+teokbokki.getFoodName()+"입니다.\n총 가격은"+teokbokki.cost()+"입니다.");
            MenuTable.setValueAt(teokbokki.getFoodName(), RowCount-1, 0);
            MenuTable.setValueAt(teokbokki.cost(), RowCount-1, 1);            
            tteokbokkinum=0;
            foodDeco.setVisible(false);
            
        }else if(friedricenum>0){
            
            Food friedrice = new FriedRice();
            for(int i=0;i<addegg;i++){
                friedrice = new AddEgg(friedrice);
            }
            for(int i=0;i<addcheese;i++){
                friedrice = new AddCheese(friedrice);
            }
            for(int i=0;i<addrice;i++){
                friedrice = new AddRice(friedrice);
            }
            JOptionPane.showMessageDialog(null,"메뉴는 : "+friedrice.getFoodName()+"입니다.\n총 가격은"+friedrice.cost()+"입니다.");
            MenuTable.setValueAt(friedrice.getFoodName(), RowCount-1, 0);
            MenuTable.setValueAt(friedrice.cost(), RowCount-1, 1);  
            friedricenum=0;
            foodDeco.setVisible(false);
            
        }
    }//GEN-LAST:event_OKMouseClicked

    private void OK1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OK1MouseClicked
        // 선택완료 클릭

    }//GEN-LAST:event_OK1MouseClicked

    private void largeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_largeMouseClicked
        // large 클릭

    }//GEN-LAST:event_largeMouseClicked

    private void smallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_smallMouseClicked
        // small 클릭

    }//GEN-LAST:event_smallMouseClicked

    private void mediumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mediumMouseClicked
        // medium 클릭

    }//GEN-LAST:event_mediumMouseClicked

    private void ramenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramenActionPerformed
    }//GEN-LAST:event_ramenActionPerformed

    private void dduckbbokiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dduckbbokiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dduckbbokiActionPerformed

    private void addEggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEggActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addEggActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DRINKPanel;
    private javax.swing.JPanel FOODPanel;
    private javax.swing.JTable MenuTable;
    private javax.swing.JPanel NoCategories;
    private javax.swing.JButton OK;
    private javax.swing.JButton OK1;
    private javax.swing.JPanel SNACKPanel;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JButton addCheeze;
    private javax.swing.JButton addEgg;
    private javax.swing.JButton addRice;
    private javax.swing.JButton cheezeStick;
    private javax.swing.JButton coke;
    private javax.swing.JButton cyder;
    private javax.swing.JButton dduckbboki;
    private javax.swing.JFrame drinkDeco;
    private javax.swing.JButton fanta;
    private javax.swing.JFrame foodDeco;
    private javax.swing.JButton friedPotato;
    private javax.swing.JButton friedRice;
    private javax.swing.JButton hotDog;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton large;
    private javax.swing.JButton medium;
    private javax.swing.JButton order;
    private javax.swing.JButton ramen;
    private javax.swing.JButton refresh;
    private javax.swing.JButton small;
    // End of variables declaration//GEN-END:variables
}
