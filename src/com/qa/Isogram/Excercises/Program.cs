using System;

namespace Excercises
{
    class Program
    {
        static void Main(string[] args)
        {
            string lol1 = "Hello";
            Console.WriteLine(Isisogram(lol1));
        }
        static bool Isisogram(string lol)
        {

            lol = lol.ToLower(); 
            int len = lol.Length;
            char[] array = lol.ToCharArray();
            Array.Sort(array);
            for (int i = 0; i < len - 1; i++)
            {
                if (array[i] == array[i + 1])
                    return false;
            }
            return true;
        }
    }
}
