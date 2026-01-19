/*
=> Threads:-
-> Multiple threads run at same time in a code this is known as Multithreading.
-> A thread is a smallest unit to work with (individual task) They can run parallely.
-> Multiple threads can share resources.
-> In thread context switching is fast means threads interact very fast with each other.
-> Thread is light weight whereas process is heavy weight.
-> Threads use shared memory area.

=> How to create a thread?
-> By extending thread class
-> By implementing Runnable interface

=> Thread States:-
-> New State -> When we create thread not yet started by invoking start() method.   
-> Runnable State -> When scheduler is not seeing and after calling the start() method.
-> Running State -> a thread is running with run() method and scheduler selected. 
-> Waiting State or non-Runnable -> sleep(),  wait() method.
-> Dead State or terminated state -> no code is left to execute.
*/
