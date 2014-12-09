using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharp
{
    public class Class1
    {
        public void some_badly_named_method(int result)
        {
            result = 42; // This won't work as expected
        }
    }
}
