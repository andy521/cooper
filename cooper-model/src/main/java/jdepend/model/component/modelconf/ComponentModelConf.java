package jdepend.model.component.modelconf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import jdepend.framework.exception.JDependException;

/**
 * 组件模型配置信息类
 * 
 * @author <b>Abner</b>
 * 
 */
public abstract class ComponentModelConf<T extends ComponentConf> implements Serializable, Cloneable {

	private String name;

	private List<T> componentConfs = new ArrayList<T>();

	private List<String> ignoreItems = new ArrayList<String>();

	public final static String ComponentModelType_Package = "package";
	public final static String ComponentModelType_Class = "class";

	public ComponentModelConf() {

	}

	public ComponentModelConf(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void addComponentConf(String name, int layer, List<String> packageNames) throws JDependException;

	protected void addComponentConf(T componentConf) {
		if (!componentConfs.contains(componentConf)) {
			componentConfs.add(componentConf);
		}
	}

	/**
	 * 删除一个组件配置
	 * 
	 * @param name
	 */
	public void deleteComponentConf(String name) {
		T componentConf = this.getTheComponentConf(name);
		if (componentConf != null) {
			componentConfs.remove(componentConf);
		}
	}

	public boolean contains(String name) {
		return this.getTheComponentConf(name) == null ? false : true;
	}

	public int size() {
		return componentConfs.size();
	}

	/**
	 * 得到组件列表名称
	 * 
	 * @return
	 */
	public List<String> getComponentConfNames() {

		List<String> names = new ArrayList<String>();

		for (T componentConf : componentConfs) {
			names.add(componentConf.getName());
		}

		return names;
	}

	/**
	 * 得到指定组件配置信息
	 * 
	 * @param name
	 * @return
	 */
	public T getTheComponentConf(String name) {

		for (T componentConf : componentConfs) {
			if (componentConf.getName().equals(name)) {
				return componentConf;
			}
		}
		return null;
	}

	public List<T> getComponentConfs() {
		return this.componentConfs;
	}

	/**
	 * 得到在创建该组件模型时未被包含的javaPackages
	 * 
	 * @return
	 */
	public List<String> getIgnoreItems() {
		return ignoreItems;
	}

	public void setIgnoreItems(List<String> ignoreItems) {
		this.ignoreItems = ignoreItems;
	}

	protected void addIgnoreItem(String ignoreItem) {
		if (!this.ignoreItems.contains(ignoreItem)) {
			this.ignoreItems.add(ignoreItem);
		}
	}

	/**
	 * 得到该组件模型包含的javaPackages
	 * 
	 * @return
	 */
	public Collection<String> getContainItems() {
		Collection<String> containItems = new HashSet<String>();
		for (ComponentConf componentConf : this.getComponentConfs()) {
			for (String itemName : componentConf.getItemNames()) {
				containItems.add(itemName);
			}
		}
		return containItems;
	}

	public void validateData() throws JDependException {
		if (this.size() == 0) {
			throw new JDependException("您没有设置组件!");
		}
		if (this.getName() == null || this.getName().length() == 0) {
			throw new JDependException("未指定组件组名称!");
		}
	}

	public abstract ComponentModelConf<T> clone() throws CloneNotSupportedException;

	public abstract Element save(Document document);

	public abstract ComponentModelConf<T> load(Node componentModel) throws JDependException;

	@Override
	public String toString() {
		StringBuilder content = new StringBuilder();
		content.append("组件模型名称：");
		content.append(this.name);
		content.append("\n");

		for (ComponentConf conf : this.componentConfs) {
			content.append(conf);
		}

		return content.toString();
	}
}
