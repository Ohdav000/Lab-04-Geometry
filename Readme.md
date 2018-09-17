[![Build Status](https://travis-ci.com/StratfordHS-CS2/lab-04-geometry-username.svg?token=L8ZuTUsXtxKqevAPVWLC&branch=master)](https://travis-ci.com/StratfordHS-CS2/lab-04-geometry-username)

# Lab 04 - Geometry

## Lab Goal
This lab was designed to give you more practice using methods, as well as introduce you to return values.

## Instructions
Make sure you modify the link at the top of your **Readme.md** to reflect your username if you want the badge at the top to represent the status of your code.

In your ```Geometry``` class, modify the following methods.
* ```circleArea()``` - With radius as a parameter and return the area of the circle.  
* ```coneVolume()``` - With radius and height as parameters, and return the volume of the cone.
* ```cubeArea()``` - With the edge length as a parameter, and return the surface area of a cube.
* ```lineSlope()``` - With the x and y values for 2 points as parameters, and return the slope of the line.
* ```rectPerimeter()``` - With length and width as parameters, returns the perimeter of the rectangle.
* ```trapArea()``` - With base1, base2, and height as parameters, returns the area of the trapezoid.

Hint: ```Math.PI``` will give you the value of pi.

Hint: ```Math.pow()``` is how you do powers. [Example](https://www.geeksforgeeks.org/java-pow-method-example/)

Hint: Volume of a cone is (1/3) * area of base * height

Hint: Slope = (y2 - y1) / (x2 - x1)

Hint: Area of a trapezoid = (1/2) * (base1 + base2) * height

Run the ```Runner``` for each shape to see if it is working.

## Grading
* 15 - ```circleArea()```
* 15 - ```coneVolume()```
* 15 - ```cubeArea()```
* 15 - ```lineSlope()```
* 15 - ```rectPerimeter()```
* 15 - ```trapArea()```
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
