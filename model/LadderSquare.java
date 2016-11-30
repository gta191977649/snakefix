package model;
public class LadderSquare extends Square
{
    public LadderSquare(int id, String colour, int spacesToMove)
    {
        super(id,colour);
        this.spacesToMove = spacesToMove;
    }

}
