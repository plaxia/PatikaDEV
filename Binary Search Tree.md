 # Binary Search Tree Project 
## https://app.patika.dev/plaxia
## Project 3
## **[7, 5, 1, 8, 3, 6, 0, 9, 4, 2]** Binary Search Tree Steps



1- Root is 7.

    7
          

2- 5 is smaller than 7.

```
     7
    /   
   5     
```

3- 1 is smaller than 7 and 5.

   

```
     7
    /   
   5     
  /      
 1        
```

4- 8 is greater than 7.

```
     7
    /  \
   5    8
  /      
 1        
```

5- 3 is smaller than 7 and 5 but greater than 1.



```
     7
    /  \
   5    8
  /      
 1 
  \
   3
```

6- 6 is smaller than 7 but greater than 5.



```
     7
    /  \
   5    8
  /  \    
 1    6
  \
   3
```

7-0 is smaller than 7,5 and 1.

          7
         /  \
        5    8
       /  \    
      1    6
     /  \
    0    3
    

8-9 is greater than 7 and 8.

          7
         /  \
        5    8
       /  \    \ 
      1    6     9
     /  \
    0    3

  9-4 is smaller than 7,5 but greater than 1,3.

```
       7
     /  \
    5    8
   /  \    \ 
  1    6     9
 /  \
0    3
       \
         4  
```

10-2 is smaller than 7 and 5 but greater than 1. And smaller than 3.



```
      7
     /  \
    5    8
   /  \    \ 
  1    6     9
 /  \
0    3
    /  \
   2    4  

```



