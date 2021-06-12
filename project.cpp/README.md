# bookmytrip.cpp - a Basic C++ program developed to demonstrate Ticket Booking systems.

***Done during my early days with C++ programming as a High school stud, this was a major project throw me out to push my limits as a programmer!***

# Originally developed Code (oldmain.cpp)

the Original Code (oldmain.cpp) was developed using Borland C++ on Turbo C++ IDE/Compiler (v3.0.7.7c) which you can get a copy from ***[here](https://github.com/imAbhinavBharadwaj/bookmytrip.cpp/tree/main/cpp.sources)***

or you can make use of a later version of same Turbo C++ IDE v3.2 with added functionalites from ***[here](https://github.com/vineetchoudhary/turbocpp/releases/download/v3.2/Turbo.C.3.2.zip?raw=true&after=https://developerinsider.co/c-and-cpp-insider/)***

oldmain.cpp had the ***grapichs.h*** header file from Borlan C++ Library which was used to make the console Inout Application more interactive and more popped-up in color.

functions like :

***delay()*** - to make the cout (or in other words output) load in delay timer passed at argument for this function

***textcolor()*** -  used to change the Text color of console Input screen, making a bit colorful

***clrscr() and getch()*** - functions defined in ***conio.h*** to clear the screen and hold the screen from exiting after execution gets over

# Modified Code (main.cpp)

But, as C++ got evolved many fold to support the modern Standards, made many of the Borland C++ libray functions were either depricated or replaced with something similar.

Hence, I had modified the oldmain.cpp to ***main.cpp***, while maintaining most of the structure but yet adapting to C++ 11 and later standards.

# What's Changed

As I said earlier, the functions of ***grapichs.h*** Library were depricated, I had to use the modified Library by manualing importing them from various sources.

**MingW** - ***GCC for Windows - get it from [here](http://mingw-w64.org/doku.php/start) and read instructions from thier Official source on how to setup for Visual Studio Code.***

**WinBGIm** - ***Borland BGI Graphics emulation for the MingW (GCC port) Compiler (grabit from [here](http://winbgim.codecutter.org/V6_0/WinBGIm_Library6_0_Nov2005.zip))***

textcolor() function is now implmeneted as :

###### Note : Text color functions use integer values as argument to specify the Color. find Text Color codes from ***[here](https://www.programmingsimplified.com/c/graphics.h/colors)***

Earlier:
```c++
textcolor(0); 
```

Now:
```c++
HANDLE hConsole = GetStdHandle(STD_OUTPUT_HANDLE);
SetConsoleTextAttribute(hConsole, FOREGROUND_RED);
```

and delay() function is now implemented with use of ***usleep()*** from ***unistd.h*** :

Earlier:
```c++
for(int i=0;i<5;++i)
	{ delay(1000000); cout<<". "; }
```

Now:
```c++
for(int i=0;i<5;++i)
	{ usleep(1000000); cout<<". "; }
```
	
# the Other Version

Also, in addition to this, implementation of the project in Java (fully) in underway and I will be link it, once Done.
