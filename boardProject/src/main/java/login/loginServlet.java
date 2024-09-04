package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.userDAO;
import user.userVO;

@WebServlet("/user/login.action")
public class loginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		userVO vo = new userVO();
		vo.setUserID(id);
		
		userDAO dao = new userDAO();
		userVO user = dao.getUser(vo);
		
		PrintWriter out = resp.getWriter();
		
		if(user!=null) {
			if(user.getUserPW().equals(pw)) {
				out.println("로그인완료!");
				resp.addHeader("Refresh", "1; /boardProject/index.jsp");
				
				HttpSession session = req.getSession();
				session.setAttribute("id", user.getUserID());
			} else {
				out.println("비밀번호 오류입니다.");
				out.println("<a href='login.jsp'>다시 로그인</a>");
			}
		} else {
			out.println("아이디 오류입니다.");
			out.println("<a href='login.jsp'>다시 로그인</a>");
		}
	}
	
	
}
