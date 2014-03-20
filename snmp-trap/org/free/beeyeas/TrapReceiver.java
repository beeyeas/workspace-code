import java.io.IOException;
import java.util.Vector;

import org.snmp4j.CommandResponder;
import org.snmp4j.CommandResponderEvent;
import org.snmp4j.CommunityTarget;
import org.snmp4j.MessageDispatcher;
import org.snmp4j.MessageDispatcherImpl;
import org.snmp4j.PDU;
import org.snmp4j.PDUv1;
import org.snmp4j.Snmp;
import org.snmp4j.mp.MPv1;
import org.snmp4j.mp.MPv2c;
import org.snmp4j.security.Priv3DES;
import org.snmp4j.security.SecurityProtocols;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.TcpAddress;
import org.snmp4j.smi.TransportIpAddress;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.AbstractTransportMapping;
import org.snmp4j.transport.DefaultTcpTransportMapping;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import org.snmp4j.util.MultiThreadedMessageDispatcher;
import org.snmp4j.util.ThreadPool;

/**
 * SNMP Trap Receiver class
 * 
 */
public class TrapReceiver implements CommandResponder {

	public static void main(String[] args) {
		TrapReceiver snmp4jTrapReceiver = new TrapReceiver();
		try {
			snmp4jTrapReceiver.listen(new UdpAddress("0.0.0.0" + "/162"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Trap Listner
	 */
	@SuppressWarnings("rawtypes")
	public synchronized void listen(TransportIpAddress address)
			throws IOException {
		AbstractTransportMapping transport;
		if (address instanceof TcpAddress) {
			transport = new DefaultTcpTransportMapping((TcpAddress) address);
		} else {
			transport = new DefaultUdpTransportMapping((UdpAddress) address);
		}

		ThreadPool threadPool = ThreadPool.create("DispatcherPool", 10);
		MessageDispatcher mDispathcher = new MultiThreadedMessageDispatcher(
				threadPool, new MessageDispatcherImpl());

		// add message processing models
		mDispathcher.addMessageProcessingModel(new MPv1());
		mDispathcher.addMessageProcessingModel(new MPv2c());

		// add all security protocols
		SecurityProtocols.getInstance().addDefaultProtocols();
		SecurityProtocols.getInstance().addPrivacyProtocol(new Priv3DES());

		// Create Target
		CommunityTarget target = new CommunityTarget();
		target.setCommunity(new OctetString("public"));

		Snmp snmp = new Snmp(mDispathcher, transport);
		snmp.addCommandResponder(this);

		transport.listen();
		System.out.println("Listening on " + address);

		try {
			this.wait();
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	/**
	 * This method will be called whenever a pdu is received on the given port
	 * specified in the listen() method
	 */
	public synchronized void processPdu(CommandResponderEvent cmdRespEvent) {
		System.out.println("Received PDU... from "
				+ cmdRespEvent.getPeerAddress().toString());
		System.out.println("Received PDU..."
				+ cmdRespEvent.getPeerAddress().toString());
		PDU pdu = cmdRespEvent.getPDU();
		if (pdu != null) {
			if (pdu.getType() == PDU.V1TRAP) {
				System.out.println("**************** PDU.V1TRAP OID "
						+ ((PDUv1) pdu).getEnterprise() + ".0."
						+ ((PDUv1) pdu).getSpecificTrap());
				System.out.println("Variables = " + pdu.getVariableBindings());
			} else if (pdu.getType() == PDU.TRAP) {

				System.out.println("**************** PDU. OID "
						+ getV2OID(pdu.getVariableBindings()));
			}
		}
	}

	private OID getV2OID(Vector<? extends VariableBinding> vector) {
		for (VariableBinding var : vector) {
			if (var.getVariable() instanceof OID) {
				return (OID) var.getVariable();
			}
		}
		return null;
	}
}
