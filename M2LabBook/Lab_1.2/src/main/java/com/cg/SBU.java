package com.cg;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	@Value("${sbu.id}")
	int sbuId;
	

	@Value("${sbu.name}")
	String sbuName;
	
	@Value("${sbu.head}")
	String sbuHead;
	
	
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	@Override
	public String toString() {
		return "SBUId=" + sbuId + ", SBUName=" + sbuName + ", SBUHead=" + sbuHead;
	}

}