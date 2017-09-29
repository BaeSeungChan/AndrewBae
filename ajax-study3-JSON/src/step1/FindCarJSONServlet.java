package step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import model.CarDAO;
import model.CarDTO;

/**
 * Servlet implementation class FindCarJSONServlet
 */
@WebServlet("/FindCarJSONServlet")
public class FindCarJSONServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindCarJSONServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String maker = request.getParameter("maker");
		CarDTO dto = CarDAO.getInstance().getCarInfo(maker);
		//구조화된 데이터로 응답하기 위해 JSON형식의 데이터로 만들어서 보낸다
		JSONObject json = new JSONObject(dto);
		out.println(json.toString());
		out.close();
	}

}
