package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.List;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char gender;
    private final LocalDate birthDate;
    private final int postCount;

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }

    public ForumUser(int userID, String userName, char gender, LocalDate birthDate, int postCount) {
        this.userID = userID;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.postCount = postCount;
    }




}
