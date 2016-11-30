package model;
public class Square
{
    protected int id;
    protected String colour;
    protected int spacesToMove;
    public Square(int id, String colour)
    {
       this.id = id;
       this.colour = colour;
    }

    protected void move(Player player) 
    {
       System.out.println(player.toString());
    }
}
