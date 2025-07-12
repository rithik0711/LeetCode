from collections import Counter
class Solution(object):
    def countCharacters(self, words, chars):
        chars_count = Counter(chars)
        total_length = 0
        for word in words:
            word_count = Counter(word)
            for c in word_count:
                if word_count[c] > chars_count.get(c, 0):
                    break
            else:
                total_length += len(word)
        return total_length