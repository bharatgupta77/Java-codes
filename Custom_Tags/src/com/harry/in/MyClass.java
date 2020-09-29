package com.harry.in;


import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyClass extends TagSupport {
	private String data;
	private Integer a=0;
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut(); // THIS WILL PRINT OUTPUT ON JSP PAGE
		a=Factorial.display(Integer.parseInt(data));
		try {
			out.println("hello this is from custom tag....:"+this.a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doStartTag();
	}

}