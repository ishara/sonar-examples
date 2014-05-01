using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

using MyLibrary;

namespace CalcAddTest
{
    [TestClass]
    public class AddTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Assert.AreEqual(42, Calc.Add(40, 2));
        }
    }
}
