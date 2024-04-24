import java.util.*;
enum Category
{
    sports,
    science,
    history;
    //geography;
}
public class enumquiz
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        System.out.println("Enter a category : ");
        String s=sc.nextLine();
        Category category=Category.valueOf(s.toLowerCase());
        switch(category)
        {
            case sports:
                String[]sportsQuestion={"Question 1 ","Question 2","Question 3"};
                int sportsIndex=rd.nextInt(sportsQuestion.length);
                System.out.println("Sports Question : "+sportsQuestion[sportsIndex]);
                break;
            case science :
                String[]scienceQuestion={"Questioin 1 ","Questin 2","Question 3 "};
                int scienceIndex=rd.nextInt(scienceQuestion.length);
                System.out.println("Sports Question : "+scienceQuestion[scienceIndex]);
                break;
            case history:
                String[]historyQuestions={"Question 1","Question 2","Question 3"};
                int historyIndex=rd.nextInt(historyQuestions.length);
                System.out.println("history quetions :"+historyQuestions[historyIndex]);
                break;
            default:
                System.out.println("Invalid Category");
                break;
        }
    }
}
