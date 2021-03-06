package jdepend.util.analyzer.framework;

import jdepend.framework.ui.graph.GraphData;
import jdepend.framework.ui.graph.TableCallBack;
import jdepend.framework.ui.graph.TableData;
import jdepend.metadata.tree.Node;

public interface AnalyzerWorker {

	public String getInfo();

	public void setInfo(String info);

	public TableData getTableData();

	public void setTableData(String key, Object value);

	public void addTableCallBack(TableCallBack callBack);

	public void setAnalyzer(Analyzer analyzer);

	public void isPrintTab(boolean tab);

	public void setTree(Node root);

	public Node getTree();

	public void setGraphData(GraphData graph);

	public GraphData getGraphData();
}
