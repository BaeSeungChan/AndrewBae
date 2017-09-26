package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardVO;

/**
 * DAO에서 총 게시물 수를 반환
 * 
 * client로부터 pageNo를 전달받는다
 * 만약 pageNo가 없으면 1 페이지로 처리
 * 
 * PagingBean 을 생성
 * DAO에서 현 페이지에 해당하는 게시물 리스트를 반환
 * (이 때 PagingBean 객체를 전달해야 한다
 * ListVO를 생성해서 request에 공유한다
 * @author kosta
 *
 */
public class ListController  implements Controller {
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {				
		ArrayList<BoardVO> list=BoardDAO.getInstance().getPostingList();	
		request.setAttribute("url", "/board/list.jsp");
		request.setAttribute("list", list);
		return "/template/home.jsp";
	}
}







