package org.free.beeyeas.ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Vector;
import java.util.concurrent.ExecutionException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.free.beeyeas.cisco.n1kv.CustomN1KV;


@SuppressWarnings("serial")
public class ManagedUIPanel extends JPanel {
	private JTextField txtIpAddress;
	private JTextField txtUser;
	private JPasswordField passwordField;
	private JComboBox<String> cbxCliReq;
	private JTextArea txtCliRsp;
	
	private N1kVSMConnectionModel vsmModel;
	private CustomN1KV customN1Kv;
	
	public ManagedUIPanel(CustomN1KV n1kv) {
		this.customN1Kv = n1kv;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
	/*	JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 0;
		add(splitPane, gbc_splitPane);*/
		
		JPanel ciscoVSMDetailsPanel = new JPanel();
		//splitPane.setLeftComponent(ciscoVSMDetailsPanel);
		GridBagLayout gbl_ciscoVSMDetailsPanel = new GridBagLayout();
		gbl_ciscoVSMDetailsPanel.columnWidths = new int[]{0, 0};
		gbl_ciscoVSMDetailsPanel.rowHeights = new int[]{0, 0};
		gbl_ciscoVSMDetailsPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_ciscoVSMDetailsPanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		ciscoVSMDetailsPanel.setLayout(gbl_ciscoVSMDetailsPanel);
		{
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 0;
		add(ciscoVSMDetailsPanel,gbc_splitPane);
		}
		
		JPanel vsmConnectionPanel = new JPanel();
		GridBagConstraints gbc_vsmConnectionPanel = new GridBagConstraints();
		gbc_vsmConnectionPanel.fill = GridBagConstraints.BOTH;
		gbc_vsmConnectionPanel.gridx = 0;
		gbc_vsmConnectionPanel.gridy = 0;
		ciscoVSMDetailsPanel.add(vsmConnectionPanel, gbc_vsmConnectionPanel);
		vsmConnectionPanel.setBorder(new CompoundBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cisco Nexus VSM Details", TitledBorder.LEADING, TitledBorder.TOP, null, null), new LineBorder(new Color(0, 0, 0))));
		GridBagLayout gbl_vsmConnectionPanel = new GridBagLayout();
		gbl_vsmConnectionPanel.columnWidths = new int[]{0, 0, 0};
		gbl_vsmConnectionPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_vsmConnectionPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_vsmConnectionPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		vsmConnectionPanel.setLayout(gbl_vsmConnectionPanel);
		
		JLabel lblIpAddress = new JLabel("IP Address");
		GridBagConstraints gbc_lblIpAddress = new GridBagConstraints();
		gbc_lblIpAddress.fill = GridBagConstraints.BOTH;
		gbc_lblIpAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblIpAddress.gridx = 0;
		gbc_lblIpAddress.gridy = 0;
		vsmConnectionPanel.add(lblIpAddress, gbc_lblIpAddress);
		
		txtIpAddress = new JTextField();
		GridBagConstraints gbc_txtIpAddress = new GridBagConstraints();
		gbc_txtIpAddress.insets = new Insets(0, 0, 5, 0);
		gbc_txtIpAddress.fill = GridBagConstraints.BOTH;
		gbc_txtIpAddress.gridx = 1;
		gbc_txtIpAddress.gridy = 0;
		vsmConnectionPanel.add(txtIpAddress, gbc_txtIpAddress);
		txtIpAddress.setColumns(10);
		
		JLabel lblUser = new JLabel("User");
		GridBagConstraints gbc_lblUser = new GridBagConstraints();
		gbc_lblUser.anchor = GridBagConstraints.EAST;
		gbc_lblUser.fill = GridBagConstraints.VERTICAL;
		gbc_lblUser.insets = new Insets(0, 0, 5, 5);
		gbc_lblUser.gridx = 0;
		gbc_lblUser.gridy = 1;
		vsmConnectionPanel.add(lblUser, gbc_lblUser);
		
		txtUser = new JTextField();
		GridBagConstraints gbc_txtUser = new GridBagConstraints();
		gbc_txtUser.insets = new Insets(0, 0, 5, 0);
		gbc_txtUser.fill = GridBagConstraints.BOTH;
		gbc_txtUser.gridx = 1;
		gbc_txtUser.gridy = 1;
		vsmConnectionPanel.add(txtUser, gbc_txtUser);
		txtUser.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.fill = GridBagConstraints.VERTICAL;
		gbc_lblPassword.insets = new Insets(0, 0, 0, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 2;
		vsmConnectionPanel.add(lblPassword, gbc_lblPassword);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.fill = GridBagConstraints.BOTH;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 2;
		vsmConnectionPanel.add(passwordField, gbc_passwordField);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("rawtypes")
				SwingWorker worker = new SwingWorker() {
					@Override
					protected Object doInBackground() throws Exception {
						CustomN1KV n1kv = new CustomN1KV();
						n1kv.customN1KVConnect(vsmModel);
						return null;
					}
					@Override
					protected void done() {
						super.done();
					}
				};
				populateModel();
				worker.execute();
			}
			
		});
		GridBagConstraints gbc_btnConnect = new GridBagConstraints();
		gbc_btnConnect.fill = GridBagConstraints.BOTH;
		gbc_btnConnect.gridx = 1;
		gbc_btnConnect.gridy = 0;
		//ciscoVSMDetailsPanel.add(btnConnect, gbc_btnConnect);
		
