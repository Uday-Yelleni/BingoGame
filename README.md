🎱 Bingo Card Generator & Simulator (Java)

This is a simple Java-based Bingo card generator and game simulator. It builds a valid 5x5 Bingo card, prints it in a standard format, and then simulates a random number caller to check how many moves it takes to win a Bingo.



📚 Table of Contents

Features

Technologies Used

How to Run

File Structure

Sample Output

📌 Features

Generates a randomized Bingo card with valid number ranges:

B: 1–15

I: 16–30

N: 31–45 (center is a free space)

G: 46–60

O: 61–75

Ensures all numbers are unique per column

Simulates number drawing and marks the card

Tracks how many moves it takes to achieve a BINGO (row, column, or diagonal)

🛠 Technologies Used

Java 17+

IntelliJ IDEA

🚀 How to Run

Clone this repository.

Open the project in IntelliJ or your favorite IDE.

Run BingoGame.java to simulate a Bingo game.

Output will display the card and number of moves to win.

📂 File Structure

BingoCard.java: Handles the card creation, number generation, and display.

BingoGame.java: Simulates the game by calling numbers and checking for a win.

💡 Sample Output

B   I   N   G   O

8  24  44  46  67
15  22  34  57  61
1  25   F  56  72
3  28  33  48  68
13  20  31  50  74

The number 34 was found on 2 move.

The number 67 was found on 4 move.

The number 33 was found on 10 move.

The number 15 was found on 11 move.

The number 61 was found on 13 move.

The number 72 was found on 17 move.

The number 22 was found on 18 move.

The number 50 was found on 19 move.

The number 56 was found on 29 move.

The number 74 was found on 35 move.

The number 24 was found on 37 move.

The number 1 was found on 38 move.

The number 48 was found on 39 move.

The number 46 was found on 42 move.

The number 28 was found on 43 move.

The number 13 was found on 44 move.

The number 8 was found on 47 move.

Bingo achieved in 47 calls!



