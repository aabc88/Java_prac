package ch3.section2_method;

class User{
    String name;
    int score;
}

public class Exam2 {

    void changeValue1(int score1, int score2){
        int temp = score1;
        score1 = score2;
        score2 = temp;
    }

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();

        user1.name = "kim";
        user1.score = 100;

        user2.name = "lee";
        user2.score = 90;

        System.out.println(user1.name+","+user1.score+" : "+user2.name+","+user2.score);

        Exam2 obj = new Exam2();
        obj.changeValue1(user1.score, user2.score );
        System.out.println(user1.name+","+user1.score+" : "+user2.name+","+user2.score);
        obj.changeValue2(user1, user2);
        System.out.println(user1.name+","+user1.score+" : "+user2.name+","+user2.score);

    }

    void changeValue2(User user1, User user2) {
        int temp = user1.score;
        user1.score = user2.score;
        user2.score = temp;
    }
}
