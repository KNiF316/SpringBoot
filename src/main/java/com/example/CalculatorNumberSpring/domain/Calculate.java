package com.example.CalculatorNumberSpring.domain;

public class Calculate {
	
	
	private int n1;
	private int n2;
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	
	public int Mul()
	{
		return n1*n2;
	}
	
	
	public int Div()
	{
		if(n2==0)
		{
			return 0;
		}
		else
		{
		return n1/n2;
		}
	}
	
	public int Sum()
	{
		return n1+n2;
	}

	public int Min()
	{
		return n1-n2;
	}

}
