// Test.java
    /*
     * Details about the TEST object
     * Feel free to CUT/COPY/PASTE these directions into your NEW file
     * 
     * Create (construct) a new Test object that will:
     *     1) initialize ALL variables in the Constructor
     *     2) ask the User some (simple) questions (like "what color is the sky?")
     *     3) check their answers
     *     4) print out a grade based on their passing percent
     * 
     * All variables should be PRIVATE
     * variables: 1. String array questions[]   => that holds 2+ questions for your "Test"
     *            2. String array answers[]     => that hold the RIGHT answers for your "Test"
     *            3. String array answersUser[] => that WILL hold 2+ answers for your "Test"
     *            4. int score                  => that holds the total number of correct answers
     *            5. double grade               => that holds the User's grade percentage
     * 
     * All methods should be PUBLIC
     * methods:   1. askQuestions( Scanner ) that will:
     *                a) accept a Scanner object from the main program
     *                b) loop through the questions (use a FOR loop)
     *                c) ask them to the user
     *                d) read in user input
     *                e) store the user input in the answers[] array
     *            2. chkAnswers() that will:
     *                a) loop through the answersUser[] array (use a WHILE loop)
     *                b) compares each answersUser[] with answers[] (use IF/ELSE)
     *                    i)   IF correct (the same), add 2 POINTS to their score
     *                    ii)  ELSE IF correct but the wrong case (upper/lower), add 1 POINT to their score
     *                    iii) ELSE (incorrect), SUBTRACT 1 point from their score
     *            3. double calcGrade() that will:
     *                a) RETURN a typecast (double) value of their score
     *                b) divide the total score by the number of questions[] to find this
     *            4. printGrade( double ) that will:
     *                a) accept a numeric score (percent)
     *                b) use a SWITCH statement to RETURN 'A', 'B', 'C', 'D', or 'F' based on the score
     */
import ***;

/**
 * TEST CLASS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
public class *** {
  
  /**
   * Class variables==============================================
   */
  private String[] questions = { 
      "***", 
      "***", 
      "***", 
      "***", 
      "***" 
    };
  
  private static String[] answers = { 
      "***", 
      "***", 
      "***", 
      "***", 
      "***" 
    };
  
  private String[] answersUser = new String[5];
  
  private int score;
  
  private double grade;
  
  
  
  
  /**
   * Class Constructor============================================
   */
  public Test() {
    
    *** = 0; // initialize score
    *** = 0; // initialize grade
    
  } // END constructor
  
  
  
  
  /*
   * Class methods================================================
   */
  
  /**
   * #1 Method: askQuestions()------------------------------------
   * 
   * @concept: FOR LOOP
   *
   * 1) Loop through the questions array
   * 2) output each question
   * 3) read in user input
   */
  public void askQuestions() {
    
    // Create a Scanner
    Scanner s = ***;
    
    // For loop
    for ( int i=0; ***; i++ ) {
      // 1) print each question
      // 2) get Input and store each answer in answersUser[] array
      // 3) call chkAnswer( Input, i ) to check the answer
    }
    
  } // END askQuestions()-----------------------------------------
  
  
  
  
  /**
   * #2 Method: static chkAnswer( String, int )-------------------
   * 
   * @param  String UserAnswer
   * @param  String arrayIndex
   * @return void
   * 
   * @concept: IF / ELSE IF / ELSE 
   * @concept: equals & equalsIgnoreCase
   * 
   * 1) send in the User answer and array index
   * 2) IF the answer EQUALS the correct answer at the same array index, print "RIGHT!"
   * 3) ELSE IF the answer is right, but the wrong case, print "kind of right"
   * 4) ELSE (it's wrong) print "WRONG!"
   */
  public static void chkAnswer( String str, int index ) {
    
    System.out.print( "Your answer <" + *** + "> is " );
    if ( ***.equals( *** ) ) {
      System.out.print( "RIGHT!\n" );
    } else if ( ***.equalsIgnoreCase( *** ) ) {
      System.out.print( "kind of right...\n" );
    } else {
      System.out.print( "WRONG!\n" );
    }
    
  } // END chkAnswer( String )------------------------------------
  
  
  
  
  /**
   * #3 Method: chkAnswers()--------------------------------------
   * 
   * @concept: WHILE LOOP
   * @concept: IF / ELSE IF / ELSE
   * @concept: equals & equalsIgnoreCase
   * 
   * 1) check answers[] array and answersUser[] array
   * 2) IF the answer EQUALS the correct answer at the same array index, print "RIGHT!"
   * 3) ELSE IF the answer is right, but the wrong case, print "kind of right"
   * 4) ELSE (it's wrong) print "WRONG!"
   */
  public void chkAnswers() {
    
    int count = 0;
    while ( *** ) {
      if ( ***.equals( *** ) ) {
        ***+=2; // add 2 points if right
      } else if ( ***.equalsIgnoreCase( *** ) ) {
        ***++;  // add 1 point if case is wrong
      } else {
        ***--;  // subtract 1 point if wrong
      }
      ***++;
    }
    
  } // END chkAnswers()-------------------------------------------
  
  
  
  
  /**
   * #4 Method: calcGrade()---------------------------------------
   * 
   * @concept: IF / ELSE IF / ELSE
   * 
   * @return char UserLetterGrade
   * 
   * 1) Calculate grade % (numCorrect / numQuestions * 100 )
   * 2) typecast grade to a double
   * 3) print the grade as a %
   * 4) use an IF / ELSE IF / ELSE to RETURN a letter grade based on the %
   */
  public char calcGrade() {
    
    // calculate grade % & typecast it
    
    // print grade %
    
    // IF / ELSE IF / ELSE return a char for the letter grade

  } // END calcGrade()--------------------------------------------
  
  
  
  
  /**
   * #5 Method: printGrade( char )--------------------------------
   * 
   * @concept: SWITCH
   * 
   * @param char LetterGrade
   * 
   * 1) use a SWITCH statement on the letter
   * 2) print a different sentence depending on the LetterGrade given
   */
  public void printGrade( char letter ) {
    
    // SWITCH statment
    
  } // END printGrade()-------------------------------------------
  
  
  
  
} // END class Test