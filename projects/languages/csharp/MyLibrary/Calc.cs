using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyLibrary
{
    public class Calc
    {
        public static int Add(int left, int right)
        {
            return left + right;
        }

        public static int Multiply(int left, int right)
        {
            return left * right;
        }

        public static int Divide(int left, int right)
        {
            if (right == 0)
            {
                Console.WriteLine("ERROR: Division by zero!");
            }

            return left / right;
        }

        public static void horrible_code(out int result)
        {
            result = 42;
        }

        public static int Subtract(int left, int right)
        {
            return left - right;
        }
    }
}
