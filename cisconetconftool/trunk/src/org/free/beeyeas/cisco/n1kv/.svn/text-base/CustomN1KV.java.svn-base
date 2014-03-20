package org.free.beeyeas.cisco.n1kv;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.free.beeyeas.ui.N1kVSMConnectionModel;

import com.cisco.n1kv.installerv2.utils.vmware.UpgradeHelper;
import com.cisco.n1kv.installerv2.utils.vmware.objects.N1kv;
import com.cisco.n1kv.installerv2.wizard.ApplicationHelper;

public class CustomN1KV {
	private N1kv n1kv;
	private UpgradeHelper upgradeHelper;
	private final static Logger LOGGER = Logger.getLogger(CustomN1KV.class
			.getName());

	public CustomN1KV() {
		initCustomN1KV();
	}

	public void customN1KVConnect(N1kVSMConnectionModel userModel) {
		if (n1kv == null) {
			n1kv = new N1kv();
			n1kv.setIpAddress(userModel.getVsmIpAddress());
			n1kv.setUsername(userModel.getVsmUser());
			n1kv.setPassword(userModel.getVsmpassword());
		}

		{
			upgradeHelper = new UpgradeHelper();
			upgradeHelper.setUser(userModel.getVsmUser());
			upgradeHelper.setPass(userModel.getVsmpassword());
			upgradeHelper.setVsmIp(userModel.getVsmIpAddress());
		}
	}

	public String executeCustomCli(N1kVSMConnectionModel userModel,
			String methodName) {
		try {
			ArrayList<Method> list = new ArrayList<Method>(
					Arrays.asList(com.cisco.n1kv.installerv2.utils.vmware.objects.N1kv.class
							.getMethods()));
			for (Method method : list) {
				if (method.getName().toLowerCase()
						.contains(methodName.toLowerCase()) == false)
					continue;
				/*
				 * if (method.getName().toLowerCase().contains("send"))
				 * continue;
				 */

				Object returnObject = null;
				try {
					returnObject = method.invoke(n1kv);
				} catch (Exception e) {
					if (returnObject == null) {
						returnObject = method.invoke(n1kv,
								userModel.getVsmIpAddress(),
								userModel.getVsmUser(),
								userModel.getVsmpassword());
					}
				}
				if (returnObject instanceof String) {
					return (String) returnObject;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";

	}

	private String executeCustomCLICommand(N1kVSMConnectionModel userModel,
			String cmd) {
		String value = "";
		customN1KVConnect(userModel);
		if ((cmd == null) || (cmd.length() <= 0)) {
			cmd = "softwareVersion";
		}
		try {
			ArrayList<Method> list = new ArrayList<Method>(
					Arrays.asList(com.cisco.n1kv.installerv2.utils.vmware.objects.N1kv.class
							.getMethods()));

			for (Method method : list) {
				if (method.getName().toLowerCase().contains(cmd.toLowerCase()) == false)
					continue;
				if (method.getName().toLowerCase().contains("send"))
					continue;

				Object returnObject = null;
				try {
					returnObject = method.invoke(n1kv);
				} catch (Exception e) {
					if (returnObject == null) {
						returnObject = method.invoke(n1kv,
								userModel.getVsmIpAddress(),
								userModel.getVsmUser(),
								userModel.getVsmpassword());
					}
				}
				if (returnObject instanceof String) {
					return (String) returnObject;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	private void initCustomN1KV() {
		// PropertyConfigurator.configure("conf" +
		// System.getProperty("file.separator") + "log4j.properties");
		LOGGER.setLevel(Level.INFO);
		try {
			ApplicationHelper.setFileHandler(new FileHandler("logging.txt"));
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * CustomN1KV vssN1Kv = new CustomN1KV(); vssN1Kv.customN1KVConnect();
		 */

	}
}
