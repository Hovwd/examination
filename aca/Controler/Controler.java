package Controler;

import Model.User;

public class Controler {
	
	private User onlineUser;
private static Controler controler;
private Controler()
{
}
public static Controler getInstance()
{
	if(controler==null)
	{
		controler=new Controler();
	}
	return controler;
	}
public void start(){
	while(true)
	{
		if(onlineUser==null)
		{
			//switch
		}
		else 
		{
			//command 
		}
	}
}
}
