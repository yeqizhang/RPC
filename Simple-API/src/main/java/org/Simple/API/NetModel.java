package org.Simple.API;

import java.io.Serializable;

public class NetModel implements Serializable{
	

	private static final long serialVersionUID = 1L;

	private String className;
	
	private String method;
	
	private  Object[] args ;
	
	private String type;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
