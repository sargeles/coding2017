package sargeles.data_structure.stack;

import java.util.Stack;

public class StackUtil {
	
	/**
	 * bad例子
	 * @param s
	 */
	public static void bad_reverse(Stack<Integer> s) {
		if(s == null || s.isEmpty()){
			return;
		}
		Stack<Integer> tmpStack = new Stack();
		while(!s.isEmpty()){
			tmpStack.push(s.pop());
		}
		
		s = tmpStack;
		
	}
	
	/**
	 * good例子
	 * @param s
	 */
	public static void reverse_247565311(Stack<Integer> s){
        if(s == null || s.isEmpty()) {
        	return;
        }
        
        int size = s.size();
        Stack<Integer> tmpStack = new Stack<Integer>();        
        
        for(int i=0;i<size;i++){
            Integer top = s.pop();
            while(s.size()>i){
                tmpStack.push(s.pop());
            }
            s.push(top);
            while(tmpStack.size()>0){
                s.push(tmpStack.pop());
            }
        }
    }


	
	/**
	 * 假设栈中的元素是Integer, 从栈顶到栈底是 : 5,4,3,2,1 调用该方法后， 元素次序变为: 1,2,3,4,5
	 * 注意：只能使用Stack的基本操作，即push,pop,peek,isEmpty， 可以使用另外一个栈来辅助
	 */
	public static void reverse(Stack<Integer> s) {
		if(s == null || s.isEmpty()) {
        	return;
        }
		
		Stack<Integer> helper = new Stack<Integer>();
		while(!s.empty()){
			helper.push(s.pop());
		}
		while(!helper.empty()){
			s.push(helper.pop());
		}
	}
	public static void addToBottom(Stack<Integer> s,  Integer value){
		
	}
	/**
	 * 删除栈中的某个元素 注意：只能使用Stack的基本操作，即push,pop,peek,isEmpty， 可以使用另外一个栈来辅助
	 * 
	 * @param o
	 */
	public static void remove(Stack s,Object o) {
		
	}

	/**
	 * 从栈顶取得len个元素, 原来的栈中元素保持不变
	 * 注意：只能使用Stack的基本操作，即push,pop,peek,isEmpty， 可以使用另外一个栈来辅助
	 * @param len
	 * @return
	 */
	public static Object[] getTop(Stack s,int len) {
		Object[] result;
	
		return null;
	}
	/**
	 * 字符串s 可能包含这些字符：  ( ) [ ] { }, a,b,c... x,yz
	 * 使用堆栈检查字符串s中的括号是不是成对出现的。
	 * 例如s = "([e{d}f])" , 则该字符串中的括号是成对出现， 该方法返回true
	 * 如果 s = "([b{x]y})", 则该字符串中的括号不是成对出现的， 该方法返回false;
	 * @param s
	 * @return
	 */
	public static boolean isValidPairs(String s){
		Stack temp = new Stack();
		char[] chars = s.toCharArray();
		for(char c : chars){
			switch(c){
			case '{':temp.push(c);break;
			case '[':temp.push(c);break;
			case '(':temp.push(c);break;
			case '}':
				if('{' != (char)temp.pop() || temp.isEmpty()){
					return false;
				}else{
					break;
				}
			case ']':
				if(']' != (char)temp.pop() || temp.isEmpty()){
					return false;
				}else{
					break;
				}
			case ')':
				if(')' != (char)temp.pop() || temp.isEmpty()){
					return false;
				}else{
					break;
				}
			}
			
		}
		return false;
	}
	
	
}
