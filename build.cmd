@Echo off

if "%~1"=="" (
 echo "Usage: build.cmd [one|two]"
 exit /b 1
)

cd src

javac com\beacastroalves\practicingoop\%1\*.java -d ..\build

cd ..\build

java com.beacastroalves.practicingoop.%1.Window

cd ..\