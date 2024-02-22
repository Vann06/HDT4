
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Calculadora {
	
	/**
    * Calcula el resultado de una expresión en notación postfix.
    * @param expresionPostfix La expresión en notación postfix a calcular.
    * @return El resultado de la evaluación de la expresión.
    */
	 // Método para calcular el resultado de una expresión postfix
    static int calcularExpresionPostfix(String expresionPostfix) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expresionPostfix.length(); i++) {
            char c = expresionPostfix.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int a = stack.pop();
                int b = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(b + a);
                        break;
                    case '-':
                        stack.push(b - a);
                        break;
                    case '*':
                        stack.push(b * a);
                        break;
                    case '/':
                        stack.push(b / a);
                        break;
                }
            }
        }
        return stack.pop();
    }

    /**
     * Convierte una expresión infix a su equivalente en notación postfix.
     * @param data La expresión en notación infix a convertir.
     * @return La expresión convertida en notación postfix.
     */
    
    public static String InfixAPostfix(String data) {
        String result = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedencia(c) <= precedencia(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    /**
 * Determina la precedencia entre operadores matemáticos.
 * @param operador El operador cuya precedencia se quiere determinar.
 * @return Un valor entero que representa la precedencia del operador.
 */
    private static int precedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    /**
 * Lee expresiones matemáticas desde un archivo y calcula su resultado.
 * @param archivo El nombre del archivo que contiene las expresiones matemáticas.
 */

    public static void leerYCalcular(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                String expresionPostfix = InfixAPostfix(line);
                int resultado = calcularExpresionPostfix(expresionPostfix);
                System.out.println("Resultado de la expresión postfix " + expresionPostfix + ": " + resultado);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
}
