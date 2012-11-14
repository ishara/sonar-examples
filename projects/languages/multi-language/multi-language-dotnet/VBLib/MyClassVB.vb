Imports System.Data.SqlClient
Imports CSharpLib

Public Class MyClassVB

    ' VIOLATION => gendarme:UseCorrectCasingRule
    Public Function doBar() As DataSet

        ' VIOLATION => fxcop:SetLocaleForDataTypes
        Dim dataSet As New DataSet()

        ' TODO: should normally raise a vbnetsquid:CommentedCode
        ' Dim dataSet As New DataSet() 

        ' Used to create a link with the C# class
        Dim myObj As New MyClassCSharp()
        myObj.doFoo()

        Return dataSet
    End Function

End Class
