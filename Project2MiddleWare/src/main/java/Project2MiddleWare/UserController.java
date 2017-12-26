package Project2MiddleWare;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.dao.UserDao;
import com.niit.model.ErrorClazz;
import com.niit.model.User;

@Controller
public class UserController 
{
	private UserDao userDao;
	
	public ResponseEntity<?> registerUser(@RequestBody User user)
	{
		try
		{
			userDao.registerUser(user);
		}
		catch(Exception e)
		{
			ErrorClazz error = new ErrorClazz(1,"unable to register user datails");
			return new ResponseEntity<ErrorClazz>(error,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ResponseEntity<?>login(@RequestBody User user,HttpSession session)
	{
		User validUser = userDao.login(user);
		if(user==null)
		{
			ErrorClazz errorClazz = new ErrorClazz(4,"invalid username/password");
			return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.UNAUTHORIZED);
		}
		else
		{
			validUser.setOnline(true);
			session.setAttribute("userName",validUser.getUsername());
			userDao.updateUser(validUser);
			return new ResponseEntity<User>(validUser,HttpStatus.OK);
		}
		
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public ResponseEntity<?>logout(HttpSession session)
	{
		String username = (String) session.getAttribute("username");
		if(username==null)
		{
			ErrorClazz error = new ErrorClazz(5,"Unauthorized Access");
			return new ResponseEntity<ErrorClazz>(error,HttpStatus.UNAUTHORIZED);
		}
		session.removeAttribute("username");
		session.invalidate();
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
}
