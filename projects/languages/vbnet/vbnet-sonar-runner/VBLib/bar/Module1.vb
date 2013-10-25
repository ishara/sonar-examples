Imports System, System.IO

REM This is a comment!

Friend Module Module1
    Public Class MyClazz
        Public ReadOnly Property MyProperty As Integer
            Get
                Return 42
            End Get
        End Property
    End Class

    Sub Main()
        Dim myClazz As New MyClazz
        Dim foo(1) As String
        foo(0) = "foo"
        foo(1) = "bar"
        Console.WriteLine("Hello, world! " & myClazz.MyProperty)
        Console.ReadLine()
    End Sub
End Module
