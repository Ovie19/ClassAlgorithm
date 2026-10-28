function getArraySquareInAscendingOrder(numbers) {
  const result = new Array(numbers.length);
  const arr = [...numbers];

  for (let index = 0; index < arr.length; index++) {
    let smallestIndex = index;

    for (let innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
      if (Math.abs(arr[smallestIndex]) > Math.abs(arr[innerIndex])) {
        smallestIndex = innerIndex;
      }
    }

    const temp = arr[smallestIndex];
    arr[smallestIndex] = arr[index];
    arr[index] = temp;
    result[index] = temp * temp;
  }

  return result;
}

module.exports = { getArraySquareInAscendingOrder };