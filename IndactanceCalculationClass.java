package p2_package;

public class IndactanceCalculationClass
    {
     public static final char DASH = '-';
     public static final char DOUBLE_DASH = '=';
     public static final char PIPE = '|';
     public static final char CROSS = '+';
     
     public static final int TWO_ENDLINES = 2;
     public static final int PRECISION = 2;
     public static final int TABLE_WIDTH = 65;
     public static final int MEASURED_BLOCK_WIDTH = 20;
     public static final int NAME_BLOCK_WIDTH = 29;
     public static final int VALUE_BLOCK_WIDTH = 12;

     public static final String PIPE_SPACE = "| ";
     public static final String SPACE_PIPE = " |";
     public static final String CROSS_SPACE = "+ ";

     public static final double TWO_PI = 2.0 * Math.PI;
     
     public static void main( String[] args )
        {
         
         // TODO: Write program here

         // Must use constants provided, none other

         // Must create and use variables as needed

         // May not use character or integer literals in method parameters

         // Strings are acceptable as method parameters
        
           // Instantiating the Console_IO_Class class so we can use it
           Console_IO_Class conIO = new Console_IO_Class();
           
           // Variables
           double current, resistance, frequency, capacitance, numerator, denominator, indactance;
           
           
           // Prints the title of the program
           // The title and the bar are 30 characters long
           conIO.printString("Indactance Calculation Program");
           conIO.printEndline();
           conIO.printChars(30 , '=');
           conIO.printEndline();
           conIO.printEndline();
           
           // Receives the input we require
           current = conIO.promptForDouble("  Enter Current       (A): ");
           resistance = conIO.promptForDouble("  Enter Resistance (Ohms): ");
           frequency = conIO.promptForDouble("  Enter Frequency    (hz): ");
           capacitance = conIO.promptForDouble("  Enter Capacitance   (F): ");

           // Completes the calculations necessary for the table
           // The indactance formula is:
           // indactance = (current * resistance) / (2 * pi * frequency * capacitance)
           numerator = current * resistance;
           denominator = TWO_PI * frequency * capacitance;
           indactance = numerator / denominator;
           
           // Begins the table -- Titles
           conIO.printEndline();
           conIO.printChar(PIPE);
           conIO.printChars(TABLE_WIDTH - TWO_ENDLINES, DOUBLE_DASH);
           conIO.printChar(PIPE);

           conIO.printEndline();
           conIO.printChar(PIPE);
           conIO.printString("INDACTANCE CALCULATION PROGRAM", TABLE_WIDTH - TWO_ENDLINES, "CENTER");
           conIO.printChar(PIPE);
           
           conIO.printEndline();
           conIO.printChar(PIPE);
           conIO.printChars(TABLE_WIDTH - TWO_ENDLINES, DASH);
           conIO.printChar(PIPE);
           
           conIO.printEndline();
           conIO.printChar(PIPE);
           conIO.printString("MEASURED", MEASURED_BLOCK_WIDTH, "CENTER");
           conIO.printChar(PIPE);
           
           conIO.printString("NAME", NAME_BLOCK_WIDTH, "CENTER");
           conIO.printChar(PIPE);
           
           conIO.printString("VALUE", VALUE_BLOCK_WIDTH, "CENTER");
           conIO.printChar(PIPE);
           
           conIO.printEndline();
           conIO.printChar(PIPE);
           conIO.printChars(MEASURED_BLOCK_WIDTH, DOUBLE_DASH);
           conIO.printChar(PIPE);
           
           conIO.printChars(NAME_BLOCK_WIDTH, DOUBLE_DASH);
           conIO.printChar(PIPE);
           
           conIO.printChars(VALUE_BLOCK_WIDTH, DOUBLE_DASH);
           conIO.printChar(PIPE);
           
           // Done with title of table
           // Beginning the rest of the table
           
           // The following subtractions of '- 1' is to account for the spaces
           // in the table, to make it look cleaner and be more dynamic.
           // We were not given constants for this, and can't create our own
           // so I don't know what else I could do to get rid of it without
           // creating spaces in the string, which is not allowed.
           
           // First Row -- Current
           conIO.printEndline();
           conIO.printString(PIPE_SPACE);
           conIO.printString("Field", MEASURED_BLOCK_WIDTH - 1, "LEFT");
           conIO.printString(CROSS_SPACE);
           
           conIO.printString("Current", NAME_BLOCK_WIDTH - 1, "LEFT");
           conIO.printString(CROSS_SPACE);
           
           conIO.printDouble(current, PRECISION, VALUE_BLOCK_WIDTH - TWO_ENDLINES, "RIGHT");
           conIO.printString(SPACE_PIPE);
           
           conIO.printEndline();
           conIO.printChar(PIPE);
           conIO.printChars(MEASURED_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           conIO.printChars(NAME_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           conIO.printChars(VALUE_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           // Second Row -- Resistance
           conIO.printEndline();
           conIO.printString(PIPE_SPACE);
           conIO.printString("Field", MEASURED_BLOCK_WIDTH - 1, "LEFT");
           conIO.printString(CROSS_SPACE);
           
           conIO.printString("Resistance", NAME_BLOCK_WIDTH - 1, "LEFT");
           conIO.printString(CROSS_SPACE);
           
           conIO.printDouble(resistance, PRECISION, VALUE_BLOCK_WIDTH - TWO_ENDLINES, "RIGHT");
           conIO.printString(SPACE_PIPE);
           
           conIO.printEndline();
           conIO.printChar(PIPE);
           conIO.printChars(MEASURED_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           conIO.printChars(NAME_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           conIO.printChars(VALUE_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           // Third Row -- Frequency
           conIO.printEndline();
           conIO.printString(PIPE_SPACE);
           conIO.printString("Laboratory", MEASURED_BLOCK_WIDTH - 1, "LEFT");
           conIO.printString(CROSS_SPACE);
           
           conIO.printString("Frequency", NAME_BLOCK_WIDTH - 1, "LEFT");
           conIO.printString(CROSS_SPACE);
           
           conIO.printDouble(frequency, PRECISION, VALUE_BLOCK_WIDTH - TWO_ENDLINES, "RIGHT");
           conIO.printString(SPACE_PIPE);
           
           conIO.printEndline();
           conIO.printChar(PIPE);
           conIO.printChars(MEASURED_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           conIO.printChars(NAME_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           conIO.printChars(VALUE_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           // Fourth Row -- Capacitance
           conIO.printEndline();
           conIO.printString(PIPE_SPACE);
           conIO.printString("Field", MEASURED_BLOCK_WIDTH - 1, "LEFT");
           conIO.printString(CROSS_SPACE);
           
           conIO.printString("Capacitance", NAME_BLOCK_WIDTH - 1, "LEFT");
           conIO.printString(CROSS_SPACE);
           
           conIO.printDouble(capacitance, PRECISION, VALUE_BLOCK_WIDTH - TWO_ENDLINES, "RIGHT");
           conIO.printString(SPACE_PIPE);
           
           conIO.printEndline();
           conIO.printChar(PIPE);
           conIO.printChars(MEASURED_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           conIO.printChars(NAME_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           conIO.printChars(VALUE_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           // Final Row -- Indactance
           conIO.printEndline();
           conIO.printString(PIPE_SPACE);
           conIO.printString("Calculated Result", MEASURED_BLOCK_WIDTH - 1, "LEFT");
           conIO.printString(CROSS_SPACE);
           
           conIO.printString("Capacitive Indactance", NAME_BLOCK_WIDTH - 1, "LEFT");
           conIO.printString(CROSS_SPACE);
           
           conIO.printDouble(indactance, PRECISION, VALUE_BLOCK_WIDTH - TWO_ENDLINES, "RIGHT");
           conIO.printString(SPACE_PIPE);
           
           conIO.printEndline();
           conIO.printChar(PIPE);
           conIO.printChars(MEASURED_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           conIO.printChars(NAME_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           conIO.printChars(VALUE_BLOCK_WIDTH, DASH);
           conIO.printChar(PIPE);
           
           // End of program display
           conIO.printEndline();
           conIO.printEndline();
           conIO.printString("End Program");
           
        }

    } 
