/*-------------------------------------------------------------
	FILE		: Console.java
	AUTHOR		: Java-Mar-2023 Group
	Last UPDATE	: 4th Nov 2023

	Utility class for standart input and output operations

	Copyleft (c) 1993 C and System Programmers Association
	All Right Free
-------------------------------------------------------------*/
package org.csystem.util.console;

import java.util.Scanner;

public final class Console {
    private static final Scanner KB = new Scanner(System.in);

    private Console()
    {
    }

    public static int readInt()
    {
        return readInt("");
    }

    public static int readInt(String prompt)
    {
        return readInt(prompt, "");
    }

    public static int readInt(String prompt, String errorPrompt)
    {
        while (true) {
            try {
                System.out.print(prompt);

                return Integer.parseInt(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                System.out.print(errorPrompt);
            }
        }
    }

    public static long readLong()
    {
        return readLong("");
    }


    public static long readLong(String prompt)
    {
        return readLong(prompt, "");
    }

    public static long readLong(String prompt, String errorPrompt)
    {
        while (true) {
            try {
                System.out.print(prompt);

                return Long.parseLong(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                System.out.print(errorPrompt);
            }
        }
    }

    public static double readDouble()
    {
        return readLong("");
    }

    public static double readDouble(String prompt)
    {
        return readDouble(prompt, "");
    }

    public static double readDouble(String prompt, String errorPrompt)
    {
        while (true) {
            try {
                System.out.print(prompt);

                return Double.parseDouble(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                System.out.print(errorPrompt);
            }
        }
    }

    public static void write(String format, Object...args)
    {
        System.out.printf(format, args);
    }

    public static void writeLine(String format, Object...args)
    {
        write(format + "\n", args);
    }

    public static void writeLine()
    {
        write("\n");
    }
    //...
}
