This example demonstrates how to analyze a Visual Studio project with code coverage results with the SonarQube Runner.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5+
* [SonarQube Scanner](http://docs.sonarqube.org/display/SONAR/Analyzing+with+SonarQube+Scanner) 2.4+
* [SonarSource C/C++ Plugin](http://www.sonarsource.com/products/plugins/languages/cpp/) 3.8+
* [SonarSource Build Wrapper](http://www.sonarsource.com/products/plugins/languages/c-cpp-objectivec/downloads/) 3.8+

Usage
=====
* Analyze the project with SonarQube using the SonarQube Runner:

        # open a VisualStudio command prompt (note: solution is a Win32 one)
        # build the solution through Build Wrapper
        C:\path\to\build-wrapper-win-x86-32.exe --out-dir build-wrapper-out msbuild.exe /t:rebuild
        # run the tests (Debug\UnitTest1.dll in our case) enabling coverage, this is going to create a TestResult directory
        C:\path\to\vstest.console.exe Debug\UnitTest1.dll /EnableCodeCoverage
        # create code coverage xml (codeCoverage.xml in our case) report using codecoverage.exe (available in the Visual Studio installation folder under "Team Tools\Dynamic Code Coverage Tools" directory)
        C:\path\to\codecoverage.exe analyze /output:codeCoverage.xml TestResult\<RESULT_FOLDER>\<REPORT_NAME>.coverage
        # run the analysis
        sonar-runner

