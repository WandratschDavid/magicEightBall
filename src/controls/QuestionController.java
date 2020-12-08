package controls;

import java.util.Random;

public class QuestionController
{
    private String[] positiveAnswers = {"It is certain", "It is decidedly so", "Without a doubt",
            "Yes - definitely", "You may rely on it", "As I see it, yes",
            "Most likely", "Outlook good", "Signs point to yes",
            "Yes"};

    private String[] negativeAnswers = {"Reply hazy, try again", "Ask again later",
            "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
            "Don't count on it", "My reply is no", "My sources say no",
            "Outlook not so good", "Very doubtful"};

    String answer;
    Random rd = new Random();

    public static boolean containsWords(String inputString, String[] items)
    {
        boolean found = false;
        for (String item : items)
        {
            if (inputString.contains(item))
            {
                found = true;
                break;
            }
        }
        return found;
    }

    public String getPositiveAnswer()
    {
        return answer = positiveAnswers[rd.nextInt(positiveAnswers.length)];
    }

    public String getNegativeAnswer()
    {
        return answer = negativeAnswers[rd.nextInt(negativeAnswers.length)];
    }
}