		JPanel reqResPanel = new JPanel();
		//splitPane.setRightComponent(reqResPanel);
		GridBagLayout gbl_reqResPanel = new GridBagLayout();
		gbl_reqResPanel.columnWidths = new int[]{0, 0};
		gbl_reqResPanel.rowHeights = new int[]{0, 0, 0};
		gbl_reqResPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_reqResPanel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		reqResPanel.setLayout(gbl_reqResPanel);
		{
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 1;
		add(reqResPanel,gbc_splitPane);
		}
		
		JPanel ciscoCommandPanel = new JPanel();
		GridBagConstraints gbc_ciscoCommandPanel = new GridBagConstraints();
		gbc_ciscoCommandPanel.fill = GridBagConstraints.BOTH;
		gbc_ciscoCommandPanel.insets = new Insets(0, 0, 5, 0);
		gbc_ciscoCommandPanel.gridx = 0;
		gbc_ciscoCommandPanel.gridy = 0;
		reqResPanel.add(ciscoCommandPanel, gbc_ciscoCommandPanel);
		GridBagLayout gbl_ciscoCommandPanel = new GridBagLayout();
		gbl_ciscoCommandPanel.columnWidths = new int[]{0, 0, 0};
		gbl_ciscoCommandPanel.rowHeights = new int[]{0, 0};
		gbl_ciscoCommandPanel.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_ciscoCommandPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		ciscoCommandPanel.setLayout(gbl_ciscoCommandPanel);
		
