const returnFive = () => 5;
console.log(returnFive())

const returnNumber10 = number => typeof number === "number" ? 10 : 0;
console.log(returnNumber10(2));
console.log(returnNumber10("char"));

for (let i = 1; i <= 15; i++) {
    if (i % 5 === 0 && i % 3 === 0) {
        console.log("FizzBuzz")
    } else if (i % 5 === 0) {
        console.log("Buzz")
    } else if (i % 3 === 0) {
        console.log("Fizz")
    } else {
        console.log("Number is: " + i)
    }
}