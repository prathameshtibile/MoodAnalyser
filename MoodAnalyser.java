package Day21_Exception;

public class MoodAnalyser 
{
	String message;

    //Constructor without parameter
    public MoodAnalyser()
    {
    }

    //Constructor with parameter
    public MoodAnalyser(String message)
    {
        this.message = message;
    }

    //analyseMood method
    public String analyseMood() 
    {
        if (message.contains("sad")) 
        {
            return "SAD";
        } else 
        {
            return "HAPPY";
        }
    }
}
