package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.border.CompoundBorder;

import model.SinhVien;
import model.SinhVienDAO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class MainForm {

	private JFrame frmQunLSinh;
	private JTextField txt_name;
	private JTextField txt_date;
	private JTextField txt_phone;
	private JTextField txt_email;
	private JTextField txt_address;
	private JTextField txt_mssv;
	private JTextField txt_sex;
	private JButton btn_save;
	private JButton btn_edit;
	private JButton btn_cancel;
	private JButton btn_del;
	private JButton btn_add;

	// model class
	private SinhVienDAO dao;
	private static int choice;
	private static int index = 0;
	private JButton btn_pre;
	private JButton btn_next;
	private List sinhviens;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
					window.frmQunLSinh.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainForm() {
		initialize();
		dao = new SinhVienDAO();
		sinhviens = dao.listSV();
		showSinhVien();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQunLSinh = new JFrame();
		frmQunLSinh.getContentPane().setEnabled(false);
		frmQunLSinh.setTitle("Qu\u1EA3n L\u00FD Sinh Vi\u00EAn");
		frmQunLSinh.setBounds(100, 100, 780, 405);
		frmQunLSinh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		txt_name = new JTextField();
		txt_name.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txt_name.setEditable(false);
		txt_name.setColumns(10);

		txt_date = new JTextField();
		txt_date.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txt_date.setEditable(false);
		txt_date.setColumns(10);

		txt_phone = new JTextField();
		txt_phone.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txt_phone.setEditable(false);
		txt_phone.setColumns(10);

		txt_email = new JTextField();
		txt_email.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txt_email.setEditable(false);
		txt_email.setColumns(10);

		txt_address = new JTextField();
		txt_address.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txt_address.setEditable(false);
		txt_address.setColumns(10);

		txt_mssv = new JTextField();
		txt_mssv.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txt_mssv.setEditable(false);
		txt_mssv.setColumns(10);

		txt_sex = new JTextField();
		txt_sex.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txt_sex.setEditable(false);
		txt_sex.setColumns(10);

		JLabel lblNewLabel = new JLabel("H\u1ECD v\u00E0 t\u00EAn");

		JLabel lblNewLabel_1 = new JLabel("N\u0103m Sinh");

		JLabel lblNewLabel_2 = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");

		JLabel lblNewLabel_3 = new JLabel("Email");

		JLabel lblNewLabel_4 = new JLabel("\u0110\u1ECBa ch\u1EC9");

		JLabel lblNewLabel_5 = new JLabel("MSSV");

		JLabel lblNewLabel_6 = new JLabel("Giới tính");

		JLabel lblNewLabel_7 = new JLabel("PHI\u1EBEU TH\u00D4NG TIN SINH VI\u00CAN");
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.PLAIN, 16));

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(frmQunLSinh.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(
						groupLayout
								.createSequentialGroup().addGap(24).addGroup(
										groupLayout.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_1)
												.addComponent(lblNewLabel).addComponent(lblNewLabel_2)
												.addComponent(lblNewLabel_3).addComponent(lblNewLabel_4))
								.addGap(37)
								.addGroup(groupLayout
										.createParallelGroup(Alignment.LEADING).addComponent(txt_phone,
												GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
										.addComponent(txt_address, GroupLayout.PREFERRED_SIZE, 280,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout
												.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
														.createSequentialGroup()
														.addComponent(txt_date, GroupLayout.PREFERRED_SIZE, 112,
																GroupLayout.PREFERRED_SIZE)
														.addGap(111))
												.addGroup(groupLayout.createSequentialGroup()
														.addGroup(groupLayout
																.createParallelGroup(Alignment.TRAILING, false)
																.addComponent(txt_name, Alignment.LEADING)
																.addComponent(txt_email, Alignment.LEADING,
																		GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
														.addGap(26)))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
														.addComponent(lblNewLabel_5).addComponent(lblNewLabel_6))
												.addGap(18)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
														.addComponent(txt_sex, 0, 0, Short.MAX_VALUE)
														.addComponent(txt_mssv, GroupLayout.DEFAULT_SIZE, 52,
																Short.MAX_VALUE))))
								.addGap(14))
						.addGroup(groupLayout.createSequentialGroup().addGap(185).addComponent(lblNewLabel_7)))
				.addGap(32).addComponent(panel, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
				.addGap(67)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup().addGap(35).addComponent(lblNewLabel_7).addGap(51)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
								.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txt_name, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel))
								.addGap(31)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txt_date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1))
								.addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txt_phone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2))
								.addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txt_email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_3)))
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_5)
												.addComponent(txt_mssv, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(31)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txt_sex, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_6))))
						.addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txt_address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4)))
						.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(panel,
								GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(22, Short.MAX_VALUE)));

		btn_add = new JButton("TH\u00CAM");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				choice = 1;
				btn_save.setEnabled(true);
				btn_cancel.setEnabled(true);
				btn_edit.setEnabled(false);
				btn_del.setEnabled(false);
				btn_next.setEnabled(false);
				btn_pre.setEnabled(false);
				btn_add.setEnabled(false);
				txt_mssv.setText("AUTO");
				//
				txt_name.setEditable(true);
				txt_date.setEditable(true);
				txt_phone.setEditable(true);
				txt_email.setEditable(true);
				txt_address.setEditable(true);
				txt_sex.setEditable(true);
				//
				txt_name.setText("");
				txt_date.setText("");
				txt_phone.setText("");
				txt_email.setText("");
				txt_address.setText("");
				txt_sex.setText("");

			}
		});

		btn_edit = new JButton("S\u1EECA");
		btn_edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				choice = 2;
				btn_save.setEnabled(true);
				btn_cancel.setEnabled(true);
				btn_add.setEnabled(false);
				btn_del.setEnabled(false);
				btn_next.setEnabled(false);
				btn_pre.setEnabled(false);
				btn_edit.setEnabled(false);
				//
				txt_name.setEditable(true);
				txt_date.setEditable(true);
				txt_phone.setEnabled(true);
				txt_email.setEnabled(true);
				txt_address.setEnabled(true);
				txt_sex.setEnabled(true);
				//
				txt_name.setEnabled(true);
				txt_date.setEditable(true);
				txt_phone.setEditable(true);
				txt_email.setEditable(true);
				txt_address.setEditable(true);
				txt_sex.setEditable(true);
			}
		});

		btn_save = new JButton("L\u01AFU");
		btn_save.setEnabled(false);
		btn_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch (choice) {
				case 1: {
					String name = txt_name.getText();
					String date = txt_date.getText();
					String phone = txt_phone.getText();
					String email = txt_email.getText();
					String diachi = txt_address.getText();
					String sex = txt_sex.getText();

					SinhVien sv = new SinhVien();
					sv.setHoten(name);
					sv.setDiachi(diachi);
					sv.setEmail(email);
					sv.setNamsinh(date);
					sv.setPhai(sex);
					sv.setSodienthoai(phone);
					if (dao.addStudent(sv))
						refreshdata();
					JOptionPane.showMessageDialog(null, "Thêm thành công sinh viên");
				}
					break;
				case 2: {
					String name = txt_name.getText();
					String date = txt_date.getText();
					String phone = txt_phone.getText();
					String email = txt_email.getText();
					String diachi = txt_address.getText();
					String sex = txt_sex.getText();
					int mssv = Integer.parseInt(txt_mssv.getText());

					SinhVien sv = new SinhVien();
					sv.setMa_sv(mssv);
					sv.setHoten(name);
					sv.setDiachi(diachi);
					sv.setEmail(email);
					sv.setNamsinh(date);
					sv.setPhai(sex);
					sv.setSodienthoai(phone);

					dao.updateSinhVien(sv);
					refreshdata();
					JOptionPane.showMessageDialog(null, "Cập nhật thành công sinh viên");
				}
					break;
				case 3: {
					Integer mssv = Integer.parseInt(txt_mssv.getText());
					dao.deleteEmployee(mssv);
					refreshdata();
					JOptionPane.showMessageDialog(null, "Xóa thành công !");
				}
					break;
				}
				reset();
				index = sinhviens.size() - 1;
				showSinhVien();
			}
		});

		btn_del = new JButton("X\u00D3A");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				choice = 3;
				txt_name.setEnabled(false);
				txt_date.setEnabled(false);
				txt_phone.setEnabled(false);
				txt_email.setEnabled(false);
				txt_address.setEnabled(false);
				txt_sex.setEnabled(false);
				txt_mssv.setEnabled(true);
				btn_save.setEnabled(true);

				btn_save.setEnabled(true);
				btn_cancel.setEnabled(true);
				btn_add.setEnabled(false);
				btn_edit.setEnabled(false);
			}
		});

		JButton btn_exit = new JButton("EXIT");
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // stop program
				frmQunLSinh.dispose(); // close window
				frmQunLSinh.setVisible(false);
			}
		});

		btn_cancel = new JButton("HỦY");
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btn_cancel.setEnabled(false);

		btn_pre = new JButton("◄");
		btn_pre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					index--;
					showSinhVien();
				} else
					JOptionPane.showMessageDialog(null, "Hết sinh viên !");
			}
		});

		btn_next = new JButton("►");
		btn_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (index < sinhviens.size() - 1) {
					index++;
					showSinhVien();
				} else
					JOptionPane.showMessageDialog(null, "Hết sinh viên !");
			}
		});

		JLabel lblNewLabel_8 = new JLabel("CHỨC NĂNG");
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel.createSequentialGroup().addContainerGap(42, Short.MAX_VALUE).addGroup(gl_panel
										.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, gl_panel
												.createSequentialGroup().addGroup(gl_panel
														.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
																.createSequentialGroup()
																.addComponent(btn_save, GroupLayout.PREFERRED_SIZE, 72,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(18).addComponent(btn_cancel,
																		GroupLayout.PREFERRED_SIZE, 72,
																		GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_panel.createSequentialGroup()
																.addComponent(btn_add, GroupLayout.PREFERRED_SIZE, 72,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addComponent(btn_edit, GroupLayout.PREFERRED_SIZE, 72,
																		GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_panel.createSequentialGroup()
																.addGroup(gl_panel
																		.createParallelGroup(Alignment.TRAILING, false)
																		.addComponent(btn_pre, Alignment.LEADING, 0, 0,
																				Short.MAX_VALUE)
																		.addComponent(btn_del, Alignment.LEADING,
																				GroupLayout.PREFERRED_SIZE, 72,
																				GroupLayout.PREFERRED_SIZE))
																.addGap(18).addGroup(
																		gl_panel.createParallelGroup(Alignment.LEADING)
																				.addComponent(btn_next,
																						GroupLayout.PREFERRED_SIZE, 72,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(btn_exit,
																						GroupLayout.PREFERRED_SIZE, 72,
																						GroupLayout.PREFERRED_SIZE))))
												.addGap(34))
										.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
												.addComponent(lblNewLabel_8).addGap(73)))));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap(39, Short.MAX_VALUE)
						.addComponent(lblNewLabel_8).addGap(35)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn_edit, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn_add, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addGap(31)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btn_save, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn_cancel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addGap(31)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btn_del, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn_exit, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addGap(32)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btn_pre, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn_next, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addGap(23)));
		panel.setLayout(gl_panel);
		frmQunLSinh.getContentPane().setLayout(groupLayout);
	}

	private void showSinhVien() {
		if (sinhviens.size() != 0) {
			SinhVien item = (SinhVien) sinhviens.get(index);
			txt_name.setText(item.getHoten());
			txt_mssv.setText(item.getMa_sv() + "");
			txt_date.setText(item.getNamsinh());
			txt_email.setText(item.getEmail());
			txt_phone.setText(item.getSodienthoai());
			txt_sex.setText(item.getPhai());
			txt_address.setText(item.getDiachi());
		}
	}

	private void refreshdata() {
		sinhviens = dao.listSV();
	}

	private void reset() {
		btn_save.setEnabled(false);
		btn_cancel.setEnabled(false);
		btn_add.setEnabled(true);
		btn_edit.setEnabled(true);
		btn_del.setEnabled(true);
		btn_next.setEnabled(false);
		btn_pre.setEnabled(false);
		btn_next.setEnabled(true);
		btn_pre.setEnabled(true);

		txt_name.setEditable(false);
		txt_date.setEditable(false);
		txt_phone.setEditable(false);
		txt_email.setEditable(false);
		txt_address.setEditable(false);
		txt_sex.setEditable(false);

		//
		txt_name.setEnabled(true);
		txt_date.setEnabled(true);
		txt_phone.setEnabled(true);
		txt_email.setEnabled(true);
		txt_address.setEnabled(true);
		txt_sex.setEnabled(true);
	}
}
