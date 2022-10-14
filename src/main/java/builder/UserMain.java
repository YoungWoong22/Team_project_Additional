package builder;

public class UserMain {

    public static void main(String[] args){
        User user = User.UserBuilder.UserBuilder()
                        .name("영웅")
                        .username("junil")
                        .password("1234")
                        .build();

        System.out.println(user);



    }

}
