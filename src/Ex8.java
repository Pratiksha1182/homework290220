// Display right angle triangle of @ using nested for loops

public class Ex8 {
    public static void main(String[] args) {
        Ex8 obj = new Ex8(); // object created
        obj.Triangle();     // method called from instance to static
    }

    public void Triangle() {
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

