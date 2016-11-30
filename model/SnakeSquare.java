package model;
public class SnakeSquare extends Square
{
    public SnakeSquare(int id, String colour, int spacesToMove)
    {
        super(id,colour);
        this.spacesToMove = spacesToMove;
    }
}
