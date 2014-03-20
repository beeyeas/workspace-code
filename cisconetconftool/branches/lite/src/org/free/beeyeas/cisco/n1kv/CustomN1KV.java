package org.free.beeyeas.cisco.n1kv;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

import org.free.beeyeas.ui.N1kVSMConnectionModel;

public class CustomN1KV {
	N1kv n1kv;
	private final static Logger LOGGER = Logger.getLogger(CustomN1KV.class
			.getName());

	public CustomN1KV() {
	}

	public void customN1KVConnect(N1kVSMConnectionModel userModel) {
		if (n1kv == null) {
			n1kv = new N1kv();
			n1kv.setIpAddress(userModel.getVsmIpAddress());
			n1kv.setUsername(userModel.getVsmUser());
			n1kv.setPassword(userModel.getVsmpassword());
		}
		n1kv.getXmlHandler().setParentDVS(n1kv);
	}

	public String executeCustomCli(N1kVSMConnectionModel userModel,
			String methodName) {
		try {
			ArrayList<Method> list = new ArrayList<Method>(
					Arrays.asList(N1kv.class
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
					Arrays.asList(N1kv.class
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

}
