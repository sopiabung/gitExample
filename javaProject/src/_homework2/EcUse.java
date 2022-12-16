package _homework2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch14.ProdEx;
public class EcUse {
	//cardNo : 5~8 자리 별표처리 //ch13_StrMethod
	//pay : 3자리마다 ,구분 //ch13_FormatEX
	static void print(Map<String, Object> map) {
		ArrayList<EC> l2=(ArrayList<EC>)map.get("list");
		EC.info(); // 양식 출력
		//내용 출력
		for(EC e : l2) {
			System.out.println(e.getNo()+"\t"+e.getOrderDate()+"\t"
					+e.getProduct()+"\t"+e.getCardName()+"\t"+e.getCardNo()+"\t"
					+e.getPay());
		}
		System.out.println("-------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		Map<String, Object> m = new HashMap<>();
		List<EC> l = new ArrayList<>();
		l.add(new EC(1234, "2022-08-24", "하이트맥주", "삼성", "37918000068", 55900));
		l.add(new EC(2345, "2022-09-11", "꼬깔콘", "롯데", "35691000045", 23600));
		l.add(new EC(3456, "2022-10-29", "노트북", "현대", "36160111182", 2600000));

		m.put("list", l); //map에 list 넣기
		print(m); //전체 내용 출력
	}
}
/*
 -------------------------------------------------------------------
주문번호  주문일자      주문상품     카드명    카드번호          결제금액
--------------------------------------------------------------------
1234       2022-08-24   하이트맥주   삼성      37918****68     55,900
2345       2022-09-11   꼬깔콘     롯데      35691****45      23,600
3456       2022-10-29   노트북     현대      36160****82      2,600,000
--------------------------------------------------------------------
 */

