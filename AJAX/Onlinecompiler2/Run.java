import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Run extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		String path=req.getServletContext().getRealPath("/");
		PrintWriter jspout=res.getWriter();
		String filename=req.getParameter("className").trim();
		
		String javaPath = "C:\\Oracle\\Middleware\\jdk160_29\\bin\\java";
String classpath = "\"" + path + "\\Files\\classes\"";
String className = filename;
String command = javaPath + " -cp " + classpath + " " + className;

		Process out=Runtime.getRuntime().exec(command);
		try
		{
			out.waitFor();
			BufferedReader output=new BufferedReader(new InputStreamReader(out.getInputStream()));
		    BufferedReader error=new BufferedReader(new InputStreamReader(out.getErrorStream()));
			
			String result="";
			String result1="";
			while(true)
			{
				String temp=output.readLine();
				if(temp!=null)
				{
					result+=temp;
					result+="\n";
				}
				else
				{
					break;
				}
			}
			while(true)
			{
                String temp=error.readLine(); 
                if(temp!=null)
				{
                    result1+=temp;
				}
                else
				{
                    break;
				}
			}
            jspout.println(result+"\n"+result1);
            output.close();
            error.close();
		}
        catch(InterruptedException e){}
	}
}