
function greet(name, age) {
    console.log("Hello " + name + ", you are " + age + " years old.");
}

greet("Kush"); // Output: Hello Kush, you are undefined years old.
// How to Solve It
function greet(name, age) {
    if (name === undefined || age === undefined) {
        console.log("Error: Missing name or age");
        return;
    }

    console.log("Hello " + name + ", you are " + age + " years old.");
}

greet("Kush"); // Error: Missing name or age
