package com.shinhan.day08;

//InterfaceA를 만든다.
//InterfaceB만 상속가능 
//봉인:sealed
public sealed interface InterfaceA permits InterfaceB{
    void method1();
}
