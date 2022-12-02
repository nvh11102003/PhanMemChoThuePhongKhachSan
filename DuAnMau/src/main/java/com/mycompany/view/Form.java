/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.model.DongSP;
import com.mycompany.model.MauSac;
import com.mycompany.model.NSX;
import com.mycompany.model.SanPham;
import com.mycompany.service.DongSPInterface;
import com.mycompany.service.MauSacInterface;
import com.mycompany.service.NSXInterface;
import com.mycompany.service.SanPhamInterface;
import com.mycompany.service.impl.DongSPImpl;
import com.mycompany.service.impl.MauSacImpl;
import com.mycompany.service.impl.NSXImpl;
import com.mycompany.service.impl.SanPhamImpl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Form extends javax.swing.JFrame {

    private SanPhamInterface sanPhamInterface = new SanPhamImpl();
    private NSXInterface nSXInterface = new NSXImpl();
    private DongSPInterface dongSPInterface = new DongSPImpl();
    private MauSacInterface mauSacInterface = new MauSacImpl();

    /**
     * Creates new form FormSanPham
     */
    public Form() {
        initComponents();
        loadTableSanPham(sanPhamInterface.getAll());
        loadTableDongSP(dongSPInterface.getAll());
        loadTableMauSac(mauSacInterface.getAll());
        loadTableNSX(nSXInterface.getAll());
    }

    public void loadTableSanPham(List<SanPham> list) {
        DefaultTableModel dtm = (DefaultTableModel) tblBangSP.getModel();
        dtm.setRowCount(0);
        for (SanPham sanPham : list) {
            Object[] rowData = {
                sanPham.getIdSanPham(),
                sanPham.getMaSP(),
                sanPham.getTenSp()
            };
            dtm.addRow(rowData);
        }
    }

    public void loadTableNSX(List<NSX> list) {
        DefaultTableModel dtm = (DefaultTableModel) tblNSX.getModel();
        dtm.setRowCount(0);
        for (NSX nsx : list) {
            Object[] rowData = {
                nsx.getIdNSX(),
                nsx.getMaNSX(),
                nsx.getTenNSX()
            };
            dtm.addRow(rowData);
        }
    }

    public void loadTableDongSP(List<DongSP> list) {
        DefaultTableModel dtm = (DefaultTableModel) tblDongSP.getModel();
        dtm.setRowCount(0);
        for (DongSP dongSP : list) {
            Object[] rowData = {
                dongSP.getIdDSP(),
                dongSP.getMaDSP(),
                dongSP.getTenDSP()
            };
            dtm.addRow(rowData);
        }
    }

    public void loadTableMauSac(List<MauSac> list) {
        DefaultTableModel dtm = (DefaultTableModel) tblMauSac.getModel();
        dtm.setRowCount(0);
        for (MauSac mauSac : list) {
            Object[] rowData = {
                mauSac.getIdMS(),
                mauSac.getMaMauSac(),
                mauSac.getTenMauSac()
            };
            dtm.addRow(rowData);
        }
    }

    public SanPham getDataSanPham() {
        String maSP = txtMaSP.getText();
        String tenSP = txtTenSP.getText();
        if (maSP.trim().length() == 0
                || tenSP.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để chống");
            return null;
        }
        SanPham sanPham = new SanPham("Newid()",maSP, tenSP);
        return sanPham;
    }

    public NSX getDataNSX() {
        String maNSX = txtMaNSX.getText();
        String tenNSX = txtTenNSX.getText();
        if (maNSX.trim().length() == 0
                || tenNSX.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để chống");
            return null;
        }
        NSX nsx = new NSX("Newid()",maNSX, tenNSX);
        return nsx;
    }

    public DongSP getDataDongSP() {
        String maDSP = txtMaDSP.getText();
        String tenDSP = txtTenDSP.getText();
        if (maDSP.trim().length() == 0
                || tenDSP.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để chống");
            return null;
        }
        DongSP dongSP = new DongSP("Newid()",maDSP, tenDSP);
        return dongSP;
    }

    public MauSac getDataMauSac() {
        String maMS = txtMaMauSac.getText();
        String tenMS = txtTenMauSac.getText();
        if (maMS.trim().length() == 0
                || tenMS.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để chống");
            return null;
        }
        MauSac mauSac = new MauSac("Newid()",maMS, tenMS);
        return mauSac;
    }

    public void clearFormSP() {
        lblId.setText("");
        txtMaSP.setText("");
        txtTenSP.setText("");
    }

    public void clearFormDSP() {
        lblIDDongSP.setText("");
        txtMaDSP.setText("");
        txtTenDSP.setText("");
    }

    public void clearFormNSX() {
        lblNSX.setText("");
        txtMaNSX.setText("");
        txtTenNSX.setText("");
    }

    public void clearFormMS() {
        lblIDMauSac.setText("");
        txtMaMauSac.setText("");
        txtTenMauSac.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtMaSP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangSP = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblIDDongSP = new javax.swing.JLabel();
        txtMaDSP = new javax.swing.JTextField();
        txtTenDSP = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDongSP = new javax.swing.JTable();
        btnthemdongsp = new javax.swing.JButton();
        btnSuaDSP = new javax.swing.JButton();
        btnXoaDSP = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblIDMauSac = new javax.swing.JLabel();
        txtMaMauSac = new javax.swing.JTextField();
        txtTenMauSac = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMauSac = new javax.swing.JTable();
        btnThemMauSac = new javax.swing.JButton();
        btnSuaMauSac = new javax.swing.JButton();
        btnXoaMauSac = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblNSX = new javax.swing.JLabel();
        txtMaNSX = new javax.swing.JTextField();
        txtTenNSX = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNSX = new javax.swing.JTable();
        btnThemNSX = new javax.swing.JButton();
        btnSuaNSX = new javax.swing.JButton();
        btnXoaNSX = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã Sản phẩm");

        jLabel2.setText("Tên Sản phẩm");

        tblBangSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Mã SP", "Tên SP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBangSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBangSP);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel3.setText("Id Sản phẩm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                            .addComponent(txtMaSP)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnThem)
                                .addGap(71, 71, 71)
                                .addComponent(btnSua)
                                .addGap(75, 75, 75)
                                .addComponent(btnXoa)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SanPham", jPanel1);

        jLabel5.setText("ID");

        jLabel6.setText("Mã DongSP");

        jLabel7.setText("Tên");

        tblDongSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Mã", "Tên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDongSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDongSPMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDongSP);

        btnthemdongsp.setText("Thêm");
        btnthemdongsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemdongspActionPerformed(evt);
            }
        });

        btnSuaDSP.setText("Sửa");
        btnSuaDSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaDSPActionPerformed(evt);
            }
        });

        btnXoaDSP.setText("Xóa");
        btnXoaDSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnthemdongsp)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDDongSP, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTenDSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addComponent(txtMaDSP, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnSuaDSP)
                        .addGap(39, 39, 39)
                        .addComponent(btnXoaDSP)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblIDDongSP))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMaDSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTenDSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthemdongsp)
                    .addComponent(btnSuaDSP)
                    .addComponent(btnXoaDSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        jTabbedPane1.addTab("DongSP", jPanel3);

        jLabel9.setText("Id");

        jLabel10.setText("Mã");

        jLabel11.setText("Tên");

        tblMauSac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Mã", "Tên"
            }
        ));
        tblMauSac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMauSacMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblMauSac);

        btnThemMauSac.setText("Thêm");
        btnThemMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMauSacActionPerformed(evt);
            }
        });

        btnSuaMauSac.setText("Sửa");
        btnSuaMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaMauSacActionPerformed(evt);
            }
        });

        btnXoaMauSac.setText("Xóa");
        btnXoaMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMauSacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTenMauSac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(txtMaMauSac, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnThemMauSac)
                        .addGap(33, 33, 33)
                        .addComponent(btnSuaMauSac)
                        .addGap(48, 48, 48)
                        .addComponent(btnXoaMauSac)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblIDMauSac))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMaMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTenMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemMauSac)
                    .addComponent(btnSuaMauSac)
                    .addComponent(btnXoaMauSac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        jTabbedPane1.addTab("MauSac", jPanel4);

        jLabel13.setText("ID");

        jLabel14.setText("Mã");

        jLabel15.setText("Tên");

        tblNSX.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Mã", "Tên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNSX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNSXMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblNSX);

        btnThemNSX.setText("Thêm");
        btnThemNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNSXActionPerformed(evt);
            }
        });

        btnSuaNSX.setText("Sửa");
        btnSuaNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNSXActionPerformed(evt);
            }
        });

        btnXoaNSX.setText("Xóa");
        btnXoaNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNSXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTenNSX, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addComponent(txtMaNSX, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnThemNSX)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaNSX)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaNSX)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblNSX))
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtMaNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtTenNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemNSX)
                    .addComponent(btnSuaNSX)
                    .addComponent(btnXoaNSX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        jTabbedPane1.addTab("NSX", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        SanPham sanPham = getDataSanPham();
        if (sanPham == null) {
            return;
        }
        sanPhamInterface.add(sanPham);
        JOptionPane.showMessageDialog(this, "Thêm thành công");
        loadTableSanPham(sanPhamInterface.getAll());
        clearFormSP();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblBangSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangSPMouseClicked
        int row = tblBangSP.getSelectedRow();
        if (row == -1) {
            return;
        }
        lblId.setText(tblBangSP.getValueAt(row, 0).toString());
        txtMaSP.setText(tblBangSP.getValueAt(row, 1).toString());
        txtTenSP.setText(tblBangSP.getValueAt(row, 2).toString());
    }//GEN-LAST:event_tblBangSPMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String maSP = txtMaSP.getText();
        if (sanPhamInterface.delete(maSP)) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loadTableSanPham(sanPhamInterface.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
        clearFormSP();

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        SanPham sanPham = getDataSanPham();
        String maSanPham = txtMaSP.getText();
        sanPham.setMaSP(maSanPham);
        sanPhamInterface.update(maSanPham, sanPham);
        JOptionPane.showMessageDialog(this, "Sửa thành công");
        loadTableSanPham(sanPhamInterface.getAll());
        clearFormSP();

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnthemdongspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemdongspActionPerformed
        DongSP dongSP = getDataDongSP();
        if (dongSP == null) {
            return;
        }
        dongSPInterface.add(dongSP);
        JOptionPane.showMessageDialog(this, "Thêm thành công");
        loadTableDongSP(dongSPInterface.getAll());
        clearFormDSP();
    }//GEN-LAST:event_btnthemdongspActionPerformed

    private void btnSuaDSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaDSPActionPerformed
        DongSP dongSP = getDataDongSP();
        String maDSP = txtMaDSP.getText();
        dongSP.setMaDSP(maDSP);
        dongSPInterface.update(maDSP, dongSP);
        JOptionPane.showMessageDialog(this, "Sửa thành công");
        loadTableDongSP(dongSPInterface.getAll());
        clearFormDSP();

    }//GEN-LAST:event_btnSuaDSPActionPerformed

    private void tblDongSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDongSPMouseClicked
        int row = tblDongSP.getSelectedRow();
        if (row == -1) {
            return;
        }
        lblIDDongSP.setText(tblDongSP.getValueAt(row, 0).toString());
        txtMaDSP.setText(tblDongSP.getValueAt(row, 1).toString());
        txtTenDSP.setText(tblDongSP.getValueAt(row, 2).toString());
    }//GEN-LAST:event_tblDongSPMouseClicked

    private void btnXoaDSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDSPActionPerformed
        String maDSP = txtMaDSP.getText();
        if (dongSPInterface.delete(maDSP)) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loadTableDongSP(dongSPInterface.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
        clearFormDSP();

    }//GEN-LAST:event_btnXoaDSPActionPerformed

    private void btnThemMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMauSacActionPerformed
        MauSac mauSac = getDataMauSac();
        if (mauSac == null) {
            return;
        }
        mauSacInterface.add(mauSac);
        JOptionPane.showMessageDialog(this, "Thêm thành công");
        loadTableMauSac(mauSacInterface.getAll());
        clearFormMS();
    }//GEN-LAST:event_btnThemMauSacActionPerformed

    private void btnSuaMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaMauSacActionPerformed
        MauSac mauSac = getDataMauSac();
        String maMauSac = txtMaMauSac.getText();
        mauSac.setMaMauSac(maMauSac);
        mauSacInterface.update(maMauSac, mauSac);
        JOptionPane.showMessageDialog(this, "Sửa thành công");
        loadTableMauSac(mauSacInterface.getAll());
        clearFormMS();

    }//GEN-LAST:event_btnSuaMauSacActionPerformed

    private void tblMauSacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMauSacMouseClicked
        int row = tblMauSac.getSelectedRow();
        if (row == -1) {
            return;
        }
        lblIDMauSac.setText(tblMauSac.getValueAt(row, 0).toString());
        txtMaMauSac.setText(tblMauSac.getValueAt(row, 1).toString());
        txtTenMauSac.setText(tblMauSac.getValueAt(row, 2).toString());
    }//GEN-LAST:event_tblMauSacMouseClicked

    private void btnXoaMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaMauSacActionPerformed
        String maMS = txtMaMauSac.getText();
        if (mauSacInterface.delete(maMS)) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loadTableMauSac(mauSacInterface.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
        clearFormMS();

    }//GEN-LAST:event_btnXoaMauSacActionPerformed

    private void btnThemNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNSXActionPerformed
        NSX nsx = getDataNSX();
        if (nsx == null) {
            return;
        }
        nSXInterface.add(nsx);
        JOptionPane.showMessageDialog(this, "Thêm thành công");
        loadTableNSX(nSXInterface.getAll());
        clearFormNSX();
    }//GEN-LAST:event_btnThemNSXActionPerformed

    private void tblNSXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNSXMouseClicked
        int row = tblNSX.getSelectedRow();
        if (row == -1) {
            return;
        }
        lblNSX.setText(tblNSX.getValueAt(row, 0).toString());
        txtMaNSX.setText(tblNSX.getValueAt(row, 1).toString());
        txtTenNSX.setText(tblNSX.getValueAt(row, 2).toString());
    }//GEN-LAST:event_tblNSXMouseClicked

    private void btnSuaNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNSXActionPerformed
        NSX nsx = getDataNSX();
        String maNSX = txtMaNSX.getText();
        nsx.setMaNSX(maNSX);
        nSXInterface.update(maNSX, nsx);
        JOptionPane.showMessageDialog(this, "Sửa thành công");
        loadTableNSX(nSXInterface.getAll());
        clearFormNSX();

    }//GEN-LAST:event_btnSuaNSXActionPerformed

    private void btnXoaNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNSXActionPerformed
        String maNSX = txtMaNSX.getText();
        if (nSXInterface.delete(maNSX)) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loadTableNSX(nSXInterface.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
        clearFormNSX();

    }//GEN-LAST:event_btnXoaNSXActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaDSP;
    private javax.swing.JButton btnSuaMauSac;
    private javax.swing.JButton btnSuaNSX;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemMauSac;
    private javax.swing.JButton btnThemNSX;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaDSP;
    private javax.swing.JButton btnXoaMauSac;
    private javax.swing.JButton btnXoaNSX;
    private javax.swing.JButton btnthemdongsp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblIDDongSP;
    private javax.swing.JLabel lblIDMauSac;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNSX;
    private javax.swing.JTable tblBangSP;
    private javax.swing.JTable tblDongSP;
    private javax.swing.JTable tblMauSac;
    private javax.swing.JTable tblNSX;
    private javax.swing.JTextField txtMaDSP;
    private javax.swing.JTextField txtMaMauSac;
    private javax.swing.JTextField txtMaNSX;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtTenDSP;
    private javax.swing.JTextField txtTenMauSac;
    private javax.swing.JTextField txtTenNSX;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
