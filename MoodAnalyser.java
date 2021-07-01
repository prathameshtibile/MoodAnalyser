/**
 * @author PRATHAMESH TIBILE
 * @since 1-7-21
 *  UC-3-Inform user if entered Invalid Mood
*/
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
    public String analyseMood() throws MoodAnalyserException 
    {
        try
        {
            if (message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY , "Please enter proper message!");
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e)
        {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL , "Please enter proper message!");
        }
    }
}
