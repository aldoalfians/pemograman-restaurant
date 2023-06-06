/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurant;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aldob
 */
public class AdminFoodScreen extends javax.swing.JFrame {

    /**
     * Creates new form FoodScreen
     */
    CrudMenuFood crudFood = new CrudMenuFood();
    DefaultTableModel model;

    public AdminFoodScreen() {
        initComponents();
        model = (DefaultTableModel) foodTable.getModel();
        setLocationRelativeTo(null);
        selectFoods();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idFood = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        foodName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        foodPrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        foodCategories = new javax.swing.JComboBox<>();
        btnFoodDelete = new javax.swing.JButton();
        btnFoodClear = new javax.swing.JButton();
        btnFoodEdit = new javax.swing.JButton();
        btnFoodAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        foodStock = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dashboard = new javax.swing.JLabel();
        manageUser = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        foodMenu = new javax.swing.JLabel();
        drinkMenu = new javax.swing.JLabel();
        dashboard1 = new javax.swing.JLabel();
        manageUser1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        foodMenu1 = new javax.swing.JLabel();
        drinkMenu1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(8, 126, 78));

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));
        jPanel2.setForeground(new java.awt.Color(205, 205, 205));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Menu Makanan");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Kode Makanan");

        idFood.setBackground(new java.awt.Color(255, 255, 255));
        idFood.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idFood.setForeground(new java.awt.Color(0, 0, 0));
        idFood.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Nama");

        foodName.setBackground(new java.awt.Color(255, 255, 255));
        foodName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        foodName.setForeground(new java.awt.Color(0, 0, 0));
        foodName.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Harga");

        foodPrice.setBackground(new java.awt.Color(255, 255, 255));
        foodPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        foodPrice.setForeground(new java.awt.Color(0, 0, 0));
        foodPrice.setBorder(null);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Kategori");

        foodCategories.setBackground(new java.awt.Color(255, 255, 255));
        foodCategories.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        foodCategories.setForeground(new java.awt.Color(0, 0, 0));
        foodCategories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ikan", "Ayam" }));
        foodCategories.setBorder(null);
        foodCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodCategoriesActionPerformed(evt);
            }
        });

        btnFoodDelete.setBackground(new java.awt.Color(8, 126, 78));
        btnFoodDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodDelete.setText("Delete");
        btnFoodDelete.setBorderPainted(false);
        btnFoodDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodDeleteActionPerformed(evt);
            }
        });

        btnFoodClear.setBackground(new java.awt.Color(8, 126, 78));
        btnFoodClear.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodClear.setText("Clear");
        btnFoodClear.setBorderPainted(false);
        btnFoodClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodClearActionPerformed(evt);
            }
        });

        btnFoodEdit.setBackground(new java.awt.Color(8, 126, 78));
        btnFoodEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodEdit.setText("Ubah");
        btnFoodEdit.setBorderPainted(false);
        btnFoodEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodEditActionPerformed(evt);
            }
        });

        btnFoodAdd.setBackground(new java.awt.Color(8, 126, 78));
        btnFoodAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodAdd.setText("Tambah");
        btnFoodAdd.setBorderPainted(false);
        btnFoodAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodAddActionPerformed(evt);
            }
        });

        foodTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Makanan", "Nama", "Stock", "Harga", "Kategori"
            }
        ));
        foodTable.setRowHeight(25);
        foodTable.setSelectionBackground(new java.awt.Color(8, 126, 78));
        foodTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(foodTable);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Stok");

        foodStock.setBackground(new java.awt.Color(255, 255, 255));
        foodStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        foodStock.setForeground(new java.awt.Color(0, 0, 0));
        foodStock.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kosong", "Tersedia" }));
        foodStock.setBorder(null);
        foodStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(foodCategories, javax.swing.GroupLayout.Alignment.LEADING, 0, 295, Short.MAX_VALUE)
                                    .addComponent(foodName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idFood, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(foodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(foodStock, 0, 301, Short.MAX_VALUE)))))
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnFoodAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFoodEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFoodDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFoodClear)))
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idFood, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(foodStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(46, 46, 46)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foodName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFoodDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFoodClear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFoodAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFoodEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Lobster", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PB");

        jButton1.setBackground(new java.awt.Color(8, 126, 78));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dashboard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setText("Dashboard");

        manageUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manageUser.setForeground(new java.awt.Color(255, 255, 255));
        manageUser.setText("Manage User");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("===MENUS===");

        foodMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        foodMenu.setForeground(new java.awt.Color(255, 255, 255));
        foodMenu.setText("Makanan");

        drinkMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        drinkMenu.setForeground(new java.awt.Color(255, 255, 255));
        drinkMenu.setText("Minuman");

        dashboard1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dashboard1.setForeground(new java.awt.Color(255, 255, 255));
        dashboard1.setText("Dashboard");

        manageUser1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manageUser1.setForeground(new java.awt.Color(255, 255, 255));
        manageUser1.setText("Manage User");
        manageUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageUser1MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("===MENUS===");

        foodMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        foodMenu1.setForeground(new java.awt.Color(1, 255, 163));
        foodMenu1.setText("Makanan");
        foodMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodMenu1MouseClicked(evt);
            }
        });

        drinkMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        drinkMenu1.setForeground(new java.awt.Color(255, 255, 255));
        drinkMenu1.setText("Minuman");
        drinkMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drinkMenu1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageUser1)
                            .addComponent(dashboard1)
                            .addComponent(foodMenu1)
                            .addComponent(drinkMenu1)
                            .addComponent(jLabel14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashboard)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(manageUser)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(foodMenu)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(drinkMenu)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dashboard1)
                        .addGap(18, 18, 18)
                        .addComponent(manageUser1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(16, 16, 16)
                        .addComponent(foodMenu1)
                        .addGap(18, 18, 18)
                        .addComponent(drinkMenu1)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashboard)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(manageUser)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(foodMenu)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(drinkMenu)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void selectFoods() {
        var listFood = crudFood.select();
        model.setRowCount(0);
        for (int i = 0; i < listFood.size(); i++) {
            var foodList = listFood.get(i);
            Object[] obj = {foodList.getKode_food(), foodList.getName(), foodList.getStock(), foodList.getPrice(), foodList.getCategory()};
            model.addRow(obj);
        }
    }

    public void clearField() {
        idFood.setText("");
        foodName.setText("");
        foodPrice.setText("");
        foodCategories.setSelectedItem("Ikan");
        foodStock.setSelectedItem("Kosong");
    }

    private void foodCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodCategoriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodCategoriesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void foodStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodStockActionPerformed

    private void btnFoodAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodAddActionPerformed
        // TODO add your handling code here:
        if (idFood.getText().isEmpty() || foodName.getText().isEmpty() || foodPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong");
            return;
        };

        String categoryStr = foodCategories.getSelectedItem().toString();
        String stockStr = foodStock.getSelectedItem().toString();

        crudFood.insert(idFood.getText(), foodName.getText(), stockStr, Integer.parseInt(foodPrice.getText()), categoryStr);
        selectFoods();
        clearField();
    }//GEN-LAST:event_btnFoodAddActionPerformed

    private void foodTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodTableMouseClicked
        // TODO add your handling code here:
        int tableIndex = foodTable.getSelectedRow();

        idFood.setEditable(false);
        idFood.setBackground(Color.lightGray);

        idFood.setText(model.getValueAt(tableIndex, 0).toString());
        foodName.setText(model.getValueAt(tableIndex, 1).toString());
        foodStock.setSelectedItem(model.getValueAt(tableIndex, 2).toString());
        foodPrice.setText(model.getValueAt(tableIndex, 3).toString());
        foodCategories.setSelectedItem(model.getValueAt(tableIndex, 4).toString());
    }//GEN-LAST:event_foodTableMouseClicked

    private void btnFoodEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodEditActionPerformed
        // TODO add your handling code here:
        int tableIndex = foodTable.getSelectedRow();
        String id_kode = model.getValueAt(tableIndex, 0).toString();

        idFood.setEditable(true);
        idFood.setBackground(Color.WHITE);

        if (idFood.getText().isEmpty() || foodName.getText().isEmpty() || foodPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong");
            return;
        };

        String categoryStr = foodCategories.getSelectedItem().toString();
        String stockStr = foodStock.getSelectedItem().toString();

        crudFood.update(id_kode, foodName.getText(), stockStr, Integer.parseInt(foodPrice.getText()), categoryStr);
        selectFoods();
        clearField();
    }//GEN-LAST:event_btnFoodEditActionPerformed

    private void btnFoodDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodDeleteActionPerformed
        // TODO add your handling code here:
        int tableIndex = foodTable.getSelectedRow();
        String id_kode = model.getValueAt(tableIndex, 0).toString();

        idFood.setEditable(true);
        idFood.setBackground(Color.WHITE);

        crudFood.delete(id_kode);
        selectFoods();
        clearField();
    }//GEN-LAST:event_btnFoodDeleteActionPerformed

    private void btnFoodClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodClearActionPerformed
        // TODO add your handling code here:
        clearField();
        idFood.setEditable(true);
        idFood.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnFoodClearActionPerformed

    private void foodMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodMenu1MouseClicked
        // TODO add your handling code here:
        new AdminDrinkScreen().setVisible(true);
    }//GEN-LAST:event_foodMenu1MouseClicked

    private void drinkMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinkMenu1MouseClicked
        // TODO add your handling code here:
        new AdminDrinkScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_drinkMenu1MouseClicked

    private void manageUser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUser1MouseClicked
        // TODO add your handling code here:
        new AdminManageUserScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageUser1MouseClicked

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
            java.util.logging.Logger.getLogger(AdminFoodScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFoodScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFoodScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFoodScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFoodScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoodAdd;
    private javax.swing.JButton btnFoodClear;
    private javax.swing.JButton btnFoodDelete;
    private javax.swing.JButton btnFoodEdit;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel dashboard1;
    private javax.swing.JLabel drinkMenu;
    private javax.swing.JLabel drinkMenu1;
    private javax.swing.JComboBox<String> foodCategories;
    private javax.swing.JLabel foodMenu;
    private javax.swing.JLabel foodMenu1;
    private javax.swing.JTextField foodName;
    private javax.swing.JTextField foodPrice;
    private javax.swing.JComboBox<String> foodStock;
    private javax.swing.JTable foodTable;
    private javax.swing.JTextField idFood;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageUser;
    private javax.swing.JLabel manageUser1;
    // End of variables declaration//GEN-END:variables
}