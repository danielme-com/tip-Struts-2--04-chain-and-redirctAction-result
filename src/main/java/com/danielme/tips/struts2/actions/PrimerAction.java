package com.danielme.tips.struts2.actions;


import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author danielme.com
 *
 */
public class PrimerAction extends ActionSupport 
{	

	private static final long serialVersionUID = 1L;
	
	private String campo1;
	
	private String campo2;	
	
	private String boton;
	
	public String execute()
	{
		return SUCCESS;
	}

	
	public String redirectAction() 
	{     	
		return "redirect";
    }
	
	public String chain() 
	{ 	
		return "chain";
    }


	public String getCampo1()
	{
		return campo1;
	}

	public void setCampo1(String campo1)
	{
		this.campo1 = campo1;
	}

	public String getCampo2()
	{
		return campo2;
	}

	public void setCampo2(String campo2)
	{
		this.campo2 = campo2;
	}


	public String getBoton()
	{
		return boton;
	}


	public void setBoton(String boton)
	{
		this.boton = boton;
	}    

}
