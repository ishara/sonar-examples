using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

using MyLibrary;

namespace CalcDivideTest
{
    [TestClass]
    public class DivideTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Assert.AreEqual(42, Calc.Divide(84, 2));
        }
    }
}
