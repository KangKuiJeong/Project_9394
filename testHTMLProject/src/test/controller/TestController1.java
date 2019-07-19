package test.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

/**
 * Servlet implementation class TestController1
 */
@WebServlet("/test1")
public class TestController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestController1() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// testForm.html 에서 enrollFrm 이 보낸 값들 받는
		// 컨트롤러임.
		
		//post 전송이면서, 전송값이 한글이면 반드시
		//request에 대해 인코딩 처리해야 함
		request.setCharacterEncoding("UTF-8");
		String userName = request.getParameter("username");
		String userId = request.getParameter("userid");
		String userPwd = request.getParameter("userpwd");
		char Gender = request.getParameter("gender").charAt(0);
		int Age = Integer.parseInt(request.getParameter("age"));
		Date Birthday = Date.valueOf(request.getParameter("birthday"));
		String Email = request.getParameter("email");
		String Phone = request.getParameter("phone");
		String Job = request.getParameter("job");
		String Zipcode = request.getParameter("zipcode");
		String Address = request.getParameter("address");
		String Etc = request.getParameter("etc");
		String Hobby = String.join(", ", request.getParameterValues("hobby"));
		//String[] Hobby = request.getParameterValues("hobby");
		
		
		System.out.println(userName);
		System.out.println(userId);
		System.out.println(userPwd);
		System.out.println(Gender);
		System.out.println(Age);
		System.out.println(Birthday);
		System.out.println(Email);
		System.out.println(Phone);
		System.out.println(Job);
		System.out.println(Zipcode);
		System.out.println(Address);
		System.out.println(Hobby);
		System.out.println(Etc);
		
		
		System.out.println(userName + ", " + Gender + ", " + Age
						+ ", " + Birthday+ ", " + Email + ", " 
						+ Phone + ", " + Job+ ", \n " + Zipcode + ", "
						+ Address + ", " + Hobby+ ", " + Etc);
		
		
		/*for(String str : Hobby) {
			System.out.print(str);
			if(!Hobby[Hobby.length - 1].equals(str)) {
				System.out.print(", ");
			}
		}*/
		
		
		
		
	}

}
