package br.edu.ifpi.ads.modelos;

public class RegisterFile {

	short value = 0;
	short src1;
	short src2;
	short tgt;
	boolean we = false;
	
	public void setSrc1(short src1) {
		this.src1 = src1;
	}
	
	public void setSrc2(short src2) {
		this.src2 = src2;
	}
	
	public void setTgt(short tgt) {
		this.tgt = tgt;
	}
	
	public short getSource1(){
		if(RFs.RFs[src1] == null){
			RFs.RFs[src1] = new RegisterFile();
		}
		return RFs.RFs[src1].value;
	}
	
	public short getSource2(){
		if(RFs.RFs[src2] == null){
			RFs.RFs[src2] = new RegisterFile();
		}
		return RFs.RFs[src2].value;
	}
	
	public void setValue(short value){
		if(we){
			if(tgt == 0){
				RFs.RFs[tgt] = new RegisterFile();
			} else {
				RFs.RFs[tgt].value = value;
			}
		}
	}
	
	public void setWriteEnable(boolean we) {
		this.we = we;
	}
}
