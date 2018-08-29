import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

//		// 1,
//		int total = 0;
//		for (int i = 0;i < 1000;i++) {
//			if (i % 5 == 0) {
//				total = total + i;
//			}else if(i % 3 == 0) {
//				total = total + i;
//			}
//		}
//		System.out.println("合計は" + total + "です");
//		
//		// 2,
//		int max = 4000000;
//		Long total2 = new Long(0) ;
//		Map<Long, Long> numMap = new HashMap<>();
//		for (Long i = new Long(1); i <= max; i++) {
//			if (i == 1 || i == 2) {
//				numMap.put(i, i);
//			} else {
//				Long fNum = numMap.get(i-1) + numMap.get(i-2);
//				numMap.put(i, fNum);
//			}
//		}
//		for (Entry<Long, Long> entry :numMap.entrySet()) {
//			total2 = total2 + entry.getValue();
//		}
//		System.out.println("合計は" + total2);
		
		// 3,
//		double sqrt = Math.sqrt(600851475143l);
//		// 小数切り捨て
//		long longSqrt = (long) Math.floor(sqrt);
//		// 素因数入れる箱
//		List<Long> sosuList = new ArrayList<>();
//		long sosu = 0;
//		for (long i = 2 ; i <= longSqrt ; i++) {
//			int count = 0;
//			for (long j = 2; j < i; j++) {
//				if (i == 2 || i % 2 == 0) {
//					break;
//				}
//				if (i % j != 0) {
//					// 約数がない場合
//					sosu = i;
//				} else {
//					// j以下の数字で割り切れた場合
//					count++;
//					break;
//				}
//			}
//			if (i == 2) {
//				sosuList.add(i);
//			} else if (i % 2 == 0 || count > 0) {
//				continue;
//			} else {
//				sosuList.add(sosu);
//			}
//		}
//		
		long max = 0;
//		long num = 600851475143l;
//		int index = 0;
//		while ( num != 1) {
//			if (num % sosuList.get(index) == 0) {
//				num = num / sosuList.get(index);
//				max = sosuList.get(index);
//			} else {
//				index++;
//				if (index >= sosuList.size()) {
//					if (num % num == 0) {
//						max = num;
//					}
//					break;
//				}
//			}
//		}
//		System.out.println("素因数の最大値は" + max);
		
		long n = 90;
		List<Long> soinsuList = new  ArrayList<>();
		for( long x = 2 ; n > 1 ; x++ ) {
			while( ( n % x ) == 0 ){
				System.out.print( x + " " );
				soinsuList.add(x);
				n /= x;
			}
		}
		long soinsu0 = soinsuList.get(0);
		for (long soinsu : soinsuList) {
			if (soinsu >= soinsu0) {
				max = soinsu;
			} 
		}
		System.out.println("素因数の最大値は" + max);
	}

}
