# Mail Sender

## Problem Statement

Given a 2 dimensional array of friends as following:

First Column    | Second Column
-------------   | -------------
rahul@test.com  | rajat@test.com, rashmi@test.com, vinod@test.com
vineet@test.com | ajay@test.com, rajat@test.com, rahul@test.com
Vinod@test.com  | rahul@test.com, nitin@test.com, vineet@test.com

The 1st column represent email address of someone, the 2nd column represent the email addresses (separated by comma) of friends of the person specified in corresponding 1st column.

We have a function

    void sendMail(String emailAddress, String message);

to send an email to the specified email address. Write a function

    void sendMail(String emailAddress, String message, String[][] friendsArray);

to send the passed message as an email to all the friends and friends of friends (complete network specified in the array) of the person whose email address is passed as an argument. Design the solution in such a way that nobody should get duplicate mails and the mail should not be received by the sender.

## How to use

    > cd path/to/dir/
    > javac *.java
    > java Main <sender_mail> <"quoted_message">

## Requirements

- Java 7+

## Notes and assumptions

1. `emailAddress` in `sendMail(String, String, String [][])` is the sender

2. First column in `friendsArray` is unique (no repeated entry), in such case last entry will be considered.
