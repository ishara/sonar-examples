using Microsoft.VisualBasic;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Data;
using System.Diagnostics;
using System.Data.SqlClient;

namespace CSharpLib
{
    public class MyClassCSharp
    {
        // VIOLATION => stylecop:ElementMustBeginWithUpperCaseLetter
        public void doFoo()
        {
            // VIOLATION => fxcop:SetLocaleForDataTypes
            // VIOLATION => gendarme:EnsureLocalDisposalRule
            DataSet dataSet = new DataSet();

            // VIOLATION => csharpsquid:CommentedCode
            //DataSet dataSet = new DataSet();
        }
    }
}