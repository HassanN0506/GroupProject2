package com.syntax.groupExercise2;
/*
Create Registration Class in which you would have
variables as email, userName and password that
have an access scope only within its own class. After
creating an object of the class user should be able to
call methods and in each method separately pass
values to set users email, username and password.
Requirements:
A.
Valid email consider to be only yahoo
B.
Valid userName and password cannot be empty and
should be of length larger than 6 characters. Also
valid password cannot contain userName.
 */
public class Registration {
    private String email, username, password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email: "+email+" registered");
        } else {
            System.out.println("Invalid email");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username.length()>6){
            this.username = username;
            System.out.println("Username: "+username+" created");
        } else {
            System.out.println("Username is too short");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()>6 && !password.contains(username)) {
            this.password = password;
            System.out.println("Password: "+password+" created");
        } else {
            System.out.println("Password must be longer than 6 characters and cannot contain username");
        }
    }
}

class RegistrationTest {
    public static void main(String[] args) {
        Registration user1 = new Registration();
        user1.setEmail("user1@yahoo.com");
        user1.setUsername("user1abcd");
        user1.setPassword("user1xyz");

        Registration user2 = new Registration();
        user2.setEmail("user2@gmail.com");
        user2.setUsername("user2");
        user2.setPassword("user2!");
    }
}