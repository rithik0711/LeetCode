class BrowserHistory {
    List<String> list;
    int pointer=-1;
    public BrowserHistory(String homepage) {
        list = new ArrayList<>();
        list.add(homepage);
        pointer+=1;
    }
    public void visit(String url) {
        // while(list.size()>pointer+1){
        //     list.remove(list.size()-1);
        // }
        for(int i=list.size()-1;i>pointer;i--){
            list.remove(i);
        }
        list.add(url);
        pointer++;
    }
    
    public String back(int steps) {
        pointer = Math.max(0, pointer-steps);
        return list.get(pointer);
    }
    
    public String forward(int steps) {
        pointer = Math.min(list.size()-1, pointer+steps);
        return list.get(pointer);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */