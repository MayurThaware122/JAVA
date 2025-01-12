class Practical4 {
// getByte methord
public static int getByte(int num) {
    int result = num % 256;  // Get the least significant 8 bits

    // Use a while loop to adjust result until it's in the byte range
    while (result > 127) {
        result -= 256;
    }

    while (result < -128) {
        result += 256;
    }

    return result;
}
//getShort methord

public static int getShort(int num) {
    int result = num % 65536;  // Get the least significant 8 bits

    // Use a while loop to adjust result until it's in the signed byte range
    while (result > 32767) {
        result -= 65536;  // Convert to signed byte range (-128 to 127)
    }

    while (result < -32768) {
        result += 65536;  // Ensure result stays within signed byte range
    }

    return result;
}

//getNumber methord
   public static int getNumber(int num, String type) {
        int r = num;

        if ("byte".equals(type)) {
            // Handle conversion to byte (range [-128, 127])
            r = num % 256;  // Get the number in the range [0, 255]
            while (r > 127) {  // If greater than 127, subtract 256
                r -= 256;
            }
            while (r < -128) {  // If less than -128, add 256
                r += 256;
            }
        } else if ("short".equals(type)) {
            // Handle conversion to short (range [-32768, 32767])
            r = num % 65536;  // Get the number in the range [0, 65535]
            while (r > 32767) {  // If greater than 32767, subtract 65536
                r -= 65536;
            }
            while (r < -32768) {  // If less than -32768, add 65536
                r += 65536;
            }
        } else {
            System.out.println("Invalid type specified. Please choose 'byte' or 'short'.");
            return num;  // Return the original number if type is invalid
        }

        return r;  // Return the converted value
    }
// conversion of number

    public static String toXXSystem(String num, String xx) {
        // Decimal to Binary
        if ("2".equalsIgnoreCase(xx) || "binary".equalsIgnoreCase(xx) || "b".equalsIgnoreCase(xx)) {
            int decimal = Integer.parseInt(num);
            StringBuilder binary = new StringBuilder();
            while (decimal > 0) {
                binary.insert(0, decimal % 2);
                decimal /= 2;
            }
            return binary.toString();
        }

        // Decimal to Octal
        else if ("8".equalsIgnoreCase(xx) || "octal".equalsIgnoreCase(xx) || "o".equalsIgnoreCase(xx)) {
            int decimal = Integer.parseInt(num);
            StringBuilder octal = new StringBuilder();
            while (decimal > 0) {
                octal.insert(0, decimal % 8);
                decimal /= 8;
            }
            return octal.toString();
        }

        // Decimal to Hexadecimal
        else if ("16".equalsIgnoreCase(xx) || "hexadecimal".equalsIgnoreCase(xx) || "h".equalsIgnoreCase(xx)) {
            int decimal = Integer.parseInt(num);
            StringBuilder hex = new StringBuilder();
            while (decimal > 0) {
                int remainder = decimal % 16;
                hex.insert(0, remainder < 10 ? (char) (remainder + '0') : (char) (remainder - 10 + 'A'));
                decimal /= 16;
            }
            return hex.toString();
        }

        // Binary to Decimal
        else if ("10".equalsIgnoreCase(xx) || "decimal".equalsIgnoreCase(xx) || "d".equalsIgnoreCase(xx)) {
            int decimal = 0;
            int base = 1;
            if (num.startsWith("0b") || num.startsWith("0B")) {
                num = num.substring(2);
            }
            for (int i = num.length() - 1; i >= 0; i--) {
                if (num.charAt(i) == '1') {
                    decimal += base;
                }
                base *= 2;
            }
            return Integer.toString(decimal);
        }

        // Octal to Decimal
        else if ("8".equalsIgnoreCase(xx) || "o".equalsIgnoreCase(xx) || "octal".equalsIgnoreCase(xx)) {
            int decimal = 0;
            int base = 1;
            if (num.startsWith("0")) {
                num = num.substring(1);
            }
            for (int i = num.length() - 1; i >= 0; i--) {
                int digit = num.charAt(i) - '0';
                if (digit >= 0 && digit <= 7) {
                    decimal += digit * base;
                } else {
                    return "Invalid octal number";
                }
                base *= 8;
            }
            return Integer.toString(decimal);
        }

        return "Invalid conversion type";
    }

    public static void main(String[] args) {
        System.out.println("Decimal to Binary of 10 is " + toXXSystem("10", "2"));
        System.out.println("Decimal to Binary of 2 is " + toXXSystem("2", "BINarY"));
        System.out.println("Decimal to Binary of 12 is " + toXXSystem("12", "B"));
        System.out.println("Decimal to Hexadecimal of 11 is " + toXXSystem("11", "16"));
        System.out.println("Decimal to Hexadecimal of 15 is " + toXXSystem("15", "h"));
        System.out.println("Decimal to Hexadecimal of 6 is " + toXXSystem("6", "HexaDECImal"));
        System.out.println("Binary to Decimal of 10 is " + toXXSystem("10", "d"));
        System.out.println("Binary to Decimal of 100 is " + toXXSystem("100", "10"));
        System.out.println("Binary to Decimal of 1011 is " + toXXSystem("1011", "dECimal"));
        System.out.println("Decimal to Octal of 14 is " + toXXSystem("14", "o"));
        System.out.println("Byte of 130 is :" +getByte(130));
        System.out.println("Byte of 1505 is :" +getByte(1505));
        System.out.println("Short value of 35000 is :" +getShort(35000));
        System.out.println("GET NUMBER of -512 in byte is :" +getNumber(-512,"byte"));
 
    }
}



