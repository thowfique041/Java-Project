<h1>Tic Tac Toe Game</h1>

<p>
  This is a simple <strong>Tic Tac Toe</strong> game implemented in Java using <code>Swing</code> for the graphical user interface. The game is designed for two players who take turns to place their mark (<code>X</code> or <code>O</code>) on a 3x3 grid. The player who aligns three marks in a row (horizontally, vertically, or diagonally) wins the game.
</p>

<h2>Features</h2>
<ul>
  <li><strong>Two Player Mode:</strong> The game prompts for player names and assigns <code>X</code> to Player 1 and <code>O</code> to Player 2.</li>
  <li><strong>Graphical Interface:</strong> The game uses a simple GUI built with Java's Swing library.</li>
  <li><strong>Winning Highlights:</strong> The winning row, column, or diagonal is highlighted in green.</li>
  <li><strong>Draw Detection:</strong> If all cells are filled and no player has won, the game declares a draw and highlights the grid in yellow.</li>
  <li><strong>No Resizing:</strong> The window is fixed at 700x750 pixels, ensuring consistent appearance.</li>
</ul>

<h2>How to Run</h2>
<ol>
  <li>Ensure you have Java installed on your system. If not, you can download it from the <a href="https://www.oracle.com/java/technologies/javase-downloads.html" target="_blank">official Java website</a>.</li>
  <li>Clone this repository or download the source code.</li>
  <li>Compile and run the <code>TicTacToe</code> class using your preferred Java IDE or the command line.</li>
  <li>Enter the names for Player 1 and Player 2 when prompted.</li>
  <li>Play the game by clicking on the buttons to place your mark.</li>
</ol>

<h3>Command Line Instructions:</h3>
<pre><code>
javac TicTacToe.java
java TicTacToe
</code></pre>

<h2>Code Structure</h2>

<ul>
  <li><strong>Main Class:</strong> <code>TicTacToe</code></li>
  <ul>
    <li><strong>Fields:</strong>
      <ul>
        <li><code>ImageIcon img:</code> Icon for the application window.</li>
        <li><code>JFrame frame:</code> Main application window.</li>
        <li><code>JPanel panel, bPanel:</code> Panels for layout management.</li>
        <li><code>JLabel label:</code> Displays the current player's turn and the winner.</li>
        <li><code>JButton[][] buttons:</code> 3x3 grid of buttons representing the Tic Tac Toe board.</li>
        <li><code>String p1, p2:</code> Player names.</li>
        <li><code>boolean gameOver, draw:</code> Flags to track game state.</li>
      </ul>
    </li>
    <li><strong>Methods:</strong>
      <ul>
        <li><code>TicTacToe():</code> Constructor to set up the game UI and initialize event listeners.</li>
        <li><code>checkWinner():</code> Checks if there's a winner after each move.</li>
        <li><code>highlightWinningButtons():</code> Highlights the winning line in green.</li>
        <li><code>highlightDrawButtons():</code> Highlights the board in yellow if the game ends in a draw.</li>
        <li><code>isBoardFull():</code> Checks if the board is fully occupied.</li>
        <li><code>win(String s):</code> Displays the winning player’s name.</li>
      </ul>
    </li>
  </ul>
</ul>

<h2>Customization</h2>
<p>
  You can customize the game by modifying the colors, fonts, and icons. For example, change the background colors of the buttons, or update the <code>ImageIcon</code> used for the application window.
</p>

<h2>License</h2>
<p>This project is open-source and available under the MIT License. Feel free to modify and distribute as needed.</p>

<h2>Screenshots</h2>
<p>ScreenShot.gif</p>
