package lab3107;

public class a2b3c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "a2b3c4";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            char ch = input.charAt(i);        
            int count = input.charAt(i + 1) - '0'; 

            for (int j = 0; j < count; j++) {
                output.append(ch);
            }
        }

        System.out.println("Output: " + output.toString());
    }

	}


