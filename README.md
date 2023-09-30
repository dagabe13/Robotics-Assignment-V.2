# Robotics-Assignment-V.2

This is the Robotics Intro Assignment for newcomers to complete

This is the Wobotics Intwo Assignment fow nyewcomews to c-compwete

## About
This repository checks your introductory Java code knowledge. 
If you're an aspiring member of the Scarlett Robotics code subteam,
    you're in the right place!

If you are new to code, don't worry!
There are many ways to learn Java basics:
1. [Sololearn](https://www.sololearn.com/learn/courses/java-introduction):
Take the "Introduction to Java" course, omitting the "Arrays" section.
2. [Codecademy](https://www.codecademy.com/learn/learn-java):
Take the "Learn Java" course, omitting the "Arrays and ArrayLists" and "String Methods" sections.
3. [W3Schools](https://www.w3schools.com/java):
Go through "Java Tutorial" (everything except "Java Arrays") and "Java Methods".
4. [YouTube](https://youtu.be/A74TOX803D0):
Go through the video, skipping the "Arrays", "ArrayLists", and "HashMaps" sections.

While there are some concepts that aren't needed for Scarlett Robotics, 
you're free to learn extra information for your own benefit!


## Setup Instructions
1. Fork this repository, creating a fork to your account.
2. Clone your version of this repository to GitHub Desktop. If you don't have GitHub Desktop installed, you can use Git.
3. Code in the Main.java file to complete the assignment.
4. Once finished, email your Main.java file to [epscarlettrobotics@gmail.com](mailto:epscarlettrobotics@gmail.com)
with the subject "Code Subteam Intro Assignment: {first-name} {last-initial}". 

## Assignment
In this year's competition, our team is competing in FISSION FIESTA<sup>SM</sup> presented by LOCKHEED MARTIN.
Teams must shoot 4-inch spheres outside the arena pool while underwater.
Our team has built the hardware parts of the robot, and it's up to you to make it functional.

1. **Create** a "telemetry()" method that prints out "{x} seconds passed" every second.
(HINT: use timer.timeElapsed to find how much time has passed so far.)
2. The autonomous portion of the contest lasts 30 seconds. Add an extra statement communicating when this has happened.
3. Create two classes using FTC's built-in "DcMotor" class.
Name them "motorLeft" and "motorRight".
4. Before DcMotors can fully run, the RunModes and Directions need to be specified.
Use "setMode()" to set both motors to use "RUN_USING_ENCODER".
5. "motorRight's" motor is set up in reverse. Use "setDirection()" set "motorRight's" direction to "REVERSE".
6. Modify "telemetry()" to include motor information.
After outputting timer information, print out the power, runMode, and direction of each motor using
"getPower()", "getMode()", and "getDirection()".
   1. Remember that if a motor's direction is "REVERSE", all motor powers will be reversed.
   Reverse any motors' "getPower()" telemetry if their "getDirection()" is "REVERSE". 
7. We already have the autonomous portion coded; we now need to implement this into our main code.
Using the Auto class, create a variable named "auto" that will "analyze()" the field after 2 seconds.
8. Auto takes 10 seconds to fully analyze.
At 12 seconds, use "getOutput()" to store the output to a variable in Main.java.
9. Depending on how the field was set up, Auto has outputted a number from 1 to 3.
Take different actions depending on what Auto returns.
(HINT: use "setDebugOutput()" and "getDebugOutput()" to test out the different outcomes when testing!)
   1. When output == 1:
      1. Set both motor powers to 1 for 2 seconds
      2. Set "motorLeft" power to -1 and "motorRight" power to 1 for 1 second
      3. Set both motor powers to 0.5 for 2 seconds
   2. When output == 2:
      1. Set both motor powers to 0.5 for 5 seconds
   3. When output == 3:
      1. Set both motor powers to 1 for 2 seconds
      2. Set "motorLeft" power to 1 and "motorRight" power to -1 for 1 second
      3. Set both motor powers to 0.5 for 2 seconds
10. Time for the driver-controlled period! This period will last from 30 seconds to 150 seconds.
Our driver Stickman Bob has very specific driving requirements.
    1. "motorRight's" direction needs to be reversed for this period.
    Using "setDirection()", set "motorRight's" direction back to "FORWARD".
    2. For some reason, Stickman Bob wants the motor powers set to the 1s digit divided by 10
    (0.1 power at 1, 11, 21 seconds; 0.2 power at 2, 12, 32 seconds; etc.).
    (HINT: taking too much time to set power second by second? Use the modulo (%) operator!)
11. Now for the endgame. This period will last from 150 seconds to 180 seconds. Stickman Bob has some additional requests.
    1. Stickman Bob now wants to drive in reverse.
    Set "motorLeft's" direction to "REVERSE" and keep "motorRight's" direction at "FORWARD".
    2. Our team's prop can only be launched when the motors are at 0.3 power.
    Maintaining the current motor powers adjustments, print in "telemetry()" when this can be done.
12. All done! Ensure no extraneous code runs when timer.opModeIsActive == false, and submit to the [Scarlett Robotics email](epscarlettrobotics@gmail.com)!

If you have any questions, feel free to message the code heads on Slack!
