@Echo off

if "%~1"=="" (
 echo "Usage: build.cmd [one|two]"
 exit /b 1
)

cd src

if "%~1"=="one" (

    javac com\beacastroalves\practicingoop\one\*.java -d ..\build

    cd ..\build

    java com.beacastroalves.practicingoop.one.One

) else (
    if "%~1"=="two" (

        javac com\beacastroalves\practicingoop\two\*.java -d ..\build

        cd ..\build

        java com.beacastroalves.practicingoop.two.Two

    ) else (
        echo option "%1" not recognized!
    )
)

cd ..\