package findNum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> oNumMap = new HashMap<Integer, Integer>();
		oNumMap.clear();
		oNumMap.put(1, 127);
		oNumMap.put(2, 119);
		oNumMap.put(3, 118);
		oNumMap.put(4, 123);
		oNumMap.put(5, 125);
		oNumMap.put(6, 113);
		oNumMap.put(7, 120);
		oNumMap.put(8, 123);
		oNumMap.put(9, 93);
		oNumMap.put(10, 125);
		oNumMap.put(11, 122);
		oNumMap.put(12, 129);
		oNumMap.put(13, 127);
		oNumMap.put(14, 128);
		oNumMap.put(15, 122);
		oNumMap.put(16, 117);
		oNumMap.put(17, 131);
		oNumMap.put(18, 131);
		oNumMap.put(19, 127);
		oNumMap.put(20, 128);
		oNumMap.put(21, 119);
		oNumMap.put(22, 99);
		oNumMap.put(23, 107);
		oNumMap.put(24, 119);
		oNumMap.put(25, 118);
		oNumMap.put(26, 124);
		oNumMap.put(27, 132);
		oNumMap.put(28, 114);
		oNumMap.put(29, 109);
		oNumMap.put(30, 110);
		oNumMap.put(31, 123);
		oNumMap.put(32, 105);
		oNumMap.put(33, 126);
		oNumMap.put(34, 142);
		oNumMap.put(35, 110);
		oNumMap.put(36, 119);
		oNumMap.put(37, 125);
		oNumMap.put(38, 120);
		oNumMap.put(39, 130);
		oNumMap.put(40, 131);
		oNumMap.put(41, 110);
		oNumMap.put(42, 116);
		oNumMap.put(43, 133);
		oNumMap.put(44, 117);
		oNumMap.put(45, 130);
				
		DBController oCon = new DBController();
		
		oCon.connect();			
		oCon.clearData();

		ArrayList<Integer> oList = new ArrayList<Integer>();
		
		//for(int i1=1; i1 <= 45; i1++){
		int i1 = 2;
			for(int i2= i1 + 1; i2 <= 45; i2++){
				System.out.println("F : " + i1 + " Step 2 : " + i2 + " / 45 ");
				for(int i3= i2 + 1; i3 <= 45; i3++){
					for(int i4= i3 + 1; i4 <= 45; i4++){
						for(int i5= i4 + 1; i5 <= 45; i5++){
							for(int i6= i5 + 1; i6 <= 45; i6++){
								oList.clear();
								oList.add(i1);
								oList.add(i2);
								oList.add(i3);
								oList.add(i4);
								oList.add(i5);
								oList.add(i6);
								
								/*
								oList.clear();
								oList.add(1);
								oList.add(22);
								oList.add(23);
								oList.add(24);
								oList.add(25);
								oList.add(26);
								*/
								
								try {
								HashMap<Integer, Integer> oCloneMap = (HashMap<Integer, Integer>)oNumMap.clone();								
								LtCase oCase = new LtCase(oList, oCloneMap);								
								oCase.calculate();
								String strValue = oCase.getInsertSQL();
								// System.out.println(strValue);
								oCon.insertData(strValue);	
								}catch(Exception e) {
									System.out.println(e.toString());
									e.printStackTrace();
								}								
							}
						}						
					}
				}
			}
		//}
		
	}
	
	public void Check()
	{
		// TODO Auto-generated method stub
		
				HashMap<Integer, Integer> oNumMap = new HashMap<Integer, Integer>();
				oNumMap.clear();
				oNumMap.put(1, 153);
				oNumMap.put(2, 145);
				oNumMap.put(3, 141);
				oNumMap.put(4, 149);
				oNumMap.put(5, 140);
				oNumMap.put(6, 139);
				oNumMap.put(7, 141);
				oNumMap.put(8, 141);
				oNumMap.put(9, 114);
				oNumMap.put(10, 146);
				oNumMap.put(11, 142);
				oNumMap.put(12, 151);
				oNumMap.put(13, 152);
				oNumMap.put(14, 145);
				oNumMap.put(15, 138);
				oNumMap.put(16, 141);
				oNumMap.put(17, 155);
				oNumMap.put(18, 145);
				oNumMap.put(19, 144);
				oNumMap.put(20, 150);
				oNumMap.put(21, 140);
				oNumMap.put(22, 113);
				oNumMap.put(23, 124);
				oNumMap.put(24, 142);
				oNumMap.put(25, 135);
				oNumMap.put(26, 145);
				oNumMap.put(27, 156);
				oNumMap.put(28, 128);
				oNumMap.put(29, 121);
				oNumMap.put(30, 134);
				oNumMap.put(31, 144);
				oNumMap.put(32, 127);
				oNumMap.put(33, 150);
				oNumMap.put(34, 157);
				oNumMap.put(35, 132);
				oNumMap.put(36, 136);
				oNumMap.put(37, 143);
				oNumMap.put(38, 144);
				oNumMap.put(39, 149);
				oNumMap.put(40, 146);
				oNumMap.put(41, 124);
				oNumMap.put(42, 136);
				oNumMap.put(43, 165);
				oNumMap.put(44, 134);
				oNumMap.put(45, 145);

				ArrayList<Integer> oList = new ArrayList<Integer>();
				oList.add(1);
				oList.add(2);
				oList.add(3);
				oList.add(4);
				oList.add(5);
				oList.add(6);
				
				LtCase oCase = new LtCase(oList, oNumMap);
				
				oCase.calculate();
				
				String strValue = oCase.getInsertSQL();
				
				System.out.println(strValue);		
	}

}
