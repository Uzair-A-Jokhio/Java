package Finals.exception;

/*      QUS NO 6  part 1
Question no 6:- Develop a program through Custom exception handling /
extended exceptional handling that asks user for his/her age and gives output
under following conditions
• If age is even number
• If age is odd number
• If age is -ve number then user should be prompted that age must be -ve
• If user enters non-integer value then user should be prompted about
invalid input
 */

 class InvalidAgeException extends Exception {
     public InvalidAgeException(String message) {
         super(message);
     }
 }

