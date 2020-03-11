package com.hussain.designpattern.design;
import com.hussain.designpattern.AdapterPattern.*;
import com.hussain.designpattern.BridgePattern.*;
import com.hussain.designpattern.CommandPattern.*;
import com.hussain.designpattern.PrototypePattern.*;
import com.hussain.designpattern.TemplatePattern.*;
import com.hussain.designpattern.SingletonPattern.*;

public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
        DriverAdapter ap = new DriverAdapter();
        DriverBridge bp = new DriverBridge();
        DriverCommand cp = new DriverCommand();
        DriverPrototype ip = new DriverPrototype();
        DriverSingleton fp = new DriverSingleton();
        DriverTemplate afp = new DriverTemplate();
        
    }
}