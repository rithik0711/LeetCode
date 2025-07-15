class Solution(object):
    def isValid(self, word):
        if(len(word)<3):
            return False
        v_found=False
        c_found=False
        vow="aeiou"
        con="bcdfghjklmnpqrstvwxyz"
        special_chars = "!@#$%^&*()_+-=[]{}|;:'\",.<>/?`~"
        lower=word.lower()
        for i in lower:
            if i in vow:
                v_found=True
            if i in con:
                c_found=True
            if i in special_chars:
                return False
        if v_found and c_found:
            return True
        else:
            return False

        