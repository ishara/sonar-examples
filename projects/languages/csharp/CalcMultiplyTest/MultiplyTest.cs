using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

using MyLibrary;

namespace CalcMultiplyTest
{
    [TestClass]
    public class MultiplyTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Assert.AreEqual(42, Calc.Multiply(21, 2));
        }
    }
}
