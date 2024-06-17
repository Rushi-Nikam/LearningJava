// JavaScript code to create a solid rectangle

// Define a function to create the rectangle
// function createRectangle(rows, columns) {
//     // Nested loops to iterate over rows and columns
//     for (let i = 1; i <= rows; i++) {
//         for (let j = 1; j <= columns; j++) {
//             // Print asterisk for each column
//             process.stdout.write("*");
//         }
//         // Move to the next line after each row
//         process.stdout.write("\n");
//         // process.stdout.write('')
//     }
    
// }

// // Call the function to create a 4x5 rectangle
// createRectangle(4, 5);
let rows=4;
for(let i=1;i<=rows;i++){
    for(let j=1;j<=i;j++){
        process.stdout.write('*')
    }
    console.log()
}
