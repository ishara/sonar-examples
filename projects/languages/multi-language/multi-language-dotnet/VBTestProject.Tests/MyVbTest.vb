Imports System.Text
Imports CSharpLib
Imports VBLib
Imports NUnit.Framework

<NUnit.Framework.TestFixture()>
Public Class MyVbTest

    <Test()>
    Public Sub TestAllThis()
        Dim myCSharpObj As New MyClassCSharp()
        myCSharpObj.doFoo()

        Dim myVbObj As New MyClassVB()
        myVbObj.doBar()
    End Sub

End Class
