package strategy;

public class Player implements DefenseBehavior, OffenseBehavior
{
    private String firstName, lastName;
    private Boolean offense;
    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;
    public Player(String firstName, String lastName, boolean offense)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
    }

    public void setDefenseBehavior()
    {
    }
    public void setOffenseBehavior()
    {

    }
    public String play()
    {
        if(offense == true)
        {
            this.setOffenseBehavior();
            if (this.offenseBehavior == null)
                return "is not playing";
            else
                return this.offenseBehavior.play();
        }
        else
        {
            this.setDefenseBehavior();
            if (this.defenseBehavior == null)
                return "is not playing";
            else
                return this.defenseBehavior.play();
        }
    }
    public void turnover()
    {
        this.offense = !offense;
    }
    public String toString()
    {
        return this.firstName + " " + this.lastName;
    }

    
}
