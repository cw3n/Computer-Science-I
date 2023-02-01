{\rtf1\ansi\ansicpg1252\cocoartf2708
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Roman;\f1\fswiss\fcharset0 ArialMT;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;\red255\green255\blue254;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;\cssrgb\c100000\c100000\c99608;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl432\partightenfactor0

\f0\fs32 \cf2 \cb3 \expnd0\expndtw0\kerning0
import java.util.Scanner;
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0
\f1\fs29\fsmilli14667 \

\f0\fs32 public class Main \{
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0 public static void main(String[] args) \{
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0 final int NUMBER_OF_QUESTIONS = 10; // Number of questions
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0 int correctCount = 0; // Count the nubmer of correct answers
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0 int count = 0;\'a0 // Count the number of questions
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0 long startTime = System.currentTimeMillis();
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0 String output = " "; // output string is initially empty
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0 Scanner input = new Scanner(System.in);
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0 while (count < NUMBER_OF_QUESTIONS) \{
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 // 1. Generate two random single-digit integers
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 int number1 = 1 + (int)(Math.random() * 15);
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 int number2 = 1 + (int)(Math.random() * 15);
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 // 2. Prompt the student to answer "What is number1 + number2?"
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 System.out.print(
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0 "What is " + number1 + " + " + number2 + "? ");
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 int answer = input.nextInt();
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 // 3. Grade the answer and display the result
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 if (number1 + number2 == answer) \{
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0 System.out.println("You are correct!");
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0 correctCount++; // Increase the correct answer count
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 \}
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 else
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0 System.out.println("Your answer is wrong.\\n" + number1
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 + " + " + number2 + " should be " + (number1 + number2));
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 // Increase the question count
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 count++;
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 output += "\\n" + number1 + "+" + number2 + "=" + answer +
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 ((number1 + number2 == answer) ? " correct" : " wrong");
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0 \}
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0 long endTime = System.currentTimeMillis();
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0 long testTime = endTime - startTime;
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0 System.out.println("Correct count is " + correctCount +
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0 "\\nTest time is " + testTime / 1000 + " seconds\\n" + output);
\f1\fs29\fsmilli14667 \

\f0\fs32 \'a0 \}
\f1\fs29\fsmilli14667 \

\f0\fs32 \}
\f1\fs29\fsmilli14667 \
}