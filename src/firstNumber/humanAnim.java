package firstNumber;

public class humanAnim {
    public static void draw(int lives) {
        String[] stages = {
                """
               ------
               |    |
               |
               |
               |
               |
            -----
            """,
                """
               ------
               |    |
               |    O
               |
               |
               |
            -----
            """,
                """
               ------
               |    |
               |    O
               |    |
               |
               |
            -----
            """,
                """
               ------
               |    |
               |    O
               |   /|
               |
               |
            -----
            """,
                """
               ------
               |    |
               |    O
               |   /|\\
               |
               |
            -----
            """,
                """
               ------
               |    |
               |    O
               |   /|\\
               |   /
               |
            -----
            """,
                """
               ------
               |    |
               |    O
               |   /|\\
               |   / \\
               |
            -----
            """
        };
        System.out.println(stages[lives]);
    }
}
