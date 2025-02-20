// let a = document.getElementsByClassName("btn")
// if (a) {
//   console.log(a);
// } else {
//   console.log("Element with class 'btn' not found.");
// }

const originalArray = [1, 2, 3, 4, 5, 2, 1, 4];
const valuesToRemove = [2]; 

const filteredArray = originalArray.filter(value => !valuesToRemove.includes(value));

console.log(filteredArray); // Output: [1, 3, 5, 1]


const nums= [1, 2, 3, 4, 5, 2, 1, 4];
const values = [2,4]; 

const removeelement = function(nums, values) {
 
 
  const k = nums.filter(num=> !values.includes(num));
k.sort()
return k
 
}

 removeelement([2,3,4,5,6,7,3,2,2,5,6,2],[2])

// console.log(result)