package findNum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LtCase {

	List<Integer> _NumList;
	Map<Integer, Integer> _NumMap;
	Num _Num;
	
	
	public LtCase(ArrayList<Integer> oNumberList, HashMap<Integer, Integer> oNumMap)
	{
		this._NumList = oNumberList;
		this._NumMap = oNumMap;
		
		this._Num = new Num();		
		this._Num.set_NumMap(oNumMap);		
	}
	
	
	public void calculate()
	{
		// System.out.println(this._Num.get_NumMap().toString());
		
		for(Integer iValue : this._NumList)
		{
			this._Num.setIncreateNumber(iValue);
		}
		
		// System.out.println(this._Num.get_NumMap().toString());
		
		this._Num.calcValue();		
	}
	
	public String getInsertSQL()
	{
		String strResult = "";
		
		StringBuilder strInsert = new StringBuilder();
		
		strInsert.append("INSERT INTO LTNUM.NUM_RESULT     ");
		strInsert.append("(     ");
		strInsert.append("STATIC_NUM     ");
		strInsert.append(", MIN_NUM     ");
		strInsert.append(", NUMVALUE_1     ");
		strInsert.append(", NUMVALUE_2     ");
		strInsert.append(", NUMVALUE_3     ");
		strInsert.append(", NUMVALUE_4     ");
		strInsert.append(", NUMVALUE_5     ");
		strInsert.append(", NUMVALUE_6     ");
		strInsert.append(") VALUES (     ");
		strInsert.append("'" + this._Num.get_StaticValue().toString() + "'     ");
		strInsert.append(", '" + this._Num.get_MinNumber().toString() + "'     ");
		
		for(int i = 0; i < 6; i++)
		{
			strInsert.append(", '" + this._NumList.get(i) + "'     ");
		}		
		
		strInsert.append(");     ");
		
		strResult = strInsert.toString();
		
		return strResult;
	}
}
