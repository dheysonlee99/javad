package com.gildaswise.risc16.classes;

import com.gildaswise.risc16.util.Convert;

public class RegisterFile {
	
	private short value = -1;
	private byte src1 = -1;
	private byte src2 = -1;
	private byte tgt = -1;
	private boolean we = false;
	
	private RUU mRUU;
	
	public RegisterFile[] RFs;
	
	public RegisterFile(short value){
		this.value = value;
	}
	
	public RegisterFile(){
		
		RegisterFile rf = new RegisterFile((short) 0);
		
		this.value = 0;
		
		RFs = new RegisterFile[] 
				{rf, 
				 rf, 
				 rf, 
				 rf,  
				 rf, 
				 rf,  
				 rf, 
				 rf};
	}
	
	public String toString(){
		String s = "";
		for (int i = 0; i < this.RFs.length; i++) {
			s += "RegisterFile [" + i + "] - Value: " + RFs[i].getValue() + "\n";
		}
		return s;
	}

	public void setSrc1(byte src1) {
		this.src1 = src1;
	}
	
	public void setSrc2(byte src2) {
		this.src2 = src2;
	}
	
	public void setTgt(byte tgt) {
		this.tgt = tgt;
	}
	
	public short getSource1() {
		
		int i = Convert.FromOctal(this.src1);
		return this.RFs[i].value;
	}
	
	public short getSource2() {
			
		int i = Convert.FromOctal(this.src2);
		return this.RFs[i].value;
	}
	
	public short getValue(){
		return this.value;
	}
	
	public void setValue(short value) {
		int i = Convert.FromOctal(this.tgt);
		if(this.we == true && i != 0){
			RFs[i] = new RegisterFile(value);}
	}
	
	public void setValue(byte target, short value) {
		int i = Convert.FromOctal(target);
		if(this.we == true && i != 0){
			RFs[i] = new RegisterFile(value);
			System.out.println("RegisterFile | Setting value to RFs[" + i + "] to " + value);
		}
	}
	
	public void setWriteEnable(boolean we) {
		this.we = we;
	}

	public RUU getRUU() {
		return mRUU;
	}

	public void setRUU(RUU mRUU) {
		this.mRUU = mRUU;
	}

}
