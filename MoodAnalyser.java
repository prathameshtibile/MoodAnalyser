/**
 * @author PRATHAMESH TIBILE
 * @since 1-7-21
 *  UC-2-Handle Exception if user provides invalid mood
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
    public String analyseMood() {
        try 
        {
            if (message.contains("sad")) 
            {
                return "SAD";
            } else 
            {
                return "HAPPY";
            }
        } catch (NullPointerException npe) 
        {
            return "HAPPY";
        }
    }
}
