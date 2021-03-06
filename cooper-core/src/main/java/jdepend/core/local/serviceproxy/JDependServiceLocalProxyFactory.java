package jdepend.core.local.serviceproxy;

import jdepend.core.framework.serviceproxy.JDependServiceProxy;
import jdepend.core.framework.serviceproxy.JDependServiceProxyFactory;

/**
 * 后台服务代理工厂
 * 
 * @author <b>Abner</b>
 * 
 */
public class JDependServiceLocalProxyFactory implements JDependServiceProxyFactory {

	public JDependServiceProxy createJDependServiceProxy(String groupName, String commandName) {
		return new JDependServiceLocalProxy(groupName, commandName);
	}
}
