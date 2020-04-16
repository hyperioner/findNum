package findNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Num {
	/* Variables */
	Integer _StaticValue;
	Integer _MinNumber;
	Map<Integer, Integer> _NumMap;
	
	/* Create */
	public Num()
	{
		this._StaticValue = 0;
		this._MinNumber = 0;		
		this._NumMap = new HashMap<Integer, Integer>();				
	}	
	
	public Integer get_StaticValue() {
		return _StaticValue;
	}

	public void set_StaticValue(Integer _StaticValue) {
		this._StaticValue = _StaticValue;
	}

	public Integer get_MinNumber() {
		return _MinNumber;
	}

	public void set_MinNumber(Integer _MinNumber) {
		this._MinNumber = _MinNumber;
	}

	public Map<Integer, Integer> get_NumMap() {
		return _NumMap;
	}

	public void set_NumMap(Map<Integer, Integer> _NumMap) {
		this._NumMap = _NumMap;
	}
	
	public void setNumber(Integer iKey, Integer iValue)
	{
		if(!this._NumMap.containsKey(iKey))	return;
		
		this._NumMap.put(iKey, iValue);
	}
	
	public void setIncreateNumber(Integer iKey)
	{
		if(!this._NumMap.containsKey(iKey))	return;
		
		Integer iValue = this._NumMap.get(iKey);
		
		this._NumMap.put(iKey, iValue + 1);		
	}
	

	
	/* Methods */
	public void calcValue()
	{
		
		Integer iMinValue = (Integer) Collections.min(this._NumMap.values());
		
		this._MinNumber = iMinValue;
		
		Integer iSumProduct = 0;
		for(Integer iValue : this._NumMap.values())
		{			
			Integer iProductValue = iValue - iMinValue;
			
			//System.out.println("Value : " + iValue + " Product Value : " + iProductValue);
			//System.out.println(iProductValue);
			
			if(iProductValue == 0)
				iProductValue = 0;
			else
				iProductValue = iProductValue * iProductValue;
			
			
			iSumProduct = iSumProduct + iProductValue;			
		}
		
		this._StaticValue = iSumProduct;
	}
	
	
}
