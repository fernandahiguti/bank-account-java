# Bank Account Java Project

The **Bank Account Java** project is a Java application that allows users to input bank account information through the terminal and then displays a personalized message with the provided data.

## How to Use

1. **Compile the Code**: Open a terminal/command prompt and navigate to the directory containing the `AccountTerminal.java` file. Compile the code using the command:

   ```
   javac AccountTerminal.java
   ```

2. **Run the Program**: After compilation, run the program using the following command:

   ```
   java AccountTerminal
   ```

3. **Enter Account Details**: The program will prompt you to enter the following details about the bank account:
   - Agência (Agency)
   - Número da Conta (Account Number)
   - Nome do Cliente (Customer Name)
   - Saldo da Conta (Account Balance)

4. **View Message**: After entering the required details, the program will display a personalized message with the provided data, including the customer's name, agency, account number, and balance.

5. **Error Handling**: The program includes basic error handling to handle invalid inputs. If an invalid input is detected, the program will display an error message and exit.

## Example

```
Por favor, digite o número da Agência: 092-4
Por favor, digite o número da Conta: 4536
Por favor, digite o nome do Cliente: ANA SILVA
Por favor, digite o saldo da Conta: 1987.62

Olá ANA SILVA, obrigado por criar uma conta em nosso banco. Sua agência é 092-4, conta 4536, e seu saldo 1987.62 já está disponível para saque.

```

## Important Notes

- This project uses the `Scanner` class to collect user input from the terminal. The provided input should match the expected data types (integers, strings, and decimals) to avoid errors.

- The program includes basic input validation, but in a real-world application, more robust validation and error handling would be needed.
