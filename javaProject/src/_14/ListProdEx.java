package _14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProdEx {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		List<ProdEx> list = new ArrayList<>();

		list.add(new ProdEx("여누", "2014", "한빛", 3000, 55));
		list.add(new ProdEx("지혀니", "2017", "영빈", 12000, 65));
		list.add(new ProdEx("승우", "2017", "길벗", 10000, 50));

		map.put("l", list);
		print(map);
	}

	static void print(Map<String, Object> map) {
		ArrayList<ProdEx> list2 = (ArrayList<ProdEx>)map.get("l");
		System.out.println("제품명\t제품코드\t제조사\t단가\t수량\t판매금액");
		for(ProdEx p : list2) {
			System.out.println(p.getName()+"\t"+p.getNum()+"\t"+p.getCompany()+"\t"+p.getPrice()+"\t"+p.getAmount()+"\t"+p.getMoney());
		}
	}
}
