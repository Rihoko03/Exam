package scoremanager.main;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.School;
import bean.Student;
import dao.StudentDao;
import tool.Action;

public class StudentCreateaction extends Action {
	public void execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		String no=request.getParameter("no");
		String name=request.getParameter("name");
		Integer entYear=Integer.parseInt(request.getParameter("entYear"));
		String classNum=request.getParameter("classNum");
		Boolean isAttend=Boolean.parseBoolean(request.getParameter("isAttend"));
		School school=School.parseSchool(request.getParameter("school"));

		Student p=new Student();
		p.setName(name);;
		StudentDao dao=new StudentDao();
		dao.insert(p);

		List<Student> list=dao.search("");
		request.setAttribute("list", list);

		return;
	}
}
