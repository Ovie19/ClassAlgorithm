const { getShortestWordCount } = require('./shortestWord');

test("finds the shortest word", () => {
  expect(getShortestWordCount("The quick brown fox")).toBe("The");

  expect(getShortestWordCount(". a big cat .")).toBe("a");

  expect(getShortestWordCount("Hello ...")).toBe("Hello");
});