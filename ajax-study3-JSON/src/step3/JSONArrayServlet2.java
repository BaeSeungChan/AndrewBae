package step3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import model.MemberVO;

/**
 * Servlet implementation class JSONArrayServlet2
 */
@WebServlet("/JSONArrayServlet2")
public class JSONArrayServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSONArrayServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		list.add(new MemberVO("java", "광유", "수원"));
		list.add(new MemberVO("jquery", "아이유", "종로"));
		list.add(new MemberVO("jdbc", "공유", "일산"));
		
		JSONArray json = new JSONArray(list);
		out.println(json.toString());
		out.close();
	}

}
