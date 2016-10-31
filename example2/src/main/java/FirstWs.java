
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class FirstWs {
	@WebMethod
	public String getMessage() {
		return "Cool";
	}

}
