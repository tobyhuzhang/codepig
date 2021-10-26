package com.yidao.designpattern.observer;

/**
 * 具体主题或通知者
 * 
 * @author
 *
 */
public class ConcreteSubject extends Subject {
    private String subjectState;

    public String getSubjectState() {
	return subjectState;
    }

    public void setSubjectState(String subjectState) {
	this.subjectState = subjectState;
    }
}
