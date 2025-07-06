int lengthOfLastWord(char* s) {
    int wordlen=0,found=0;
    int len=strlen(s);
    int i=len-1;
    while(i>=0 && s[i]==' '){
        i--;
    }
    while(i>=0 && s[i]!=' '){
        wordlen++;
        i--;
        found=1;
    }
    return wordlen;
}