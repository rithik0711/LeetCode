bool isHappy(int n) {
        int arr[100];
        int count=0,digit;
        int sum=0,j=0;
        while(n>0){
            digit = n%10;
            arr[j++]=digit;
            count++;
            n/=10;
        }
        for(int i=0;i<count;i++){
            sum += (arr[i] * arr[i]);
        }
        if(sum==1 || sum==7){
            return true;
        }
        else if(sum<10 && sum>7){
            return false;
        }
        else if(sum<7 && sum>1){
            return false;
        }
        else{
            return isHappy(sum);
        }
    }