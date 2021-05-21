/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPP_Memeto;
import java.util.Stack;

/**
 *
 * @author USER
 */

public class CareTaker {
    Stack<Memento> mementos = new Stack<>(); // Memento 관리를 위한 스택
    
    public void push(Memento memento) { // 특정 시점에 생성된 Memento를 푸쉬
        mementos.push(memento);
    }
    
    public Memento pop() { // 복원을 위한 Memento 객체 반환
        return mementos.pop();
    }
}