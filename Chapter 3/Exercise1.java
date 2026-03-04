public class Exercise1{
	public static void main(String[] args){
// similarities between if annd while
if (x > 5)
while (x > 5)
	
// divide one by another
int result = 7 / 2;
System.out.println(result);

//description in two ways
int score = 85;

if (score >= 50) {
    if (score >= 75) {
        System.out.println("Distinction");
    }
}
int count = 1;

while (count <= 5) {
    if (count % 2 == 0) {
        System.out.println(count + " is even");
    }
    count++;
}
// sum
int sum = 0;

for (int i = 1; i <= 100; i++) {
    sum += i;
}
System.out.println(sum);
int sum = 0;
int number;

System.out.print("Enter a positive integer (0 to stop): ");
number = input.nextInt();

while (number != 0) {
    sum += number;
    System.out.print("Enter a positive integer (0 to stop): ");
    number = input.nextInt();
}

System.out.println("Sum = " + sum);

int x = 5;
int y = ++x;  // x becomes 6 first

if (age >= 65);
System.out.println("Age is greater than or equal to 65");
else System.out.println("Age is less than 65)";

if (age >= 65) {
    System.out.println("Age is greater than or equal to 65");
} else {
    System.out.println("Age is less than 65");
}
while (x <= 100)
    total += x; 
++x;