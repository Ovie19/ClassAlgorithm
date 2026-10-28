function getShortestWordCount(sentence) {
  let shortestWordCount = Number.MAX_SAFE_INTEGER;
  let shortestWord = "";
  let index = 0;
  let wordCount = 0;

  while (index < sentence.length) {
    const c = sentence.charAt(index);

    if (!/[a-zA-Z]/.test(c)) {       
      if (wordCount !== 0 && wordCount < shortestWordCount) {
        shortestWordCount = wordCount;
        shortestWord = sentence.substring(index - wordCount, index);
      }
      wordCount = 0;
    } else {
      wordCount++;
    }
    index++;
  }

  if (wordCount !== 0 && wordCount < shortestWordCount) {
    shortestWordCount = wordCount;
    shortestWord = sentence.substring(index - wordCount, index);
  }

  return shortestWord;
}

module.exports = { getShortestWordCount };