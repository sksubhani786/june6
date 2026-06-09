package June7;

public class Print_weekno_based_on_weename {

	public static void main(String[] args) 
	{
		String weekname="friday";
		
		switch(weekname)
		{
		case "sunday":System.out.println(1); break;
		case "monday":System.out.println(2); break;
		case "tuesday":System.out.println(3); break;
		case "wendsday":System.out.println(4); break;
		case "thrusday":System.out.println(5); break;
		case "friday":System.out.println(6); break;
		case "saturday":System.out.println(7);
		default:System.out.println("invalid week name");
		}

	}

}
