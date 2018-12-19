public class CodeWordChecker implements StringChecker
{
    private int min;
    private int max;
    private String check;

    public CodeWordChecker(int min, int max, String check)
    {
        this.min = min;
        this.max = max;
        this.check = check;
    }

    public CodeWordChecker(String check)
    {
        this.min = 6;
        this.max = 20;
        this.check = check;
    }

    public boolean isValid(String str)
    {
        if(str.length()<this.min || str.length()>this.max)
        {
            return false;
        }
        else
        {
            if(!(str.contains(this.check)))
            {
                return true;
            }
            return false;
        }
    }
}
