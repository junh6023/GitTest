package ee.ee.ee;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ServerInfo implements InitializingBean,DisposableBean{

	private String ipNum;
	private String portNum;
	
	
	public String getIpNum() {
		return ipNum;
	}
	public void setIpNum(String ipNum) {
		this.ipNum = ipNum;
	}
	public String getPortNum() {
		return portNum;
	}
	public void setPortNum(String portNum) {
		this.portNum = portNum;
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
