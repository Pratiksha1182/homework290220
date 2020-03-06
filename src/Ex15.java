//15. Display left angle triangle of * using nested for loops

public class Ex15 {
    public static void main(String[] args) {
        Ex15 obj = new Ex15(); // object created
        obj.centerTriangle();     // method called from instance to static
    }

    public void centerTriangle() {
        for (int a = 1; a <= 5; a++)// for lop for row
        {
            for (int b = 1; b <= a; b++)// for loop for space
            {
                System.out.print(" @");
            }
            System.out.println("\n ");
        }
    }
}

