using NUnit.Framework;
using ConsoleApplication1;

namespace NUnitTestProject1
{
    [TestFixtureAttribute]
    public class NUnitTest1
    {
        [TestAttribute]
        public void NUnitTestMethod1()
        {
            Assert.AreEqual(42, Program.Add(40, 2));
            Assert.AreEqual(42, Program.Add(0, 42));
        }
    }
}
