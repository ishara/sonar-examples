This example demonstrates how to analyze a Visual Studio project with code coverage results with the SonarQube Runner.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5.2 or higher
* [SonarQube Runner](http://docs.codehaus.org/x/N4KxDQ) 2.0 or higher
* [SonarSource C/C++ Plugin](http://www.sonarsource.com/products/plugins/languages/cpp/) 3.4 or higher
* [SonarSource build-wrapper](http://www.sonarsource.com/products/plugins/languages/c-cpp-objectivec/downloads/) 3.2 or higher

Usage
=====
* Analyze the project with SonarQube using the SonarQube Runner:

        # open a VisualStudio command prompt
        # build the solution through build-wrapper
        /path/to/build-wrapper-win.exe --out-dir build-wrapper-out msbuilt /t:rebuild
        # run the tests (Debug\UnitTest1.dll in our case) enabling coverage, this is going to create a TestResult directory
        vstest.console.exe Debug\UnitTest1.dll /EnableCodeCoverage
        # create code coverage xml (codeCoverage.xml in our case) report using CodeCoverage.exe (available in the Visual Studio installation folder under "Team Tools\Dynamic Code Coverage Tools" directory)
        C:\path\to\CodeCoverage.exe analyze /output:codeCoverage.xml TestResult\<RESULT_FOLDER>\<REPORT_NAME>.coverage
        # run the analysis
        sonar-runner

