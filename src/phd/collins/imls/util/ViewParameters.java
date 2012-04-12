package phd.collins.imls.util;

import java.io.Serializable;
import java.util.HashMap;

public class ViewParameters implements Serializable {
	private static final long serialVersionUID = 9014342727689084678L;
	
	private HashMap<String, Object> _viewParameters = new HashMap<String, Object>();
	
	public ViewParameters(){
		//
	}
	
	public boolean getBooleanParameter(String pKey){
		Object pVal = getParameter(pKey);
		boolean pBoolVal = (pVal == null) ? null : Boolean.valueOf( pVal.toString() );
		return pBoolVal;
	}
	
	public Object getParameter(String pKey){
		return (_viewParameters.containsKey(pKey)) ? _viewParameters.get(pKey) : null;
	}
	
	public void setParameter(String pKey, Object pVal){
		_viewParameters.put(pKey, pVal);
	}
	
	public String getAllParameterKeys(){
		return _viewParameters.keySet().toString();
	}
	
}
