using ConsoleApplication1;
using Xunit;

namespace XUnitProject1
{
    public class XUnitClass1
    {
        [Fact]
        public void XUnitTestMethod1()
        {
            Assert.Equal(42, Program.Add(40, 2));
            Assert.Equal(42, Program.Add(0, 42));
        }
    }
}
