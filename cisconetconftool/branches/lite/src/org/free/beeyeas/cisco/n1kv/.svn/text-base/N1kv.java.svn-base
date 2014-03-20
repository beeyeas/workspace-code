package org.free.beeyeas.cisco.n1kv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import com.trilead.ssh2.Connection;
import com.trilead.ssh2.Session;
import com.trilead.ssh2.StreamGobbler;

public final class N1kv {
	/* 42 */private static Logger N1KVLogger = Logger.getLogger(N1kv.class
			.getName());
	/*     */public static FileHandler fh;

	String uuid;
	String softwareVersion;
	String model;
	String ipAddress;

	String username;
	String password;
	XMLAPIHandler xmlHandler;

	public N1kv() {
		try {
			if (fh == null)
				fh = new FileHandler("logging.txt");
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		/* 57 */if (N1KVLogger.getHandlers().length == 0)
			/* 58 */N1KVLogger.addHandler(fh);
		/* 59 */this.xmlHandler = new XMLAPIHandler();
		/* 60 */this.xmlHandler.setParentDVS(this);
	}

	public N1kv(Handler handler) {
		try {
			if (fh == null)
				fh = new FileHandler("logging.txt");
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		/* 64 */if (N1KVLogger.getHandlers().length == 0)
			/* 65 */N1KVLogger.addHandler(fh);
		/* 66 */this.xmlHandler = new XMLAPIHandler();
		/* 67 */this.xmlHandler.setParentDVS(this);
	}

	public String getUsername() {
		/* 74 */return this.username;
	}

	public void setUsername(String username) {
		/* 82 */this.username = username;
	}

	public String getIpAddress() {
		/* 89 */return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		/* 97 */this.ipAddress = ipAddress;
	}

	public String getPassword() {
		/* 104 */return this.password;
	}

	public void setPassword(String password) {
		/* 112 */this.password = password;
	}

	public String getSoftwareVersion() {
		/* 149 */return this.softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		/* 157 */this.softwareVersion = softwareVersion;
	}

	public String sendShowModule() {
		/* 327 */String ret = null;
		try {
			/* 329 */this.xmlHandler.getXMLAgentSession();
			/* 330 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 331 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 333 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 334 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 335 */String response = this.xmlHandler.readMessage(reader);
			/* 336 */N1KVLogger.info(response);

			/* 338 */String svsDomain = this.xmlHandler.showModule;
			/* 339 */N1KVLogger.info(svsDomain);

			/* 341 */this.xmlHandler.writeMessage(svsDomain, writer);
			/* 342 */response = this.xmlHandler.readMessage(reader);
			/* 343 */N1KVLogger.info(response);
			/* 344 */ret = response;

			/* 346 */this.xmlHandler.sess.close();
			/* 347 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 350 */e.printStackTrace();
		}
		/* 353 */return ret;
	}

	public String sendShowModuleVem() {
		/* 357 */String ret = null;
		try {
			/* 359 */this.xmlHandler.getXMLAgentSession();
			/* 360 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 361 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 363 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 364 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 365 */String response = this.xmlHandler.readMessage(reader);
			/* 366 */N1KVLogger.info(response);

			/* 368 */String svsDomain = this.xmlHandler.showModuleVem;
			/* 369 */N1KVLogger.info(svsDomain);

			/* 371 */this.xmlHandler.writeMessage(svsDomain, writer);
			/* 372 */response = this.xmlHandler.readMessage(reader);
			/* 373 */N1KVLogger.info(response);
			/* 374 */ret = response;

			/* 376 */this.xmlHandler.sess.close();
			/* 377 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 380 */e.printStackTrace();
			/* 381 */;
		}
		/* 383 */return ret;
	}

	public String sendShowMgmtIpv6() {
		/* 387 */String ret = null;
		try {
			/* 389 */this.xmlHandler.getXMLAgentSession();
			/* 390 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 391 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 393 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 394 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 395 */String response = this.xmlHandler.readMessage(reader);
			/* 396 */N1KVLogger.info(response);

			/* 398 */String ipv6 = this.xmlHandler.showMgmtipv6;
			/* 399 */N1KVLogger.info(ipv6);

			/* 401 */this.xmlHandler.writeMessage(ipv6, writer);
			/* 402 */response = this.xmlHandler.readMessage(reader);
			/* 403 */N1KVLogger.info(response);
			/* 404 */ret = response;

			/* 406 */this.xmlHandler.sess.close();
			/* 407 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 410 */e.printStackTrace();
			/* 411 */;
		}
		/* 413 */return ret;
	}

	public String sendShowMgmtIpv4() {
		/* 417 */String ret = null;
		try {
			/* 419 */this.xmlHandler.getXMLAgentSession();
			/* 420 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 421 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 423 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 424 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 425 */String response = this.xmlHandler.readMessage(reader);
			/* 426 */N1KVLogger.info(response);

			/* 428 */String ipv4 = this.xmlHandler.showMgmtipv4;
			/* 429 */N1KVLogger.info(ipv4);

			/* 431 */this.xmlHandler.writeMessage(ipv4, writer);
			/* 432 */response = this.xmlHandler.readMessage(reader);
			/* 433 */N1KVLogger.info(response);
			/* 434 */ret = response;

			/* 436 */this.xmlHandler.sess.close();
			/* 437 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 440 */e.printStackTrace();
			/* 441 */;
		}
		/* 443 */return ret;
	}

	public String sendShowRedState() {
		/* 447 */String ret = null;
		try {
			/* 449 */this.xmlHandler.getXMLAgentSession();
			/* 450 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 451 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 453 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 454 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 455 */String response = this.xmlHandler.readMessage(reader);
			/* 456 */N1KVLogger.info(response);

			/* 458 */String red = this.xmlHandler.showRedStatus;
			/* 459 */N1KVLogger.info(red);

			/* 461 */this.xmlHandler.writeMessage(red, writer);
			/* 462 */response = this.xmlHandler.readMessage(reader);
			/* 463 */N1KVLogger.info(response);
			/* 464 */ret = response;

			/* 466 */this.xmlHandler.sess.close();
			/* 467 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 470 */e.printStackTrace();
			/* 471 */;
		}
		/* 473 */return ret;
	}

	public String sendShowVlanAllPorts() {
		/* 477 */String ret = null;
		try {
			/* 479 */this.xmlHandler.getXMLAgentSession();
			/* 480 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 481 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 483 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 484 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 485 */String response = this.xmlHandler.readMessage(reader);
			/* 486 */N1KVLogger.info(response);

			/* 488 */String ports = this.xmlHandler.showVlanAllPorts;
			/* 489 */N1KVLogger.info(ports);

			/* 491 */this.xmlHandler.writeMessage(ports, writer);
			/* 492 */response = this.xmlHandler.readMessage(reader);
			/* 493 */N1KVLogger.info(response);
			/* 494 */ret = response;

			/* 496 */this.xmlHandler.sess.close();
			/* 497 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 500 */e.printStackTrace();
			/* 501 */;
		}
		/* 503 */return ret;
	}

	public String sendShowPortProfileUsage() {
		/* 507 */String ret = null;
		try {
			/* 509 */this.xmlHandler.getXMLAgentSession();
			/* 510 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 511 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 513 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 514 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 515 */String response = this.xmlHandler.readMessage(reader);
			/* 516 */N1KVLogger.info(response);

			/* 518 */String usage = this.xmlHandler.showPortProfileUsage;
			/* 519 */N1KVLogger.info(usage);

			/* 521 */this.xmlHandler.writeMessage(usage, writer);
			/* 522 */response = this.xmlHandler.readMessage(reader);
			/* 523 */N1KVLogger.info(response);
			/* 524 */ret = response;

			/* 526 */this.xmlHandler.sess.close();
			/* 527 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 530 */e.printStackTrace();
			/* 531 */;
		}
		/* 533 */return ret;
	}

	public String sendShowPortProfileByName(String ppfName) {
		/* 537 */String ret = null;
		try {
			/* 539 */this.xmlHandler.getXMLAgentSession();
			/* 540 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 541 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 543 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 544 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 545 */String response = this.xmlHandler.readMessage(reader);
			/* 546 */N1KVLogger.info(response);

			/* 548 */String portProfile = this.xmlHandler.showPortProfileByName;
			/* 549 */portProfile = portProfile.replaceAll("PPNAME", ppfName);
			/* 550 */N1KVLogger.info(portProfile);

			/* 552 */this.xmlHandler.writeMessage(portProfile, writer);
			/* 553 */response = this.xmlHandler.readMessage(reader);
			/* 554 */N1KVLogger.info(response);
			/* 555 */ret = response;

			/* 557 */this.xmlHandler.sess.close();
			/* 558 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 561 */e.printStackTrace();
			/* 562 */;
		}
		/* 564 */return ret;
	}

	public String sendShowPortProfileBrief() {
		/* 568 */String ret = null;
		try {
			/* 570 */this.xmlHandler.getXMLAgentSession();
			/* 571 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 572 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 574 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 575 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 576 */String response = this.xmlHandler.readMessage(reader);
			/* 577 */N1KVLogger.info(response);

			/* 579 */String brief = this.xmlHandler.showPortProfileBrief;
			/* 580 */N1KVLogger.info(brief);

			/* 582 */this.xmlHandler.writeMessage(brief, writer);
			/* 583 */response = this.xmlHandler.readMessage(reader);
			/* 584 */N1KVLogger.info(response);
			/* 585 */ret = response;

			/* 587 */this.xmlHandler.sess.close();
			/* 588 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 591 */e.printStackTrace();
			/* 592 */;
		}
		/* 594 */return ret;
	}

	public static boolean sshWaitForOnline(String ip, String user, String pass,
			int tries) throws InterruptedException, IOException {
		/* 598 */Connection conn = new Connection(ip);
		/* 599 */boolean flag = false;
		/* 600 */int count = 1;
		do
			try {
				/* 603 */conn.connect();
				/* 604 */flag = true;
			} catch (Exception e) {
				/* 607 */N1KVLogger
						.info("Waiting to SSH, ignore timeout exception. #"
								+ count);
				/* 608 */count++;
				/* 609 */if (count > tries)
					/* 610 */flag = true;
				/* 611 */Thread.currentThread();
				Thread.sleep(1000L);
			}
		/* 613 */while (!flag);
		/* 614 */if (count > tries) {
			/* 615 */N1KVLogger.info("SSH timed out.");
			/* 616 */return false;
		}
		/* 618 */boolean isAuthenticated = conn.authenticateWithPassword(user,
				pass);
		/* 619 */return isAuthenticated;
	}

	public static int sshWaitForOnlineForVCInstall(String ip, String user,
			String pass, int tries) throws InterruptedException, IOException {
		/* 624 */int ret = 0;
		/* 625 */Connection conn = new Connection(ip);
		/* 626 */boolean flag = false;
		/* 627 */int count = 1;
		do
			try {
				/* 630 */conn.connect();
				/* 631 */flag = true;
			} catch (Exception e) {
				/* 634 */N1KVLogger
						.info("Waiting to SSH, ignore timeout exception. #"
								+ count);
				/* 635 */count++;
				/* 636 */if (count > tries)
					/* 637 */flag = true;
				/* 638 */Thread.currentThread();
				/* 639 */Thread.sleep(1000L);
			}
		/* 641 */while (!flag);
		/* 642 */if (count > tries) {
			/* 643 */N1KVLogger.info("SSH timed out.");
			/* 644 */ret = 1;
		} else {
			/* 647 */boolean isAuthenticated = conn.authenticateWithPassword(
					user, pass);
			/* 648 */if (!isAuthenticated)
				/* 649 */ret = 2;
		}
		/* 651 */return ret;
	}

	public String sendShowVersion() {
		/* 655 */String ret = null;
		try {
			/* 657 */this.xmlHandler.getXMLAgentSession();
			/* 658 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 659 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 661 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 662 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 663 */String response = this.xmlHandler.readMessage(reader);
			/* 664 */N1KVLogger.info(response);

			/* 666 */String red = this.xmlHandler.showVersion;
			/* 667 */N1KVLogger.info(red);

			/* 669 */this.xmlHandler.writeMessage(red, writer);
			/* 670 */response = this.xmlHandler.readMessage(reader);
			/* 671 */N1KVLogger.info(response);
			/* 672 */ret = response;

			/* 674 */this.xmlHandler.sess.close();
			/* 675 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 678 */e.printStackTrace();
			/* 679 */;
		}
		/* 681 */return ret;
	}

	public String sendDirBootflash() {
		/* 685 */String ret = null;
		try {
			/* 687 */this.xmlHandler.getXMLAgentSession();
			/* 688 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 689 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 691 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 692 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 693 */String response = this.xmlHandler.readMessage(reader);
			/* 694 */N1KVLogger.info(response);

			/* 696 */String red = this.xmlHandler.printBootflash;
			/* 697 */N1KVLogger.info(red);

			/* 699 */this.xmlHandler.writeMessage(red, writer);
			/* 700 */response = this.xmlHandler.readMessage(reader);
			/* 701 */N1KVLogger.info(response);
			/* 702 */ret = response;

			/* 704 */this.xmlHandler.sess.close();
			/* 705 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 708 */e.printStackTrace();
			/* 709 */;
		}
		/* 711 */return ret;
	}

	public boolean sendVlanCreation(int vlan) {
		/* 832 */if (vlan < 0)
			/* 833 */return false;
		/* 834 */if (vlan > 4093)
			/* 835 */return false;
		/* 836 */if ((vlan > 3967) && (vlan < 4048))
			/* 837 */return false;
		try {
			/* 839 */this.xmlHandler.getXMLAgentSession();
			/* 840 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 841 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 843 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 844 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 845 */String response = this.xmlHandler.readMessage(reader);
			/* 846 */N1KVLogger.info(response);

			/* 848 */String vlanConf = this.xmlHandler.confVlan;
			/* 849 */vlanConf = vlanConf.replaceFirst("VLAN_ID",
					Integer.toString(vlan));
			/* 850 */N1KVLogger.info(vlanConf);

			/* 852 */this.xmlHandler.writeMessage(vlanConf, writer);
			/* 853 */response = this.xmlHandler.readMessage(reader);
			/* 854 */N1KVLogger.info(response);

			/* 856 */Thread.currentThread();
			Thread.sleep(5000L);

			/* 863 */this.xmlHandler.sess.close();
			/* 864 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 867 */e.printStackTrace();
			/* 868 */;
		}
		/* 870 */return true;
	}

	public String getShowSvsConnection() {
		/* 1429 */String response = null;
		try {
			/* 1431 */this.xmlHandler.getXMLAgentSession();
			/* 1432 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 1433 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 1435 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 1436 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 1437 */response = this.xmlHandler.readMessage(reader);
			/* 1438 */N1KVLogger.info(response);

			/* 1441 */this.xmlHandler.writeMessage(this.xmlHandler.showSvsConn,
					writer);
			/* 1442 */response = this.xmlHandler.readMessage(reader);
			/* 1443 */N1KVLogger.info(response);

			/* 1445 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 1447 */e.printStackTrace();
			/* 1448 */;
		}
		/* 1450 */return response;
	}

	public XMLAPIHandler getXmlHandler() {
		/* 2445 */return this.xmlHandler;
	}

	public void setXmlHandler(XMLAPIHandler xmlHandler) {
		/* 2453 */this.xmlHandler = xmlHandler;
	}

	public static String getShowModule(String ip, String user, String pass)
			throws Exception {
		/* 2487 */N1kv n1kv = new N1kv(null);
		/* 2488 */n1kv.setIpAddress(ip);
		/* 2489 */n1kv.setUsername(user);
		/* 2490 */n1kv.setPassword(pass);

		/* 2492 */N1KVLogger
				.info(" n1kv.getXmlHandler().getXMLAgentSession().. ");
		/* 2493 */n1kv.getXmlHandler().getXMLAgentSession();

		/* 2495 */String ret = n1kv.sendShowModule();
		/* 2496 */n1kv.getXmlHandler().close();
		/* 2497 */return ret;
	}

	public static String getShowModuleVem(String ip, String user, String pass)
			throws Exception {
		/* 2501 */N1kv n1kv = new N1kv(null);
		/* 2502 */n1kv.setIpAddress(ip);
		/* 2503 */n1kv.setUsername(user);
		/* 2504 */n1kv.setPassword(pass);

		/* 2506 */N1KVLogger
				.info(" n1kv.getXmlHandler().getXMLAgentSession().. ");
		/* 2507 */n1kv.getXmlHandler().getXMLAgentSession();

		/* 2509 */String ret = n1kv.sendShowModuleVem();
		/* 2510 */n1kv.getXmlHandler().close();
		/* 2511 */return ret;
	}

	public static String getMgmtIpv6(String ip, String user, String pass)
			throws Exception {
		/* 2515 */N1kv n1kv = new N1kv(null);
		/* 2516 */n1kv.setIpAddress(ip);
		/* 2517 */n1kv.setUsername(user);
		/* 2518 */n1kv.setPassword(pass);

		/* 2520 */N1KVLogger
				.info(" n1kv.getXmlHandler().getXMLAgentSession().. ");
		/* 2521 */n1kv.getXmlHandler().getXMLAgentSession();

		/* 2523 */String ret = n1kv.sendShowMgmtIpv6();
		/* 2524 */n1kv.getXmlHandler().close();
		/* 2525 */return ret;
	}

	public static String getMgmtIpv4(String ip, String user, String pass)
			throws Exception {
		/* 2529 */N1kv n1kv = new N1kv(null);
		/* 2530 */n1kv.setIpAddress(ip);
		/* 2531 */n1kv.setUsername(user);
		/* 2532 */n1kv.setPassword(pass);

		/* 2534 */N1KVLogger
				.info(" n1kv.getXmlHandler().getXMLAgentSession().. ");
		/* 2535 */n1kv.getXmlHandler().getXMLAgentSession();

		/* 2537 */String ret = n1kv.sendShowMgmtIpv4();
		/* 2538 */n1kv.getXmlHandler().close();
		/* 2539 */return ret;
	}

	public static String getRedStatus(String ip, String user, String pass)
			throws Exception {
		/* 2543 */N1kv n1kv = new N1kv(null);
		/* 2544 */n1kv.setIpAddress(ip);
		/* 2545 */n1kv.setUsername(user);
		/* 2546 */n1kv.setPassword(pass);

		/* 2548 */N1KVLogger
				.info(" n1kv.getXmlHandler().getXMLAgentSession().. ");
		/* 2549 */n1kv.getXmlHandler().getXMLAgentSession();

		/* 2551 */String ret = n1kv.sendShowRedState();
		/* 2552 */n1kv.getXmlHandler().close();
		/* 2553 */return ret;
	}

	public static String getShowVersion(String ip, String user, String pass)
			throws Exception {
		/* 2753 */N1kv n1kv = new N1kv(null);
		/* 2754 */n1kv.setIpAddress(ip);
		/* 2755 */n1kv.setUsername(user);
		/* 2756 */n1kv.setPassword(pass);

		/* 2758 */N1KVLogger
				.info(" n1kv.getXmlHandler().getXMLAgentSession().. ");
		/* 2759 */n1kv.getXmlHandler().getXMLAgentSession();

		/* 2761 */String ret = n1kv.sendShowVersion();
		/* 2762 */n1kv.getXmlHandler().close();

		/* 2764 */return ret;
	}

	public static String getBootflashFiles(String ip, String user, String pass)
			throws Exception {
		/* 2768 */N1kv n1kv = new N1kv(null);
		/* 2769 */n1kv.setIpAddress(ip);
		/* 2770 */n1kv.setUsername(user);
		/* 2771 */n1kv.setPassword(pass);

		/* 2773 */N1KVLogger
				.info(" n1kv.getXmlHandler().getXMLAgentSession().. ");
		/* 2774 */n1kv.getXmlHandler().getXMLAgentSession();

		/* 2776 */String ret = n1kv.sendDirBootflash();
		/* 2777 */n1kv.getXmlHandler().close();

		/* 2779 */return ret;
	}

	public String sendGetAllInterface() {
		/* 655 */String ret = null;
		try {
			/* 657 */this.getXmlHandler().getXMLAgentSession();
			/* 658 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 659 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 661 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 662 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 663 */String response = this.xmlHandler.readMessage(reader);
			/* 664 */N1KVLogger.info(response);

			/* 666 */String red = this.xmlHandler.showAllInterface;
			/* 667 */N1KVLogger.info(red);

			/* 669 */this.xmlHandler.writeMessage(red, writer);
			/* 670 */response = this.xmlHandler.readMessage(reader);
			/* 671 */N1KVLogger.info(response);
			/* 672 */ret = response;

			/* 674 */this.xmlHandler.sess.close();
			/* 675 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 678 */e.printStackTrace();
			/* 679 */;
		}
		/* 681 */return ret;
	}

	public static String getShowAllVLAN(String ip, String user, String pass)
			throws Exception {
		N1kv n1kv = new N1kv(null);
		n1kv.setIpAddress(ip);
		n1kv.setUsername(user);
		n1kv.setPassword(pass);
		n1kv.getXmlHandler().getXMLAgentSession();
		String ret = n1kv.sendGetAllVLAN();
		n1kv.getXmlHandler().close();
		return ret;
	}

	public String sendGetAllVLAN() {
		/* 655 */String ret = null;
		try {
			/* 657 */this.getXmlHandler().getXMLAgentSession();
			/* 658 */InputStream stdout = new StreamGobbler(
					this.xmlHandler.sess.getStdout());
			/* 659 */BufferedReader reader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 661 */PrintWriter writer = new PrintWriter(
					this.xmlHandler.sess.getStdin());
			/* 662 */this.xmlHandler.writeMessage(this.xmlHandler.initial,
					writer);
			/* 663 */String response = this.xmlHandler.readMessage(reader);
			/* 664 */N1KVLogger.info(response);

			/* 666 */String red = this.xmlHandler.showAllVLAN;
			/* 667 */N1KVLogger.info(red);

			/* 669 */this.xmlHandler.writeMessage(red, writer);
			/* 670 */response = this.xmlHandler.readMessage(reader);
			/* 671 */N1KVLogger.info(response);
			/* 672 */ret = response;

			/* 674 */this.xmlHandler.sess.close();
			/* 675 */this.xmlHandler.close();
		} catch (Exception e) {
			/* 678 */e.printStackTrace();
			/* 679 */;
		}
		/* 681 */return ret;
	}

	public static String getShowAllInterface(String ip, String user, String pass)
			throws Exception {
		N1kv n1kv = new N1kv(null);
		n1kv.setIpAddress(ip);
		n1kv.setUsername(user);
		n1kv.setPassword(pass);
		n1kv.getXmlHandler().getXMLAgentSession();
		String ret = n1kv.sendGetAllInterface();
		n1kv.getXmlHandler().close();
		return ret;
	}

	public static void testVlanCreation() throws Exception {
		/* 2811 */N1kv n1kv = new N1kv(null);
		/* 2812 */n1kv.setIpAddress("172.23.180.85");
		/* 2813 */n1kv.setUsername("admin");
		/* 2814 */n1kv.setPassword("Sfish123");

		/* 2817 */N1KVLogger
				.info(" n1kv.getXmlHandler().getXMLAgentSession().. ");
		/* 2818 */n1kv.getXmlHandler().getXMLAgentSession();

		/* 2820 */n1kv.sendVlanCreation(120);
		/* 2821 */n1kv.getXmlHandler().close();
	}

	class TimeoutReader extends Thread {
		boolean finished;
		boolean failed;
		BufferedReader data;
		String output;

		TimeoutReader(BufferedReader reader) {
			/* 2398 */this.finished = false;
			/* 2399 */this.failed = false;
			/* 2400 */this.data = reader;
		}

		public void start() {
			try {
				/* 2405 */this.output = this.data.readLine();
				/* 2406 */this.finished = true;
			} catch (IOException e) {
				/* 2409 */this.failed = true;
				/* 2410 */this.finished = false;
			}
		}

		public void interrupt() {
			/* 2415 */this.failed = true;
			/* 2416 */this.finished = false;
			/* 2417 */super.interrupt();
		}

		public boolean isFinished() {
			/* 2421 */return this.finished;
		}

		public boolean isFailed() {
			/* 2425 */return this.failed;
		}

		public BufferedReader getData() {
			/* 2429 */return this.data;
		}

		public void setData(BufferedReader data) {
			/* 2433 */this.data = data;
		}

		public String getOutput() {
			/* 2437 */return this.output;
		}

	}

	public class XMLAPIHandler {
		N1kv parentDVS;
		/* 1455 */String initial = "<?xml version=\"1.0\"?> <nc:hello xmlns:nc=\"urn:ietf:params:xml:ns:netconf:base:1.0\">  <nc:capabilities>     <nc:capability>urn:ietf:params:xml:ns:netconf:base:1.0</nc:capability>  </nc:capabilities>  </nc:hello>]]>]]> ";

		/* 1461 */String showBegin = "\n<?xml version=\"1.0\"?>\n<nc:rpc message-id=\"1\" xmlns:nc=\"urn:ietf:params:xml:ns:netconf:base:1.0\"\n xmlns=\"http://www.cisco.com/nxos:1.0:security_tree\">\n <nc:get>\n  <nc:filter type=\"subtree\">\n";

		/* 1467 */String showEnd = " </nc:filter>\n</nc:get>\n</nc:rpc>\n]]>]]>\r\n";

		/* 1469 */String showVersion = this.showBegin + "   <show>\n"
				+ "     <version/>\n" + " </show>\n" + this.showEnd;

		/* 1473 */String showSvsConn = this.showBegin + "   <show>\n"
				+ "     <svs>\n" + "       <connections/>\n" + "     </svs>\n"
				+ "   </show>\n" + this.showEnd;

		/* 1481 */String showRedStatus = this.showBegin + "   <show>\n"
				+ "       <redundancy>\n" + "\t\t       <status/>\n"
				+ "       </redundancy>\n" + "   </show>\n" + this.showEnd;

		/* 1489 */String showModule = this.showBegin + "   <show>\n"
				+ "     <module/>\n" + "   </show>\n" + this.showEnd;

		/* 1495 */String showModuleVem = this.showBegin + "   <show>\n"
				+ "     <module>\n" + "     \t<vem/>\n" + "     </module>\n"
				+ "   </show>\n" + this.showEnd;

		/* 1503 */String showMgmtipv6 = this.showBegin + "   <show>\n"
				+ "     <ipv6>\n" + "\t\t\t<interface>\n"
				+ "\t\t\t\t<intf-name>mgmt0</intf-name>\n"
				+ "\t\t\t</interface>\n" + "\t\t</ipv6>\n" + "   </show>\n"
				+ this.showEnd;

		/* 1513 */String showMgmtipv4 = this.showBegin + "   <show>\n"
				+ "     <ip>\n" + "\t\t\t<interface>\n"
				+ "\t\t\t\t<intf-name>mgmt0</intf-name>\n"
				+ "\t\t\t</interface>\n" + "\t\t</ip>\n" + "   </show>\n"
				+ this.showEnd;

		/* 1523 */String showSvsDomain = this.showBegin + "   <show>\n"
				+ "     <svs>\n" + "       <domain/>\n" + "     </svs>\n"
				+ "   </show>\n" + this.showEnd;

		/* 1531 */String showVlanAllPorts = this.showBegin + "   <show>\n"
				+ "     <vlan>\n" + "       <all-ports/>\n" + "     </vlan>\n"
				+ "   </show>\n" + this.showEnd;

		/* 1539 */String showPortProfileUsage = this.showBegin + "   <show>\n"
				+ "     <port-profile>\n" + "       <usage/>\n"
				+ "     </port-profile>\n" + "   </show>\n" + this.showEnd;

		/* 1547 */String showPortProfileByName = this.showBegin + "   <show>\n"
				+ "     <port-profile>\n" + "\t\t  <name>\n"
				+ "        <placeholder_tag>\n"
				+ "\t\t      <__XML__PARAM_value>PPNAME</__XML__PARAM_value>\n"
				+ "        </placeholder_tag>\n" + "\t\t  </name>\n"
				+ "     </port-profile>\n" + "   </show>\n" + this.showEnd;

		/* 1559 */String showPortProfileBrief = this.showBegin + "   <show>\n"
				+ "     <port-profile>\n" + "       <brief/>\n"
				+ "     </port-profile>\n" + "   </show>\n" + this.showEnd;

		/* 1567 */String confBegin = "<?xml version=\"1.0\"?><nf:rpc xmlns=\"http://www.cisco.com/nxos:1.0:vms\" xmlns:nf=\"urn:ietf:params:xml:ns:netconf:base:1.0\" message-id=\"110\"><nf:edit-config><nf:target><nf:running/></nf:target><nf:config><nxos:configure xmlns:nxos=\"http://www.cisco.com/nxos:1.0:vms\"><nxos:__XML__MODE__exec_configure>";

		/* 1577 */String confEnd = "</nxos:__XML__MODE__exec_configure></nxos:configure></nf:config></nf:edit-config></nf:rpc>]]>]]>";

		/* 1583 */String printBootflash = this.showBegin
				+ "<dir_type_Cmd_some_cmd>" + "<__XML__OPT_Cmd_some_cmd_uri0>"
				+ "<uri0>bootflash://</uri0>"
				+ "</__XML__OPT_Cmd_some_cmd_uri0>"
				+ "</dir_type_Cmd_some_cmd>" + this.showEnd;

		/* 1592 */String confSvsConn = this.confBegin
				+ "    <svs>"
				+ "      <connection>"
				+ "        <conn_name>"
				+ "         <__XML__PARAM_value>CONNAME</__XML__PARAM_value>"
				+ "          <__XML__MODE_svs-conn>"
				+ "          <protocol>"
				+ "             <vmware-vim />"
				+ "          </protocol>"
				+ "          <remote>"
				+ "          <__XML__BLK_Cmd_svs_remote_ip_address_ip>"
				+ "\t\t\t\tSVSCONNTYPE"
				+ "          </__XML__BLK_Cmd_svs_remote_ip_address_ip>"
				+ "          </remote>"
				+ "            <vmware>"
				+ "              <dvs>"
				+ "                <__XML__OPT_Cmd_svs_vmw_dvs_datacenter_name_uuid>"
				+ "                  <datacenter-name>"
				+ "                    <datacenter-name xml:space=\"preserve\">DCNAME</datacenter-name>"
				+ "                  </datacenter-name>"
				+ "                </__XML__OPT_Cmd_svs_vmw_dvs_datacenter_name_uuid>"
				+ "             </dvs>" + "            </vmware>"
				+ "\t\t\t<admin>" + "\t\t\t\t<__XML__BLK_Cmd_svs_user_user> "
				+ "\t\t\t\t<user>"
				+ "\t\t\t\t\t<user xml:space=\"preserve\">ADMIN</user>"
				+ "\t\t\t\t</user>" + "\t\t\t\t</__XML__BLK_Cmd_svs_user_user>"
				+ "\t\t\t</admin>\t" + "           <connect />"
				+ "          </__XML__MODE_svs-conn>" + "        </conn_name>"
				+ "      </connection>" + "    </svs>" + this.confEnd;

		/* 1630 */String confSvsConnIp = "           <ip>              <address>                <ipaddress>ADDR</ipaddress>              </address>            </ip>";

		/* 1637 */String confSvsConnHostname = "           <hostname>                <host_name>ADDR</host_name>           </hostname>";

		/* 1642 */String confIntf = this.confBegin + "<interface>"
				+ "\t<interface isKey=\"true\">NAME</interface>"
				+ "</interface>" + "<ip>" + "\t<address>"
				+ "\t\t<ipaddress>INET_ADDRESS</ipaddress>" + "\t</address>"
				+ "</ip>" + this.confEnd;

		/* 1653 */String confDefRoute = this.confBegin
				+ "<__XML__BLK_Cmd_ip_route_command_ip-addr>" + "\t<ip>"
				+ "   <route>" + "\t\t<ip-prefix>" + "\t\t\tPREFIX"
				+ "\t\t</ip-prefix>" + "\t\t<next-hop>" + "\t\t\tNEXTHOP"
				+ "\t\t</next-hop>" + "\t  </route>" + " </ip>"
				+ "</__XML__BLK_Cmd_ip_route_command_ip-addr>" + this.confEnd;

		/* 1668 */String confConnect = this.confBegin + "    <svs>"
				+ "      <connection>" + "        <conn_name>"
				+ "         <__XML__PARAM_value>CONNAME</__XML__PARAM_value>"
				+ "          <__XML__MODE_svs-conn>"
				+ "               <connect />"
				+ "          </__XML__MODE_svs-conn>" + "        </conn_name>"
				+ "      </connection>" + "    </svs>" + this.confEnd;

		/* 1681 */String confNoConnect = this.confBegin + "    <svs>"
				+ "      <connection>" + "        <conn_name>"
				+ "         <__XML__PARAM_value>CONNAME</__XML__PARAM_value>"
				+ "          <__XML__MODE_svs-conn>"
				+ "               <no><connect /></no>"
				+ "          </__XML__MODE_svs-conn>" + "        </conn_name>"
				+ "      </connection>" + "    </svs>" + this.confEnd;

		/* 1721 */String confSvsDomainL2 = this.confBegin + "     <svs-domain>"
				+ "      <__XML__MODE_svs-domain>" + "      <domain>"
				+ "      <id>" + "        <number>DOMAIN</number>"
				+ "      </id>" + "      </domain>" + "        <svs>"
				+ "          <mode>" + "            <L2 />"
				+ "          </mode>" + "        </svs>" + "      <control>"
				+ "      <vlan>" + "        <number>CTLVLAN</number>"
				+ "      </vlan>" + "      </control>" + "      <packet>"
				+ "      <vlan>" + "        <number>PKTVLAN</number>"
				+ "      </vlan>" + "      </packet>"
				+ "      </__XML__MODE_svs-domain>" + "    </svs-domain>"
				+ this.confEnd;

		/* 1748 */String confSvsDomainL3 = this.confBegin + "<svs-domain>"
				+ "<__XML__MODE_svs-domain>" + "<no>"
				+ "  <packet><vlan/></packet>" + "</no>" + "<no>"
				+ "  <control><vlan/></control>" + "</no>" + "<svs>"
				+ "  <mode>" + "    <L3>" + "     <interface>"
				+ "       <__XML__BLK_Cmd_svs_mode_interface_mgmt0>"
				+ "          <L3INTERFACE />"
				+ "       </__XML__BLK_Cmd_svs_mode_interface_mgmt0>"
				+ "      </interface>" + "    </L3>" + "  </mode>" + "</svs>"
				+ "</__XML__MODE_svs-domain>" + "</svs-domain>" + this.confEnd;

		/* 1772 */String confPortProfile = this.confBegin
				+ "    <port-profile>"
				+ "\t      <__XML__OPT_Cmd_ppm_create_profile_type>"
				+ "           <type><__XML__BLK_Cmd_ppm_create_profile_ethernet><TYPE/></__XML__BLK_Cmd_ppm_create_profile_ethernet>"
				+ "           </type>"
				+ "           <name>"
				+ "               <__XML__PARAM_value isKey=\"true\">PPF_NAME</__XML__PARAM_value><__XML__MODE_port-prof> "
				+ "  \t            <vmware> <port-group> <__XML__OPT_Cmd_ppm_port_group_pg_name>"
				+ "                    <pg_name>PPF_NAME</pg_name>"
				+ "                     </__XML__OPT_Cmd_ppm_port_group_pg_name></port-group>"
				+ "               </vmware>"
				+ "                SWITCH_PORT "
				+ "\t\t\t\t PPF_POLICY "
				+ "                <no> "
				+ "                  <shutdown /> "
				+ "                </no> "
				+ "                <system>"
				+ "                   <vlan>"
				+ "                      <priv_vlans>SYSTEM_VLAN_LIST</priv_vlans> "
				+ "                   </vlan> " + "                </system> "
				+ "                <state> "
				+ "                    <enabled /> "
				+ "                </state> " + "\t\t\t\tL3CAPABILITY "
				+ "               MAXPORTS " + "               MINPORTS "
				+ "\t\t\t\tPORTBINDINGAUTO "
				+ "          </__XML__MODE_port-prof>" + "        </name>"
				+ "      </__XML__OPT_Cmd_ppm_create_profile_type>"
				+ "     </port-profile> " + this.confEnd;

		/* 1806 */String confL3Capability = "<capability>\t<l3control /></capability>";

		/* 1811 */String confPortBindingAuto = "<port-binding>\t<static>\t\t<auto>\t\t\t<expand />\t\t</auto>\t</static></port-binding>";

		/* 1820 */String confPortProfileMaxPorts = "<__XML__OPT_Cmd_ppm_max_ports_vmware> \t<max-ports>\t\t<i0>\t\t\tMAX_PORTS \t\t</i0>\t</max-ports></__XML__OPT_Cmd_ppm_max_ports_vmware>";

		/* 1829 */String confPortProfileMinPorts = "<min-ports>\t<i0>\t\tMIN_PORTS \t</i0></min-ports>";

		/* 1836 */String confPortProfilePolicy = "           <channel-group>\t\t\t\t<auto>\t\t\t\t\t<mode>\t\t\t\t\t\t<on>\t\t\t\t\t\t\tMACPIN_OPTION\t\t\t\t\t\t</on>\t                </mode>\t\t\t\t</auto>            </channel-group>";

		/* 1847 */String confPortProfilePolicyMacPinning = "<mac-pinning />";

		/* 1849 */String confPortProfileswitchPortTrunkNativeVlan = "                  <trunk> \t\t\t\t\t<native> \t\t\t\t\t\t<vlan> \t\t\t\t\t\t\t<vlan-id-native>NATIVE_VLAN </vlan-id-native> \t\t\t\t\t\t</vlan> \t\t\t\t\t</native> \t\t\t\t\t</trunk> ";

		/* 1859 */String confPortProfileSwitchPortTrunk = "              <switchport>                  <mode>                      <port_mode>trunk</port_mode>                   </mode>                   <trunk>                            <allowed>                            <vlan>                               <__XML__BLK_Cmd_ppm_switchport_trunk_allowed_allow-vlans>                                <allow-vlans isKey=\"true\">VLAN_LIST</allow-vlans>                               </__XML__BLK_Cmd_ppm_switchport_trunk_allowed_allow-vlans>                            </vlan>                          </allowed>                  </trunk>\t\t\t\t\tNATIVE_VLAN_CONFIG                </switchport>";

		/* 1876 */String confPortProfileSwitchPortAccess = "              <switchport>                  <mode>                      <port_mode>access</port_mode>                   </mode>                   <access><vlan>                     <vlan-id-access>VLAN_LIST</vlan-id-access>                   </vlan></access>               </switchport>";

		/* 1886 */String confVlan = this.confBegin + "              <vlan>"
				+ "                  <number> "
				+ "                     VLAN_ID "
				+ "                  </number> " + "              </vlan>"
				+ this.confEnd;

		/* 1894 */String reload_mod = this.confBegin
				+ "<reload>"
				+ "\t<module>"
				+ "\t\t<module>"
				+ "\t\t\t<__XML__PARAM_value>MODULE_NUMBER</__XML__PARAM_value>"
				+ "\t\t</module>" + "\t</module>" + "</reload>" + this.confEnd;

		/* 1905 */String change_role = this.confBegin + "<system>"
				+ "\t<redundancy>" + "\t\t<role>"
				+ "\t\t\t<role>RED_ROLE</role>" + "\t\t</role>"
				+ "\t</redundancy>" + "</system>" + this.confEnd;

		/* 1915 */String install_auto = this.confBegin + "<install>"
				+ "\t<all>" + "    <__XML__BLK_Cmd_sf_install_kickstart>"
				+ "\t\t<__XML__OPT_Cmd_sf_install_kickstart>"
				+ "\t\t\t<__XML__ALL_og_Cmd_sf_install_kickstart>"
				+ "\t\t\t\tKICKSTART" + "\t\t\t\tSYSTEM"
				+ "\t\t\t</__XML__ALL_og_Cmd_sf_install_kickstart>"
				+ "\t\t</__XML__OPT_Cmd_sf_install_kickstart>"
				+ "    </__XML__BLK_Cmd_sf_install_kickstart>" + "\t</all>"
				+ "</install>" + this.confEnd;

		/* 1930 */String install_auto_kickstart = "\t\t<kickstart>\t\t\t<uri1>KICKSTART_PATH</uri1>\t\t</kickstart>";

		/* 1935 */String install_auto_system = "\t\t<system>   \t   <uri3>SYSTEM_PATH</uri3>\t\t</system>";

		/* 1940 */String showBootVars = this.showBegin + "<show>" + "\t<boot>"
				+ "\t\t<module>MODULENUM</module>" + "\t</boot>" + "</show>"
				+ this.showEnd;

		/* 1948 */String confNoBootVars = this.confBegin + "<no>" + "\t<boot>"
				+ "\t\t<system />" + "\t\t<kickstart />" + "\t</boot>"
				+ "</no>" + this.confEnd;

		/* 1963 */String confBootVars = this.confBegin + "<boot>"
				+ "\t<system>" + "\t\t<uri0>"
				+ "\t\t\t<__XML__PARAM_value>SYSTEMVAR</__XML__PARAM_value>"
				+ "\t\t\t<MODULENUM/>" + "\t\t</uri0>" + "\t</system>"
				+ "\t<kickstart>" + "\t\t<uri0>"
				+ "\t\t\t<__XML__PARAM_value>KICKSTARTVAR</__XML__PARAM_value>"
				+ "\t\t\t<MODULENUM/>" + "\t\t</uri0>" + "\t</kickstart>"
				+ "</boot>" + this.confEnd;

		/* 1980 */String confBootVarsAll = this.confBegin + "<boot>"
				+ "\t<system>" + "\t\t<uri0>"
				+ "\t\t\t<__XML__PARAM_value>SYSTEMVAR</__XML__PARAM_value>"
				+ "\t\t</uri0>" + "\t</system>" + "\t<kickstart>"
				+ "\t\t<uri0>"
				+ "\t\t\t<__XML__PARAM_value>KICKSTARTVAR</__XML__PARAM_value>"
				+ "\t\t</uri0>" + "\t</kickstart>" + "</boot>" + this.confEnd;

		/* 1995 */String confSvsUpgrade = this.confBegin
				+ "<svs>"
				+ "\t<upgrade>"
				+ "\t\t<start>"
				+ "\t\t\t<mgmt0>"
				+ "\t\t\t\t<__XML__BLK_Cmd_config_svs_upgrade_start_ip>"
				+ "\t\t\t\t\t<__XML__ALL_bg_Cmd_config_svs_upgrade_start_ip>"
				+ "\t\t\t\t\t\tMGMT4"
				+ "\t\t\t\t\t\tMGMT6"
				+ "\t\t\t\t\t</__XML__ALL_bg_Cmd_config_svs_upgrade_start_ip>"
				+ "\t\t\t\t\t<__XML__OPT_Cmd_config_svs_upgrade_start_control0>"
				+ "\t\t\t\t\t\t\tL3"
				+ "\t\t\t\t\t</__XML__OPT_Cmd_config_svs_upgrade_start_control0>"
				+ "\t\t\t\t</__XML__BLK_Cmd_config_svs_upgrade_start_ip>"
				+ "\t\t\t</mgmt0>" + "\t\t</start>" + "\t</upgrade>" + "</svs>"
				+ this.confEnd;

		/* 2015 */String confSvsUpgradeComplete = this.confBegin + "<svs>"
				+ "\t<upgrade>" + "\t\t<complete/>" + "\t</upgrade>" + "</svs>"
				+ this.confEnd;

		/* 2023 */String confSvsUpgradeMgmt4 = "\t<ip>\t\t<ipaddress>MGMTIPV4</ipaddress>\t</ip>";

		/* 2028 */String confSvsUpgradeMgmt6 = "\t<ipv6>\t\t<ipv6address>MGMTIPV6</ipv6address>\t</ipv6>";

		/* 2033 */String confSvsUpgradeL3 = "<control0>\t<ip>\t\t<ipaddr>CONTROLIPV4</ipaddr>\t</ip></control0>";

		/* 2040 */String confPass = this.confBegin
				+ "<no><password><strength-check/></password></no>"
				+ "<username>" + "\t<s0>"
				+ "     <__XML__PARAM_value>THEADMIN</__XML__PARAM_value>"
				+ "<password><s4>THEPASS</s4></password>" + "</s0>"
				+ "</username>" + "<password><strength-check/></password>"
				+ this.confEnd;

		String showAllInterface = this.showBegin + "   <show>\n"
				+ "     <interface/>\n" + " </show>\n" + this.showEnd;

		String showAllVLAN = this.showBegin + "   <show>\n" + "     <vlan/>\n"
				+ " </show>\n" + this.showEnd;

		/* 2052 */Connection conn = null;
		/* 2053 */Session sess = null;

		public XMLAPIHandler() {
		}

		public void setParentDVS(N1kv parentDVS) {
			/* 2067 */this.parentDVS = parentDVS;
		}

		public void close() {
			/* 2071 */if (this.conn != null) {
				try {
					/* 2073 */if (this.sess != null)
						/* 2074 */this.sess.close();
					/* 2075 */this.conn.close();
				} catch (Exception e) {
					/* 2077 */e.printStackTrace();
				}
			}
			/* 2081 */this.conn = null;
		}

		public void getXMLAgentSession() {
			try {
				/* 2087 */this.conn = new Connection(
						this.parentDVS.getIpAddress());
				/* 2088 */boolean flag = false;
				/* 2089 */int count = 1;
				do
					try {
						/* 2092 */this.conn.connect();
						/* 2093 */flag = true;
					} catch (Exception e) {
						/* 2096 */N1kv.N1KVLogger
								.info("Waiting to SSH, ignore timeout exception. #"
										+ count);
						/* 2097 */count++;
						/* 2098 */if (count > 15)
							/* 2099 */throw new IOException(
									"Could not contact given IP: "
											+ this.parentDVS.getIpAddress());
						/* 2100 */Thread.currentThread();
						Thread.sleep(1000L);
					}
				/* 2102 */while (!flag);

				/* 2104 */boolean isAuthenticated = this.conn
						.authenticateWithPassword(this.parentDVS.getUsername(),
								this.parentDVS.getPassword());

				/* 2107 */if (!isAuthenticated) {
					/* 2108 */throw new IOException("Authentication failed.");
				}
				/* 2110 */if (this.conn != null) {
					/* 2111 */if (this.sess != null)
						/* 2112 */this.sess.close();
					/* 2113 */this.sess = this.conn.openSession();
					/* 2114 */this.sess.startSubSystem("xmlagent");
				}
			} catch (IOException e) {
				/* 2118 */N1kv.N1KVLogger
						.severe("SSH I/O Exception. Tried 15 times.");
			} catch (Exception e) {
				/* 2121 */e.printStackTrace();
			}
		}

		public String copyRunningStartup() {
			/* 2200 */String message = "<?xml version=\"1.0\"?> <nf:rpc message-id=\"2\" xmlns:nf=\"urn:ietf:params:xml:ns:netconf:base:1.0\" xmlns=\"http://www.cisco.com/nxos:1.0\"> <exec-command> <copy><running><startup/></running></copy> </exec-command> </nf:rpc>]]>]]>";

			/* 2202 */return message;
		}

		public String copyRestoreConfig() {
			/* 2206 */String message = "<?xml version=\"1.0\"?> <nf:rpc message-id=\"2\" xmlns:nf=\"urn:ietf:params:xml:ns:netconf:base:1.0\" xmlns=\"http://www.cisco.com/nxos:1.0\"> <exec-command> <copy><src_local><__XML__PARAM_value>FILENAME</__XML__PARAM_value><running/></src_local></copy> </exec-command> </nf:rpc>]]>]]>";

			/* 2208 */return message;
		}

		public boolean getStartupConfig() throws IOException {
			/* 2213 */Connection conn = new Connection(
					this.parentDVS.getIpAddress());

			/* 2215 */conn.connect();

			/* 2217 */boolean isAuthenticated = conn.authenticateWithPassword(
					this.parentDVS.getUsername(), this.parentDVS.getPassword());
			/* 2218 */if (!isAuthenticated) {
				/* 2219 */throw new IOException("Authentication failed.");
			}
			/* 2221 */Session sess = conn.openSession();
			/* 2222 */sess.execCommand("show startup-config");
			/* 2223 */InputStream stdout = new StreamGobbler(sess.getStdout());
			/* 2224 */BufferedReader stdoutReader = new BufferedReader(
					new InputStreamReader(stdout));

			/* 2226 */String flushBuffer = new String();
			while (true) {
				/* 2229 */String line = stdoutReader.readLine();
				/* 2230 */if (line == null)
					break;
				/* 2232 */flushBuffer = flushBuffer + line + '\n';
			}

			/* 2236 */sess.close();

			/* 2238 */conn.close();
			/* 2239 */if (flushBuffer.contains("switchname")) {
				/* 2240 */return true;
			}

			/* 2243 */return false;
		}

		public String getEscapedString(String rawString) {
			/* 2289 */rawString = rawString.replaceAll("&", "&amp;");
			/* 2290 */rawString = rawString.replaceAll("<", "&lt;");
			/* 2291 */rawString = rawString.replaceAll(">", "&gt;");
			/* 2292 */rawString = rawString.replaceAll("\"", "&quot;");
			/* 2293 */rawString = rawString.replaceAll("'", "&apos;");

			/* 2296 */String cleanDc = new String();
			/* 2297 */for (int i = 0; i < rawString.length(); i++) {
				/* 2298 */if (rawString.charAt(i) == '$') {
					/* 2299 */cleanDc = cleanDc + "\\" + rawString.charAt(i);
				}
				/* 2301 */else if (rawString.charAt(i) == '\\') {
					/* 2302 */cleanDc = cleanDc + "\\" + rawString.charAt(i);
				} else {
					/* 2305 */cleanDc = cleanDc + rawString.charAt(i);
				}
			}
			/* 2308 */return rawString;
		}

		public String getInterfaceXml(String intfName, String ip) {
			/* 2312 */String intfConf = this.confIntf;
			/* 2313 */intfConf = intfConf.replaceFirst("NAME", intfName);
			/* 2314 */intfConf = intfConf.replaceFirst("INET_ADDRESS", ip);
			/* 2315 */N1kv.N1KVLogger.info("INTFCONF:" + intfConf);
			/* 2316 */return intfConf;
		}

		public String getShowSvsConnectionXml() {
			/* 2320 */return this.showSvsConn;
		}

		public String readMessage(BufferedReader reader) throws Exception {
			/* 2326 */StringBuilder response = new StringBuilder();
			/* 2327 */boolean appendToResponse = false;
			while (true) {
				/* 2329 */N1kv.TimeoutReader thread = new N1kv.TimeoutReader(
						reader);
				/* 2330 */thread.start();
				/* 2331 */boolean interrupt = false;
				/* 2332 */int count = 0;
				/* 2333 */while ((!interrupt) && (!thread.isFinished())) {
					try {
						/* 2335 */Thread.currentThread();
						Thread.sleep(1000L);
					} catch (Exception e) {
					}
					/* 2340 */if ((thread.isFinished()) || (thread.isFailed()))
						break;
					/* 2342 */if (count > 45) {
						/* 2343 */interrupt = true;
					} else {
						/* 2346 */count++;
					}
				}
				/* 2349 */if (interrupt) {
					/* 2350 */thread.interrupt();
					/* 2351 */throw new IllegalStateException(
							"Buffered Reader Timeout");
				}
				/* 2353 */String line = null;
				/* 2354 */if (thread.isFinished()) {
					/* 2355 */line = thread.getOutput();
				}
				/* 2357 */if (line == null)
					break;
				/* 2359 */if ((line.startsWith("<?xml"))
						|| ((line.indexOf("]]>]]>") != -1) && (line
								.substring(line.indexOf("]]>]]>") + 6)
								.startsWith("<?xml")))) {
					/* 2362 */appendToResponse = true;
				}
				/* 2364 */if (appendToResponse == true)
					/* 2365 */if (line.indexOf("]]>]]>") != -1) {
						/* 2366 */response.append(line.substring(line
								.indexOf("]]>]]>") + 6) + "\r\n");
					} else {
						/* 2370 */response.append(line + "\r\n");
					}
				/* 2372 */if ((line.indexOf("rpc-reply>") >= 0)
						|| (line.indexOf("</hello>") >= 0)) {
					break;
				}
			}
			/* 2377 */N1kv.N1KVLogger.info(" Response:" + response.toString());
			/* 2378 */return response.toString();
		}

		public void writeMessage(String msg, PrintWriter writer)
				throws IOException {
			/* 2384 */writer.println(msg);
			/* 2385 */writer.flush();
		}

	}

}
