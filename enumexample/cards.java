public class cards {
enum Suit{
    spade,
    heart,
    diamond,
    clubs;
}
enum Rank{
    ace,two,three,four,five,six,seven,eight,nine,ten,jack,queen,king;

}
public static void main(String [] args)
{
    for(Suit suit : Suit.values())
    {
        for (Rank rank : Rank.values())
        {
            System.out.println(rank+" of "+ suit);
        }
    }
}
    
}
