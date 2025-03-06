package com.shinhan.day08.lab;

//구현class : 반드시 추상메서드를 구현할 의무 
public class Speaker extends Object implements  Volume{
	//1.field
	int volLevel;
    //2.일반메서드 
	public void volumeUp(int level) {
		volLevel += level;
		if(volLevel>100) volLevel=100;
		System.out.println(getClass().getSimpleName()+ "볼륨 올립니다."+volLevel);
	}

	public void volumeDown(int level) {
		volLevel -= level;
		if(volLevel<0) volLevel=0;
		System.out.println(getClass().getSimpleName()+ "볼륨 내립니다."+volLevel);

	}
}
 
