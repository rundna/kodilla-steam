package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.Map;
import static java.time.LocalDate.now;

public class StreamMain {
    public static void main(String[] args){

        Forum filterForum = new Forum();
        Map<Integer, ForumUser> mapForum = filterForum.getUserList().stream()
                //.filter(name -> name.getUserName().equals("Szynszyl"))
                .filter(gender->gender.getGender()=='F')
                .filter(post -> post.getPostCount()>=1)
                .filter(age->(LocalDate.now().getYear()-age.getBirthDate().getYear())>=20)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

                System.out.println("# elements: " + mapForum.size());
                mapForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
        }


}
