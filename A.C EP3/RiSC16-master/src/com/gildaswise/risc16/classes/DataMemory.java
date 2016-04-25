package com.gildaswise.risc16.classes;

import com.gildaswise.risc16.interfaces.TickBased;

public class DataMemory {
	
	public DataMemory[] RAM;
			
	public DataMemory(short s) {
		this.value = s;
	}
	
	public DataMemory(){
		this.value = -1;
		DataMemory mem = new DataMemory((short) -1);
		this.RAM = new DataMemory[]{mem,
									mem,
									mem,
									mem,
									mem,
									mem,
									mem,
									mem,
									mem,
									mem,
									mem,
									mem,
									mem,
									mem,
									mem,
									mem,
									mem,
									mem,
									mem};
	}

	short value;

	public short getValue() {
		return value;
	}

	public void setValue(short value) {
		this.value = value;
	}

}
