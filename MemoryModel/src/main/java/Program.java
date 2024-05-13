public class Program
{
    public static void main(String[] args)
    {
        int owen = 4;
        String christian = "Christan";
        int[] tom = { 6, 7, 2 };
        for (var anna = 0; anna < tom.length; anna++)
        {
            System.out.println(tom[anna]);
        }

        double conner = 3.14159;
        var duncan = owen;
        owen++;
        String[] karho = { "cat", "dog" };
        {
            var steven = tom;
            steven[2] = 42;
            String[] logan = { "perch", "cod", "eel" };
            karho = logan;
            karho[1] = "bass";
            var lachlan = duncan;
            christian = logan[0];
        }
        conner = tom[2];
    }
}