		JPanel requestCLICmdPanel = new JPanel();
		GridBagConstraints gbc_requestCLICmdPanel = new GridBagConstraints();
		gbc_requestCLICmdPanel.insets = new Insets(0, 0, 0, 5);
		gbc_requestCLICmdPanel.fill = GridBagConstraints.BOTH;
		gbc_requestCLICmdPanel.gridx = 0;
		gbc_requestCLICmdPanel.gridy = 0;
		ciscoCommandPanel.add(requestCLICmdPanel, gbc_requestCLICmdPanel);
		requestCLICmdPanel.setBorder(new CompoundBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cisco XML Request", TitledBorder.LEADING, TitledBorder.TOP, null, null), new LineBorder(new Color(0, 0, 0))));
		GridBagLayout gbl_requestCLICmdPanel = new GridBagLayout();
		gbl_requestCLICmdPanel.columnWidths = new int[]{0, 0};
		gbl_requestCLICmdPanel.rowHeights = new int[]{0, 0};
		gbl_requestCLICmdPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_requestCLICmdPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		requestCLICmdPanel.setLayout(gbl_requestCLICmdPanel);
		
		ArrayList<Method> list = new ArrayList<Method>(Arrays.asList(
				com.cisco.n1kv.installerv2.utils.vmware.objects.N1kv.class.getMethods()));
		Vector<String> vector = new Vector<>();
		for (Method method : list){
			if (method.getName().toLowerCase().contains("main")) continue;
			if (method.getName().toLowerCase().contains("set")) continue;
			if (method.getName().toLowerCase().contains("send")) continue;
			vector.add(method.getName());
		}
		cbxCliReq = new JComboBox<String>(vector);
		
		GridBagConstraints gbc_txtCliReq = new GridBagConstraints();
		gbc_txtCliReq.fill = GridBagConstraints.BOTH;
		gbc_txtCliReq.gridx = 0;
		gbc_txtCliReq.gridy = 0;
		requestCLICmdPanel.add(cbxCliReq, gbc_txtCliReq);
		
		JButton btnExecute = new JButton("Execute");
		btnExecute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("rawtypes")
				SwingWorker<?,?> worker = new SwingWorker(){
					@Override
					protected Object doInBackground() throws Exception {
						return customN1Kv.executeCustomCli(populateModel(), ((String)cbxCliReq.getSelectedItem()).trim());
					}
					@Override
					protected void done() {
						Object returnValue;
						try {
							returnValue = get();
							if (returnValue instanceof String){
								txtCliRsp.setText(txtCliRsp.getText() + (String) returnValue + "\n-----------------------------"+new Date());
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						} catch (ExecutionException e) {
							e.printStackTrace();
						}finally{
							txtCliRsp.validate();
						}
					}
				};
				txtCliRsp.setText("Sending selected request at "+cbxCliReq.getSelectedItem() + "\n ----------------------------"+new Date() +"\n");
				worker.execute();
			}
		});
		GridBagConstraints gbc_btnExecute = new GridBagConstraints();
		gbc_btnExecute.fill = GridBagConstraints.BOTH;
		gbc_btnExecute.gridx = 1;
		gbc_btnExecute.gridy = 0;
		ciscoCommandPanel.add(btnExecute, gbc_btnExecute);
		
		JPanel responseCLICmdPanel = new JPanel();
		GridBagConstraints gbc_responseCLICmdPanel = new GridBagConstraints();
		gbc_responseCLICmdPanel.fill = GridBagConstraints.BOTH;
		gbc_responseCLICmdPanel.gridx = 0;
		gbc_responseCLICmdPanel.gridy = 1;
		reqResPanel.add(responseCLICmdPanel, gbc_responseCLICmdPanel);
		responseCLICmdPanel.setBorder(new CompoundBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cisco XML Response", TitledBorder.LEADING, TitledBorder.TOP, null, null), new LineBorder(new Color(0, 0, 0))));
		GridBagLayout gbl_responseCLICmdPanel = new GridBagLayout();
		gbl_responseCLICmdPanel.columnWidths = new int[]{0, 0};
		gbl_responseCLICmdPanel.rowHeights = new int[]{0, 0};
		gbl_responseCLICmdPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_responseCLICmdPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		responseCLICmdPanel.setLayout(gbl_responseCLICmdPanel);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		responseCLICmdPanel.add(scrollPane, gbc_scrollPane);
		
		txtCliRsp = new JTextArea();
		scrollPane.setViewportView(txtCliRsp);
		txtCliRsp.setEnabled(false);
		txtCliRsp.setEditable(false);
	}
	public N1kVSMConnectionModel getVsmModel() {
		return vsmModel;
	}
	public void setVsmModel(N1kVSMConnectionModel vsmModel) {
		this.vsmModel = vsmModel;
	}
	
	private N1kVSMConnectionModel populateModel(){
		vsmModel = new N1kVSMConnectionModel(this.txtUser.getText(), new String (this.passwordField.getPassword()), this.txtIpAddress.getText());
		return vsmModel;
	}
}
