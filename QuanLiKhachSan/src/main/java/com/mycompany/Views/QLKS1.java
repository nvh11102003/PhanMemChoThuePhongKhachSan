package com.mycompany.Views;

import com.mycompany.Domainmodel.DichVu;
import com.mycompany.Domainmodel.Phong;
import com.mycompany.Services.DichVuService;
import com.mycompany.Services.IPhongService;
import com.mycompany.Services.Impl.DichVuImpl;
import com.mycompany.Services.Impl.PhongServiceImpl;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLKS1 extends javax.swing.JFrame {

    private IPhongService phongService = new PhongServiceImpl();
    private DichVuService dichVuService= new DichVuImpl();
    public QLKS1() {
        initComponents();
//        DatTra.setSize(1900, 1200);
//        DatTra.setResizable(true);
        ThanhToan.setSize(1120, 818);
        loadTrangChu();
        loaddichvu();
    }
    public void loaddichvu(){
         List<DichVu> listdv = dichVuService.getAll();
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblDV.getModel();
        defaultTableModel.setRowCount(0);
        for (int i = 0; i < listdv.size(); i++) {
            Object[] RowData = {
                i + 1,
                listdv.get(i).getMaDichVu(),
                listdv.get(i).getLoaiDichVu(),
                listdv.get(i).getSoTien(),
                
            };
            defaultTableModel.addRow(RowData);
        }
    }
    
    

    public void loadTrangChu() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/x-button.png"));

        if (conTrong("101") == false) {
            p101.setIcon(icon);
        } else {
            p101.setIcon(null);
        }

        //copy thay so 
        if (conTrong("102") == false) {
            p102.setIcon(icon);
        } else {
            p102.setIcon(null);
        }

        if (conTrong("103") == false) {
            p103.setIcon(icon);
        } else {
            p103.setIcon(null);
        }

        if (conTrong("104") == false) {
            p104.setIcon(icon);
        } else {
            p104.setIcon(null);
        }
        if (conTrong("105") == false) {
            p105.setIcon(icon);
        } else {
            p105.setIcon(null);
        }
        if (conTrong("106") == false) {
            p106.setIcon(icon);
        } else {
            p106.setIcon(null);
        }
        //Tang 2
        if (conTrong("201") == false) {
            p201.setIcon(icon);
        } else {
            p201.setIcon(null);
        }
        if (conTrong("202") == false) {
            p202.setIcon(icon);
        } else {
            p202.setIcon(null);
        }
        if (conTrong("203") == false) {
            p203.setIcon(icon);
        } else {
            p203.setIcon(null);
        }
        if (conTrong("204") == false) {
            p204.setIcon(icon);
        } else {
            p204.setIcon(null);
        }
        if (conTrong("205") == false) {
            p205.setIcon(icon);
        } else {
            p205.setIcon(null);
        }
        if (conTrong("206") == false) {
            p206.setIcon(icon);
        } else {
            p206.setIcon(null);
        }
          if (conTrong("207") == false) {
            p207.setIcon(icon);
        } else {
            p207.setIcon(null);
        }  
          //Tang 3
          if (conTrong("301") == false) {
            p301.setIcon(icon);
        } else {
            p301.setIcon(null);
        }  
           if (conTrong("302") == false) {
            p302.setIcon(icon);
        } else {
            p302.setIcon(null);
        }
        if (conTrong("303") == false) {
            p303.setIcon(icon);
        } else {
            p303.setIcon(null);
        }
        if (conTrong("304") == false) {
            p304.setIcon(icon);
        } else {
            p304.setIcon(null);
        }
        if (conTrong("305") == false) {
            p305.setIcon(icon);
        } else {
            p305.setIcon(null);
        }
        if (conTrong("306") == false) {
            p306.setIcon(icon);
        } else {
            p306.setIcon(null);
        }
          if (conTrong("307") == false) {
            p307.setIcon(icon);
        } else {
            p307.setIcon(null);
        }  
          
          //tang 4
         if (conTrong("V4.1") == false) {
            v41.setIcon(icon);
        } else {
            v41.setIcon(null);
        }    
         if (conTrong("V4.2") == false) {
            v42.setIcon(icon);
        } else {
            v42.setIcon(null);
        } 
         if (conTrong("V4.3") == false) {
            v43.setIcon(icon);
        } else {
            v43.setIcon(null);
        }    
         if (conTrong("V4.4") == false) {
            v44.setIcon(icon);
        } else {
            v44.setIcon(null);
        }    
    }

    public boolean conTrong(String maphong) {
        Phong phong = phongService.findByRoomNumber(maphong);
        if (phong == null) {
            return true;
        }
        if (phong.getTinhTrang().equalsIgnoreCase("Trong")) {
            return true;
        }
        return false;
    }
    public DichVu getformdata(){
//        int row = tblDV.getSelectedRow();
        DichVu dv = new DichVu();
        String madv = txtMaDV.getText();
        String tendv = txtTenDV.getText();
        float giaDv = Float.parseFloat(txtGia.getText());
        dv.setMaDichVu(madv);
        dv.setLoaiDichVu(tendv);
        dv.setSoTien(giaDv);
        return dv;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DatTra = new javax.swing.JFrame();
        DatTraPhong = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel57 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        ThanhToan = new javax.swing.JFrame();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        txtMaDV2 = new javax.swing.JTextField();
        txtMaDV3 = new javax.swing.JTextField();
        txtMaDV4 = new javax.swing.JTextField();
        txtMaDV5 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        txtMaDV6 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        txtMaDV7 = new javax.swing.JTextField();
        txtMaDV8 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel71 = new javax.swing.JLabel();
        txtMaDV9 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        txtMaDV10 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtMaDV11 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtMaDV12 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        txtMaDV13 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        txtMaDV14 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txtMaDV15 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        txtMaDV16 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        thanhToan = new javax.swing.JToolBar();
        jPanel14 = new javax.swing.JPanel();
        Khachhang = new javax.swing.JToolBar();
        jPanel4 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        txtMaDV17 = new javax.swing.JTextField();
        txtTenDV2 = new javax.swing.JTextField();
        txtGia2 = new javax.swing.JTextField();
        btnThem2 = new javax.swing.JButton();
        btnSua2 = new javax.swing.JButton();
        btnXoa2 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbDV2 = new javax.swing.JTable();
        DichVu = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        dichvu = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtMaDV = new javax.swing.JTextField();
        txtTenDV = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDV = new javax.swing.JTable();
        ThongKe = new javax.swing.JTabbedPane();
        Phong = new javax.swing.JTabbedPane();
        TrangChu = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        t103 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        p103 = new javax.swing.JLabel();
        t101 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        p101 = new javax.swing.JLabel();
        t102 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        p102 = new javax.swing.JLabel();
        t104 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        p104 = new javax.swing.JLabel();
        t105 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        p105 = new javax.swing.JLabel();
        t106 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        p106 = new javax.swing.JLabel();
        t201 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        p201 = new javax.swing.JLabel();
        t202 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        p202 = new javax.swing.JLabel();
        t203 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        p203 = new javax.swing.JLabel();
        t204 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        p204 = new javax.swing.JLabel();
        t205 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        p205 = new javax.swing.JLabel();
        t206 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        p206 = new javax.swing.JLabel();
        t207 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        p207 = new javax.swing.JLabel();
        t302 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        p302 = new javax.swing.JLabel();
        t301 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        p301 = new javax.swing.JLabel();
        t303 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        p303 = new javax.swing.JLabel();
        t304 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        p304 = new javax.swing.JLabel();
        t305 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        p305 = new javax.swing.JLabel();
        t306 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        p306 = new javax.swing.JLabel();
        t307 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        p307 = new javax.swing.JLabel();
        t43 = new javax.swing.JPanel();
        v43 = new javax.swing.JLabel();
        t41 = new javax.swing.JPanel();
        v41 = new javax.swing.JLabel();
        t42 = new javax.swing.JPanel();
        v42 = new javax.swing.JLabel();
        t44 = new javax.swing.JPanel();
        v44 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        DatTra.setPreferredSize(new java.awt.Dimension(1400, 800));

        DatTraPhong.setBackground(new java.awt.Color(255, 255, 255));
        DatTraPhong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đặt, trả phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel35.setText("Giới tính:");

        jLabel36.setText("Ngày sinh:");

        jLabel37.setText("Số điện thoại:");

        jLabel38.setText("Địa chỉ:");

        jLabel40.setText("jLabel40");

        jLabel48.setText("Tên khách hàng:");

        jTextField10.setText("jTextField10");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel48)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(448, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        jLabel50.setText("Thông tin khách hàng");

        jLabel53.setText("Thời gian thuê");

        jLabel54.setText("Thời gian trả");

        jLabel55.setText("Số người");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tầng", "Số phòng", "Loại phòng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jLabel56.setText("Số phòng");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel56)
                    .addComponent(jLabel55))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel51.setText("Chi tiết phòng thuê");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Số phòng", "Tầng", "Dịch vụ", "Phí DV", "Thời gian sử dụng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel52.setText("Chi tiết phòng và dịch vụ");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tầng", "Số phòng", "Loại phòng", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable4);

        jLabel57.setText("Thông tin phòng được chọn");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jLabel10.setText("Thêm dịch vụ cho phòng");

        jButton3.setText("Trả phòng");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatTraPhongLayout = new javax.swing.GroupLayout(DatTraPhong);
        DatTraPhong.setLayout(DatTraPhongLayout);
        DatTraPhongLayout.setHorizontalGroup(
            DatTraPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatTraPhongLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(DatTraPhongLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(DatTraPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatTraPhongLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatTraPhongLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatTraPhongLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(199, 199, 199)
                        .addComponent(jLabel51)
                        .addGap(617, 617, 617))
                    .addGroup(DatTraPhongLayout.createSequentialGroup()
                        .addGroup(DatTraPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        DatTraPhongLayout.setVerticalGroup(
            DatTraPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatTraPhongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatTraPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatTraPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DatTraLayout = new javax.swing.GroupLayout(DatTra.getContentPane());
        DatTra.getContentPane().setLayout(DatTraLayout);
        DatTraLayout.setHorizontalGroup(
            DatTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatTraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatTraPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DatTraLayout.setVerticalGroup(
            DatTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatTraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(DatTraPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        DatTra.getAccessibleContext().setAccessibleName("Đặt, trả phòng");

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thanh toán", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        jPanel21.setBackground(new java.awt.Color(204, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel61.setText("Ngày checkin:");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel62.setText("Tên khách hàng:");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel63.setText("Số điện thoại:");

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel64.setText("Quê quán/Địa chỉ:");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel65.setText("Giới tính:");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel66.setText("Ngày sinh:");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel67.setText("Hình thức :");

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jRadioButton1.setText("Theo Ngày");

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jRadioButton2.setText("Theo Giờ");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaDV5, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62)
                            .addComponent(jLabel61)
                            .addComponent(jLabel63))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtMaDV4, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaDV3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaDV2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addGap(28, 28, 28)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaDV6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)))
                .addGap(17, 17, 17))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(txtMaDV2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel62)
                        .addComponent(txtMaDV3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel63)
                        .addComponent(txtMaDV4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaDV6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel67)
                    .addComponent(txtMaDV5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(204, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ngày checkin", "Ngày checkout", "Hình thức thuê", "Giá", "Thời gian ở", "Loại phòng"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Hình thức thuê");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Thời gian ở");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Loại phòng");
        }

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel68.setText("Số phòng:");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel69.setText("Tầng:");

        txtMaDV7.setEnabled(false);

        txtMaDV8.setEnabled(false);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dịch vụ", "Thời gian gọi", "Tổng chi phí"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable5);

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel71.setText("Tiền phòng:");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel72.setText("Tổng tiền DV:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setText("X");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setText("=");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel73.setText("Khuyến mãi:");

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "5%", "10%" }));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel74.setText("Giá chưa giảm:");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel75.setText("Đã giảm:");

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel77.setText("Ghi chú:");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel69)
                                    .addComponent(jLabel68))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaDV7, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(txtMaDV8))
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel71)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel72)
                                    .addComponent(jLabel73)
                                    .addComponent(jLabel77))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaDV10, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addComponent(txtMaDV9, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel74)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addComponent(txtMaDV11, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMaDV12, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addComponent(txtMaDV13, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel75)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMaDV14, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtMaDV15, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(txtMaDV7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel69)
                            .addComponent(txtMaDV8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel71)
                                            .addComponent(txtMaDV9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMaDV12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(txtMaDV11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaDV10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73)
                            .addComponent(txtMaDV13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75)
                            .addComponent(txtMaDV14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel77))
                    .addComponent(txtMaDV15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel76.setText("Tổng tiền phải thanh toán:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bill.png"))); // NOI18N
        jButton1.setText("In hóa đơn");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x-button.png"))); // NOI18N
        jButton2.setText("Hủy bỏ");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel76)
                        .addGap(30, 30, 30)
                        .addComponent(txtMaDV16, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButton1)
                        .addGap(117, 117, 117)
                        .addComponent(jButton2)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(txtMaDV16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ThanhToanLayout = new javax.swing.GroupLayout(ThanhToan.getContentPane());
        ThanhToan.getContentPane().setLayout(ThanhToanLayout);
        ThanhToanLayout.setHorizontalGroup(
            ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ThanhToanLayout.setVerticalGroup(
            ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThanhToanLayout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jTabbedPane8.setBackground(new java.awt.Color(204, 255, 255));
        jTabbedPane8.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane8.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane8.setAutoscrolls(true);
        jTabbedPane8.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N

        thanhToan.setRollover(true);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1231, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );

        thanhToan.add(jPanel14);

        jTabbedPane8.addTab("Thanh toán", new javax.swing.ImageIcon(getClass().getResource("/pay.png")), thanhToan); // NOI18N

        Khachhang.setRollover(true);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jPanel23.setBackground(new java.awt.Color(204, 204, 255));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel20.setText("QUẢN LÍ KHÁCH HÀNG");

        jPanel24.setBackground(new java.awt.Color(204, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel78.setText("Mã DV:");

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel79.setText("Tên DV:");

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel80.setText("Giá:");

        txtMaDV17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaDV17ActionPerformed(evt);
            }
        });

        btnThem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThem2.setText("Làm mới");
        btnThem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem2ActionPerformed(evt);
            }
        });

        btnSua2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSua2.setText("Sửa DV");
        btnSua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua2ActionPerformed(evt);
            }
        });

        btnXoa2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXoa2.setText("Xóa DV");
        btnXoa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa2ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton13.setText("Lưu DV");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThem2)
                            .addComponent(btnSua2))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa2)
                            .addComponent(jButton13)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel78)
                                    .addComponent(jLabel79)))
                            .addComponent(jLabel80)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTenDV2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel24Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(txtMaDV17, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtGia2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaDV17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel79)
                .addGap(34, 34, 34)
                .addComponent(txtTenDV2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel80)
                .addGap(18, 18, 18)
                .addComponent(txtGia2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem2)
                    .addComponent(btnXoa2))
                .addGap(33, 33, 33)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua2)
                    .addComponent(jButton13))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(204, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết thông tin dịch vụ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tbDV2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã DV", "Tên dịch vụ", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbDV2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDV2MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tbDV2);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Khachhang.add(jPanel4);

        jTabbedPane8.addTab("Khách hàng", new javax.swing.ImageIcon(getClass().getResource("/team.png")), Khachhang); // NOI18N

        DichVu.setRollover(true);

        dichvu.setBackground(new java.awt.Color(204, 204, 255));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setText("QUẢN LÍ DỊCH VỤ");

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin dịch vụ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("Mã DV:");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("Tên DV:");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("Giá:");

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThem.setText("Làm mới");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSua.setText("Sửa DV");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXoa.setText("Xóa DV");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton11.setText("Lưu DV");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThem)
                            .addComponent(btnSua))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa)
                            .addComponent(jButton11)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)))
                            .addComponent(jLabel28)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTenDV, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(txtMaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addGap(34, 34, 34)
                .addComponent(txtTenDV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa))
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(jButton11))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(204, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết thông tin dịch vụ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã DV", "Tên dịch vụ", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDV);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dichvuLayout = new javax.swing.GroupLayout(dichvu);
        dichvu.setLayout(dichvuLayout);
        dichvuLayout.setHorizontalGroup(
            dichvuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dichvuLayout.createSequentialGroup()
                .addGroup(dichvuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dichvuLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dichvuLayout.createSequentialGroup()
                        .addGap(481, 481, 481)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        dichvuLayout.setVerticalGroup(
            dichvuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dichvuLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dichvuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dichvu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(dichvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        DichVu.add(jPanel2);

        jTabbedPane8.addTab("Dịch vụ", new javax.swing.ImageIcon(getClass().getResource("/headphones.png")), DichVu); // NOI18N
        jTabbedPane8.addTab("Thống kê", new javax.swing.ImageIcon(getClass().getResource("/analysis.png")), ThongKe); // NOI18N
        jTabbedPane8.addTab("Phòng", new javax.swing.ImageIcon(getClass().getResource("/living-room.png")), Phong); // NOI18N

        TrangChu.setBackground(new java.awt.Color(204, 204, 255));

        jPanel18.setBackground(new java.awt.Color(204, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jPanel15.setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Tầng 1");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Tầng 2");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Tầng 3");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Tầng 4");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        t103.setBackground(java.awt.Color.lightGray);
        t103.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t103MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t103MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t103MouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("103");

        javax.swing.GroupLayout t103Layout = new javax.swing.GroupLayout(t103);
        t103.setLayout(t103Layout);
        t103Layout.setHorizontalGroup(
            t103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t103Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(t103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p103)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        t103Layout.setVerticalGroup(
            t103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t103Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(p103)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        t101.setBackground(java.awt.Color.lightGray);
        t101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t101MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t101MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t101MouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("101");

        javax.swing.GroupLayout t101Layout = new javax.swing.GroupLayout(t101);
        t101.setLayout(t101Layout);
        t101Layout.setHorizontalGroup(
            t101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t101Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(t101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p101)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        t101Layout.setVerticalGroup(
            t101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t101Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(p101)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        t102.setBackground(java.awt.Color.lightGray);
        t102.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t102MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t102MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t102MouseExited(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("102");

        javax.swing.GroupLayout t102Layout = new javax.swing.GroupLayout(t102);
        t102.setLayout(t102Layout);
        t102Layout.setHorizontalGroup(
            t102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t102Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(t102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p102)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        t102Layout.setVerticalGroup(
            t102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t102Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(p102)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        t104.setBackground(java.awt.Color.lightGray);
        t104.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t104MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t104MouseExited(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("104");

        javax.swing.GroupLayout t104Layout = new javax.swing.GroupLayout(t104);
        t104.setLayout(t104Layout);
        t104Layout.setHorizontalGroup(
            t104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t104Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(t104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p104)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        t104Layout.setVerticalGroup(
            t104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t104Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p104)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        t105.setBackground(java.awt.Color.lightGray);
        t105.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t105MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t105MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t105MouseExited(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("105");

        javax.swing.GroupLayout t105Layout = new javax.swing.GroupLayout(t105);
        t105.setLayout(t105Layout);
        t105Layout.setHorizontalGroup(
            t105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t105Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t105Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p105)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t105Layout.setVerticalGroup(
            t105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t105Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t105Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p105)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t106.setBackground(java.awt.Color.lightGray);
        t106.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t106MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t106MouseExited(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("106");

        javax.swing.GroupLayout t106Layout = new javax.swing.GroupLayout(t106);
        t106.setLayout(t106Layout);
        t106Layout.setHorizontalGroup(
            t106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t106Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(t106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t106Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p106)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t106Layout.setVerticalGroup(
            t106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t106Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t106Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p106)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t201.setBackground(java.awt.Color.lightGray);
        t201.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t201MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t201MouseExited(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("201");

        javax.swing.GroupLayout t201Layout = new javax.swing.GroupLayout(t201);
        t201.setLayout(t201Layout);
        t201Layout.setHorizontalGroup(
            t201Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t201Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t201Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t201Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p201)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t201Layout.setVerticalGroup(
            t201Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t201Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t201Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t201Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p201)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t202.setBackground(java.awt.Color.lightGray);
        t202.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t202MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t202MouseExited(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("202");

        javax.swing.GroupLayout t202Layout = new javax.swing.GroupLayout(t202);
        t202.setLayout(t202Layout);
        t202Layout.setHorizontalGroup(
            t202Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t202Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t202Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t202Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p202)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t202Layout.setVerticalGroup(
            t202Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t202Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t202Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t202Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p202)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t203.setBackground(java.awt.Color.lightGray);
        t203.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t203MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t203MouseExited(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("203");

        javax.swing.GroupLayout t203Layout = new javax.swing.GroupLayout(t203);
        t203.setLayout(t203Layout);
        t203Layout.setHorizontalGroup(
            t203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t203Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t203Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p203)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t203Layout.setVerticalGroup(
            t203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t203Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t203Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p203)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t204.setBackground(java.awt.Color.lightGray);
        t204.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t204MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t204MouseExited(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("204");

        javax.swing.GroupLayout t204Layout = new javax.swing.GroupLayout(t204);
        t204.setLayout(t204Layout);
        t204Layout.setHorizontalGroup(
            t204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t204Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t204Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p204)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t204Layout.setVerticalGroup(
            t204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t204Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t204Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p204)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t205.setBackground(java.awt.Color.lightGray);
        t205.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t205MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t205MouseExited(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("205");

        javax.swing.GroupLayout t205Layout = new javax.swing.GroupLayout(t205);
        t205.setLayout(t205Layout);
        t205Layout.setHorizontalGroup(
            t205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t205Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t205Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p205)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t205Layout.setVerticalGroup(
            t205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t205Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t205Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p205)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t206.setBackground(java.awt.Color.lightGray);
        t206.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t206MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t206MouseExited(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("206");

        javax.swing.GroupLayout t206Layout = new javax.swing.GroupLayout(t206);
        t206.setLayout(t206Layout);
        t206Layout.setHorizontalGroup(
            t206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t206Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t206Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p206)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t206Layout.setVerticalGroup(
            t206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t206Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t206Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p206)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t207.setBackground(java.awt.Color.lightGray);
        t207.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t207MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t207MouseExited(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("207");

        javax.swing.GroupLayout t207Layout = new javax.swing.GroupLayout(t207);
        t207.setLayout(t207Layout);
        t207Layout.setHorizontalGroup(
            t207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t207Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t207Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p207)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t207Layout.setVerticalGroup(
            t207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t207Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t207Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p207)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t302.setBackground(java.awt.Color.lightGray);
        t302.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t302MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t302MouseExited(evt);
            }
        });

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("302");

        javax.swing.GroupLayout t302Layout = new javax.swing.GroupLayout(t302);
        t302.setLayout(t302Layout);
        t302Layout.setHorizontalGroup(
            t302Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t302Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t302Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t302Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p302)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t302Layout.setVerticalGroup(
            t302Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t302Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t302Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t302Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p302)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t301.setBackground(java.awt.Color.lightGray);
        t301.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t301MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t301MouseExited(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("301");

        javax.swing.GroupLayout t301Layout = new javax.swing.GroupLayout(t301);
        t301.setLayout(t301Layout);
        t301Layout.setHorizontalGroup(
            t301Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t301Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t301Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t301Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p301)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t301Layout.setVerticalGroup(
            t301Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t301Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t301Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t301Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p301)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t303.setBackground(java.awt.Color.lightGray);
        t303.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t303MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t303MouseExited(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("303");

        javax.swing.GroupLayout t303Layout = new javax.swing.GroupLayout(t303);
        t303.setLayout(t303Layout);
        t303Layout.setHorizontalGroup(
            t303Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t303Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t303Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t303Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p303)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t303Layout.setVerticalGroup(
            t303Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t303Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t303Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t303Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p303)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t304.setBackground(java.awt.Color.lightGray);
        t304.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t304MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t304MouseExited(evt);
            }
        });

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("304");

        javax.swing.GroupLayout t304Layout = new javax.swing.GroupLayout(t304);
        t304.setLayout(t304Layout);
        t304Layout.setHorizontalGroup(
            t304Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t304Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t304Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t304Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p304)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t304Layout.setVerticalGroup(
            t304Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t304Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t304Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t304Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p304)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t305.setBackground(java.awt.Color.lightGray);
        t305.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t305MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t305MouseExited(evt);
            }
        });

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("305");

        javax.swing.GroupLayout t305Layout = new javax.swing.GroupLayout(t305);
        t305.setLayout(t305Layout);
        t305Layout.setHorizontalGroup(
            t305Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t305Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t305Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t305Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p305)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t305Layout.setVerticalGroup(
            t305Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t305Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t305Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t305Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p305)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t306.setBackground(java.awt.Color.lightGray);
        t306.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t306MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t306MouseExited(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("306");

        javax.swing.GroupLayout t306Layout = new javax.swing.GroupLayout(t306);
        t306.setLayout(t306Layout);
        t306Layout.setHorizontalGroup(
            t306Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t306Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t306Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t306Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p306)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t306Layout.setVerticalGroup(
            t306Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t306Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t306Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t306Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p306)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t307.setBackground(java.awt.Color.lightGray);
        t307.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t307MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t307MouseExited(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("307");

        javax.swing.GroupLayout t307Layout = new javax.swing.GroupLayout(t307);
        t307.setLayout(t307Layout);
        t307Layout.setHorizontalGroup(
            t307Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t307Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(t307Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t307Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(p307)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        t307Layout.setVerticalGroup(
            t307Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t307Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(t307Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t307Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(p307)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        t43.setBackground(java.awt.Color.lightGray);
        t43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t43MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t43MouseExited(evt);
            }
        });

        v43.setBackground(new java.awt.Color(255, 255, 255));
        v43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        v43.setForeground(new java.awt.Color(255, 255, 255));
        v43.setText("V4.3");

        javax.swing.GroupLayout t43Layout = new javax.swing.GroupLayout(t43);
        t43.setLayout(t43Layout);
        t43Layout.setHorizontalGroup(
            t43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t43Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(v43, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        t43Layout.setVerticalGroup(
            t43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(v43)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        t41.setBackground(java.awt.Color.lightGray);
        t41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t41MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t41MouseExited(evt);
            }
        });

        v41.setBackground(new java.awt.Color(255, 255, 255));
        v41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        v41.setForeground(new java.awt.Color(255, 255, 255));
        v41.setText("V4.1");

        javax.swing.GroupLayout t41Layout = new javax.swing.GroupLayout(t41);
        t41.setLayout(t41Layout);
        t41Layout.setHorizontalGroup(
            t41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t41Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(v41, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        t41Layout.setVerticalGroup(
            t41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(v41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        t42.setBackground(java.awt.Color.lightGray);
        t42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t42MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t42MouseExited(evt);
            }
        });

        v42.setBackground(new java.awt.Color(255, 255, 255));
        v42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        v42.setForeground(new java.awt.Color(255, 255, 255));
        v42.setText("V4.2");

        javax.swing.GroupLayout t42Layout = new javax.swing.GroupLayout(t42);
        t42.setLayout(t42Layout);
        t42Layout.setHorizontalGroup(
            t42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t42Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(v42, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        t42Layout.setVerticalGroup(
            t42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(v42)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        t44.setBackground(java.awt.Color.lightGray);
        t44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t44MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t44MouseExited(evt);
            }
        });

        v44.setBackground(new java.awt.Color(255, 255, 255));
        v44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        v44.setForeground(new java.awt.Color(255, 255, 255));
        v44.setText("V4.4");

        javax.swing.GroupLayout t44Layout = new javax.swing.GroupLayout(t44);
        t44.setLayout(t44Layout);
        t44Layout.setHorizontalGroup(
            t44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t44Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(v44, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        t44Layout.setVerticalGroup(
            t44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(v44)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(t101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t201, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t202, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t203, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t303, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(t103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t204, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t304, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t205, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t305, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(t206, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t306, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t207, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t307, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t201, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t202, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t203, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t204, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t205, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t206, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t207, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t302, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t301, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t303, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t304, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t305, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t306, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t307, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(t42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(t43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("DANH SÁCH PHÒNG");

        javax.swing.GroupLayout TrangChuLayout = new javax.swing.GroupLayout(TrangChu);
        TrangChu.setLayout(TrangChuLayout);
        TrangChuLayout.setHorizontalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrangChuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(499, 499, 499))
            .addGroup(TrangChuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 93, Short.MAX_VALUE))
        );
        TrangChuLayout.setVerticalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Trang chủ", new javax.swing.ImageIcon(getClass().getResource("/house.png")), TrangChu); // NOI18N

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("QUẢN LÍ CHO THUÊ PHÒNG KHÁCH SẠN");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDVMouseClicked
        int selectedRow = tblDV.getSelectedRow();
        txtMaDV.setText(tblDV.getValueAt(selectedRow, 1).toString());
        txtTenDV.setText(tblDV.getValueAt(selectedRow, 2).toString());
        txtGia.setText(tblDV.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_tblDVMouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDV.getSelectedRow();
        String maDV = tblDV.getValueAt(selectedRow, 1).toString();
        if (dichVuService.delete(maDV)) {
            JOptionPane.showMessageDialog(this, "Xoa thanh cong");
            loaddichvu();
        } else {
            JOptionPane.showMessageDialog(this, "Xoa that bai");
        }
        clearForm();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int selectedRow = tblDV.getSelectedRow();
        String maDV = tblDV.getValueAt(selectedRow, 1).toString();
        DichVu dv = new DichVu();
        dv.setMaDichVu(txtMaDV.getText());
        dv.setLoaiDichVu(txtTenDV.getText());
        dv.setSoTien(Float.parseFloat(txtGia.getText()));
        if (dichVuService.update(dv, maDV)) {
            JOptionPane.showMessageDialog(this, "Cap nhat thanh cong");
            loaddichvu();
        } else {
            JOptionPane.showMessageDialog(this, "Cap nhat that bai");
        }
        clearForm();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        DichVu dv = getformdata();
        if (dichVuService.add(dv)) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            loaddichvu();
        } else {
            JOptionPane.showMessageDialog(this, "Them that bai");
        }
        clearForm();
    }//GEN-LAST:event_btnThemActionPerformed

    private void clearForm(){
        txtGia.setText("");
        txtMaDV.setText("");
        txtTenDV.setText("");
    }
    private void t106MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t106MouseExited
        t106.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_t106MouseExited

    private void t106MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t106MouseEntered
        t106.setBackground(Color.red);
    }//GEN-LAST:event_t106MouseEntered

    private void t105MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t105MouseExited
        t105.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t105MouseExited

    private void t105MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t105MouseEntered
        t105.setBackground(Color.red);
    }//GEN-LAST:event_t105MouseEntered

    private void t105MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t105MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t105MouseClicked

    private void t104MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t104MouseExited
        t104.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t104MouseExited

    private void t104MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t104MouseEntered
        t104.setBackground(Color.red);
    }//GEN-LAST:event_t104MouseEntered

    private void t102MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t102MouseExited
        t102.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t102MouseExited

    private void t102MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t102MouseEntered
        t102.setBackground(Color.red);
    }//GEN-LAST:event_t102MouseEntered

    private void t102MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t102MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t102MouseClicked

    private void t101MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t101MouseExited
        t101.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t101MouseExited

    private void t101MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t101MouseEntered
        t101.setBackground(Color.red);
    }//GEN-LAST:event_t101MouseEntered

    private void t101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t101MouseClicked
        DatTra.setVisible(true);
    }//GEN-LAST:event_t101MouseClicked

    private void t103MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t103MouseExited
        t103.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t103MouseExited

    private void t103MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t103MouseEntered
        t103.setBackground(Color.red);
    }//GEN-LAST:event_t103MouseEntered

    private void t103MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t103MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t103MouseClicked

    private void t201MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t201MouseEntered
        t201.setBackground(Color.red);
    }//GEN-LAST:event_t201MouseEntered

    private void t201MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t201MouseExited
        t201.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t201MouseExited

    private void t202MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t202MouseEntered
        t202.setBackground(Color.red);
    }//GEN-LAST:event_t202MouseEntered

    private void t202MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t202MouseExited
        t202.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t202MouseExited

    private void t203MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t203MouseEntered
        t203.setBackground(Color.red);
    }//GEN-LAST:event_t203MouseEntered

    private void t203MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t203MouseExited
        t203.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t203MouseExited

    private void t204MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t204MouseEntered
        t204.setBackground(Color.red);
    }//GEN-LAST:event_t204MouseEntered

    private void t204MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t204MouseExited
        t204.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t204MouseExited

    private void t205MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t205MouseEntered
        t205.setBackground(Color.red);
    }//GEN-LAST:event_t205MouseEntered

    private void t205MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t205MouseExited
        t205.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t205MouseExited

    private void t206MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t206MouseEntered
        t206.setBackground(Color.red);
    }//GEN-LAST:event_t206MouseEntered

    private void t207MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t207MouseEntered
        t207.setBackground(Color.red);
    }//GEN-LAST:event_t207MouseEntered

    private void t206MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t206MouseExited
        t206.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t206MouseExited

    private void t207MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t207MouseExited
        t207.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t207MouseExited

    private void t301MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t301MouseEntered
        t301.setBackground(Color.red);
    }//GEN-LAST:event_t301MouseEntered

    private void t301MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t301MouseExited
        t301.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t301MouseExited

    private void t302MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t302MouseEntered
        t302.setBackground(Color.red);
    }//GEN-LAST:event_t302MouseEntered

    private void t302MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t302MouseExited
        t302.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t302MouseExited

    private void t303MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t303MouseEntered
        t303.setBackground(Color.red);
    }//GEN-LAST:event_t303MouseEntered

    private void t303MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t303MouseExited
        t303.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t303MouseExited

    private void t304MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t304MouseEntered
        t304.setBackground(Color.red);
    }//GEN-LAST:event_t304MouseEntered

    private void t304MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t304MouseExited
        t304.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t304MouseExited

    private void t305MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t305MouseEntered
        t305.setBackground(Color.red);
    }//GEN-LAST:event_t305MouseEntered

    private void t305MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t305MouseExited
        t305.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t305MouseExited

    private void t306MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t306MouseEntered
        t306.setBackground(Color.red);
    }//GEN-LAST:event_t306MouseEntered

    private void t306MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t306MouseExited
        t306.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t306MouseExited

    private void t307MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t307MouseEntered
        t307.setBackground(Color.red);
    }//GEN-LAST:event_t307MouseEntered

    private void t307MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t307MouseExited
        t307.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t307MouseExited

    private void t41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t41MouseEntered
        t41.setBackground(Color.red);
    }//GEN-LAST:event_t41MouseEntered

    private void t41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t41MouseExited
        t41.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t41MouseExited

    private void t42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t42MouseEntered
        t42.setBackground(Color.red);
    }//GEN-LAST:event_t42MouseEntered

    private void t42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t42MouseExited
        t43.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t42MouseExited

    private void t43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t43MouseEntered
        t43.setBackground(Color.red);
    }//GEN-LAST:event_t43MouseEntered

    private void t43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t43MouseExited
        t43.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t43MouseExited

    private void t44MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t44MouseEntered
        t44.setBackground(Color.red);
    }//GEN-LAST:event_t44MouseEntered

    private void t44MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t44MouseExited
        t44.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_t44MouseExited

    private void btnThem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnThem2ActionPerformed

    private void btnSua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSua2ActionPerformed

    private void btnXoa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoa2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tbDV2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDV2MouseClicked
        // TODO add your handling code here:
        int row = tblDV.getSelectedRow();
        String ma = tblDV.getValueAt(row, 0).toString();
        String ten = tblDV.getValueAt(row, 1).toString();
        String gia = tblDV.getValueAt(row, 2).toString();
    }//GEN-LAST:event_tbDV2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ThanhToan.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtMaDV17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaDV17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaDV17ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLKS1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame DatTra;
    private javax.swing.JPanel DatTraPhong;
    private javax.swing.JToolBar DichVu;
    private javax.swing.JToolBar Khachhang;
    private javax.swing.JTabbedPane Phong;
    private javax.swing.JFrame ThanhToan;
    private javax.swing.JTabbedPane ThongKe;
    private javax.swing.JPanel TrangChu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSua2;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem2;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoa2;
    private javax.swing.JPanel dichvu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel p101;
    private javax.swing.JLabel p102;
    private javax.swing.JLabel p103;
    private javax.swing.JLabel p104;
    private javax.swing.JLabel p105;
    private javax.swing.JLabel p106;
    private javax.swing.JLabel p201;
    private javax.swing.JLabel p202;
    private javax.swing.JLabel p203;
    private javax.swing.JLabel p204;
    private javax.swing.JLabel p205;
    private javax.swing.JLabel p206;
    private javax.swing.JLabel p207;
    private javax.swing.JLabel p301;
    private javax.swing.JLabel p302;
    private javax.swing.JLabel p303;
    private javax.swing.JLabel p304;
    private javax.swing.JLabel p305;
    private javax.swing.JLabel p306;
    private javax.swing.JLabel p307;
    private javax.swing.JPanel t101;
    private javax.swing.JPanel t102;
    private javax.swing.JPanel t103;
    private javax.swing.JPanel t104;
    private javax.swing.JPanel t105;
    private javax.swing.JPanel t106;
    private javax.swing.JPanel t201;
    private javax.swing.JPanel t202;
    private javax.swing.JPanel t203;
    private javax.swing.JPanel t204;
    private javax.swing.JPanel t205;
    private javax.swing.JPanel t206;
    private javax.swing.JPanel t207;
    private javax.swing.JPanel t301;
    private javax.swing.JPanel t302;
    private javax.swing.JPanel t303;
    private javax.swing.JPanel t304;
    private javax.swing.JPanel t305;
    private javax.swing.JPanel t306;
    private javax.swing.JPanel t307;
    private javax.swing.JPanel t41;
    private javax.swing.JPanel t42;
    private javax.swing.JPanel t43;
    private javax.swing.JPanel t44;
    private javax.swing.JTable tbDV2;
    private javax.swing.JTable tblDV;
    private javax.swing.JToolBar thanhToan;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtGia2;
    private javax.swing.JTextField txtMaDV;
    private javax.swing.JTextField txtMaDV10;
    private javax.swing.JTextField txtMaDV11;
    private javax.swing.JTextField txtMaDV12;
    private javax.swing.JTextField txtMaDV13;
    private javax.swing.JTextField txtMaDV14;
    private javax.swing.JTextField txtMaDV15;
    private javax.swing.JTextField txtMaDV16;
    private javax.swing.JTextField txtMaDV17;
    private javax.swing.JTextField txtMaDV2;
    private javax.swing.JTextField txtMaDV3;
    private javax.swing.JTextField txtMaDV4;
    private javax.swing.JTextField txtMaDV5;
    private javax.swing.JTextField txtMaDV6;
    private javax.swing.JTextField txtMaDV7;
    private javax.swing.JTextField txtMaDV8;
    private javax.swing.JTextField txtMaDV9;
    private javax.swing.JTextField txtTenDV;
    private javax.swing.JTextField txtTenDV2;
    private javax.swing.JLabel v41;
    private javax.swing.JLabel v42;
    private javax.swing.JLabel v43;
    private javax.swing.JLabel v44;
    // End of variables declaration//GEN-END:variables
}
