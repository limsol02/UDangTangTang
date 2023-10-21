package sol;

public class A1021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//		for문을 2중으로 사용 처리..
//		      홍길동 70	80 
//		      김길동 90	85 
//		      신길동 95	75 
		
		String [] str = "홍길동&70&80-김길동&90&85-신길동&95&75".split("-");
		for(int idx = 0; idx<str.length; idx++) {
			String str01[] = str[idx].split("&");
			for(String slist : str01) {
				System.out.println(slist);
			}
		}

	}

}
