package javaAtoZ;


class OverLoading
{
  int addition(int operand1, int operand2)
  {
    return operand1+operand2;
  }
  int  addition(int operand1, int operand2, int operand3)  
  {
    return operand1+operand2+operand3;
  }

  public static void main(String args[])
  {
	  OverLoading obj = new OverLoading();
    System.out.println("Addition of two operands is "+obj.addition(10, 20));
    System.out.println("Addition of three operands is "+obj.addition(10, 20, 30));
  }
}