# JUnit implementation

Implementing JUnit test on a simple calculator class.

`@Test`, `@BeforeEach`, `@AfterEach`, `TestInfo`, `assertEquals()`



### 1

Testing the methods of the class named `Calculator`.

Method names:

- `add`
- `substract`
- `multiply`
- `divide`


### 2

Created and Implemented Special `assertEquals` method. 

Prints the console ` + passed ` or ` - failed `

Example of console output:

```
testAdd
 + passed

testSubtract
 + passed

testDivide
 + passed

testMultiply
 + passed 
```


## How to

How to open project in Eclipse:

   `File -> Open Projects from File System... -> Directory` and follow the steps on pop-up windows.
   
Note 1:

   * Right Click on Project Directory in `Package Explorer`

      `Build Path -> Add Libraries... -> JUnit`

      Select Junit librarry version: `JUnit 5`

      `Finish`

OR: 

   * Right Click on Project Directory in `Package Explorer`

      `Build Path -> Configure Build path... -> Libraries -> Add Library.. -> JUNIT -> Next`

      Select Junit librarry version: `JUnit 5`

      `Finish`
   
   
 Note 2:

   * `File -> New -> JUnit Test Case`
