package b;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class User {

	/**
	 * 第一类:byte short int long double float boolean char String
	 */
	private int id;
	private String name;
	
	/**
	 * 第二类 list
	 */
	private List<String>list;
	
	/**
	 * 第三类 map
	 */
	private Map< String, Object>map;
	
	/**
	 * 第四类 properties
	 */
	private Properties prop;
	
	public User() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", list=" + list + ", map=" + map + ", prop=" + prop + "]";
	}
	
	
	
}
