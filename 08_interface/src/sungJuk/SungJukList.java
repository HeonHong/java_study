package sungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getNo()+"\t"+
					list.get(i).getName()+"\t"+
					list.get(i).getKor()+"\t"+
					list.get(i).getEng()+"\t"+
					list.get(i).getMath()+"\t"+
					list.get(i).getTot()+"\t"+
					list.get(i).getAvg()+"\t");
		}
		System.out.println();
		/*
		for(SungJukDTO sungJukDTO:list) {
			System.out.println(sungJukDTO.getNo()+"\t"+
					sungJukDTO.getName()+"\t"+
					sungJukDTO.getKor()+"\t"+
					sungJukDTO.getEng()+"\t"+
					sungJukDTO.getMath()+"\t"+
					sungJukDTO.getTot()+"\t"+
					sungJukDTO.getAvg()+"\t");
		}
		*/
		/*
		for(SungJukDTO sungJukDTO:list) {
			System.out.println(sungJukDTO);
		}//DTO에 함수 존재!!!!!
	*/
	}

	
		
}
	

