using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

using MyLibrary;

namespace CalcSubtractTest
{
    [TestClass]
    public class SubtractTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Assert.AreEqual(42, Calc.Subtract(43, 1));
        }
    }
}
