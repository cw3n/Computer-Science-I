{\rtf1\ansi\ansicpg1252\cocoartf2708
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 ArialMT;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;\red255\green255\blue254;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;\cssrgb\c100000\c100000\c99608;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl432\partightenfactor0

\f0\fs32 \cf2 \cb3 \expnd0\expndtw0\kerning0
import java.util.Scanner;
\fs29\fsmilli14667 \

\fs32 \'a0
\fs29\fsmilli14667 \

\fs32 public class AdditionQuiz \{
\fs29\fsmilli14667 \

\fs32 \'a0public static void main(String[] args) \{
\fs29\fsmilli14667 \

\fs32 \'a0\'a0 int number1 = (int) (System.currentTimeMillis() % 10);
\fs29\fsmilli14667 \

\fs32 \'a0\'a0 int number2 = (int) (System.currentTimeMillis() / 7 % 10);
\fs29\fsmilli14667 \

\fs32 \'a0
\fs29\fsmilli14667 \

\fs32 \'a0\'a0 // Create a Scanner
\fs29\fsmilli14667 \

\fs32 \'a0\'a0 Scanner input = new Scanner(System.in);
\fs29\fsmilli14667 \

\fs32 \'a0
\fs29\fsmilli14667 \

\fs32 \'a0\'a0 System.out.print("What is " + number1 + " + " + number2 + "? ");
\fs29\fsmilli14667 \

\fs32 \'a0
\fs29\fsmilli14667 \

\fs32 \'a0\'a0 int number = input.nextInt();
\fs29\fsmilli14667 \

\fs32 \'a0
\fs29\fsmilli14667 \

\fs32 \'a0\'a0 System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
\fs29\fsmilli14667 \

\fs32 \'a0\}
\fs29\fsmilli14667 \

\fs32 \}
\fs29\fsmilli14667 \
\pard\pardeftab720\sl337\partightenfactor0
\cf2 \cb1 3.14\
import java.util.Scanner;\
\'a0\
public class Exercise_03_14 \{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 public static void main(String[] args) \{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 Scanner input = new Scanner(System.in);\
\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // Generate a random integer 0 or 1\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 int coin = (int)(Math.random() * 2);\
\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // Prompt the user to enter a guess\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 System.out.print("Enter a guess 0-head or 1-tail: ");\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 int guess = input.nextInt();\
\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // Display result\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 System.out.println(((guess == coin) ? "Correct" : "Incorrect") + " guess."); \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 \}\
\}\
}