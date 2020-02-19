# EReport Java Application
EReport is a windows compatible application written in a java programming language that reads
a text file containing employee information and outputs the sorted data to the console. The application
accepts the file path/name as an input argument and not prompt the user for any input.
Input file format:
- Comments are preceded by the '#' (hash-tag) character
- The data consists of an employee number and employee name separated by a ',' (comma) delimiter
- The employee name consists of first and last name separated by a ' ' (space) delimiter

# About Project
Eclipse IDE is used to create this project.
Employee Model is created to store employee information using arraylist.

# How to run this project
Clone this repository
Open this project in eclipse or other Java IDE
EReport in src directory is the main class, compile and run this file.

# An example of the input text file:
```
###############################################
#
# Employee information
# Employee number, employee name
102,Mary Major
103,Zachery Zoe
101, John Doe
104,Joe Public
110,Carla Coleman
```

# An example of the expected output:
Processing by employee number...
```
101,John Doe
102,Mary Major
103,Zachery Zoe
104,Joe Public
110,Carla Coleman
```
# Processing by last (family) Name...
```
110,Carla Coleman
101,John Doe
102,Mary Major
104,Joe Public
103,Zachery Zoe
```
