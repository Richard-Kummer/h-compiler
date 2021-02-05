positive integers are represented by series of h (10 would be hhhhhhhhhh)
see '-' operator for negative numbers (-10 would be HHhhhhhhhhhh)

All pointer values are 0 by default. Pointer position starts at 0 and cannot be negative. '>' operator cannot have negative input

Only 'h' and 'H' will be recognnized by compiler
All characters except below symbols are ignored in compiled h file

;  # section separator (automatically increases section value) - HhHhh
> $section  # add value to section pointer and goto specified section if value at current pointer is greater than zero - HhHhH
- $value  # negate value (for negatve numbers) - HH
< $value  # add value to current pointer (variable) - Hhhh
^ $value  # add value to pointer position (variable pointer) - HhhH
:  # print ascii char of current pointer - HhHHh
?  # add ascii value of input char to current pointer - HhHHH

HELLO WORLD PROGRAM - Compiled H (prints "Hello World!")

<72  
:
<29
:
<7
::
<3
:
<-79
:
<55
:
<24
:
<3
:
<-6
:
<-8
:
<-67
:

CONDENSED:

<72:<29:<6::<3:<-79:<55:<24:<3:<-6:<-8:<-67:

H:

Hhhh hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
HhHHh
Hhhh hhhhhhhhhhhhhhhhhhhhhhhhhhhhh
HhHHh
Hhhh hhhhhhh
HhHHh
HhHHh
Hhhh hhh
HhHHh
HhhhHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
HhHHh
Hhhh hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
HhHHh
Hhhh hhhhhhhhhhhhhhhhhhhhhhhh
HhHHh
Hhhh hhh
HhHHh
HhhhHH hhhhhh
HhHHh
HhhhHH hhhhhhhh
HhHHh
HhhhHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
HhHHh

CONDENSED H:

HhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhHHhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhHHhHhhhhhhhhhHhHHhHhHHhHhhhhhhHhHHhHhhhHHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhHHhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhHHhHhhhhhhhhhhhhhhhhhhhhhhhhhhhHhHHhHhhhhhhHhHHhHhhhHHhhhhhhHhHHhHhhhHHhhhhhhhhHhHHhHhhhHHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhHHh
