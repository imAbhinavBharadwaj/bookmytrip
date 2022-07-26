# BookmyTrip - C++ Version (Original and Initial Development)

## Initially developed Code (oldmain.cpp)

the Original Code (Initial Development) [oldmain.cpp](https://github.com/abhinavbharadwajr/bookmytrip/tree/main/project.cppfol/oldmain.cpp) was developed using Borland C++ on ***[Turbo C++ IDE/Compiler (v3.0.7.7c)](https://github.com/abhinavbharadwajr/bookmytrip/tree/main/project.cppfol/cpp.sources)*** which you can get a copy from 

or you can make use of a later version of same [Turbo C++ IDE v3.2](https://github.com/vineetchoudhary/turbocpp/releases/download/v3.2/Turbo.C.3.2.zip?raw=true&after=https://developerinsider.co/c-and-cpp-insider/) with added functionalites.

oldmain.cpp had built-in functions from Borlan C++ Libraries like ***<grapichs.h>, <dos.h> and <conio.h>***, which were used to make the Application's I/O more interactive and more popped-up in color.

<details> <summary> delay() </summary>
<p>

defined in the '<dos.h>' library, delay() is used to make the output load with a 'defined-delay' timer. the Amount of Delay is defined in 'milliseconds' as argument of the function.

```c++
void delay (unsigned int milliseconds)
```

</p>
</details>

<details> <summary> textcolor() </summary>
<p>

defined in '<graphics.h>' library - used to change the Text color of console Input screen, making a bit colorful

</p>
</details>

<details> <summary> clrscr() and getch() </summary>
<p>

these functions are part of '<conio.h>' - used to clear the screen and hold the screen from exiting after execution gets over.

</p>
</details>

## Post Project-Period Development (2021 - Present)

But, as C++ got evolved many fold to support the modern Standards, made many of the Borland C++ libray functions were either depricated or replaced with something similar.

Hence, I had modified the oldmain.cpp to ***[main.cpp](https://github.com/abhinavbharadwajr/bookmytrip/tree/main/project.cppfol/main.cpp)***, while maintaining most of the structure but yet adapting to C++ 11 and later standards.

for this current Development I'm using Visual Studio Code and I had to install and import some of the Dependencies.

<details> <summary> MingW - GCC compiler on Windows </summary>
<p>

***[MingW](https://www.mingw-w64.org/)***, formerly mingw32, is a free and open source software development environment to create Microsoft Windows applications. MingW is implement as [Cygwin](https://cygwin.com/),  is a Unix-like environment and command-line interface for Microsoft Windows.

[How to setup MingW for Visual Studio Code](https://code.visualstudio.com/docs/cpp/config-mingw)

[How to setup MingW for Eclipse IDE](https://www.eclipse.org/4diac/documentation/html/installation/minGW.html)

<p>
</details>

<details> <summary> WinBGIm  - Borlad Graphics Interface</summary>
<p>

**[WinBGIm](https://winbgim.codecutter.org/)** is is a Windows C++ graphics library based on the classic Borland Graphics Interface (originally distributed with Borland’s Turbo Pascal and later with their Turbo C compilers).

> oldmain.cpp requires all the Classic Libraries from Borland Turbo C/C++. 

to integrate WinBGIm to MingW (GCC Compiler) download the [WinBGIm 6.0 library](http://winbgim.codecutter.org/V6_0/WinBGIm_Library6_0_Nov2005.zip) and : 
		1. Copy headers winbgim.h, and  graphics.h To your MingW #include directory.
		2. Copy library libbgi.a to your MingW lib directory.

> You can find the Various implementation of WinBGIm [here](https://home.cs.colorado.edu/~main/bgi/install.html)

> Alternatively you can follow this StackOverFlow [Thread](https://stackoverflow.com/questions/19537564/can-gcc-compile-graphics-h-or-will-graphic-h-only-compile-with-the-borlan-turbo) too.

<p>
</details>

## What's Changed

As I said earlier, the functions of ***grapichs.h*** Library were depricated, I had to use the modified Library by manualing importing them from various sources.

***textcolor()*** function is now implmeneted as :

Earlier:
```c++
textcolor(0); 
```

Now:
```c++
HANDLE hConsole = GetStdHandle(STD_OUTPUT_HANDLE);
SetConsoleTextAttribute(hConsole, FOREGROUND_RED);
```
> Note : Text color functions use integer values as argument to specify the Color. find Text Color codes from ***[here](https://www.programmingsimplified.com/c/graphics.h/colors)***

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
	
# Advance Implementations

In addition to this, implementation of this project in Java and Python are underway and I will be link it, once Done.

> Early Previews of Java Code is available ***[here](https://github.com/abhinavbharadwajr/bookmytrip/tree/main/project.javafol)***