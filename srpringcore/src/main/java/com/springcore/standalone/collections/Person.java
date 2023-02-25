package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

class Person{
	private List<String> friends;
	private Map<String, Integer> feestucture;
	private Set<String> food;
	private Properties properties;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	public Map<String, Integer> getFeestucture() {
		return feestucture;
	}

	public void setFeestucture(Map<String, Integer> feestucture) {
		this.feestucture = feestucture;
	}
	
	public Set<String> getFood() {
		return food;
	}

	public void setFood(Set<String> food) {
		this.food = food;
	}
	
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}