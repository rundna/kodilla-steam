package com.kodilla.stream.forumuser;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Szynszyl", 'M', LocalDate.of(1978, 6, 27), 12));
        userList.add(new ForumUser(2, "Tapir", 'M', LocalDate.of(1984, 2, 26), 0));
        userList.add(new ForumUser(3, "Wombat", 'F', LocalDate.of(1985, 4, 14), 10));
        userList.add(new ForumUser(4, "Mundżak", 'M', LocalDate.of(1990, 7, 13), 4));
        userList.add(new ForumUser(5, "Kapibara", 'F', LocalDate.of(1974, 12, 20), 30));
        userList.add(new ForumUser(6, "Mandryl", 'M', LocalDate.of(2000, 1, 24), 4000));
    }
        public List<ForumUser> getUserList(){
            return new ArrayList<ForumUser>(userList);
        }


    }

