using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

using MyLibrary;

namespace MyLibraryTest
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
