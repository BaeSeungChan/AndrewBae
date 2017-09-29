package model;

public class MockDAO {
	private static MockDAO instance = new MockDAO();
	
	private MockDAO() {
		
	}
	
	public static MockDAO getInstance() {
		return instance;
	}
	
	public String getDeptInfo(int deptno) {
		String info = null;
		
		switch(deptno) {
			case 10:
				info = "연구개발 판교";
				break;
			case 20:
				info = "인사총무 종로";
				break;
			case 30:
				info = "전략기획 제주";
				break;
			default:
				info = "부서정보없음";
		}//switch
		
		return info;
	}//getDeptInfo
}
