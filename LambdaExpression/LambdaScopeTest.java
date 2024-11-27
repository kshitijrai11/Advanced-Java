import java.util.function.Consumer;

public class LambdaScopeTest
{
   public int x=0;
   class FirstLevel
   {
		public int x=1;
		
		void methodInFirstLevel(int x)
		{
			Consumer<Integer> myConsumer=(y)->
			{
				System.out.println("x= "+x);
				System.out.println("y= "+y);
				System.out.println("this.x= "+this.x);
				System.out.println("LambdaScopeTest.this.x= "+
				LambdaScopeTest.this.x);
			};
			myConsumer.accept(x);
		}
   }
  public static void main(String ad[])
  {
	  LambdaScopeTest st=new LambdaScopeTest();
	  LambdaScopeTest.FirstLevel fl=st.new FirstLevel();
	  fl.methodInFirstLevel(23);
  }
}

/*
E:\Advance_java\LambdaExpression>java  LambdaScopeTest
x= 23
y= 23
this.x= 1
LambdaScopeTest.this.x= 0
*/