const { getArraySquareInAscendingOrder } = require('./squareArrayAscending');

test("squares array in ascending order of absolute values", () => {
  expect(getArraySquareInAscendingOrder([-4, -1, 0, 3, 10])).toEqual([0, 1, 9, 16, 100]);

  expect(getArraySquareInAscendingOrder([-7, -3, 2, 3, 11])).toEqual([4, 9, 9, 49, 121]);

  expect(getArraySquareInAscendingOrder([5, 1, 4, 2])).toEqual([1, 4, 16, 25]);
  
  expect(getArraySquareInAscendingOrder([0, -2, 0, 3])).toEqual([0, 0, 4, 9]);
  
  expect(getArraySquareInAscendingOrder([-3, 3, -2, 2])).toEqual([4, 4, 9, 9]);
});